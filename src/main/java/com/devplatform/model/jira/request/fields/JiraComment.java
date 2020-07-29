package com.devplatform.model.jira.request.fields;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class JiraComment {
	@JsonProperty("body")
	private String body = null;

	public JiraComment(String body) {
		super();
		this.body = body;
	}
	
	public JiraComment body(String body) {
		this.body = body;
		return this;
	}

	@ApiModelProperty(value = "body")
	@Valid
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(body);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JiraComment other = (JiraComment) obj;
		return Objects.equals(body, other.body);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraComment {\n");
		sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
