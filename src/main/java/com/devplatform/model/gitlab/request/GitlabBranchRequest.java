package com.devplatform.model.gitlab.request;

import java.util.Objects;

import javax.annotation.Generated;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabBranchRequest {
	@JsonProperty("branch")
	private String branch = null;

	@JsonProperty("ref")
	private String ref = null;

	public GitlabBranchRequest branch(String branch) {
		this.branch = branch;
		return this;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public GitlabBranchRequest ref(String ref) {
		this.ref = ref;
		return this;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabBranchRequest gitlabCommit = (GitlabBranchRequest) o;
		return Objects.equals(this.branch, gitlabCommit.branch)
				 && Objects.equals(this.ref, gitlabCommit.ref);
	}

	@Override
	public int hashCode() {
		return Objects.hash(branch, ref);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabBranchRequest {\n");
		sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
		sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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
