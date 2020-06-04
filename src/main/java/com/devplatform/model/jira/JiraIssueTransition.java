package com.devplatform.model.jira;

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
public class JiraIssueTransition {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("to")
	private JiraStatus to = null;

	public JiraIssueTransition id(String id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public JiraIssueTransition name(String name) {
		this.name = name;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JiraIssueTransition to(JiraStatus to) {
		this.to = to;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public JiraStatus getTo() {
		return to;
	}

	public void setTo(JiraStatus to) {
		this.to = to;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraIssueTransition jiraIssueComment = (JiraIssueTransition) o;
		return Objects.equals(this.id, jiraIssueComment.id) 
				&& Objects.equals(this.name, jiraIssueComment.name)
				&& Objects.equals(this.to, jiraIssueComment.to);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, to);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueTransition {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
