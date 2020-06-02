package com.devplatform.model.jira.event;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.jira.JiraIssueComment;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraEvent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraEventComment {
	@JsonProperty("timestamp")
	private String timestamp = null;

	@JsonProperty("webhookEvent")
	private JiraWebhookEventEnum webhookEvent = null;

	@JsonProperty("comment")
	private JiraIssueComment comment = null;

	public JiraEventComment timestamp(String timestamp) {
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

	public JiraEventComment webhookEvent(JiraWebhookEventEnum webhookEvent) {
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

	public JiraEventComment comment(JiraIssueComment comment) {
		this.comment = comment;
		return this;
	}

	/**
	 * Get issueEventTypeName
	 * 
	 * @return issueEventTypeName
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull
	public JiraIssueComment getComment() {
		return comment;
	}

	public void setComment(JiraIssueComment comment) {
		this.comment = comment;
	}
	
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraEventComment jiraEvent = (JiraEventComment) o;
		return Objects.equals(this.timestamp, jiraEvent.timestamp)
				&& Objects.equals(this.webhookEvent, jiraEvent.webhookEvent)
				&& Objects.equals(this.comment, jiraEvent.comment);
	}

	@Override
	public int hashCode() {
		return Objects.hash(timestamp, webhookEvent, comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraEventComment {\n");

		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    webhookEvent: ").append(toIndentedString(webhookEvent)).append("\n");
		sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
