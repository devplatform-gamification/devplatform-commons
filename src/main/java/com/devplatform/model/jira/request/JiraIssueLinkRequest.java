package com.devplatform.model.jira.request;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.jira.JiraIssue;
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
public class JiraIssueLinkRequest {
	@JsonProperty("inwardIssue")
	private JiraIssue inwardIssue = null;
	@JsonProperty("outwardIssue")
	private JiraIssue outwardIssue = null;

	@JsonProperty("type")
	private JiraIssueLinkTypeRequest issueLinkType = null;

	public JiraIssueLinkRequest inwardIssue(JiraIssue inwardIssue) {
		this.inwardIssue = inwardIssue;
		return this;
	}
	@ApiModelProperty(value = "")
	@Valid
	public JiraIssue getInwardIssue() {
		return inwardIssue;
	}
	public void setInwardIssue(JiraIssue inwardIssue) {
		this.inwardIssue = inwardIssue;
	}
	
	public JiraIssueLinkRequest outwardIssue(JiraIssue outwardIssue) {
		this.outwardIssue = outwardIssue;
		return this;
	}
	@ApiModelProperty(value = "")
	@Valid
	public JiraIssue getOutwardIssue() {
		return outwardIssue;
	}

	public void setOutwardIssue(JiraIssue outwardIssue) {
		this.outwardIssue = outwardIssue;
	}

	public JiraIssueLinkRequest issueLinkType(JiraIssueLinkTypeRequest issueLinkType) {
		this.issueLinkType = issueLinkType;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public JiraIssueLinkTypeRequest getIssueLinkType() {
		return issueLinkType;
	}

	public void setIssueLinkType(JiraIssueLinkTypeRequest issueLinkType) {
		this.issueLinkType = issueLinkType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraIssueLinkRequest jiraIssueComment = (JiraIssueLinkRequest) o;
		return Objects.equals(this.inwardIssue, jiraIssueComment.inwardIssue)
				&& Objects.equals(this.outwardIssue, jiraIssueComment.outwardIssue)
				&& Objects.equals(this.issueLinkType, jiraIssueComment.issueLinkType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(inwardIssue, outwardIssue, issueLinkType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueLinkRequest {\n");
		sb.append("    inwardIssue: ").append(toIndentedString(inwardIssue)).append("\n");
		sb.append("    outwardIssue: ").append(toIndentedString(outwardIssue)).append("\n");
		sb.append("    issueLinkType: ").append(toIndentedString(issueLinkType)).append("\n");
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
