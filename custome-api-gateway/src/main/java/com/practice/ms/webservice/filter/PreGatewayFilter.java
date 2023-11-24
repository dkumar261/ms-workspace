package com.practice.ms.webservice.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.RequestPath;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.practice.ms.webservice.constants.GatewayConstants;
import com.practice.ms.webservice.constants.GatewayConstants.USER_STATUS;
import com.practice.ms.webservice.util.JwtTokenUtil;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PreGatewayFilter extends AbstractGatewayFilterFactory<PreGatewayFilter.Config> {

	private static final String RESPONSE_STATUS = "Response Status : ";

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	/**
	 * This is initialization the super class.
	 */
	public PreGatewayFilter() {
		super(Config.class);
	}

	@Override
	public GatewayFilter apply(Config config) {

		return (exchange, chain) -> {
			final ServerHttpResponse response = exchange.getResponse();
			final HttpHeaders headers = exchange.getRequest().getHeaders();
			final RequestPath requestPath = exchange.getRequest().getPath();
			final String httpMethod = exchange.getRequest().getMethod().name();

			USER_STATUS userStatus = USER_STATUS.NOT_AUTHENTICATED;

			if (headers.containsKey(HttpHeaders.AUTHORIZATION)) {
				try {
					userStatus = this.checkUserAuthStatus(headers, requestPath, httpMethod);
				} catch (Exception e) {
					userStatus = USER_STATUS.NOT_AUTHENTICATED;
					response.setStatusCode(HttpStatus.UNAUTHORIZED);
					return response.setComplete();
				}
			} else {
				response.setStatusCode(HttpStatus.UNAUTHORIZED);
				log.info(RESPONSE_STATUS + HttpStatus.UNAUTHORIZED);
				return response.setComplete();
			}
			return chain.filter(exchange);

		};
	}

	private USER_STATUS checkUserAuthStatus(final HttpHeaders headers, final RequestPath requestPath,
			final String httpMethod) {
		log.info("checkUserAuthStatus() begins");
		final USER_STATUS userStatus = USER_STATUS.NOT_AUTHENTICATED;
		final String authData = headers.getFirst(HttpHeaders.AUTHORIZATION);
		final String jwtToken = (authData != null)
				&& (authData.indexOf(GatewayConstants.AUTHORIZATION_TYPE_BEARER) == 0)
						? authData.substring(GatewayConstants.AUTHORIZATION_TYPE_BEARER.length())
						: null;

		// Validate the jwtToken
		if (!StringUtils.isEmpty(jwtToken)) {
			log.info("Token value found");
			return this.checkAuthStatus(headers, requestPath, httpMethod, jwtToken);
		}
		return userStatus;
	}

	private USER_STATUS checkAuthStatus(final HttpHeaders headers, final RequestPath requestPath,
			final String httpMethod, String jwtToken) {
		log.info("checkAuthStatus() begins");

		USER_STATUS userStatus = null;

		jwtTokenUtil.validateToken(jwtToken);
		userStatus = USER_STATUS.AUTHENTICATED;
		return userStatus;
	}

	public static class Config {
		// Put the configuration properties
	}
}
