package com.devplatform.model.slack.event;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SlackEventTypeEnum {
    MESSAGE("message"),
    URL_VERIFICATION("url_verification");

    private String value;

    SlackEventTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SlackEventTypeEnum fromValue(String text) {
      for (SlackEventTypeEnum b : SlackEventTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
