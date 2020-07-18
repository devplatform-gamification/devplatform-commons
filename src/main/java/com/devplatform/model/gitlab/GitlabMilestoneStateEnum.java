package com.devplatform.model.gitlab;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GitlabMilestoneStateEnum {
	ACTIVE("active"),
	CLOSED("closed");

	private String value;

	GitlabMilestoneStateEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static GitlabMilestoneStateEnum fromValue(String text) {
		for (GitlabMilestoneStateEnum b : GitlabMilestoneStateEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}