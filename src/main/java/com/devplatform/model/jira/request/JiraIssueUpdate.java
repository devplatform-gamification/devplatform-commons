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
public class JiraIssueUpdate {
	@JsonProperty("update")
	protected Map<String, Object> update = null;

	public JiraIssueUpdate() {
		super();
	}

	public JiraIssueUpdate(Map<String, Object> update) {
		super();
		this.update = update;
	}

	public JiraIssueUpdate update(Map<String, Object> update) {
		this.update = update;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public Map<String, Object> getUpdate() {
		return update;
	}

	public void setUpdate(Map<String, Object> update) {
		this.update = update;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(update);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JiraIssueUpdate other = (JiraIssueUpdate) obj;
		return Objects.equals(update, other.update);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueUpdate {\n");
		sb.append("    update: ").append(toIndentedString(update)).append("\n");
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
