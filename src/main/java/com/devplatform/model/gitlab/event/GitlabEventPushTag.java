package com.devplatform.model.gitlab.event;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.annotation.Generated;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.gitlab.GitlabCommit;
import com.devplatform.model.gitlab.GitlabProject;
import com.devplatform.model.gitlab.GitlabRepository;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabMergeRequest
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabEventPushTag extends GitlabEvent {
	@JsonProperty("event_name")
	private GitlabEventTypeEnum eventName = null;

	@JsonProperty("before")
	private String before = null;

	@JsonProperty("after")
	private String after = null;

	@JsonProperty("ref")
	private String ref = null;

	@JsonProperty("checkout_sha")
	private String checkoutSha = null;

	@JsonProperty("message")
	private String message = null;

	@JsonProperty("user_id")
	private BigInteger userId = null;

	@JsonProperty("user_name")
	private String userName = null;

	@JsonProperty("user_username")
	private String userUsername = null;

	@JsonProperty("user_email")
	private String userEmail = null;

	@JsonProperty("user_avatar")
	private String userAvatar = null;

	@JsonProperty("project_id")
	private BigDecimal projectId = null;

	@JsonProperty("project")
	private GitlabProject project = null;
	
	@JsonProperty("commits")
	private List<GitlabCommit> commits = null;
	
	@JsonProperty("total_commits_count")
	private BigDecimal totalCommitsCount = null;

	@JsonProperty("push_options")
	private Map<String, String> pushOptions = null;

	@JsonProperty("repository")
	private GitlabRepository repository = null;	

	public GitlabEventPushTag eventName(GitlabEventTypeEnum eventName) {
		this.eventName = eventName;
		return this;
	}

	public GitlabEventTypeEnum getEventName() {
		return eventName;
	}

	public void setEventName(GitlabEventTypeEnum eventName) {
		this.eventName = eventName;
	}

	public GitlabEventPushTag before(String before) {
		this.before = before;
		return this;
	}

	public String getBefore() {
		return before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GitlabEventPushTag after(String after) {
		this.after = after;
		return this;
	}

	public String getAfter() {
		return after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	public GitlabEventPushTag ref(String ref) {
		this.ref = ref;
		return this;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public GitlabEventPushTag checkoutSha(String checkoutSha) {
		this.checkoutSha = checkoutSha;
		return this;
	}

	public String getCheckoutSha() {
		return checkoutSha;
	}

	public void setCheckoutSha(String checkoutSha) {
		this.checkoutSha = checkoutSha;
	}

	public GitlabEventPushTag message(String message) {
		this.message = message;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public GitlabEventPushTag userId(BigInteger userId) {
		this.userId = userId;
		return this;
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public GitlabEventPushTag userName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public GitlabEventPushTag userUsername(String userUsername) {
		this.userUsername = userUsername;
		return this;
	}

	public String getUserUsername() {
		return userUsername;
	}

	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}

	public GitlabEventPushTag userEmail(String userEmail) {
		this.userEmail = userEmail;
		return this;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public GitlabEventPushTag userAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
		return this;
	}

	public String getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}

	public GitlabEventPushTag projectId(BigDecimal projectId) {
		this.projectId = projectId;
		return this;
	}

	public BigDecimal getProjectId() {
		return projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	public GitlabEventPushTag project(GitlabProject project) {
		this.project = project;
		return this;
	}

	public GitlabProject getProject() {
		return project;
	}

	public void setProject(GitlabProject project) {
		this.project = project;
	}

	public GitlabEventPushTag commits(List<GitlabCommit>  commits) {
		this.commits = commits;
		return this;
	}

	public List<GitlabCommit> getCommits() {
		return commits;
	}

	public void setCommits(List<GitlabCommit> commits) {
		this.commits = commits;
	}

	public GitlabEventPushTag totalCommitsCount(BigDecimal totalCommitsCount) {
		this.totalCommitsCount = totalCommitsCount;
		return this;
	}

	public BigDecimal getTotalCommitsCount() {
		return totalCommitsCount;
	}

	public void setTotalCommitsCount(BigDecimal totalCommitsCount) {
		this.totalCommitsCount = totalCommitsCount;
	}

	public GitlabEventPushTag pushOptions(Map<String, String> pushOptions) {
		this.pushOptions = pushOptions;
		return this;
	}

	public Map<String, String> getPushOptions() {
		return pushOptions;
	}

	public void setPushOptions(Map<String, String> pushOptions) {
		this.pushOptions = pushOptions;
	}

	public GitlabEventPushTag repository(GitlabRepository repository) {
		this.repository = repository;
		return this;
	}

	public GitlabRepository getRepository() {
		return repository;
	}

	public void setRepository(GitlabRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabEventPushTag gitlabEventTag = (GitlabEventPushTag) o;
		return Objects.equals(this.eventName, gitlabEventTag.eventName) && Objects.equals(this.before, gitlabEventTag.before)
				&& Objects.equals(this.after, gitlabEventTag.after)
				&& Objects.equals(this.ref, gitlabEventTag.ref)
				&& Objects.equals(this.checkoutSha, gitlabEventTag.checkoutSha)
				&& Objects.equals(this.message, gitlabEventTag.message)
				&& Objects.equals(this.userId, gitlabEventTag.userId)
				&& Objects.equals(this.userName, gitlabEventTag.userName)
				&& Objects.equals(this.userUsername, gitlabEventTag.userUsername)
				&& Objects.equals(this.userEmail, gitlabEventTag.userEmail)
				&& Objects.equals(this.userAvatar, gitlabEventTag.userAvatar)
				&& Objects.equals(this.projectId, gitlabEventTag.projectId)
				&& Objects.equals(this.project, gitlabEventTag.project)
				&& Objects.equals(this.commits, gitlabEventTag.commits)
				&& Objects.equals(this.totalCommitsCount, gitlabEventTag.totalCommitsCount)
				&& Objects.equals(this.pushOptions, gitlabEventTag.pushOptions)
				&& Objects.equals(this.repository, gitlabEventTag.repository);
	}

	@Override
	public int hashCode() {
		return Objects.hash(eventName, before, after, ref, checkoutSha, message, userId, userName, userUsername, 
				userEmail, userAvatar, projectId, project, commits, totalCommitsCount, pushOptions, repository);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabEventPushTag {\n");
		sb.append(super.toString());
		sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
		sb.append("    before: ").append(toIndentedString(before)).append("\n");
		sb.append("    after: ").append(toIndentedString(after)).append("\n");
		sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
		sb.append("    checkoutSha: ").append(toIndentedString(checkoutSha)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
		sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
		sb.append("    userUsername: ").append(toIndentedString(userUsername)).append("\n");
		sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
		sb.append("    userAvatar: ").append(toIndentedString(userAvatar)).append("\n");
		sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
		sb.append("    project: ").append(toIndentedString(project)).append("\n");
		sb.append("    commits: ").append(toIndentedString(commits)).append("\n");
		sb.append("    totalCommitsCount: ").append(toIndentedString(totalCommitsCount)).append("\n");
		sb.append("    pushOptions: ").append(toIndentedString(pushOptions)).append("\n");
		sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
