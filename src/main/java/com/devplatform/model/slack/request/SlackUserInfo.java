package com.devplatform.model.slack.request;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class SlackUserInfo {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("user")
	private String user = null;
	
	public SlackUserInfo(String user) {
		super();
		this.user = user;
	}

	public SlackUserInfo user(String user) {
		this.user = user;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SlackUserInfo slackChannelMessage = (SlackUserInfo) o;
		return Objects.equals(this.user, slackChannelMessage.user);
	}

	@Override
	public int hashCode() {
		return Objects.hash(user);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SlackUserInfo {\n");

		sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
