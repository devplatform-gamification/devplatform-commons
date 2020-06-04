package com.devplatform.model.jira.request.fields;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import com.devplatform.model.jira.JiraIssueTransition;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class JiraTransition {
	@JsonProperty("transition")
	private Map<String, String> transition = null;

	public JiraTransition(String id) {
		super();
		if(id != null) {
			transition = new HashMap<>();
			transition.put("id", id);
		}
	}

	public JiraTransition(JiraIssueTransition issueTransition) {
		super();
		if(issueTransition != null) {
			transition = new HashMap<>();
			transition.put("id", issueTransition.getId());
		}
	}

	public JiraTransition transition(Map<String, String> transition) {
		this.transition = transition;
		return this;
	}

	@ApiModelProperty(value = "transition")
	@Valid
	public Map<String, String> getTransition() {
		return transition;
	}

	public void setTransition(Map<String, String> transition) {
		this.transition = transition;
	}

	@Override
	public int hashCode() {
		return Objects.hash(transition);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JiraTransition other = (JiraTransition) obj;
		return Objects.equals(transition, other.transition);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraTransition {\n");
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
