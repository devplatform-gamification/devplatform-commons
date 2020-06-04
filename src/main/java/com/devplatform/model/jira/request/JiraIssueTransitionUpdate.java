package com.devplatform.model.jira.request;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.jira.JiraIssueTransition;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssueTransitionUpdate extends JiraIssueUpdate {
	@JsonProperty("transition")
	protected Map<String, String> transition = null;

	public JiraIssueTransitionUpdate(String id) {
		super();
		if (id != null) {
			this.transition = new HashMap<>();
			this.transition.put("id", id);
		}
	}

	public JiraIssueTransitionUpdate(JiraIssueTransition issueTransition) {
		super();
		if (issueTransition != null) {
			this.transition = new HashMap<>();
			this.transition.put("id", issueTransition.getId());
		}
	}

	public JiraIssueTransitionUpdate(JiraIssueTransition issueTransition, Map<String, Object> update) {
		super();
		if (issueTransition != null) {
			this.transition = new HashMap<>();
			this.transition.put("id", issueTransition.getId());
		}
		this.update = update;
	}

	public JiraIssueTransitionUpdate transition(Map<String, String> transition) {
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		JiraIssueTransitionUpdate other = (JiraIssueTransitionUpdate) obj;
		return Objects.equals(transition, other.transition);
	}

	@Override
	public int hashCode() {
		return Objects.hash(update, transition);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueTransitionUpdate {\n");
		sb.append("    update: ").append(update).append("\n");
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
