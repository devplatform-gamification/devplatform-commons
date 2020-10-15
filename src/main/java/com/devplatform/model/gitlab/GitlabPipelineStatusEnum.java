package com.devplatform.model.gitlab;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GitlabPipelineStatusEnum {
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

	GitlabPipelineStatusEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static GitlabPipelineStatusEnum fromValue(String text) {
		for (GitlabPipelineStatusEnum b : GitlabPipelineStatusEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
	
	public static Boolean statusFailed(GitlabPipelineStatusEnum status) {
		return (status != null 
				&& (
					status.equals(GitlabPipelineStatusEnum.FAILED) 
					|| status.equals(GitlabPipelineStatusEnum.CANCELED) 
					|| status.equals(GitlabPipelineStatusEnum.SKIPPED)
				));
	}
}