package com.devplatform.model.rocketchat;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * https://docs.gitlab.com/ee/user/project/quick_actions.html
 */
public enum RocketchatRoomTypeEnum {
	LIVECHAT("l"),
	CHAT("c"),
	DIRECTMESSAGE("d"),
	PRIVATE("p");

    private String value;

    RocketchatRoomTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RocketchatRoomTypeEnum fromValue(String text) {
      for (RocketchatRoomTypeEnum b : RocketchatRoomTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
