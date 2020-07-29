package com.devplatform.model.jira.request;

import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssueComment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssueFields {
	@JsonProperty("fields")
	protected Map<String, Object> fields = null;

	public JiraIssueFields() {
		super();
	}

	public JiraIssueFields(Map<String, Object> fields) {
		super();
		this.fields = fields;
	}

	public JiraIssueFields fields(Map<String, Object> fields) {
		this.fields = fields;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public Map<String, Object> getFields() {
		return fields;
	}

	public void setFields(Map<String, Object> fields) {
		this.fields = fields;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(fields);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JiraIssueFields other = (JiraIssueFields) obj;
		return Objects.equals(fields, other.fields);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueFields {\n");
		sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
