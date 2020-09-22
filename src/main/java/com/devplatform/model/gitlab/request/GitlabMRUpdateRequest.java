package com.devplatform.model.gitlab.request;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabMRUpdateRequest {
	@JsonProperty("id")
	@JsonInclude(Include.NON_NULL)
	private BigDecimal id = null;
	
	@JsonProperty("merge_request_iid")
	@JsonInclude(Include.NON_NULL)
	private BigDecimal mergeRequestIid = null;

	@JsonProperty("target_branch")
	@JsonInclude(Include.NON_NULL)
	private String targetBranch = null;

	@JsonProperty("title")
	@JsonInclude(Include.NON_NULL)
	private String title = null;

	@JsonProperty("assignee_id")
	@JsonInclude(Include.NON_NULL)
	private Integer assigneeId = null;

	@JsonProperty("assignee_ids")
	@JsonInclude(Include.NON_NULL)
	private List<Integer> assigneeIds = null;

	@JsonProperty("milestone_id")
	@JsonInclude(Include.NON_NULL)
	private Integer milestoneId = null;

	@JsonProperty("labels")
	@JsonInclude(Include.NON_NULL)
	private String labels = null;

	@JsonProperty("add_labels")
	@JsonInclude(Include.NON_NULL)
	private String addLabels = null;
	
	@JsonProperty("remove_labels")
	@JsonInclude(Include.NON_NULL)
	private String removeLabels = null;
	
	@JsonProperty("description")
	@JsonInclude(Include.NON_NULL)
	private String description = null;
	
	@JsonProperty("state_event")
	@JsonInclude(Include.NON_NULL)
	private String stateEvent = null;
	
	@JsonProperty("remove_source_branch")
	@JsonInclude(Include.NON_NULL)
	private Boolean removeSourceBranch = null;

	@JsonProperty("squash")
	@JsonInclude(Include.NON_NULL)
	private Boolean squash = null;

	@JsonProperty("discussion_locked")
	@JsonInclude(Include.NON_NULL)
	private Boolean discussionLocked = null;

	@JsonProperty("allow_collaboration")
	@JsonInclude(Include.NON_NULL)
	private Boolean allowCollaboration = null;

	public GitlabMRUpdateRequest id(BigDecimal id) {
		this.id = id;
		return this;
	}

	@Valid
	@NotNull
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}
	
	public GitlabMRUpdateRequest targetBranch(String targetBranch) {
		this.targetBranch = targetBranch;
		return this;
	}

	@Valid
	@NotNull
	public String getTargetBranch() {
		return targetBranch;
	}

	public void setTargetBranch(String targetBranch) {
		this.targetBranch = targetBranch;
	}

	public GitlabMRUpdateRequest title(String title) {
		this.title = title;
		return this;
	}

	@Valid
	@NotNull
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public GitlabMRUpdateRequest assigneeId(Integer assigneeId) {
		this.assigneeId = assigneeId;
		return this;
	}

	@Valid
	public Integer getAssigneeId() {
		return assigneeId;
	}

	public void setAssigneeId(Integer assigneeId) {
		this.assigneeId = assigneeId;
	}

	public GitlabMRUpdateRequest assigneeIds(List<Integer> assigneeIds) {
		this.assigneeIds = assigneeIds;
		return this;
	}

	@Valid
	public List<Integer> getAssigneeIds() {
		return assigneeIds;
	}

	public void setAssigneeIds(List<Integer> assigneeIds) {
		this.assigneeIds = assigneeIds;
	}

	public GitlabMRUpdateRequest description(String description) {
		this.description = description;
		return this;
	}

	@Valid
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public GitlabMRUpdateRequest labels(String labels) {
		this.labels = labels;
		return this;
	}

	@Valid
	public String getLabels() {
		return labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
	}

	public GitlabMRUpdateRequest milestoneId(Integer milestoneId) {
		this.milestoneId = milestoneId;
		return this;
	}

	@Valid
	public Integer getMilestoneId() {
		return milestoneId;
	}

	public void setMilestoneId(Integer milestoneId) {
		this.milestoneId = milestoneId;
	}

	public GitlabMRUpdateRequest removeSourceBranch(Boolean removeSourceBranch) {
		this.removeSourceBranch = removeSourceBranch;
		return this;
	}

	@Valid
	public Boolean getRemoveSourceBranch() {
		return removeSourceBranch;
	}

	public void setRemoveSourceBranch(Boolean removeSourceBranch) {
		this.removeSourceBranch = removeSourceBranch;
	}

	public GitlabMRUpdateRequest allowCollaboration(Boolean allowCollaboration) {
		this.allowCollaboration = allowCollaboration;
		return this;
	}

	@Valid
	public Boolean getAllowCollaboration() {
		return allowCollaboration;
	}

	public void setAllowCollaboration(Boolean allowCollaboration) {
		this.allowCollaboration = allowCollaboration;
	}

	public GitlabMRUpdateRequest squash(Boolean squash) {
		this.squash = squash;
		return this;
	}

	@Valid
	public Boolean getSquash() {
		return squash;
	}

	public void setSquash(Boolean squash) {
		this.squash = squash;
	}
	
	public GitlabMRUpdateRequest mergeRequestIid(BigDecimal mergeRequestIid) {
		this.mergeRequestIid = mergeRequestIid;
		return this;
	}

	@Valid
	public BigDecimal getMergeRequestIid() {
		return mergeRequestIid;
	}

	public void setMergeRequestIid(BigDecimal mergeRequestIid) {
		this.mergeRequestIid = mergeRequestIid;
	}

	public GitlabMRUpdateRequest addLabels(String addLabels) {
		this.addLabels = addLabels;
		return this;
	}

	@Valid
	public String getAddLabels() {
		return addLabels;
	}

	public void setAddLabels(String addLabels) {
		this.addLabels = addLabels;
	}

	public GitlabMRUpdateRequest removeLabels(String removeLabels) {
		this.removeLabels = removeLabels;
		return this;
	}

	@Valid
	public String getRemoveLabels() {
		return removeLabels;
	}

	public void setRemoveLabels(String removeLabels) {
		this.removeLabels = removeLabels;
	}

	public GitlabMRUpdateRequest stateEvent(String stateEvent) {
		this.stateEvent = stateEvent;
		return this;
	}

	@Valid
	public String getStateEvent() {
		return stateEvent;
	}

	public void setStateEvent(String stateEvent) {
		this.stateEvent = stateEvent;
	}

	public GitlabMRUpdateRequest discussionLocked(Boolean discussionLocked) {
		this.discussionLocked = discussionLocked;
		return this;
	}

	@Valid
	public Boolean getDiscussionLocked() {
		return discussionLocked;
	}

	public void setDiscussionLocked(Boolean discussionLocked) {
		this.discussionLocked = discussionLocked;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabMRUpdateRequest gitlabCommit = (GitlabMRUpdateRequest) o;
		return Objects.equals(this.id, gitlabCommit.id) && Objects.equals(this.mergeRequestIid, gitlabCommit.mergeRequestIid)
				&& Objects.equals(this.targetBranch, gitlabCommit.targetBranch) && Objects.equals(this.title, gitlabCommit.title)
				&& Objects.equals(this.assigneeId, gitlabCommit.assigneeId) && Objects.equals(this.assigneeIds, gitlabCommit.assigneeIds)
				&& Objects.equals(this.description, gitlabCommit.description) 
				&& Objects.equals(this.labels, gitlabCommit.labels)
				&& Objects.equals(this.addLabels, gitlabCommit.addLabels)
				&& Objects.equals(this.removeLabels, gitlabCommit.removeLabels)
				&& Objects.equals(this.milestoneId, gitlabCommit.milestoneId)
				&& Objects.equals(this.removeSourceBranch, gitlabCommit.removeSourceBranch) 
				&& Objects.equals(this.allowCollaboration, gitlabCommit.allowCollaboration)
				&& Objects.equals(this.squash, gitlabCommit.squash)
				&& Objects.equals(this.stateEvent, gitlabCommit.stateEvent)
				&& Objects.equals(this.discussionLocked, gitlabCommit.discussionLocked);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, targetBranch, title, assigneeId, assigneeIds, description,
				labels, milestoneId, removeSourceBranch, allowCollaboration, squash,
				mergeRequestIid, addLabels, removeLabels, stateEvent, discussionLocked);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabMRUpdateRequest {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    mergeRequestIid: ").append(toIndentedString(mergeRequestIid)).append("\n");
		sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
		sb.append("    assigneeIds: ").append(toIndentedString(assigneeIds)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("    addLabels: ").append(toIndentedString(addLabels)).append("\n");
		sb.append("    removeLabels: ").append(toIndentedString(removeLabels)).append("\n");
		sb.append("    milestoneId: ").append(toIndentedString(milestoneId)).append("\n");
		sb.append("    removeSourceBranch: ").append(toIndentedString(removeSourceBranch)).append("\n");
		sb.append("    squash: ").append(toIndentedString(squash)).append("\n");
		sb.append("    stateEvent: ").append(toIndentedString(stateEvent)).append("\n");
		sb.append("    discussionLocked: ").append(toIndentedString(discussionLocked)).append("\n");
		sb.append("    allowCollaboration: ").append(toIndentedString(allowCollaboration)).append("\n");
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
