package com.devplatform.model.gitlab;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets mergeStatus
 */
public enum GitlabNoteTypeEnum {
	DISCUSSION_NOTE("DiscussionNote"),
	DIFF_NOTE("DiffNote");

	private String value;

	GitlabNoteTypeEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static GitlabNoteTypeEnum fromValue(String text) {
		for (GitlabNoteTypeEnum b : GitlabNoteTypeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}