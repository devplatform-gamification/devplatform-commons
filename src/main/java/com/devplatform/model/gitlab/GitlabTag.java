package com.devplatform.model.gitlab;

import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.gitlab.response.GitlabCommitResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabTag {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("message")
	private String message = null;

	@JsonProperty("target")
	private String target = null;

	@JsonProperty("protected")
	private Boolean protectedTag = null;

	@JsonProperty("commit")
	private GitlabCommitResponse commit = null;

	@JsonProperty("release")
	private GitlabTagRelease release = null;

	public GitlabTag name(String name) {
		this.name = name;
		return this;
	}

	@Valid
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GitlabTag message(String message) {
		this.message = message;
		return this;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public GitlabTag target(String target) {
		this.target = target;
		return this;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public GitlabTag protectedTag(Boolean protectedTag) {
		this.protectedTag = protectedTag;
		return this;
	}

	public Boolean getProtectedTag() {
		return protectedTag;
	}

	public void setProtectedTag(Boolean protectedTag) {
		this.protectedTag = protectedTag;
	}

	public GitlabTag commit(GitlabCommitResponse commit) {
		this.commit = commit;
		return this;
	}

	public GitlabCommitResponse getCommit() {
		return commit;
	}

	public void setCommit(GitlabCommitResponse commit) {
		this.commit = commit;
	}

	public GitlabTag release(GitlabTagRelease release) {
		this.release = release;
		return this;
	}

	public GitlabTagRelease getRelease() {
		return release;
	}

	public void setRelease(GitlabTagRelease release) {
		this.release = release;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabTag gitlabCommit = (GitlabTag) o;
		return Objects.equals(this.name, gitlabCommit.name) && Objects.equals(this.message, gitlabCommit.message)
				&& Objects.equals(this.target, gitlabCommit.target) && Objects.equals(this.protectedTag, gitlabCommit.protectedTag)
				&& Objects.equals(this.commit, gitlabCommit.commit) && Objects.equals(this.release, gitlabCommit.release);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, message, target, protectedTag, commit, release);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabTag {\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    target: ").append(toIndentedString(target)).append("\n");
		sb.append("    protectedTag: ").append(toIndentedString(protectedTag)).append("\n");
		sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
		sb.append("    release: ").append(toIndentedString(release)).append("\n");
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
