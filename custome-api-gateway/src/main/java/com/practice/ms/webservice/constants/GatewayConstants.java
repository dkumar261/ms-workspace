package com.practice.ms.webservice.constants;

public interface GatewayConstants {
	public String AUTHORIZATION_TYPE_BEARER = "Bearer ";
	public String TOKEN_VALIDATION_API_PASS_STATUS = "Pass";
	public String TRUE = "TRUE";
	public String FALSE = "FALSE";
	public static final String FULL_ACCESS = "F";
	public static final String READ_ACCESS = "R";
	public static final String WHITE_SPACE = " ";

	// Request Headers

	public static final String X_AUTH_SESSION_ID = "X-Auth-Session-Id";
	public static final String X_AUTH_TRANSACTION_ID = "X-Auth-Transaction-Id";
	public static final String X_AUTH_USER_ID = "X-Auth-User-Id";
	public static final String X_FORWARDED_FOR = "X-Forwarded-For";
	public static final String APP_VERSION = "APP_VERSION";
	public static final String CHANNEL_ID = "Channel-Id";
	public static final String USER_AGENT = "User-Agent";

	public static enum USER_STATUS {
		AUTHENTICATED("AUTHENTICATED"), AUTHORIZED("AUTHORIZED"), NOT_AUTHENTICATED("NOT_AUTHENTICATED"),
		NOT_AUTHORIZED("NOT_AUTHORIZED");

		private final String value;

		USER_STATUS(final String newValue) {
			this.value = newValue;
		}

		public String getValue() {
			return this.value;
		}
	}
}
