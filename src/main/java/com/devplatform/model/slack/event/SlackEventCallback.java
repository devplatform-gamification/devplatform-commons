package com.devplatform.model.slack.event;

import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.slack.SlackChannelMessage;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class SlackEventCallback {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("type")
	private SlackEventTypeEnum type = null;

	@JsonProperty("token")
	private String token = null;

	@JsonProperty("team_id")
	private String team_id = null;

	@JsonProperty("api_app_id")
	private String api_app_id = null;

	@JsonProperty("event_id")
	private String event_id = null;

	@JsonProperty("event_time")
	private String event_time = null;

	@JsonProperty("authed_users")
	private List<String> authed_users = null;

	@JsonProperty("event")
	private SlackChannelMessage event = null;
	
	public SlackEventCallback type(SlackEventTypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull
	public SlackEventTypeEnum getType() {
		return type;
	}

	public void setType(SlackEventTypeEnum type) {
		this.type = type;
	}

	public SlackEventCallback token(String token) {
		this.token = token;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public SlackEventCallback team_id(String team_id) {
		this.team_id = team_id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getTeam_id() {
		return team_id;
	}

	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}

	public SlackEventCallback api_app_id(String api_app_id) {
		this.api_app_id = api_app_id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getApi_app_id() {
		return api_app_id;
	}

	public void setApi_app_id(String api_app_id) {
		this.api_app_id = api_app_id;
	}

	public SlackEventCallback event_id(String event_id) {
		this.event_id = event_id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getEvent_id() {
		return event_id;
	}

	public void setEvent_id(String event_id) {
		this.event_id = event_id;
	}

	public SlackEventCallback event_time(String event_time) {
		this.event_time = event_time;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getEvent_time() {
		return event_time;
	}

	public void setEvent_time(String event_time) {
		this.event_time = event_time;
	}

	public SlackEventCallback authed_users(List<String> authed_users) {
		this.authed_users = authed_users;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public List<String> getAuthed_users() {
		return authed_users;
	}

	public void setAuthed_users(List<String> authed_users) {
		this.authed_users = authed_users;
	}
	
	public SlackEventCallback event(SlackChannelMessage event) {
		this.event = event;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public SlackChannelMessage getEvent() {
		return event;
	}

	public void setEvent(SlackChannelMessage event) {
		this.event = event;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SlackEventCallback slackChannelMessage = (SlackEventCallback) o;
		return Objects.equals(this.type, slackChannelMessage.type)
				&& Objects.equals(this.token, slackChannelMessage.token)
				&& Objects.equals(this.team_id, slackChannelMessage.team_id)
				&& Objects.equals(this.api_app_id, slackChannelMessage.api_app_id)
				&& Objects.equals(this.event_id, slackChannelMessage.event_id)
				&& Objects.equals(this.event_time, slackChannelMessage.event_time)
				&& Objects.equals(this.authed_users, slackChannelMessage.authed_users)
				&& Objects.equals(this.event, slackChannelMessage.event);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, token, team_id, api_app_id, event_id, event_time, authed_users, event);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SlackEventCallback {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    team_id: ").append(toIndentedString(team_id)).append("\n");
		sb.append("    api_app_id: ").append(toIndentedString(api_app_id)).append("\n");
		sb.append("    event_id: ").append(toIndentedString(event_id)).append("\n");
		sb.append("    event_time: ").append(toIndentedString(event_time)).append("\n");
		sb.append("    authed_users: ").append(toIndentedString(authed_users)).append("\n");
		sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
