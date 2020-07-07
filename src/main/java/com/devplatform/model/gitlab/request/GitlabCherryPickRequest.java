package com.devplatform.model.gitlab.request;

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
public class GitlabCherryPickRequest {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("branch")
	private String branch = null;

	@JsonProperty("sha")
	private String sha = null;

	public GitlabCherryPickRequest id(String id) {
		this.id = id;
		return this;
	}

	@Valid
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public GitlabCherryPickRequest branch(String branch) {
		this.branch = branch;
		return this;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public GitlabCherryPickRequest sha(String sha) {
		this.sha = sha;
		return this;
	}

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
		GitlabCherryPickRequest gitlabCherrypick = (GitlabCherryPickRequest) o;
		return Objects.equals(this.id, gitlabCherrypick.id) && Objects.equals(this.sha, gitlabCherrypick.sha)
				&& Objects.equals(this.branch, gitlabCherrypick.branch);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, sha, branch);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabCherryPickRequest {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
		sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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
