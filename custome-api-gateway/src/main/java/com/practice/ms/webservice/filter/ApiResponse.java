package com.practice.ms.webservice.filter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ApiResponse {

	private String sessionId;
	private String channelId;
	private String accessToken;
	private String refreshToken;

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(final String sessionId) {
		this.sessionId = sessionId;
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(final String channelId) {
		this.channelId = channelId;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(final String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(final String refreshToken) {
		this.refreshToken = refreshToken;
	}

	/**
	 * This is by default constructor for init
	 */
	public ApiResponse() {
		super();

	}

}