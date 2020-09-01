package com.devplatform.model.rocketchat.request;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.rocketchat.RocketchatMessage;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class RocketchatSendMessageRequest {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("msg")
	private String msg = "method";

	@JsonProperty("method")
	private String method = "sendMessage";
	
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("params")
	private List<RocketchatMessage> params = null;

	public RocketchatSendMessageRequest(String rid, String msg) {
		super();
		this.params = new ArrayList<>();
		this.params.add(new RocketchatMessage(rid, msg));
	}

	public RocketchatSendMessageRequest msg(String msg) {
		this.msg = msg;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public RocketchatSendMessageRequest method(String method) {
		this.method = method;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public RocketchatSendMessageRequest id(String id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RocketchatSendMessageRequest params(List<RocketchatMessage> params) {
		this.params = params;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public List<RocketchatMessage> getParams() {
		return params;
	}

	public void setParams(ArrayList<RocketchatMessage> params) {
		this.params = params;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RocketchatSendMessageRequest slackChannelMessage = (RocketchatSendMessageRequest) o;
		return Objects.equals(this.msg, slackChannelMessage.msg)
				&& Objects.equals(this.method, slackChannelMessage.method)
				&& Objects.equals(this.id, slackChannelMessage.id)
				&& Objects.equals(this.params, slackChannelMessage.params);
	}

	@Override
	public int hashCode() {
		return Objects.hash(msg, method, id, params);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatSendMessage {\n");

		sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
		sb.append("    method: ").append(toIndentedString(method)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
