package com.devplatform.model.gitlab.request;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabCommitRequest {
	@JsonProperty("branch")
	private String branch = null;

	@JsonProperty("commit_message")
	private String commitMessage = null;

	@JsonProperty("author_email")
	private String authorEmail = null;

	@JsonProperty("author_name")
	private String authorName = null;
	
	@JsonProperty("stats")
	private Boolean stats = Boolean.TRUE;

	@JsonProperty("actions")
	private List<GitlabCommitActionRequest> actions = new ArrayList<>();

	public GitlabCommitRequest branch(String branch) {
		this.branch = branch;
		return this;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public GitlabCommitRequest commitMessage(String commitMessage) {
		this.commitMessage = commitMessage;
		return this;
	}

	public String getCommitMessage() {
		return commitMessage;
	}

	public void setCommitMessage(String commitMessage) {
		this.commitMessage = commitMessage;
	}

	public GitlabCommitRequest authorName(String authorName) {
		this.authorName = authorName;
		return this;
	}

	@Valid
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public GitlabCommitRequest authorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
		return this;
	}

	@Valid
	public String getAuthorEmail() {
		return authorEmail;
	}

	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	
	public GitlabCommitRequest stats(Boolean stats) {
		this.stats = stats;
		return this;
	}

	public Boolean getStats() {
		return stats;
	}

	public void setStats(Boolean stats) {
		this.stats = stats;
	}
	
	public GitlabCommitRequest actions(List<GitlabCommitActionRequest> actions) {
		this.actions = actions;
		return this;
	}

	public List<GitlabCommitActionRequest> getActions() {
		return actions;
	}

	public void setActions(List<GitlabCommitActionRequest> actions) {
		this.actions = actions;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabCommitRequest gitlabCommit = (GitlabCommitRequest) o;
		return Objects.equals(this.commitMessage, gitlabCommit.commitMessage)
				&& Objects.equals(this.branch, gitlabCommit.branch) && Objects.equals(this.authorEmail, gitlabCommit.authorEmail)
				&& Objects.equals(this.authorName, gitlabCommit.authorName) && Objects.equals(this.stats, gitlabCommit.stats)
				 && Objects.equals(this.actions, gitlabCommit.actions);
	}

	@Override
	public int hashCode() {
		return Objects.hash(commitMessage, branch, authorEmail, authorName, stats, actions);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabCommitRequest {\n");

		sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
		sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
		sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
		sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
		sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
		sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
