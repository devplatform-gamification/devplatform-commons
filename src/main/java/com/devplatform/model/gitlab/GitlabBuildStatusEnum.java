package com.devplatform.model.gitlab;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GitlabBuildStatusEnum {
	CREATED("created"),
	WAITING_FOR_RESOURCE("waiting_for_resource"),
	PREPARING("preparing"),
	PENDING("pending"),
	RUNNING("running"),
	SUCCESS("success"),
	FAILED("failed"),
	CANCELED("canceled"),
	SKIPPED("skipped"),
	MANUAL("manual"),
	SCHEDULED("scheduled");

	private String value;

	GitlabBuildStatusEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static GitlabBuildStatusEnum fromValue(String text) {
		for (GitlabBuildStatusEnum b : GitlabBuildStatusEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}