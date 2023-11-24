package com.practice.ms.webservice.constants;

public interface GatewayConstants {
	public String AUTHORIZATION_TYPE_BEARER = "Bearer ";
	public String TRUE = "TRUE";
	public String FALSE = "FALSE";

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
