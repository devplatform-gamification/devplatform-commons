package com.devplatform.model.gitlab;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * https://docs.gitlab.com/ee/user/project/quick_actions.html
 */
public enum GitlabMergeRequestActionsEnum {
	OPEN("open"),
	CLOSE("close"),
	REOPEN("reopen"),
	UPDATE("update"),
	MERGE("merge"),
	UNAPPROVED("unapproved"),
    APPROVED("approved");

    private String value;

    GitlabMergeRequestActionsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GitlabMergeRequestActionsEnum fromValue(String text) {
      for (GitlabMergeRequestActionsEnum b : GitlabMergeRequestActionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
