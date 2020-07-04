package com.devplatform.model.gitlab.response;

import java.util.HashMap;
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
public class GitlabCommitResponse {
	@JsonProperty("id")
	private String id = null;
	
	@JsonProperty("short_id")
	private String shortId = null;

	@JsonProperty("message")
	private String message = null;

	@JsonProperty("title")
	private String title = null;

	@JsonProperty("author_name")
	private String authorName = null;

	@JsonProperty("author_email")
	private String authorEmail = null;

	@JsonProperty("committer_name")
	private String committerName = null;

	@JsonProperty("committer_email")
	private String committerEmail = null;

	@JsonProperty("created_at")
	private String createdAt = null;

	@JsonProperty("parent_ids")
	private List<String> parentIds = null;

	@JsonProperty("committed_date")
	private String committedDate = null;
	
	@JsonProperty("authored_date")
	private String authoredDate = null;
	
	@JsonProperty("status")
	private String status = null;
	
	@JsonProperty("stats")
	private HashMap<String, Integer> stats = null;
	
	@JsonProperty("web_url")
	private String webUrl = null;
	

	public GitlabCommitResponse id(String id) {
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

	public GitlabCommitResponse message(String message) {
		this.message = message;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public GitlabCommitResponse title(String title) {
		this.title = title;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public GitlabCommitResponse shortId(String shortId) {
		this.shortId = shortId;
		return this;
	}

	public String getShortId() {
		return shortId;
	}

	public void setShortId(String shortId) {
		this.shortId = shortId;
	}

	public GitlabCommitResponse authorName(String authorName) {
		this.authorName = authorName;
		return this;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public GitlabCommitResponse authorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
		return this;
	}

	public String getAuthorEmail() {
		return authorEmail;
	}

	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}

	public GitlabCommitResponse committerName(String committerName) {
		this.committerName = committerName;
		return this;
	}

	public String getCommitterName() {
		return committerName;
	}

	public void setCommitterName(String committerName) {
		this.committerName = committerName;
	}

	public GitlabCommitResponse committerEmail(String committerEmail) {
		this.committerEmail = committerEmail;
		return this;
	}

	public String getCommitterEmail() {
		return committerEmail;
	}

	public void setCommitterEmail(String committerEmail) {
		this.committerEmail = committerEmail;
	}

	public GitlabCommitResponse createdAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public GitlabCommitResponse parentIds(List<String> parentIds) {
		this.parentIds = parentIds;
		return this;
	}

	public List<String> getParentIds() {
		return parentIds;
	}

	public void setParentIds(List<String> parentIds) {
		this.parentIds = parentIds;
	}

	public GitlabCommitResponse committedDate(String committedDate) {
		this.committedDate = committedDate;
		return this;
	}

	public String getCommittedDate() {
		return committedDate;
	}

	public void setCommittedDate(String committedDate) {
		this.committedDate = committedDate;
	}

	public GitlabCommitResponse authoredDate(String authoredDate) {
		this.authoredDate = authoredDate;
		return this;
	}

	public String getAuthoredDate() {
		return authoredDate;
	}

	public void setAuthoredDate(String authoredDate) {
		this.authoredDate = authoredDate;
	}

	public GitlabCommitResponse status(String status) {
		this.status = status;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public GitlabCommitResponse stats(HashMap<String, Integer> stats) {
		this.stats = stats;
		return this;
	}

	public HashMap<String, Integer> getStats() {
		return stats;
	}

	public void setStats(HashMap<String, Integer> stats) {
		this.stats = stats;
	}

	public GitlabCommitResponse webUrl(String webUrl) {
		this.webUrl = webUrl;
		return this;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabCommitResponse gitlabCommit = (GitlabCommitResponse) o;
		return Objects.equals(this.id, gitlabCommit.id)
				&& Objects.equals(this.shortId, gitlabCommit.shortId)
				&& Objects.equals(this.message, gitlabCommit.message)
				&& Objects.equals(this.title, gitlabCommit.title)
				&& Objects.equals(this.authorName, gitlabCommit.authorName)
				&& Objects.equals(this.authorEmail, gitlabCommit.authorEmail)
				&& Objects.equals(this.committerName, gitlabCommit.committerName)
				&& Objects.equals(this.committerEmail, gitlabCommit.committerEmail)
				&& Objects.equals(this.createdAt, gitlabCommit.createdAt)
				&& Objects.equals(this.parentIds, gitlabCommit.parentIds)
				&& Objects.equals(this.committedDate, gitlabCommit.committedDate)
				&& Objects.equals(this.authoredDate, gitlabCommit.authoredDate)
				&& Objects.equals(this.status, gitlabCommit.status)
				&& Objects.equals(this.stats, gitlabCommit.stats)
				&& Objects.equals(this.webUrl, gitlabCommit.webUrl);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, shortId, message, title, authorName, authorEmail, committerName, committerEmail,
				createdAt, parentIds, committedDate, authoredDate, status, stats, webUrl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabCommitResponse {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    shortId: ").append(toIndentedString(shortId)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
		sb.append("    authorEmail: ").append(toIndentedString(authorEmail)).append("\n");
		sb.append("    committerName: ").append(toIndentedString(committerName)).append("\n");
		sb.append("    committerEmail: ").append(toIndentedString(committerEmail)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    parentIds: ").append(toIndentedString(parentIds)).append("\n");
		sb.append("    committedDate: ").append(toIndentedString(committedDate)).append("\n");
		sb.append("    authoredDate: ").append(toIndentedString(authoredDate)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
		sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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
