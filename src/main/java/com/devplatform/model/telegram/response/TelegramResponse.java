package com.devplatform.model.telegram.response;

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
public class TelegramResponse<E> {
	@JsonProperty("ok")
	private Boolean ok = null;

	@JsonProperty("error_code")
	private String error_code = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("result")
	private E result = null;

	public TelegramResponse<E> ok(Boolean ok) {
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

	public TelegramResponse<E> error_code(String error_code) {
		this.error_code = error_code;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public TelegramResponse<E> description(String description) {
		this.description = description;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	
	public TelegramResponse<E> result(E result) {
		this.result = result;
		return this;
	}

	@ApiModelProperty(value = "")
	public E getResult() {
		return result;
	}
	
	public void setResult(E result) {
		this.result = result;
	}
	
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		@SuppressWarnings("unchecked")
		TelegramResponse<E> slackChannelMessage = (TelegramResponse<E>) o;
		return Objects.equals(this.ok, slackChannelMessage.ok)
				&& Objects.equals(this.error_code, slackChannelMessage.error_code)
				&& Objects.equals(this.description, slackChannelMessage.description)
				&& Objects.equals(this.result, slackChannelMessage.result);
	}


	@Override
	public int hashCode() {
		return Objects.hash(ok, error_code, description, result);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TelegramResponse {\n");

		sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
		sb.append("    result: ").append(toIndentedString(result)).append("\n");
		sb.append("    error_code: ").append(toIndentedString(error_code)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
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