package com.devplatform.model.slack.response;

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
public class SlackMessageResponse {
	@JsonProperty("ok")
	private Boolean ok = null;

	@JsonProperty("channel")
	private String channel = null;

	@JsonProperty("ts")
	private String ts = null;

	@JsonProperty("message")
	private SlackChannelMessage message = null;

	@JsonProperty("error")
	private String error = null;
	
	@JsonProperty("warning")
	private String warning = null;
	
	@JsonProperty("response_metadata")
	private Object response_metadata = null;

	public SlackMessageResponse ok(Boolean ok) {
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

	public SlackMessageResponse channel(String channel) {
		this.channel = channel;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public SlackMessageResponse ts(String ts) {
		this.ts = ts;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public SlackMessageResponse error(String error) {
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

	public SlackMessageResponse message(SlackChannelMessage message) {
		this.message = message;
		return this;
	}

	@ApiModelProperty(value = "")
	public SlackChannelMessage getMessage() {
		return message;
	}

	public void setMessage(SlackChannelMessage message) {
		this.message = message;
	}
	
	public SlackMessageResponse warning(String warning) {
		this.message = message;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getWarning() {
		return warning;
	}

	public void setWarning(String warning) {
		this.warning = warning;
	}

	public SlackMessageResponse response_metadata(Object response_metadata) {
		this.response_metadata = response_metadata;
		return this;
	}

	@ApiModelProperty(value = "")
	public Object getResponse_metadata() {
		return response_metadata;
	}

	public void setResponse_metadata(Object response_metadata) {
		this.response_metadata = response_metadata;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SlackMessageResponse slackChannelMessage = (SlackMessageResponse) o;
		return Objects.equals(this.ok, slackChannelMessage.ok)
				&& Objects.equals(this.channel, slackChannelMessage.channel)
				&& Objects.equals(this.ts, slackChannelMessage.ts)
				&& Objects.equals(this.error, slackChannelMessage.error)
				&& Objects.equals(this.warning, slackChannelMessage.warning)
				&& Objects.equals(this.response_metadata, slackChannelMessage.response_metadata)
				&& Objects.equals(this.message, slackChannelMessage.message);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ok, channel, ts, error, message, warning, response_metadata);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SlackMessageResponse {\n");

		sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
		sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
		sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    error: ").append(toIndentedString(error)).append("\n");
		sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
		sb.append("    response_metadata: ").append(toIndentedString(response_metadata)).append("\n");
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