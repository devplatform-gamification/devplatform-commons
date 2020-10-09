package com.devplatform.model.gitlab;

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
public class GitlabBuild {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("stage")
	private String stage = null;

	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("status")
	private GitlabBuildStatusEnum status = null;
	
	@JsonProperty("created_at")
	private String createdAt = null;
	
	@JsonProperty("started_at")
	private String startedAt = null;
	
	@JsonProperty("finished_at")
	private String finishedAt = null;
	
	@JsonProperty("when")
	private String when = null;
	
	@JsonProperty("manual")
	private Boolean manual = null;
	
	@JsonProperty("allow_failure")
	private Boolean allowFailure = null;
	
	@JsonProperty("user")
	private GitlabUser user = null;
	
	@JsonProperty("runner")
	private GitlabRunner runner = null;

	@JsonProperty("artifacts_file")
	private GitlabArtifactFile artifactsFile = null;

	public GitlabBuild id(String id) {
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



	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GitlabBuildStatusEnum getStatus() {
		return status;
	}

	public void setStatus(GitlabBuildStatusEnum status) {
		this.status = status;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getStartedAt() {
		return startedAt;
	}

	public void setStartedAt(String startedAt) {
		this.startedAt = startedAt;
	}

	public String getFinishedAt() {
		return finishedAt;
	}

	public void setFinishedAt(String finishedAt) {
		this.finishedAt = finishedAt;
	}

	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}

	public Boolean getManual() {
		return manual;
	}

	public void setManual(Boolean manual) {
		this.manual = manual;
	}

	public Boolean getAllowFailure() {
		return allowFailure;
	}

	public void setAllowFailure(Boolean allowFailure) {
		this.allowFailure = allowFailure;
	}

	public GitlabUser getUser() {
		return user;
	}

	public void setUser(GitlabUser user) {
		this.user = user;
	}

	public GitlabRunner getRunner() {
		return runner;
	}

	public void setRunner(GitlabRunner runner) {
		this.runner = runner;
	}

	public GitlabArtifactFile getArtifactsFile() {
		return artifactsFile;
	}

	public void setArtifactsFile(GitlabArtifactFile artifactsFile) {
		this.artifactsFile = artifactsFile;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabBuild gitlabCommit = (GitlabBuild) o;
		return Objects.equals(this.id, gitlabCommit.id) && Objects.equals(this.stage, gitlabCommit.stage)
				&& Objects.equals(this.name, gitlabCommit.name) && Objects.equals(this.status, gitlabCommit.status)
				&& Objects.equals(this.createdAt, gitlabCommit.createdAt) && Objects.equals(this.startedAt, gitlabCommit.startedAt)
				&& Objects.equals(this.finishedAt, gitlabCommit.finishedAt) && Objects.equals(this.when, gitlabCommit.when)
				&& Objects.equals(this.manual, gitlabCommit.manual) && Objects.equals(this.allowFailure, gitlabCommit.allowFailure)
				&& Objects.equals(this.user, gitlabCommit.user) && Objects.equals(this.runner, gitlabCommit.runner)
				&& Objects.equals(this.artifactsFile, gitlabCommit.artifactsFile);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, stage, name, status, createdAt, startedAt, finishedAt, when, manual, allowFailure, user, runner, artifactsFile);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabBuild {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
		sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
		sb.append("    when: ").append(toIndentedString(when)).append("\n");
		sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
		sb.append("    allowFailure: ").append(toIndentedString(allowFailure)).append("\n");
		sb.append("    user: ").append(toIndentedString(user)).append("\n");
		sb.append("    runner: ").append(toIndentedString(runner)).append("\n");
		sb.append("    artifactsFile: ").append(toIndentedString(artifactsFile)).append("\n");
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
