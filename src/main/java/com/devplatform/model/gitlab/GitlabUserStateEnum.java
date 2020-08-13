package com.devplatform.model.gitlab;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GitlabUserStateEnum {
	ACTIVE("active"),
	BLOCKED("blocked");

	private String value;

	GitlabUserStateEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static GitlabUserStateEnum fromValue(String text) {
		for (GitlabUserStateEnum b : GitlabUserStateEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}