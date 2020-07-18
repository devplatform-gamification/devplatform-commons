package com.devplatform.model.gitlab.request;

import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabMRRequest {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("source_branch")
	private String sourceBranch = null;

	@JsonProperty("target_branch")
	private String targetBranch = null;

	@JsonProperty("title")
	private String title = null;

	@JsonProperty("assignee_id")
	private Integer assigneeId = null;

	@JsonProperty("assignee_ids")
	private List<Integer> assigneeIds = null;
	
	@JsonProperty("description")
	private String description = null;

	@JsonProperty("target_project_id")
	private Integer targetProjectId = null;

	@JsonProperty("labels")
	private String labels = null;

	@JsonProperty("milestone_id")
	private Integer milestoneId = null;

	@JsonProperty("remove_source_branch")
	private Boolean removeSourceBranch = null;

	@JsonProperty("allow_collaboration")
	private Boolean allowCollaboration = null;

	@JsonProperty("squash")
	private Boolean squash = null;

	public GitlabMRRequest id(String id) {
		this.id = id;
		return this;
	}

	@Valid
	@NotNull
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public GitlabMRRequest sourceBranch(String sourceBranch) {
		this.sourceBranch = sourceBranch;
		return this;
	}

	@Valid
	@NotNull
	public String getSourceBranch() {
		return sourceBranch;
	}

	public void setSourceBranch(String sourceBranch) {
		this.sourceBranch = sourceBranch;
	}

	public GitlabMRRequest targetBranch(String targetBranch) {
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

	public GitlabMRRequest title(String title) {
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

	public GitlabMRRequest assigneeId(Integer assigneeId) {
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

	public GitlabMRRequest assigneeIds(List<Integer> assigneeIds) {
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

	public GitlabMRRequest description(String description) {
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

	public GitlabMRRequest targetProjectId(Integer targetProjectId) {
		this.targetProjectId = targetProjectId;
		return this;
	}

	@Valid
	public Integer getTargetProjectId() {
		return targetProjectId;
	}

	public void setTargetProjectId(Integer targetProjectId) {
		this.targetProjectId = targetProjectId;
	}

	public GitlabMRRequest labels(String labels) {
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

	public GitlabMRRequest milestoneId(Integer milestoneId) {
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

	public GitlabMRRequest removeSourceBranch(Boolean removeSourceBranch) {
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

	public GitlabMRRequest allowCollaboration(Boolean allowCollaboration) {
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

	public GitlabMRRequest squash(Boolean squash) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabMRRequest gitlabCommit = (GitlabMRRequest) o;
		return Objects.equals(this.id, gitlabCommit.id) && Objects.equals(this.sourceBranch, gitlabCommit.sourceBranch)
				&& Objects.equals(this.targetBranch, gitlabCommit.targetBranch) && Objects.equals(this.title, gitlabCommit.title)
				&& Objects.equals(this.assigneeId, gitlabCommit.assigneeId) && Objects.equals(this.assigneeIds, gitlabCommit.assigneeIds)
				&& Objects.equals(this.description, gitlabCommit.description) && Objects.equals(this.targetProjectId, gitlabCommit.targetProjectId)
				&& Objects.equals(this.labels, gitlabCommit.labels) && Objects.equals(this.milestoneId, gitlabCommit.milestoneId)
				&& Objects.equals(this.removeSourceBranch, gitlabCommit.removeSourceBranch) 
				&& Objects.equals(this.allowCollaboration, gitlabCommit.allowCollaboration)
				&& Objects.equals(this.squash, gitlabCommit.squash);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, sourceBranch, targetBranch, title, assigneeId, assigneeIds, description, targetProjectId,
				labels, milestoneId, removeSourceBranch, allowCollaboration, squash);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabMRRequest {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
		sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
		sb.append("    assigneeIds: ").append(toIndentedString(assigneeIds)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
		sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("    milestoneId: ").append(toIndentedString(milestoneId)).append("\n");
		sb.append("    removeSourceBranch: ").append(toIndentedString(removeSourceBranch)).append("\n");
		sb.append("    allowCollaboration: ").append(toIndentedString(allowCollaboration)).append("\n");
		sb.append("    squash: ").append(toIndentedString(squash)).append("\n");
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
