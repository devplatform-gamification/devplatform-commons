package com.devplatform.model.rocketchat.response;

import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.rocketchat.RocketchatRoom;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class RocketchatChannelsResponse {
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("channels")
	private List<RocketchatRoom> channels;

	@JsonProperty("count")
	private Integer count;

	@JsonProperty("offset")
	private Integer offset;

	@JsonProperty("total")
	private Integer total;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("success")
	private Boolean success;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("error")
	private String error;

	public RocketchatChannelsResponse channels(List<RocketchatRoom> channels) {
		this.channels = channels;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public List<RocketchatRoom> getChannels() {
		return channels;
	}

	public void setChannels(List<RocketchatRoom> channels) {
		this.channels = channels;
	}

	public RocketchatChannelsResponse count(Integer count) {
		this.count = count;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public RocketchatChannelsResponse offset(Integer offset) {
		this.offset = offset;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public RocketchatChannelsResponse total(Integer total) {
		this.total = total;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public RocketchatChannelsResponse success(Boolean success) {
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
	
	public RocketchatChannelsResponse error(String error) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RocketchatChannelsResponse slackChannelMessage = (RocketchatChannelsResponse) o;
		return Objects.equals(this.channels, slackChannelMessage.channels)
				&& Objects.equals(this.count, slackChannelMessage.count)
				&& Objects.equals(this.offset, slackChannelMessage.offset)
				&& Objects.equals(this.total, slackChannelMessage.total)
				&& Objects.equals(this.success, slackChannelMessage.success)
				&& Objects.equals(this.error, slackChannelMessage.error);
	}

	@Override
	public int hashCode() {
		return Objects.hash(channels, count, offset, total, success, error);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatChannelsResponse {\n");
		sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
		sb.append("    count: ").append(toIndentedString(count)).append("\n");
		sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
		sb.append("    total: ").append(toIndentedString(total)).append("\n");
		sb.append("    success: ").append(toIndentedString(success)).append("\n");
		sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
