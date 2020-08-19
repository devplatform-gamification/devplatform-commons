package com.devplatform.model.jira;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum JiraIssueTipoVersaoEnum {
	ORDINARIA("Ordinária"),
	HOTFIX("Hotfix");

	private String value;

	JiraIssueTipoVersaoEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static JiraIssueTipoVersaoEnum fromValue(String text) {
		for (JiraIssueTipoVersaoEnum b : JiraIssueTipoVersaoEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}