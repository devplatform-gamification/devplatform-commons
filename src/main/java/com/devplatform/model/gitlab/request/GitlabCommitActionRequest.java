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
public class GitlabCommitActionRequest {
	@JsonProperty("action")
	private GitlabCommitActionsEnum action = null;

	@JsonProperty("file_path")
	private String filePath = null;

	@JsonProperty("previous_path")
	private String previousPath = null;

	@JsonProperty("content")
	private String content = null;

	@JsonProperty("encoding")
	private String encoding = null;
	
	@JsonProperty("last_commit_id")
	private String lastCommitId = null;
	
	@JsonProperty("execute_filemode")
	private Boolean executeFilemode = null;
	
	public GitlabCommitActionRequest action(GitlabCommitActionsEnum action) {
		this.action = action;
		return this;
	}

	@Valid
	public GitlabCommitActionsEnum getAction() {
		return action;
	}

	public void setAction(GitlabCommitActionsEnum action) {
		this.action = action;
	}

	public GitlabCommitActionRequest filePath(String filePath) {
		this.filePath = filePath;
		return this;
	}

	@Valid
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public GitlabCommitActionRequest previousPath(String previousPath) {
		this.previousPath = previousPath;
		return this;
	}

	@Valid
	public String getPreviousPath() {
		return previousPath;
	}

	public void setPreviousPath(String previousPath) {
		this.previousPath = previousPath;
	}

	public GitlabCommitActionRequest content(String content) {
		this.content = content;
		return this;
	}

	@Valid
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public GitlabCommitActionRequest encoding(String encoding) {
		this.encoding = encoding;
		return this;
	}

	@Valid
	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public GitlabCommitActionRequest lastCommitId(String lastCommitId) {
		this.lastCommitId = lastCommitId;
		return this;
	}

	@Valid
	public String getLastCommitId() {
		return lastCommitId;
	}

	public void setLastCommitId(String lastCommitId) {
		this.lastCommitId = lastCommitId;
	}

	public GitlabCommitActionRequest executeFilemode(Boolean executeFilemode) {
		this.executeFilemode = executeFilemode;
		return this;
	}

	@Valid
	public Boolean getExecute_filemode() {
		return executeFilemode;
	}

	public void setExecute_filemode(Boolean executeFilemode) {
		this.executeFilemode = executeFilemode;
	}
	
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabCommitActionRequest gitlabCommit = (GitlabCommitActionRequest) o;
		return Objects.equals(this.action, gitlabCommit.action) && Objects.equals(this.filePath, gitlabCommit.filePath)
				&& Objects.equals(this.previousPath, gitlabCommit.previousPath) && Objects.equals(this.content, gitlabCommit.content)
				&& Objects.equals(this.encoding, gitlabCommit.encoding) && Objects.equals(this.lastCommitId, gitlabCommit.lastCommitId)
				&& Objects.equals(this.executeFilemode, gitlabCommit.executeFilemode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(action, filePath, previousPath, content, encoding, lastCommitId, executeFilemode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabCommitActionRequest {\n");

		sb.append("    action: ").append(toIndentedString(action)).append("\n");
		sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
		sb.append("    previousPath: ").append(toIndentedString(previousPath)).append("\n");
		sb.append("    content: ").append(toIndentedString(content)).append("\n");
		sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
		sb.append("    lastCommitId: ").append(toIndentedString(lastCommitId)).append("\n");
		sb.append("    executeFilemode: ").append(toIndentedString(executeFilemode)).append("\n");
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
