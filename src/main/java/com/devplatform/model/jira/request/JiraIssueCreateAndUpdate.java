package com.devplatform.model.jira.request;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.jira.JiraIssueTransition;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssueComment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
@JsonInclude(Include.NON_NULL)
public class JiraIssueCreateAndUpdate {
	@JsonProperty("fields")
	protected Map<String, Object> fields = null;
	@JsonProperty("update")
	protected Map<String, Object> update = null;
	@JsonProperty("transition")
	protected Map<String, String> transition = null;

	public JiraIssueCreateAndUpdate fields(Map<String, Object> fields) {
		this.fields = fields;
		return this;
	}

	public Map<String, Object> getFields() {
		return fields;
	}

	public void setFields(Map<String, Object> fields) {
		this.fields = fields;
	}

	public JiraIssueCreateAndUpdate transition(Map<String, String> transition) {
		this.transition = transition;
		return this;
	}

	public Map<String, String> getTransition() {
		return transition;
	}

	public void setTransition(Map<String, String> transition) {
		this.transition = transition;
	}
	
	public void setTransition(JiraIssueTransition issueTransition) {
		if (issueTransition != null) {
			this.transition = new HashMap<>();
			this.transition.put("id", issueTransition.getId());
		}
	}


	public JiraIssueCreateAndUpdate update(Map<String, Object> update) {
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
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraIssueCreateAndUpdate jiraIssueComment = (JiraIssueCreateAndUpdate) o;
		return Objects.equals(this.fields, jiraIssueComment.fields)
				&& Objects.equals(this.update, jiraIssueComment.update)
				&& Objects.equals(this.transition, jiraIssueComment.transition);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fields, update, transition);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueCreateAndUpdate {\n");
		sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
		sb.append("    update: ").append(toIndentedString(update)).append("\n");
		sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
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
