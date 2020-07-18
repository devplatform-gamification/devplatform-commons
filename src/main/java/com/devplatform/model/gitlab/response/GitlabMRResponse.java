package com.devplatform.model.gitlab.response;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.annotation.Generated;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.gitlab.GitlabDiffRef;
import com.devplatform.model.gitlab.GitlabMergeRequestAttributes;
import com.devplatform.model.gitlab.GitlabMilestone;
import com.devplatform.model.gitlab.GitlabTimeStats;
import com.devplatform.model.jira.JiraUser;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabMRResponse extends GitlabMergeRequestAttributes {
	@JsonProperty("project_id")
	private BigDecimal projectId = null;

	@JsonProperty("merged_by")
	private JiraUser mergedBy = null;

	@JsonProperty("merged_at")
	private String mergedAt = null;

	@JsonProperty("closed_by")
	private JiraUser closedBy = null;

	@JsonProperty("closed_at")
	private String closedAt = null;

	@JsonProperty("user_notes_count")
	private Integer userNotesCount = 0;

	@JsonProperty("upvotes")
	private Integer upvotes = 0;

	@JsonProperty("downvotes")
	private Integer downvotes = 0;

	@JsonProperty("assignee")
	private JiraUser assignee = null;

	@JsonProperty("author")
	private JiraUser author = null;

	@JsonProperty("assignees")
	private List<JiraUser> assignees = null;

	@JsonProperty("labels")
	private List<String> labels = null;

	@JsonProperty("milestone")
	private GitlabMilestone milestone = null;

	@JsonProperty("sha")
	private String sha = null;
	
	@JsonProperty("squash_commit_sha")
	private String squashCommitSha = null;

	@JsonProperty("discussion_locked")
	private Boolean discussionLocked = null;
	
	@JsonProperty("should_remove_source_branch")
	private Boolean shouldRemoveSourceBranch = null;
	
	@JsonProperty("force_remove_source_branch")
	private Boolean forceRemoveSourceBranch = null;
	
	@JsonProperty("reference")
	private String reference = null;

	@JsonProperty("references")
	private Map<String, String> references = null;

	@JsonProperty("web_url")
	private String webUrl = null;

	@JsonProperty("time_stats")
	private GitlabTimeStats timeStats = null;

	@JsonProperty("squash")
	private Boolean squash = null;

	@JsonProperty("task_completion_status")
	private Object taskCompletionStatus = null;

	@JsonProperty("has_conflicts")
	private Boolean hasConflicts = null;

	@JsonProperty("blocking_discussions_resolved")
	private Boolean blockingDiscussionsResolved = null;

	@JsonProperty("subscribed")
	private Boolean subscribed = null;

	@JsonProperty("changes_count")
	private String changesCount = null;

	@JsonProperty("latest_build_started_at")
	private String latestBuildStartedAt = null;

	@JsonProperty("latest_build_finished_at")
	private String latestBuildFinishedAt = null;

	@JsonProperty("first_deployed_to_production_at")
	private String firstDeployedToProductionAt = null;

	@JsonProperty("pipeline")
	private Object pipeline = null;

	@JsonProperty("head_pipeline")
	private Object headPipeline = null;

	@JsonProperty("diff_refs")
	private GitlabDiffRef diffRefs = null;

	@JsonProperty("user")
	private Map<String, String> user = null;

	public GitlabMRResponse projectId(BigDecimal projectId) {
		this.projectId = projectId;
		return this;
	}

	public BigDecimal getProjectId() {
		return projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	public GitlabMRResponse mergedBy(JiraUser mergedBy) {
		this.mergedBy = mergedBy;
		return this;
	}

	public JiraUser getMergedBy() {
		return mergedBy;
	}

	public void setMergedBy(JiraUser mergedBy) {
		this.mergedBy = mergedBy;
	}

	public GitlabMRResponse mergedAt(String mergedAt) {
		this.mergedAt = mergedAt;
		return this;
	}

	public String getMergedAt() {
		return mergedAt;
	}

	public void setMergedAt(String mergedAt) {
		this.mergedAt = mergedAt;
	}

	public GitlabMRResponse closedBy(JiraUser closedBy) {
		this.closedBy = closedBy;
		return this;
	}

	public JiraUser getClosedBy() {
		return closedBy;
	}

	public void setClosedBy(JiraUser closedBy) {
		this.closedBy = closedBy;
	}

	public GitlabMRResponse closedAt(String closedAt) {
		this.closedAt = closedAt;
		return this;
	}

	public String getClosedAt() {
		return closedAt;
	}

	public void setClosedAt(String closedAt) {
		this.closedAt = closedAt;
	}

	public GitlabMRResponse userNotesCount(Integer userNotesCount) {
		this.userNotesCount = userNotesCount;
		return this;
	}

	public Integer getUserNotesCount() {
		return userNotesCount;
	}

	public void setUserNotesCount(Integer userNotesCount) {
		this.userNotesCount = userNotesCount;
	}

	public GitlabMRResponse upvotes(Integer upvotes) {
		this.upvotes = upvotes;
		return this;
	}

	public Integer getUpvotes() {
		return upvotes;
	}

	public void setUpvotes(Integer upvotes) {
		this.upvotes = upvotes;
	}

	public GitlabMRResponse downvotes(Integer downvotes) {
		this.downvotes = downvotes;
		return this;
	}

	public Integer getDownvotes() {
		return downvotes;
	}

	public void setDownvotes(Integer downvotes) {
		this.downvotes = downvotes;
	}

	public GitlabMRResponse assignee(JiraUser assignee) {
		this.assignee = assignee;
		return this;
	}

	public JiraUser getAssignee() {
		return assignee;
	}

	public void setAssignee(JiraUser assignee) {
		this.assignee = assignee;
	}

	public GitlabMRResponse author(JiraUser author) {
		this.author = author;
		return this;
	}

	public JiraUser getAuthor() {
		return author;
	}

	public void setAuthor(JiraUser author) {
		this.author = author;
	}

	public GitlabMRResponse assignees(List<JiraUser> assignees) {
		this.assignees = assignees;
		return this;
	}

	public List<JiraUser> getAssignees() {
		return assignees;
	}

	public void setAssignees(List<JiraUser> assignees) {
		this.assignees = assignees;
	}

	public GitlabMRResponse labels(List<String> labels) {
		this.labels = labels;
		return this;
	}

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public GitlabMRResponse milestone(GitlabMilestone milestone) {
		this.milestone = milestone;
		return this;
	}

	public GitlabMilestone getMilestone() {
		return milestone;
	}

	public void setMilestone(GitlabMilestone milestone) {
		this.milestone = milestone;
	}

	public GitlabMRResponse sha(String sha) {
		this.sha = sha;
		return this;
	}

	public String getSha() {
		return sha;
	}

	public void setSha(String sha) {
		this.sha = sha;
	}

	public GitlabMRResponse squashCommitSha(String squashCommitSha) {
		this.squashCommitSha = squashCommitSha;
		return this;
	}

	public String getSquashCommitSha() {
		return squashCommitSha;
	}

	public void setSquashCommitSha(String squashCommitSha) {
		this.squashCommitSha = squashCommitSha;
	}

	public GitlabMRResponse discussionLocked(Boolean discussionLocked) {
		this.discussionLocked = discussionLocked;
		return this;
	}

	public Boolean getDiscussionLocked() {
		return discussionLocked;
	}

	public void setDiscussionLocked(Boolean discussionLocked) {
		this.discussionLocked = discussionLocked;
	}

	public GitlabMRResponse shouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
		this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
		return this;
	}

	public Boolean getShouldRemoveSourceBranch() {
		return shouldRemoveSourceBranch;
	}

	public void setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
		this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
	}

	public GitlabMRResponse forceRemoveSourceBranch(Boolean forceRemoveSourceBranch) {
		this.forceRemoveSourceBranch = forceRemoveSourceBranch;
		return this;
	}

	public Boolean getForceRemoveSourceBranch() {
		return forceRemoveSourceBranch;
	}

	public void setForceRemoveSourceBranch(Boolean forceRemoveSourceBranch) {
		this.forceRemoveSourceBranch = forceRemoveSourceBranch;
	}

	public GitlabMRResponse reference(String reference) {
		this.reference = reference;
		return this;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public GitlabMRResponse references(Map<String, String> references) {
		this.references = references;
		return this;
	}

	public Map<String, String> getReferences() {
		return references;
	}

	public void setReferences(Map<String, String> references) {
		this.references = references;
	}

	public GitlabMRResponse webUrl(String webUrl) {
		this.webUrl = webUrl;
		return this;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public GitlabMRResponse timeStats(GitlabTimeStats timeStats) {
		this.timeStats = timeStats;
		return this;
	}

	public GitlabTimeStats getTimeStats() {
		return timeStats;
	}

	public void setTimeStats(GitlabTimeStats timeStats) {
		this.timeStats = timeStats;
	}

	public GitlabMRResponse squash(Boolean squash) {
		this.squash = squash;
		return this;
	}

	public Boolean getSquash() {
		return squash;
	}

	public void setSquash(Boolean squash) {
		this.squash = squash;
	}

	public GitlabMRResponse taskCompletionStatus(Object taskCompletionStatus) {
		this.taskCompletionStatus = taskCompletionStatus;
		return this;
	}

	public Object getTaskCompletionStatus() {
		return taskCompletionStatus;
	}

	public void setTaskCompletionStatus(Object taskCompletionStatus) {
		this.taskCompletionStatus = taskCompletionStatus;
	}

	public GitlabMRResponse hasConflicts(Boolean hasConflicts) {
		this.hasConflicts = hasConflicts;
		return this;
	}

	public Boolean getHasConflicts() {
		return hasConflicts;
	}

	public void setHasConflicts(Boolean hasConflicts) {
		this.hasConflicts = hasConflicts;
	}

	public GitlabMRResponse blockingDiscussionsResolved(Boolean blockingDiscussionsResolved) {
		this.blockingDiscussionsResolved = blockingDiscussionsResolved;
		return this;
	}

	public Boolean getBlockingDiscussionsResolved() {
		return blockingDiscussionsResolved;
	}

	public void setBlockingDiscussionsResolved(Boolean blockingDiscussionsResolved) {
		this.blockingDiscussionsResolved = blockingDiscussionsResolved;
	}

	public GitlabMRResponse subscribed(Boolean subscribed) {
		this.subscribed = subscribed;
		return this;
	}

	public Boolean getSubscribed() {
		return subscribed;
	}

	public void setSubscribed(Boolean subscribed) {
		this.subscribed = subscribed;
	}

	public GitlabMRResponse changesCount(String changesCount) {
		this.changesCount = changesCount;
		return this;
	}

	public String getChangesCount() {
		return changesCount;
	}

	public void setChangesCount(String changesCount) {
		this.changesCount = changesCount;
	}

	public GitlabMRResponse latestBuildStartedAt(String latestBuildStartedAt) {
		this.latestBuildStartedAt = latestBuildStartedAt;
		return this;
	}

	public String getLatestBuildStartedAt() {
		return latestBuildStartedAt;
	}

	public void setLatestBuildStartedAt(String latestBuildStartedAt) {
		this.latestBuildStartedAt = latestBuildStartedAt;
	}

	public GitlabMRResponse latestBuildFinishedAt(String latestBuildFinishedAt) {
		this.latestBuildFinishedAt = latestBuildFinishedAt;
		return this;
	}

	public String getLatestBuildFinishedAt() {
		return latestBuildFinishedAt;
	}

	public void setLatestBuildFinishedAt(String latestBuildFinishedAt) {
		this.latestBuildFinishedAt = latestBuildFinishedAt;
	}

	public GitlabMRResponse firstDeployedToProductionAt(String firstDeployedToProductionAt) {
		this.firstDeployedToProductionAt = firstDeployedToProductionAt;
		return this;
	}

	public String getFirstDeployedToProductionAt() {
		return firstDeployedToProductionAt;
	}

	public void setFirstDeployedToProductionAt(String firstDeployedToProductionAt) {
		this.firstDeployedToProductionAt = firstDeployedToProductionAt;
	}

	public GitlabMRResponse pipeline(Object pipeline) {
		this.pipeline = pipeline;
		return this;
	}

	public Object getPipeline() {
		return pipeline;
	}

	public void setPipeline(Object pipeline) {
		this.pipeline = pipeline;
	}

	public GitlabMRResponse headPipeline(Object headPipeline) {
		this.headPipeline = headPipeline;
		return this;
	}

	public Object getHeadPipeline() {
		return headPipeline;
	}

	public void setHeadPipeline(Object headPipeline) {
		this.headPipeline = headPipeline;
	}

	public GitlabMRResponse diffRefs(GitlabDiffRef diffRefs) {
		this.diffRefs = diffRefs;
		return this;
	}

	public GitlabDiffRef getDiffRefs() {
		return diffRefs;
	}

	public void setDiffRefs(GitlabDiffRef diffRefs) {
		this.diffRefs = diffRefs;
	}

	public GitlabMRResponse user(Map<String, String> user) {
		this.user = user;
		return this;
	}

	public Map<String, String> getUser() {
		return user;
	}

	public void setUser(Map<String, String> user) {
		this.user = user;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabMRResponse gitlabCommit = (GitlabMRResponse) o;
		return Objects.equals(this.projectId, gitlabCommit.projectId)
				&& Objects.equals(this.mergedBy, gitlabCommit.mergedBy)
				&& Objects.equals(this.mergedAt, gitlabCommit.mergedAt)
				&& Objects.equals(this.closedBy, gitlabCommit.closedBy)
				&& Objects.equals(this.closedAt, gitlabCommit.closedAt)
				&& Objects.equals(this.userNotesCount, gitlabCommit.userNotesCount)
				&& Objects.equals(this.upvotes, gitlabCommit.upvotes)
				&& Objects.equals(this.downvotes, gitlabCommit.downvotes)
				&& Objects.equals(this.assignee, gitlabCommit.assignee)
				&& Objects.equals(this.author, gitlabCommit.author)
				&& Objects.equals(this.assignees, gitlabCommit.assignees)
				&& Objects.equals(this.labels, gitlabCommit.labels)
				&& Objects.equals(this.milestone, gitlabCommit.milestone)
				&& Objects.equals(this.sha, gitlabCommit.sha)
				&& Objects.equals(this.squashCommitSha, gitlabCommit.squashCommitSha)
				&& Objects.equals(this.discussionLocked, gitlabCommit.discussionLocked)
				&& Objects.equals(this.shouldRemoveSourceBranch, gitlabCommit.shouldRemoveSourceBranch)
				&& Objects.equals(this.blockingDiscussionsResolved, gitlabCommit.blockingDiscussionsResolved)
				&& Objects.equals(this.subscribed, gitlabCommit.subscribed)
				&& Objects.equals(this.changesCount, gitlabCommit.changesCount)
				&& Objects.equals(this.latestBuildStartedAt, gitlabCommit.latestBuildStartedAt)
				&& Objects.equals(this.latestBuildFinishedAt, gitlabCommit.latestBuildFinishedAt)
				&& Objects.equals(this.firstDeployedToProductionAt, gitlabCommit.firstDeployedToProductionAt)
				&& Objects.equals(this.pipeline, gitlabCommit.pipeline)
				&& Objects.equals(this.headPipeline, gitlabCommit.headPipeline)
				&& Objects.equals(this.diffRefs, gitlabCommit.diffRefs)
				&& Objects.equals(this.user, gitlabCommit.user)
				&& super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(projectId, mergedBy, mergedAt, closedBy, closedAt, userNotesCount, upvotes, downvotes,
				assignee, author, assignees, labels, milestone, sha, squashCommitSha, discussionLocked, shouldRemoveSourceBranch,
				forceRemoveSourceBranch, reference, references, webUrl, timeStats, squash, taskCompletionStatus, hasConflicts,
				blockingDiscussionsResolved, subscribed, changesCount, latestBuildStartedAt, latestBuildFinishedAt, 
				firstDeployedToProductionAt, pipeline, headPipeline, diffRefs, user, super.hashCode());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabMRResponse {\n");
		sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
		sb.append("    mergedBy: ").append(toIndentedString(mergedBy)).append("\n");
		sb.append("    mergedAt: ").append(toIndentedString(mergedAt)).append("\n");
		sb.append("    closedBy: ").append(toIndentedString(closedBy)).append("\n");
		sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
		sb.append("    userNotesCount: ").append(toIndentedString(userNotesCount)).append("\n");
		sb.append("    upvotes: ").append(toIndentedString(upvotes)).append("\n");
		sb.append("    downvotes: ").append(toIndentedString(downvotes)).append("\n");
		sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
		sb.append("    author: ").append(toIndentedString(author)).append("\n");
		sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
		sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
		sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
		sb.append("    squashCommitSha: ").append(toIndentedString(squashCommitSha)).append("\n");
		sb.append("    discussionLocked: ").append(toIndentedString(discussionLocked)).append("\n");
		sb.append("    shouldRemoveSourceBranch: ").append(toIndentedString(shouldRemoveSourceBranch)).append("\n");
		sb.append("    forceRemoveSourceBranch: ").append(toIndentedString(forceRemoveSourceBranch)).append("\n");
		sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
		sb.append("    references: ").append(toIndentedString(references)).append("\n");
		sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
		sb.append("    timeStats: ").append(toIndentedString(timeStats)).append("\n");
		sb.append("    squash: ").append(toIndentedString(squash)).append("\n");
		sb.append("    taskCompletionStatus: ").append(toIndentedString(taskCompletionStatus)).append("\n");
		sb.append("    hasConflicts: ").append(toIndentedString(hasConflicts)).append("\n");
		sb.append("    blockingDiscussionsResolved: ").append(toIndentedString(blockingDiscussionsResolved)).append("\n");
		sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
		sb.append("    changesCount: ").append(toIndentedString(changesCount)).append("\n");
		sb.append("    latestBuildStartedAt: ").append(toIndentedString(latestBuildStartedAt)).append("\n");
		sb.append("    latestBuildFinishedAt: ").append(toIndentedString(latestBuildFinishedAt)).append("\n");
		sb.append("    firstDeployedToProductionAt: ").append(toIndentedString(firstDeployedToProductionAt)).append("\n");
		sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
		sb.append("    headPipeline: ").append(toIndentedString(headPipeline)).append("\n");
		sb.append("    diffRefs: ").append(toIndentedString(diffRefs)).append("\n");
		sb.append("    user: ").append(toIndentedString(user)).append("\n");
		sb.append(super.toString());
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
