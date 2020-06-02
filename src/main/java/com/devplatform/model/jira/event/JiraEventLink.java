package com.devplatform.model.jira.event;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.jira.JiraIssueLink;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraEvent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraEventLink {
	@JsonProperty("timestamp")
	private String timestamp = null;

	@JsonProperty("webhookEvent")
	private JiraWebhookEventEnum webhookEvent = null;

	@JsonProperty("issueLink")
	private JiraIssueLink issueLink = null;
	
	@JsonProperty("userName")
	private String userName = null;

	@JsonProperty("userKey")
	private String userKey = null;

	public JiraEventLink timestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * Get timestamp
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull
	@Valid
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public JiraEventLink webhookEvent(JiraWebhookEventEnum webhookEvent) {
		this.webhookEvent = webhookEvent;
		return this;
	}

	/**
	 * Get webhookEvent
	 * 
	 * @return webhookEvent
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public JiraWebhookEventEnum getWebhookEvent() {
		return webhookEvent;
	}

	public void setWebhookEvent(JiraWebhookEventEnum webhookEvent) {
		this.webhookEvent = webhookEvent;
	}

	public JiraEventLink issueLink(JiraIssueLink issueLink) {
		this.issueLink = issueLink;
		return this;
	}

	/**
	 * Get issueEventTypeName
	 * 
	 * @return issueEventTypeName
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull
	public JiraIssueLink getIssueLink() {
		return issueLink;
	}

	public void setsetIssueEventTypeName(JiraIssueLink issueLink) {
		this.issueLink = issueLink;
	}
	
	public JiraEventLink userName(String userName) {
		this.userName = userName;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public JiraEventLink userKey(String userKey) {
		this.userKey = userKey;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getUserKey() {
		return userKey;
	}

	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraEventLink jiraEvent = (JiraEventLink) o;
		return Objects.equals(this.timestamp, jiraEvent.timestamp)
				&& Objects.equals(this.webhookEvent, jiraEvent.webhookEvent)
				&& Objects.equals(this.issueLink, jiraEvent.issueLink)
				&& Objects.equals(this.userName, jiraEvent.userName)
				&& Objects.equals(this.userKey, jiraEvent.userKey);
	}

	@Override
	public int hashCode() {
		return Objects.hash(timestamp, webhookEvent, issueLink, userName, userKey);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraEventLink {\n");

		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    webhookEvent: ").append(toIndentedString(webhookEvent)).append("\n");
		sb.append("    issueLink: ").append(toIndentedString(issueLink)).append("\n");
		sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
		sb.append("    userKey: ").append(toIndentedString(userKey)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
