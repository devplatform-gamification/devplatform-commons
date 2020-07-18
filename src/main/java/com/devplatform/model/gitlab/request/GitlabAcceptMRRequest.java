package com.devplatform.model.gitlab.request;

import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabAcceptMRRequest {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("merge_request_iid")
	private BigDecimal mergeRequestIid = null;

	@JsonProperty("merge_commit_message")
	private String mergeCommitMessage = null;

	@JsonProperty("squash_commit_message")
	private String squashCommitMessage = null;

	@JsonProperty("squash")
	private Boolean squash = null;

	@JsonProperty("should_remove_source_branch")
	private Boolean shouldRemoveSourceBranch = null;

	@JsonProperty("merge_when_pipeline_succeeds")
	private Boolean mergeWhenPipelineSucceeds = null;

	@JsonProperty("sha")
	private String sha = null;

	public GitlabAcceptMRRequest id(String id) {
		this.id = id;
		return this;
	}
	
	@Valid
	@NotNull
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public GitlabAcceptMRRequest mergeRequestIid(BigDecimal mergeRequestIid) {
		this.mergeRequestIid = mergeRequestIid;
		return this;
	}
	
	@Valid
	@NotNull
	public BigDecimal getMergeRequestIid() {
		return mergeRequestIid;
	}

	public void setMergeRequestIid(BigDecimal mergeRequestIid) {
		this.mergeRequestIid = mergeRequestIid;
	}

	public GitlabAcceptMRRequest mergeCommitMessage(String mergeCommitMessage) {
		this.mergeCommitMessage = mergeCommitMessage;
		return this;
	}
	
	@Valid
	@NotNull
	public String getMergeCommitMessage() {
		return mergeCommitMessage;
	}

	public void setMergeCommitMessage(String mergeCommitMessage) {
		this.mergeCommitMessage = mergeCommitMessage;
	}

	public GitlabAcceptMRRequest squashCommitMessage(String squashCommitMessage) {
		this.squashCommitMessage = squashCommitMessage;
		return this;
	}
	
	@Valid
	public String getSquashCommitMessage() {
		return squashCommitMessage;
	}

	public void setSquashCommitMessage(String squashCommitMessage) {
		this.squashCommitMessage = squashCommitMessage;
	}

	public GitlabAcceptMRRequest squash(Boolean squash) {
		this.squash = squash;
		return this;
	}
	
	@Valid
	public Boolean getSquash() {
		return squash;
	}

	public void setSquash(Boolean squash) {
		this.squash = squash;
	}

	public GitlabAcceptMRRequest shouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
		this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
		return this;
	}
	
	@Valid
	public Boolean getShouldRemoveSourceBranch() {
		return shouldRemoveSourceBranch;
	}

	public void setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
		this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
	}

	public GitlabAcceptMRRequest mergeWhenPipelineSucceeds(Boolean mergeWhenPipelineSucceeds) {
		this.mergeWhenPipelineSucceeds = mergeWhenPipelineSucceeds;
		return this;
	}
	
	@Valid
	public Boolean getMergeWhenPipelineSucceeds() {
		return mergeWhenPipelineSucceeds;
	}

	public void setMergeWhenPipelineSucceeds(Boolean mergeWhenPipelineSucceeds) {
		this.mergeWhenPipelineSucceeds = mergeWhenPipelineSucceeds;
	}

	public GitlabAcceptMRRequest sha(String sha) {
		this.sha = sha;
		return this;
	}
	
	@Valid
	public String getSha() {
		return sha;
	}

	public void setSha(String sha) {
		this.sha = sha;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabAcceptMRRequest gitlabCommit = (GitlabAcceptMRRequest) o;
		return Objects.equals(this.id, gitlabCommit.id)
				&& Objects.equals(this.mergeRequestIid, gitlabCommit.mergeRequestIid)
				&& Objects.equals(this.mergeCommitMessage, gitlabCommit.mergeCommitMessage)
				&& Objects.equals(this.squashCommitMessage, gitlabCommit.squashCommitMessage)
				&& Objects.equals(this.squash, gitlabCommit.squash)
				&& Objects.equals(this.shouldRemoveSourceBranch, gitlabCommit.shouldRemoveSourceBranch)
				&& Objects.equals(this.mergeWhenPipelineSucceeds, gitlabCommit.mergeWhenPipelineSucceeds)
				&& Objects.equals(this.sha, gitlabCommit.sha);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, mergeRequestIid, mergeCommitMessage, squashCommitMessage, squash, shouldRemoveSourceBranch,
				mergeWhenPipelineSucceeds, sha);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabMRRequest {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    mergeRequestIid: ").append(toIndentedString(mergeRequestIid)).append("\n");
		sb.append("    mergeCommitMessage: ").append(toIndentedString(mergeCommitMessage)).append("\n");
		sb.append("    squashCommitMessage: ").append(toIndentedString(squashCommitMessage)).append("\n");
		sb.append("    squash: ").append(toIndentedString(squash)).append("\n");
		sb.append("    shouldRemoveSourceBranch: ").append(toIndentedString(shouldRemoveSourceBranch)).append("\n");
		sb.append("    mergeWhenPipelineSucceeds: ").append(toIndentedString(mergeWhenPipelineSucceeds)).append("\n");
		sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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
