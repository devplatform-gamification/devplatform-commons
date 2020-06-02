package com.devplatform.model.gitlab;

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
public class GitlabCommit {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("message")
	private String message = null;

	@JsonProperty("title")
	private String title = null;

	@JsonProperty("timestamp")
	private String timestamp = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("author")
	private GitlabCommitAuthor author = null;
	
	@JsonProperty("added")
	private List<String> added = null;
	
	@JsonProperty("modified")
	private List<String> modified = null;

	@JsonProperty("removed")
	private List<String> removed = null;


	public GitlabCommit id(String id) {
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

	public GitlabCommit message(String message) {
		this.message = message;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public GitlabCommit title(String title) {
		this.title = title;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public GitlabCommit timestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	@Valid
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public GitlabCommit url(String url) {
		this.url = url;
		return this;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public GitlabCommit author(GitlabCommitAuthor author) {
		this.author = author;
		return this;
	}

	@Valid
	public GitlabCommitAuthor getAuthor() {
		return author;
	}

	public void setAuthor(GitlabCommitAuthor author) {
		this.author = author;
	}

	public GitlabCommit added(List<String> added) {
		this.added = added;
		return this;
	}

	public List<String> getAdded() {
		return added;
	}

	public void setAdded(List<String> added) {
		this.added = added;
	}

	public GitlabCommit modified(List<String> modified) {
		this.modified = modified;
		return this;
	}

	public List<String> getModified() {
		return modified;
	}

	public void setModified(List<String> modified) {
		this.modified = modified;
	}

	public GitlabCommit removed(List<String> removed) {
		this.removed = removed;
		return this;
	}

	public List<String> getRemoved() {
		return removed;
	}

	public void setRemoved(List<String> removed) {
		this.removed = removed;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabCommit gitlabCommit = (GitlabCommit) o;
		return Objects.equals(this.id, gitlabCommit.id) && Objects.equals(this.message, gitlabCommit.message)
				&& Objects.equals(this.timestamp, gitlabCommit.timestamp) && Objects.equals(this.url, gitlabCommit.url)
				&& Objects.equals(this.author, gitlabCommit.author);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, message, timestamp, url, author);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabCommit {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    author: ").append(toIndentedString(author)).append("\n");
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
