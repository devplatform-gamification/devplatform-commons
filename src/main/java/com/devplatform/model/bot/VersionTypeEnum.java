package com.devplatform.model.bot;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum VersionTypeEnum {
	ORDINARIA("ordinaria"),
	SNAPSHOT("snapshot"),
	RELEASECANDIDATE("release_candidate");

	private String value;

	VersionTypeEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static VersionTypeEnum fromValue(String text) {
		for (VersionTypeEnum b : VersionTypeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}