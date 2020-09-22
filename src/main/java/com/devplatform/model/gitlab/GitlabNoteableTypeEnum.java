package com.devplatform.model.gitlab;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets mergeStatus
 */
public enum GitlabNoteableTypeEnum {
	MERGE_REQUEST("merge_request"),
	COMMIT("Commit"),
	ISSUE("Issue"),
	CODE_SNIPPET("Snippet");

	private String value;

	GitlabNoteableTypeEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static GitlabNoteableTypeEnum fromValue(String text) {
		for (GitlabNoteableTypeEnum b : GitlabNoteableTypeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}