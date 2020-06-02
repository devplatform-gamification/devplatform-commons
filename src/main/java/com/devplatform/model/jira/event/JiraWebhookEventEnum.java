package com.devplatform.model.jira.event;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum JiraWebhookEventEnum {
	  ISSUE_CREATED("jira:issue_created"),
	  ISSUE_UPDATED("jira:issue_updated"),
	  ISSUE_DELETED("jira:issue_deleted"),
	  ISSUE_WORK_STARTED("issue_work_started"),
	  COMMENT_CREATED("comment_created"),
	  COMMENT_UPDATED("comment_updated"),
	  COMMENT_DELETED("comment_deleted"),
	  ISSUE_LINK_CREATED("issuelink_created"),
	  ISSUE_LINK_DELETED("issuelink_deleted"),
	  VERSION_CREATED("jira:version_created"),
	  VERSION_MOVED("jira:version_moved"),
	  VERSION_UPDATED("jira:version_updated"),
	  VERSION_RELEASED("jira:version_released"),
	  VERSION_UNRELEASED("jira:version_unreleased"),
	  VERSION_DELETED("jira:version_deleted");
	  
	  
	  private String value;

	  JiraWebhookEventEnum(String value) {
	    this.value = value;
	  }

	  @Override
	  @JsonValue
	  public String toString() {
	    return String.valueOf(value);
	  }

	  @JsonCreator
	  public static JiraWebhookEventEnum fromValue(String text) {
	    for (JiraWebhookEventEnum b : JiraWebhookEventEnum.values()) {
	      if (String.valueOf(b.value).equals(text)) {
	        return b;
	      }
	    }
	    return null;
	  }
}
