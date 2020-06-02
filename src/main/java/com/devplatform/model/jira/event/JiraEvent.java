package com.devplatform.model.jira.event;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraEvent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraEvent {
	@JsonProperty("timestamp")
	protected String timestamp = null;

	@JsonProperty("webhookEvent")
	protected JiraWebhookEventEnum webhookEvent = null;

	@JsonProperty("userName")
	protected String userName = null;

	@JsonProperty("userKey")
	protected String userKey = null;

	public JiraEvent timestamp(String timestamp) {
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

	public JiraEvent webhookEvent(JiraWebhookEventEnum webhookEvent) {
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

	public JiraEvent userName(String userName) {
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

	public JiraEvent userKey(String userKey) {
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
		JiraEvent jiraEvent = (JiraEvent) o;
		return Objects.equals(this.timestamp, jiraEvent.timestamp)
				&& Objects.equals(this.webhookEvent, jiraEvent.webhookEvent)
				&& Objects.equals(this.userName, jiraEvent.userName)
				&& Objects.equals(this.userKey, jiraEvent.userKey);
	}

	@Override
	public int hashCode() {
		return Objects.hash(timestamp, webhookEvent, userName, userKey);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraEvent {\n");

		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    webhookEvent: ").append(toIndentedString(webhookEvent)).append("\n");
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
