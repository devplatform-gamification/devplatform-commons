package com.devplatform.model.jira;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum JiraVersionReleaseNotesIssueTypeEnum {
	NEW_FEATURE("Novas funcionalidades"),
	IMPROVEMENT("Melhorias"),
	BUGFIX("Correções"),
	MINOR_CHANGES("Outras alterações");

	private String value;

	JiraVersionReleaseNotesIssueTypeEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static JiraVersionReleaseNotesIssueTypeEnum fromValue(String text) {
		for (JiraVersionReleaseNotesIssueTypeEnum b : JiraVersionReleaseNotesIssueTypeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}