package com.devplatform.model.gitlab;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabEventChanges
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabEventChanges {

	@JsonProperty("updated_at")
	private GitlabEventChangedItem<String> updatedAt = null;

	@JsonProperty("updated_by_id")
	private GitlabEventChangedItem<Integer> updatedById = null;
	
	@JsonProperty("last_edited_by_id")
	private GitlabEventChangedItem<Integer> lastEditedById = null;
	
	@JsonProperty("last_edited_at")
	private GitlabEventChangedItem<String> lastEditedAt = null;
	
	@JsonProperty("total_time_spent")
	private GitlabEventChangedItem<Integer> totalTimeSpent = null;

	@JsonProperty("time_estimate")
	private GitlabEventChangedItem<Integer> timeEstimate = null;

	@JsonProperty("state_id")
	private GitlabEventChangedItem<Integer> stateId = null;

	@JsonProperty("labels")
	private GitlabEventChangedItem<List<GitlabLabel>> labels = null;

	@JsonProperty("milestone_id")
	private GitlabEventChangedItem<Integer> milestoneId = null;

	@JsonProperty("title")
	private GitlabEventChangedItem<String> title = null;

	@JsonProperty("assignees")
	private GitlabEventChangedItem<List<GitlabUser>> assignees = null;

	@JsonProperty("merge_status")
	private GitlabEventChangedItem<GitlabMergeRequestStatusEnum> mergeStatus = null;


	public GitlabEventChanges stateId(GitlabEventChangedItem<Integer> stateId) {
		this.stateId = stateId;
		return this;
	}

	@ApiModelProperty(value = "")
	public GitlabEventChangedItem<Integer> getStateId() {
		return stateId;
	}

	public void setStateId(GitlabEventChangedItem<Integer> stateId) {
		this.stateId = stateId;
	}

	@ApiModelProperty(value = "")
	public GitlabEventChangedItem<String> getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(GitlabEventChangedItem<String> updatedAt) {
		this.updatedAt = updatedAt;
	}

	public GitlabEventChanges updatedAt(GitlabEventChangedItem<String> updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	@ApiModelProperty(value = "")
	public GitlabEventChangedItem<Integer> getUpdatedById() {
		return updatedById;
	}

	public void setUpdatedById(GitlabEventChangedItem<Integer> updatedById) {
		this.updatedById = updatedById;
	}

	public GitlabEventChanges updatedById(GitlabEventChangedItem<Integer> updatedById) {
		this.updatedById = updatedById;
		return this;
	}
	
	@ApiModelProperty(value = "")
	public GitlabEventChangedItem<List<GitlabLabel>> getLabels() {
		return labels;
	}

	public void setLabels(GitlabEventChangedItem<List<GitlabLabel>> labels) {
		this.labels = labels;
	}

	public GitlabEventChanges labels(GitlabEventChangedItem<List<GitlabLabel>> labels) {
		this.labels = labels;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public GitlabEventChangedItem<Integer> getTotalTimeSpent() {
		return totalTimeSpent;
	}

	public void setTotalTimeSpent(GitlabEventChangedItem<Integer> totalTimeSpent) {
		this.totalTimeSpent = totalTimeSpent;
	}

	public GitlabEventChanges totalTimeSpent(GitlabEventChangedItem<Integer> totalTimeSpent) {
		this.totalTimeSpent = totalTimeSpent;
		return this;
	}
	
	public GitlabEventChangedItem<Integer> getLastEditedById() {
		return lastEditedById;
	}

	public void setLastEditedById(GitlabEventChangedItem<Integer> lastEditedById) {
		this.lastEditedById = lastEditedById;
	}

	public GitlabEventChangedItem<String> getLastEditedAt() {
		return lastEditedAt;
	}

	public void setLastEditedAt(GitlabEventChangedItem<String> lastEditedAt) {
		this.lastEditedAt = lastEditedAt;
	}

	public GitlabEventChangedItem<Integer> getTimeEstimate() {
		return timeEstimate;
	}

	public void setTimeEstimate(GitlabEventChangedItem<Integer> timeEstimate) {
		this.timeEstimate = timeEstimate;
	}

	public GitlabEventChangedItem<Integer> getMilestoneId() {
		return milestoneId;
	}

	public void setMilestoneId(GitlabEventChangedItem<Integer> milestoneId) {
		this.milestoneId = milestoneId;
	}

	public GitlabEventChangedItem<String> getTitle() {
		return title;
	}

	public void setTitle(GitlabEventChangedItem<String> title) {
		this.title = title;
	}

	public GitlabEventChangedItem<List<GitlabUser>> getAssignees() {
		return assignees;
	}

	public void setAssignees(GitlabEventChangedItem<List<GitlabUser>> assignees) {
		this.assignees = assignees;
	}

	public GitlabEventChangedItem<GitlabMergeRequestStatusEnum> getMergeStatus() {
		return mergeStatus;
	}

	public void setMergeStatus(GitlabEventChangedItem<GitlabMergeRequestStatusEnum> mergeStatus) {
		this.mergeStatus = mergeStatus;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabEventChanges gitlabEventChanges = (GitlabEventChanges) o;
		return Objects.equals(this.updatedAt, gitlabEventChanges.updatedAt)
				&& Objects.equals(this.updatedById, gitlabEventChanges.updatedById)
				&& Objects.equals(this.lastEditedById, gitlabEventChanges.lastEditedById)
				&& Objects.equals(this.lastEditedAt, gitlabEventChanges.lastEditedAt)
				&& Objects.equals(this.totalTimeSpent, gitlabEventChanges.totalTimeSpent)
				&& Objects.equals(this.timeEstimate, gitlabEventChanges.timeEstimate)
				&& Objects.equals(this.stateId, gitlabEventChanges.stateId)
				&& Objects.equals(this.labels, gitlabEventChanges.labels)
				&& Objects.equals(this.milestoneId, gitlabEventChanges.milestoneId)
				&& Objects.equals(this.title, gitlabEventChanges.title)
				&& Objects.equals(this.assignees, gitlabEventChanges.assignees)
				&& Objects.equals(this.mergeStatus, gitlabEventChanges.mergeStatus);
	}

	@Override
	public int hashCode() {
		return Objects.hash(updatedAt, updatedById, lastEditedById, lastEditedAt, 
				totalTimeSpent, timeEstimate, stateId, labels, milestoneId, title, assignees, mergeStatus);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabEventChanges {\n");
		sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
		sb.append("    updatedById: ").append(toIndentedString(updatedById)).append("\n");
		sb.append("    lastEditedById: ").append(toIndentedString(lastEditedById)).append("\n");
		sb.append("    lastEditedAt: ").append(toIndentedString(lastEditedAt)).append("\n");
		sb.append("    totalTimeSpent: ").append(toIndentedString(totalTimeSpent)).append("\n");
		sb.append("    timeEstimate: ").append(toIndentedString(timeEstimate)).append("\n");
		sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
		sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("    milestoneId: ").append(toIndentedString(milestoneId)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
		sb.append("    mergeStatus: ").append(toIndentedString(mergeStatus)).append("\n");
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
