package com.devplatform.model.telegram;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TelegramMessageParseModeEnum {
	MARKDOWN("Markdown"),
	MARKDOWN_V2("MarkdownV2"),
	HTML("html");

	private String value;

	TelegramMessageParseModeEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static TelegramMessageParseModeEnum fromValue(String text) {
		for (TelegramMessageParseModeEnum b : TelegramMessageParseModeEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
