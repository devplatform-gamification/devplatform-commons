package com.devplatform.model.gitlab;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GitlabMergeRequestStateEnum {
    MERGED("merged"),
    OPENED("opened"),
    CLOSED("closed"),
    LOCKED("locked");

    private String value;

    GitlabMergeRequestStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GitlabMergeRequestStateEnum fromValue(String text) {
      for (GitlabMergeRequestStateEnum b : GitlabMergeRequestStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
