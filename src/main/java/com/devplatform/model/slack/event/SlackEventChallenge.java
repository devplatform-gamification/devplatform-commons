package com.devplatform.model.slack.event;

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
public class SlackEventChallenge {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("type")
	private SlackEventTypeEnum type = null;

	@JsonProperty("token")
	private String token = null;

	@JsonProperty("challenge")
	private String challenge = null;

	public SlackEventChallenge type(SlackEventTypeEnum type) {
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

	public SlackEventChallenge token(String token) {
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

	public SlackEventChallenge challenge(String challenge) {
		this.challenge = challenge;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getChallenge() {
		return challenge;
	}

	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SlackEventChallenge slackChannelMessage = (SlackEventChallenge) o;
		return Objects.equals(this.type, slackChannelMessage.type)
				&& Objects.equals(this.token, slackChannelMessage.token)
				&& Objects.equals(this.challenge, slackChannelMessage.challenge);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, token, challenge);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SlackEventChallenge {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
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
