package com.devplatform.model.jira.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ProcessingTypeEnum {
	ERROR("Error"),
	INFO("Info"),
	DEBUG("Debug"),
	WARNING("Warn");

	private String value;

	ProcessingTypeEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static ProcessingTypeEnum fromValue(String text) {
		for (ProcessingTypeEnum b : ProcessingTypeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}