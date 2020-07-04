package com.devplatform.model.gitlab.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GitlabCommitActionsEnum {
	  CREATE("create"),
	  DELETE("delete"),
	  MOVE("move"),
	  UPDATE("update"),
	  CHMOD("chmod");
	  
	  private String value;

	  GitlabCommitActionsEnum(String value) {
	    this.value = value;
	  }

	  @Override
	  @JsonValue
	  public String toString() {
	    return String.valueOf(value);
	  }

	  @JsonCreator
	  public static GitlabCommitActionsEnum fromValue(String text) {
	    for (GitlabCommitActionsEnum b : GitlabCommitActionsEnum.values()) {
	      if (String.valueOf(b.value).equals(text)) {
	        return b;
	      }
	    }
	    return null;
	  }
}
