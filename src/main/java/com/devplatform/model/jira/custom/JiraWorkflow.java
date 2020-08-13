package com.devplatform.model.jira.custom;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraWorkflow {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("displayName")
	private String displayName = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("isDefault")
	private Boolean isDefault = null;

	@JsonProperty("isActive")
	private Boolean isActive = null;

	@JsonProperty("isDraft")
	private Boolean isDraft = null;
	
	@JsonProperty("isEditable")
	private Boolean isEditable = null;

	@JsonProperty("numSteps")
	private Integer numSteps = null;

	@JsonProperty("lastModifiedDate")
	private String lastModifiedDate = null;

	@JsonProperty("lastModifiedUser")
	private String lastModifiedUser = null;

	@JsonProperty("self")
	private String self = null;

	public JiraWorkflow name(String name) {
		this.name = name;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JiraWorkflow displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public JiraWorkflow description(String description) {
		this.description = description;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public JiraWorkflow isDefault(Boolean isDefault) {
		this.isDefault = isDefault;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public JiraWorkflow isActive(Boolean isActive) {
		this.isActive = isActive;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public JiraWorkflow isDraft(Boolean isDraft) {
		this.isDraft = isDraft;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getIsDraft() {
		return isDraft;
	}

	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}

	public JiraWorkflow isEditable(Boolean isEditable) {
		this.isEditable = isEditable;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getIsEditable() {
		return isEditable;
	}
	
	public void setIsEditable(Boolean isEditable) {
		this.isEditable = isEditable;
	}
	
	public JiraWorkflow numSteps(Integer numSteps) {
		this.numSteps = numSteps;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Integer getNumSteps() {
		return numSteps;
	}

	public void setNumSteps(Integer numSteps) {
		this.numSteps = numSteps;
	}

	public JiraWorkflow lastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public JiraWorkflow lastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getLastModifiedUser() {
		return lastModifiedUser;
	}

	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	public JiraWorkflow self(String self) {
		this.self = self;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraWorkflow jiraIssue = (JiraWorkflow) o;
		return Objects.equals(this.name, jiraIssue.name) && Objects.equals(this.displayName, jiraIssue.displayName)
				&& Objects.equals(this.description, jiraIssue.description) && Objects.equals(this.isDefault, jiraIssue.isDefault)
				&& Objects.equals(this.isActive, jiraIssue.isActive) && Objects.equals(this.isDraft, jiraIssue.isDraft)
				 && Objects.equals(this.isEditable, jiraIssue.isEditable)
				&& Objects.equals(this.numSteps, jiraIssue.numSteps) && Objects.equals(this.lastModifiedDate, jiraIssue.lastModifiedDate)
				&& Objects.equals(this.lastModifiedUser, jiraIssue.lastModifiedUser) && Objects.equals(this.self, jiraIssue.self);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, displayName, description, isDefault, isActive, isDraft, isEditable, numSteps, lastModifiedDate, 
				lastModifiedUser, self);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraWorkflow {\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
		sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
		sb.append("    isDraft: ").append(toIndentedString(isDraft)).append("\n");
		sb.append("    isEditable: ").append(toIndentedString(isEditable)).append("\n");
		sb.append("    numSteps: ").append(toIndentedString(numSteps)).append("\n");
		sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
		sb.append("    lastModifiedUser: ").append(toIndentedString(lastModifiedUser)).append("\n");
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
