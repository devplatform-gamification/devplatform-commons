package com.devplatform.model.jira;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraVersionReleaseNoteIssues {
	@JsonProperty("issueKey")
	private String issueKey = null;
	
	@JsonProperty("author")
	private JiraUser author = null;

	@JsonProperty("summary")
	private String summary = null;

	@JsonProperty("release-observation")
	private String releaseObservation = null;

	@JsonProperty("issueType")
	private String issueType = null;

	@JsonProperty("priority")
	private Integer priority = null;

	public JiraVersionReleaseNoteIssues issueKey(String issueKey) {
		this.issueKey = issueKey;
		return this;
	}

	public String getIssueKey() {
		return issueKey;
	}

	public void setIssueKey(String issueKey) {
		this.issueKey = issueKey;
	}

	public JiraVersionReleaseNoteIssues author(JiraUser author) {
		this.author = author;
		return this;
	}

	public JiraUser getAuthor() {
		return author;
	}

	public void setAuthor(JiraUser author) {
		this.author = author;
	}

	public JiraVersionReleaseNoteIssues summary(String summary) {
		this.summary = summary;
		return this;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public JiraVersionReleaseNoteIssues releaseObservation(String releaseObservation) {
		this.releaseObservation = releaseObservation;
		return this;
	}

	public String getReleaseObservation() {
		return releaseObservation;
	}

	public void setReleaseObservation(String releaseObservation) {
		this.releaseObservation = releaseObservation;
	}

	public JiraVersionReleaseNoteIssues issueType(String issueType) {
		this.issueType = issueType;
		return this;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public JiraVersionReleaseNoteIssues priority(Integer priority) {
		this.priority = priority;
		return this;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraVersionReleaseNoteIssues releaseItem = (JiraVersionReleaseNoteIssues) o;
		return Objects.equals(this.issueKey, releaseItem.issueKey) && Objects.equals(this.author, releaseItem.author)
			&& Objects.equals(this.summary, releaseItem.summary) && Objects.equals(this.releaseObservation, releaseItem.releaseObservation)
			&& Objects.equals(this.issueType, releaseItem.issueType) && Objects.equals(this.priority, releaseItem.priority);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(issueKey, author, summary, releaseObservation, issueType, priority);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraVersionReleaseNoteIssues {\n");
		sb.append("    issueKey: ").append(toIndentedString(issueKey)).append("\n");
		sb.append("    author: ").append(toIndentedString(author)).append("\n");
		sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
		sb.append("    releaseObservation: ").append(toIndentedString(releaseObservation)).append("\n");
		sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
		sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
