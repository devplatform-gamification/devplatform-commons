package com.devplatform.model.bot;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum VersionReleaseNotesIssueTypeEnum {
	NEW_FEATURE("Novas funcionalidades"),
	IMPROVEMENT("Melhorias"),
	BUGFIX("Correções"),
	MINOR_CHANGES("Outras alterações");

	private String value;

	VersionReleaseNotesIssueTypeEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static VersionReleaseNotesIssueTypeEnum fromValue(String text) {
		for (VersionReleaseNotesIssueTypeEnum b : VersionReleaseNotesIssueTypeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}