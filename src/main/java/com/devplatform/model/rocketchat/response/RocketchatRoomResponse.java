package com.devplatform.model.rocketchat.response;

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
public class RocketchatRoomResponse {
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("room")
	private RocketchatRoom room;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("success")
	private Boolean success;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("error")
	private String error;

	public RocketchatRoomResponse room(RocketchatRoom room) {
		this.room = room;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public RocketchatRoom getRoom() {
		return room;
	}

	public void setRoom(RocketchatRoom room) {
		this.room = room;
	}

	public RocketchatRoomResponse success(Boolean success) {
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
	
	public RocketchatRoomResponse error(String error) {
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
		RocketchatRoomResponse slackChannelMessage = (RocketchatRoomResponse) o;
		return Objects.equals(this.room, slackChannelMessage.room)
				&& Objects.equals(this.success, slackChannelMessage.success)
				&& Objects.equals(this.error, slackChannelMessage.error);
	}

	@Override
	public int hashCode() {
		return Objects.hash(room, success, error);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatRoomResponse {\n");
		sb.append("    room: ").append(toIndentedString(room)).append("\n");
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
