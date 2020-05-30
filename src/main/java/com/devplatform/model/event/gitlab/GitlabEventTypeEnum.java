package com.devplatform.model.event.gitlab;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GitlabEventTypeEnum {
	MERGE_REQUEST("merge_request"),

	COMMENT("note"),

	TAG_PUSHED("tag_pushed"),

	PUSH("push"),

	JOB_CHANGES("job_changes"),

	PIPELINE_CHANGES("pipeline_changes");

	private String value;

	GitlabEventTypeEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static GitlabEventTypeEnum fromValue(String text) {
		for (GitlabEventTypeEnum b : GitlabEventTypeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}