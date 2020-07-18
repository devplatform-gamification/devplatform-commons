package com.devplatform.model.gitlab;

import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabMilestone {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("iid")
	private BigDecimal iid = null;

	@JsonProperty("project_id")
	private BigDecimal projectId = null;

	@JsonProperty("title")
	private String title = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("due_date")
	private String dueDate = null;

	@JsonProperty("startDate")
	private String startDate = null;

	@JsonProperty("state")
	private GitlabMilestoneStateEnum state = null;

	@JsonProperty("updated_at")
	private String updatedAt = null;

	@JsonProperty("created_at")
	private String createdAt = null;

	public GitlabMilestone id(BigDecimal id) {
		this.id = id;
		return this;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public GitlabMilestone iid(BigDecimal iid) {
		this.iid = iid;
		return this;
	}

	public BigDecimal getIid() {
		return iid;
	}

	public void setIid(BigDecimal iid) {
		this.iid = iid;
	}

	public GitlabMilestone projectId(BigDecimal projectId) {
		this.projectId = projectId;
		return this;
	}

	public BigDecimal getProjectId() {
		return projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	public GitlabMilestone title(String title) {
		this.title = title;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public GitlabMilestone description(String description) {
		this.description = description;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public GitlabMilestone dueDate(String dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public GitlabMilestone startDate(String startDate) {
		this.startDate = startDate;
		return this;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public GitlabMilestone state(GitlabMilestoneStateEnum state) {
		this.state = state;
		return this;
	}

	public GitlabMilestoneStateEnum getState() {
		return state;
	}

	public void setState(GitlabMilestoneStateEnum state) {
		this.state = state;
	}

	public GitlabMilestone updatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public GitlabMilestone createdAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabMilestone gitlabCommit = (GitlabMilestone) o;
		return Objects.equals(this.id, gitlabCommit.id) && Objects.equals(this.iid, gitlabCommit.iid)
				&& Objects.equals(this.projectId, gitlabCommit.projectId) && Objects.equals(this.title, gitlabCommit.title)
				&& Objects.equals(this.description, gitlabCommit.description) && Objects.equals(this.dueDate, gitlabCommit.dueDate)
		&& Objects.equals(this.startDate, gitlabCommit.startDate) && Objects.equals(this.state, gitlabCommit.state)
		&& Objects.equals(this.updatedAt, gitlabCommit.updatedAt) && Objects.equals(this.createdAt, gitlabCommit.createdAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, iid, projectId, title, description, dueDate, startDate, state, updatedAt, createdAt);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabMilestone {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    iid: ").append(toIndentedString(iid)).append("\n");
		sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
