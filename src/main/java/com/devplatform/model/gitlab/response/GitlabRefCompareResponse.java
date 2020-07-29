package com.devplatform.model.gitlab.response;

import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.gitlab.GitlabStDiff;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabRefCompareResponse {
	@JsonProperty("commit")
	private GitlabCommitResponse commit = null;
	
	@JsonProperty("commits")
	private List<GitlabCommitResponse> commits = null;

	@JsonProperty("diffs")
	private List<GitlabStDiff> diffs = null;

	@JsonProperty("compare_timeout")
	private Boolean compareTimeout = null;

	@JsonProperty("compare_same_ref")
	private Boolean compareSameRef = null;

	public GitlabRefCompareResponse commit(GitlabCommitResponse commit) {
		this.commit = commit;
		return this;
	}

	@Valid
	public GitlabCommitResponse getCommit() {
		return commit;
	}

	public void setCommit(GitlabCommitResponse commit) {
		this.commit = commit;
	}

	public GitlabRefCompareResponse commits(List<GitlabCommitResponse> commits) {
		this.commits = commits;
		return this;
	}

	@Valid
	public List<GitlabCommitResponse> getCommits() {
		return commits;
	}

	public void setCommits(List<GitlabCommitResponse> commits) {
		this.commits = commits;
	}

	public GitlabRefCompareResponse diffs(List<GitlabStDiff> diffs) {
		this.diffs = diffs;
		return this;
	}

	@Valid
	public List<GitlabStDiff> getDiffs() {
		return diffs;
	}

	public void setDiffs(List<GitlabStDiff> diffs) {
		this.diffs = diffs;
	}

	public GitlabRefCompareResponse compareTimeout(Boolean compareTimeout) {
		this.compareTimeout = compareTimeout;
		return this;
	}

	@Valid
	public Boolean getCompareTimeout() {
		return compareTimeout;
	}

	public void setCompareTimeout(Boolean compareTimeout) {
		this.compareTimeout = compareTimeout;
	}

	public GitlabRefCompareResponse compareSameRef(Boolean compareSameRef) {
		this.compareSameRef = compareSameRef;
		return this;
	}

	@Valid
	public Boolean getCompareSameRef() {
		return compareSameRef;
	}

	public void setCompareSameRef(Boolean compareSameRef) {
		this.compareSameRef = compareSameRef;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabRefCompareResponse gitlabCommit = (GitlabRefCompareResponse) o;
		return Objects.equals(this.commit, gitlabCommit.commit)
				&& Objects.equals(this.commits, gitlabCommit.commits)
				&& Objects.equals(this.diffs, gitlabCommit.diffs)
				&& Objects.equals(this.compareTimeout, gitlabCommit.compareTimeout)
				&& Objects.equals(this.compareSameRef, gitlabCommit.compareSameRef);
	}

	@Override
	public int hashCode() {
		return Objects.hash(commit, commits, diffs, compareTimeout, compareSameRef);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabRefCompareResponse {\n");
		sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
		sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
		sb.append("    diffs: ").append(toIndentedString(diffs)).append("\n");
		sb.append("    compareTimeout: ").append(toIndentedString(compareTimeout)).append("\n");
		sb.append("    compareSameRef: ").append(toIndentedString(compareSameRef)).append("\n");
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
