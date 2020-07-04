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
	private String file_path = null;

	@JsonProperty("previous_path")
	private String previous_path = null;

	@JsonProperty("content")
	private String content = null;

	@JsonProperty("encoding")
	private String encoding = null;
	
	@JsonProperty("last_commit_id")
	private String last_commit_id = null;
	
	@JsonProperty("execute_filemode")
	private Boolean execute_filemode = null;
	
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

	public GitlabCommitActionRequest file_path(String file_path) {
		this.file_path = file_path;
		return this;
	}

	@Valid
	public String getFile_path() {
		return file_path;
	}

	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}

	public GitlabCommitActionRequest previous_path(String previous_path) {
		this.previous_path = previous_path;
		return this;
	}

	@Valid
	public String getPrevious_path() {
		return previous_path;
	}

	public void setPrevious_path(String previous_path) {
		this.previous_path = previous_path;
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

	public GitlabCommitActionRequest last_commit_id(String last_commit_id) {
		this.last_commit_id = last_commit_id;
		return this;
	}

	@Valid
	public String getLast_commit_id() {
		return last_commit_id;
	}

	public void setLast_commit_id(String last_commit_id) {
		this.last_commit_id = last_commit_id;
	}

	public GitlabCommitActionRequest execute_filemode(Boolean execute_filemode) {
		this.execute_filemode = execute_filemode;
		return this;
	}

	@Valid
	public Boolean getExecute_filemode() {
		return execute_filemode;
	}

	public void setExecute_filemode(Boolean execute_filemode) {
		this.execute_filemode = execute_filemode;
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
		return Objects.equals(this.action, gitlabCommit.action) && Objects.equals(this.file_path, gitlabCommit.file_path)
				&& Objects.equals(this.previous_path, gitlabCommit.previous_path) && Objects.equals(this.content, gitlabCommit.content)
				&& Objects.equals(this.encoding, gitlabCommit.encoding) && Objects.equals(this.last_commit_id, gitlabCommit.last_commit_id)
				&& Objects.equals(this.execute_filemode, gitlabCommit.execute_filemode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(action, file_path, previous_path, content, encoding, last_commit_id, execute_filemode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabCommitActionRequest {\n");

		sb.append("    action: ").append(toIndentedString(action)).append("\n");
		sb.append("    file_path: ").append(toIndentedString(file_path)).append("\n");
		sb.append("    previous_path: ").append(toIndentedString(previous_path)).append("\n");
		sb.append("    content: ").append(toIndentedString(content)).append("\n");
		sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
		sb.append("    last_commit_id: ").append(toIndentedString(last_commit_id)).append("\n");
		sb.append("    execute_filemode: ").append(toIndentedString(execute_filemode)).append("\n");
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
