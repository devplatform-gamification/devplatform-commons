package com.devplatform.model.gitlab.event;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.gitlab.GitlabCommit;
import com.devplatform.model.gitlab.GitlabObjectKindEnum;
import com.devplatform.model.gitlab.GitlabProject;
import com.devplatform.model.gitlab.GitlabRepository;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabMergeRequest
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabEventPush {
	@JsonProperty("object_kind")
	private GitlabObjectKindEnum objectKind = null;

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
	private BigDecimal userId = null;

	@JsonProperty("user_name")
	private String userName = null;

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
	private Integer totalCommitsCount = null;

	@JsonProperty("push_options")
	private Map<String, String> pushOptions = null;

	@JsonProperty("repository")
	private GitlabRepository repository = null;

	public GitlabEventPush objectKind(GitlabObjectKindEnum objectKind) {
		this.objectKind = objectKind;
		return this;
	}

	@NotNull
	public GitlabObjectKindEnum getObjectKind() {
		return objectKind;
	}

	public void setObjectKind(GitlabObjectKindEnum objectKind) {
		this.objectKind = objectKind;
	}

	public GitlabEventPush eventName(GitlabEventTypeEnum eventName) {
		this.eventName = eventName;
		return this;
	}

	@NotNull
	public GitlabEventTypeEnum getEventName() {
		return eventName;
	}

	public void setEventName(GitlabEventTypeEnum eventName) {
		this.eventName = eventName;
	}

	public GitlabEventPush before(String before) {
		this.before = before;
		return this;
	}

	public String getBefore() {
		return before;
	}

	public void setBefore(String before) {
		this.before = before;
	}

	public GitlabEventPush after(String after) {
		this.after = after;
		return this;
	}

	public String getAfter() {
		return after;
	}

	public void setAfter(String after) {
		this.after = after;
	}

	@NotNull
	public GitlabEventPush ref(String ref) {
		this.ref = ref;
		return this;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}
	
	@NotNull
	public GitlabEventPush checkoutSha(String checkoutSha) {
		this.checkoutSha = checkoutSha;
		return this;
	}

	public String getCheckoutSha() {
		return checkoutSha;
	}

	public void setCheckoutSha(String checkoutSha) {
		this.checkoutSha = checkoutSha;
	}

	public GitlabEventPush message(String message) {
		this.message = message;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public GitlabEventPush userId(BigDecimal userId) {
		this.userId = userId;
		return this;
	}

	@NotNull
	public BigDecimal getUserId() {
		return userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	public GitlabEventPush userName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public GitlabEventPush userEmail(String userEmail) {
		this.userEmail = userEmail;
		return this;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public GitlabEventPush userAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
		return this;
	}

	public String getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}

	public GitlabEventPush projectId(BigDecimal projectId) {
		this.projectId = projectId;
		return this;
	}

	@NotNull
	public BigDecimal getProjectId() {
		return projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	public GitlabEventPush project(GitlabProject project) {
		this.project = project;
		return this;
	}

	public GitlabProject getProject() {
		return project;
	}

	public void setProject(GitlabProject project) {
		this.project = project;
	}
	
	public GitlabEventPush commits(List<GitlabCommit> commits) {
		this.commits = commits;
		return this;
	}

	@NotNull
	@Valid
	public List<GitlabCommit> getCommits() {
		return commits;
	}

	public void setCommits(List<GitlabCommit> commits) {
		this.commits = commits;
	}

	public GitlabEventPush totalCommitsCount(Integer totalCommitsCount) {
		this.totalCommitsCount = totalCommitsCount;
		return this;
	}

	@NotNull
	public Integer getTotalCommitsCount() {
		return totalCommitsCount;
	}

	public void setTotalCommitsCount(Integer totalCommitsCount) {
		this.totalCommitsCount = totalCommitsCount;
	}

	public GitlabEventPush pushOptions(Map<String, String> pushOptions) {
		this.pushOptions = pushOptions;
		return this;
	}

	public Map<String, String> getPushOptions() {
		return pushOptions;
	}

	public void setPushOptions(Map<String, String> pushOptions) {
		this.pushOptions = pushOptions;
	}
	
	public GitlabEventPush repository(GitlabRepository repository) {
		this.repository = repository;
		return this;
	}

	@NotNull
	@Valid
	public GitlabRepository getRepository() {
		return repository;
	}

	public void setRepository(GitlabRepository repository) {
		this.repository = repository;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((after == null) ? 0 : after.hashCode());
		result = prime * result + ((before == null) ? 0 : before.hashCode());
		result = prime * result + ((checkoutSha == null) ? 0 : checkoutSha.hashCode());
		result = prime * result + ((commits == null) ? 0 : commits.hashCode());
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((objectKind == null) ? 0 : objectKind.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result + ((pushOptions == null) ? 0 : pushOptions.hashCode());
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
		result = prime * result + ((repository == null) ? 0 : repository.hashCode());
		result = prime * result + ((totalCommitsCount == null) ? 0 : totalCommitsCount.hashCode());
		result = prime * result + ((userAvatar == null) ? 0 : userAvatar.hashCode());
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GitlabEventPush other = (GitlabEventPush) obj;
		if (after == null) {
			if (other.after != null)
				return false;
		} else if (!after.equals(other.after))
			return false;
		if (before == null) {
			if (other.before != null)
				return false;
		} else if (!before.equals(other.before))
			return false;
		if (checkoutSha == null) {
			if (other.checkoutSha != null)
				return false;
		} else if (!checkoutSha.equals(other.checkoutSha))
			return false;
		if (commits == null) {
			if (other.commits != null)
				return false;
		} else if (!commits.equals(other.commits))
			return false;
		if (eventName != other.eventName)
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (objectKind != other.objectKind)
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		if (pushOptions == null) {
			if (other.pushOptions != null)
				return false;
		} else if (!pushOptions.equals(other.pushOptions))
			return false;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		if (repository == null) {
			if (other.repository != null)
				return false;
		} else if (!repository.equals(other.repository))
			return false;
		if (totalCommitsCount == null) {
			if (other.totalCommitsCount != null)
				return false;
		} else if (!totalCommitsCount.equals(other.totalCommitsCount))
			return false;
		if (userAvatar == null) {
			if (other.userAvatar != null)
				return false;
		} else if (!userAvatar.equals(other.userAvatar))
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabEventPush {\n");

		sb.append("    objectKind: ").append(toIndentedString(objectKind)).append("\n");
		sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
		sb.append("    before: ").append(toIndentedString(before)).append("\n");
		sb.append("    after: ").append(toIndentedString(after)).append("\n");
		sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
		sb.append("    checkoutSha: ").append(toIndentedString(checkoutSha)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
		sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
