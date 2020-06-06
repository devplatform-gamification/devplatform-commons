package com.devplatform.model.slack.response;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.slack.SlackUser;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class SlackUserResponse {
	@JsonProperty("ok")
	private Boolean ok = null;

	@JsonProperty("error")
	private String error = null;

	@JsonProperty("user")
	private SlackUser user = null;

	public SlackUserResponse ok(Boolean ok) {
		this.ok = ok;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public Boolean getOk() {
		return ok;
	}

	public void setOk(Boolean ok) {
		this.ok = ok;
	}

	public SlackUserResponse error(String error) {
		this.error = error;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public SlackUserResponse user(SlackUser user) {
		this.user = user;
		return this;
	}

	@ApiModelProperty(value = "")
	public SlackUser getUser() {
		return user;
	}

	public void setUser(SlackUser user) {
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
		SlackUserResponse slackChannelMessage = (SlackUserResponse) o;
		return Objects.equals(this.ok, slackChannelMessage.ok)
				&& Objects.equals(this.error, slackChannelMessage.error)
				&& Objects.equals(this.user, slackChannelMessage.user);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ok, error, user);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SlackUserResponse {\n");

		sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
		sb.append("    error: ").append(toIndentedString(error)).append("\n");
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