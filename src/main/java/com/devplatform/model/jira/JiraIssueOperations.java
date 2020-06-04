package com.devplatform.model.jira;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssueOperations {
	@JsonProperty("linkGroups")
	private List<JiraIssueOpLinkGroup> linkGroups = null;

	public JiraIssueOperations linkGroups(List<JiraIssueOpLinkGroup> linkGroups) {
		this.linkGroups = linkGroups;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public List<JiraIssueOpLinkGroup> getLinkGroups() {
		return linkGroups;
	}

	public void setLinkGroups(List<JiraIssueOpLinkGroup> linkGroups) {
		this.linkGroups = linkGroups;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraIssueOperations jiraIssueComment = (JiraIssueOperations) o;
		return Objects.equals(this.linkGroups, jiraIssueComment.linkGroups);
	}

	@Override
	public int hashCode() {
		return Objects.hash(linkGroups);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueOperations {\n");

		sb.append("    linkGroups: ").append(toIndentedString(linkGroups)).append("\n");
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
