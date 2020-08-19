package com.devplatform.model.jira;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraProjectProjectCategory
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraProjectComponent   {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("self")
	private String self = null;

	@JsonProperty("lead")
	private JiraUser lead = null;

	@JsonProperty("assigneeType")
	private String assigneeType = null;

	@JsonProperty("assignee")
	private JiraUser assignee = null;

	@JsonProperty("realAssigneeType")
	private String realAssigneeType = null;

	@JsonProperty("realAssignee")
	private JiraUser realAssignee = null;

	@JsonProperty("isAssigneeTypeValid")
	private Boolean isAssigneeTypeValid = null;

	@JsonProperty("project")
	private String project = null;

	@JsonProperty("projectId")
	private BigDecimal projectId = null;

	public JiraProjectComponent id(BigDecimal id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * @return id
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public JiraProjectComponent name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * @return name
	 **/
	@ApiModelProperty(value = "")

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JiraProjectComponent description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 * @return description
	 **/
	@ApiModelProperty(value = "")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public JiraProjectComponent self(String self) {
		this.self = self;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public JiraProjectComponent lead(JiraUser lead) {
		this.lead = lead;
		return this;
	}

	@ApiModelProperty(value = "")
	public JiraUser getLead() {
		return lead;
	}

	public void setLead(JiraUser lead) {
		this.lead = lead;
	}

	public JiraProjectComponent assigneeType(String assigneeType) {
		this.assigneeType = assigneeType;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getAssigneeType() {
		return assigneeType;
	}

	public void setAssigneeType(String assigneeType) {
		this.assigneeType = assigneeType;
	}

	public JiraProjectComponent assignee(JiraUser assignee) {
		this.assignee = assignee;
		return this;
	}

	@ApiModelProperty(value = "")
	public JiraUser getAssignee() {
		return assignee;
	}

	public void setAssignee(JiraUser assignee) {
		this.assignee = assignee;
	}

	public JiraProjectComponent realAssigneeType(String realAssigneeType) {
		this.realAssigneeType = realAssigneeType;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getRealAssigneeType() {
		return realAssigneeType;
	}

	public void setRealAssigneeType(String realAssigneeType) {
		this.realAssigneeType = realAssigneeType;
	}

	public JiraProjectComponent realAssignee(JiraUser realAssignee) {
		this.realAssignee = realAssignee;
		return this;
	}

	@ApiModelProperty(value = "")
	public JiraUser getRealAssignee() {
		return realAssignee;
	}

	public void setRealAssignee(JiraUser realAssignee) {
		this.realAssignee = realAssignee;
	}

	public JiraProjectComponent isAssigneeTypeValid(Boolean isAssigneeTypeValid) {
		this.isAssigneeTypeValid = isAssigneeTypeValid;
		return this;
	}

	@ApiModelProperty(value = "")
	public Boolean getIsAssigneeTypeValid() {
		return isAssigneeTypeValid;
	}

	public void setIsAssigneeTypeValid(Boolean isAssigneeTypeValid) {
		this.isAssigneeTypeValid = isAssigneeTypeValid;
	}

	public JiraProjectComponent project(String project) {
		this.project = project;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public JiraProjectComponent projectId(BigDecimal projectId) {
		this.projectId = projectId;
		return this;
	}

	@ApiModelProperty(value = "")
	public BigDecimal getProjectId() {
		return projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraProjectComponent jiraProjectProjectCategory = (JiraProjectComponent) o;
		return Objects.equals(this.id, jiraProjectProjectCategory.id) &&
				Objects.equals(this.name, jiraProjectProjectCategory.name) &&
				Objects.equals(this.description, jiraProjectProjectCategory.description) &&
				Objects.equals(this.lead, jiraProjectProjectCategory.lead) &&
				Objects.equals(this.assigneeType, jiraProjectProjectCategory.assigneeType) &&
				Objects.equals(this.assignee, jiraProjectProjectCategory.assignee) &&
				Objects.equals(this.realAssigneeType, jiraProjectProjectCategory.realAssigneeType) &&
				Objects.equals(this.isAssigneeTypeValid, jiraProjectProjectCategory.isAssigneeTypeValid) &&
				Objects.equals(this.project, jiraProjectProjectCategory.project) &&
				Objects.equals(this.projectId, jiraProjectProjectCategory.projectId) &&
				Objects.equals(this.self, jiraProjectProjectCategory.self);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, description, self, lead, assigneeType, assignee, 
				realAssigneeType, isAssigneeTypeValid, project, projectId);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraProjectComponent {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
		sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
		sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
		sb.append("    realAssigneeType: ").append(toIndentedString(realAssigneeType)).append("\n");
		sb.append("    isAssigneeTypeValid: ").append(toIndentedString(isAssigneeTypeValid)).append("\n");
		sb.append("    project: ").append(toIndentedString(project)).append("\n");
		sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
		sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
