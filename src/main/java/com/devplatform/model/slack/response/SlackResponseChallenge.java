package com.devplatform.model.slack.response;

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
public class SlackResponseChallenge extends SlackResponse{
	@JsonProperty("challenge")
	private String challenge = null;
	
	public SlackResponseChallenge() {
		super();
	}

	public SlackResponseChallenge(String challenge) {
		super();
		this.challenge = challenge;
	}

	public SlackResponseChallenge challenge(String challenge) {
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
		SlackResponseChallenge slackChannelMessage = (SlackResponseChallenge) o;
		return Objects.equals(this.challenge, slackChannelMessage.challenge);
	}

	@Override
	public int hashCode() {
		return Objects.hash(challenge);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SlackResponseChallenge {\n");

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
