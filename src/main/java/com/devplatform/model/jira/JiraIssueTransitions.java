package com.devplatform.model.jira;

import java.util.List;
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
public class JiraIssueTransitions {
	@JsonProperty("expand")
	private String expand = null;

	@JsonProperty("transitions")
	private List<JiraIssueTransition> transitions = null;

	public JiraIssueTransitions expand(String expand) {
		this.expand = expand;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public JiraIssueTransitions transitions(List<JiraIssueTransition> transitions) {
		this.transitions = transitions;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public List<JiraIssueTransition> getTransitions() {
		return transitions;
	}

	public void setTransitions(List<JiraIssueTransition> transitions) {
		this.transitions = transitions;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraIssueTransitions jiraIssueComment = (JiraIssueTransitions) o;
		return Objects.equals(this.expand, jiraIssueComment.expand) 
				&& Objects.equals(this.transitions, jiraIssueComment.transitions);
	}

	@Override
	public int hashCode() {
		return Objects.hash(expand, transitions);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueTransitions {\n");
		sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
		sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
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
