package com.devplatform.model.jira.response;

import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.jira.JiraIssue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraJQLSearchResponse {
	@JsonProperty("expand")
	private String expand = null;
	
	@JsonProperty("startAt")
	private Integer startAt = null;

	@JsonProperty("maxResults")
	private Integer maxResults = null;

	@JsonProperty("total")
	private Integer total = null;

	@JsonProperty("issues")
	private List<JiraIssue> issues = null;
	
	public JiraJQLSearchResponse expand(String expand) {
		this.expand = expand;
		return this;
	}

	@Valid
	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public JiraJQLSearchResponse startAt(Integer startAt) {
		this.startAt = startAt;
		return this;
	}

	@Valid
	public Integer getStartAt() {
		return startAt;
	}

	public void setStartAt(Integer startAt) {
		this.startAt = startAt;
	}

	public JiraJQLSearchResponse maxResults(Integer maxResults) {
		this.maxResults = maxResults;
		return this;
	}

	@Valid
	public Integer getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public JiraJQLSearchResponse total(Integer total) {
		this.total = total;
		return this;
	}

	@Valid
	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public JiraJQLSearchResponse issues(List<JiraIssue> issues) {
		this.issues = issues;
		return this;
	}

	@Valid
	public List<JiraIssue> getIssues() {
		return issues;
	}

	public void setIssues(List<JiraIssue> issues) {
		this.issues = issues;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraJQLSearchResponse gitlabCommit = (JiraJQLSearchResponse) o;
		return Objects.equals(this.expand, gitlabCommit.expand)
				&& Objects.equals(this.startAt, gitlabCommit.startAt)
				&& Objects.equals(this.maxResults, gitlabCommit.maxResults)
				&& Objects.equals(this.total, gitlabCommit.total)
				&& Objects.equals(this.issues, gitlabCommit.issues);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(expand, startAt, maxResults, total, issues);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraJQLSearchResponse {\n");
		sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
		sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
		sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
		sb.append("    total: ").append(toIndentedString(total)).append("\n");
		sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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
