package com.devplatform.model.rocketchat.request;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class RocketchatDirectMessageRequest {
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("username")
	private String username;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("usernames")
	private String usernames;

	public RocketchatDirectMessageRequest username(String username) {
		this.username = username;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public RocketchatDirectMessageRequest usernames(String usernames) {
		this.usernames = usernames;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getUsernames() {
		return usernames;
	}

	public void setUsernames(String usernames) {
		this.usernames = usernames;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RocketchatDirectMessageRequest slackChannelMessage = (RocketchatDirectMessageRequest) o;
		return Objects.equals(this.username, slackChannelMessage.username)
				&& Objects.equals(this.usernames, slackChannelMessage.usernames);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, usernames);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatDirectMessage {\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    usernames: ").append(toIndentedString(usernames)).append("\n");
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
