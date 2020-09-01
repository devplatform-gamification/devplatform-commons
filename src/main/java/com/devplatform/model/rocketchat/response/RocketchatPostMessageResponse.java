package com.devplatform.model.rocketchat.response;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.rocketchat.RocketchatMessage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class RocketchatPostMessageResponse {
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("message")
	private RocketchatMessage message;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("channel")
	private String channel;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("ts")
	private String ts;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("success")
	private Boolean success;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("error")
	private String error;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("errorType")
	private String errorType;

	public RocketchatPostMessageResponse channel(String channel) {
		this.channel = channel;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public RocketchatPostMessageResponse ts(String ts) {
		this.ts = ts;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public RocketchatPostMessageResponse message(RocketchatMessage message) {
		this.message = message;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public RocketchatMessage getMessage() {
		return message;
	}

	public void setMessage(RocketchatMessage message) {
		this.message = message;
	}

	public RocketchatPostMessageResponse success(Boolean success) {
		this.success = success;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	public RocketchatPostMessageResponse error(String error) {
		this.error = error;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	public RocketchatPostMessageResponse errorType(String errorType) {
		this.errorType = errorType;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RocketchatPostMessageResponse slackChannelMessage = (RocketchatPostMessageResponse) o;
		return Objects.equals(this.message, slackChannelMessage.message)
				&& Objects.equals(this.channel, slackChannelMessage.channel)
				&& Objects.equals(this.ts, slackChannelMessage.ts)
				&& Objects.equals(this.success, slackChannelMessage.success)
				&& Objects.equals(this.error, slackChannelMessage.error)
				&& Objects.equals(this.errorType, slackChannelMessage.errorType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(message, channel, ts, success, error, errorType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatPostMessageResponse {\n");
		sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
		sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    success: ").append(toIndentedString(success)).append("\n");
		sb.append("    error: ").append(toIndentedString(error)).append("\n");
		sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
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
