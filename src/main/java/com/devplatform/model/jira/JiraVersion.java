package com.devplatform.model.jira;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraVersion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraVersion {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("projectId")
	private BigDecimal projectId = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("archived")
	private Boolean archived = null;

	@JsonProperty("released")
	private Boolean released = null;

	@JsonProperty("releaseDate")
	private String releaseDate = null;

	@JsonProperty("overdue")
	private Boolean overdue = null;

	@JsonProperty("userStartDate")
	private String userStartDate = null;

	@JsonProperty("userReleaseDate")
	private String userReleaseDate = null;

	@JsonProperty("self")
	private String self = null;

	public JiraVersion id(BigDecimal id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull
	@Valid
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public JiraVersion projectId(BigDecimal projectId) {
		this.projectId = projectId;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	@Valid
	public BigDecimal getProjectId() {
		return projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	public JiraVersion name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JiraVersion description(String description) {
		this.description = description;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@Valid
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public JiraVersion archived(Boolean archived) {
		this.archived = archived;
		return this;
	}

	/**
	 * Get archived
	 * 
	 * @return archived
	 **/
	@ApiModelProperty(value = "")

	public Boolean getArchived() {
		return archived;
	}

	public void setArchived(Boolean archived) {
		this.archived = archived;
	}

	public JiraVersion released(Boolean released) {
		this.released = released;
		return this;
	}

	/**
	 * Get released
	 * 
	 * @return released
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull
	public Boolean getReleased() {
		return released;
	}

	public void setReleased(Boolean released) {
		this.released = released;
	}

	public JiraVersion releaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
		return this;
	}

	/**
	 * Get releaseDate
	 * 
	 * @return releaseDate
	 **/
	@ApiModelProperty(value = "")
	@Valid
	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public JiraVersion userStartDate(String userStartDate) {
		this.userStartDate = userStartDate;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getUserStartDate() {
		return userStartDate;
	}

	public void setUserStartDate(String userStartDate) {
		this.userStartDate = userStartDate;
	}
	
	public JiraVersion userReleaseDate(String userReleaseDate) {
		this.userReleaseDate = userReleaseDate;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getUserReleaseDate() {
		return userReleaseDate;
	}

	public void setUserReleaseDate(String userReleaseDate) {
		this.userReleaseDate = userReleaseDate;
	}

	public JiraVersion overdue(Boolean overdue) {
		this.overdue = overdue;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public Boolean getOverdue() {
		return overdue;
	}

	public void setOverdue(Boolean overdue) {
		this.overdue = overdue;
	}

	public JiraVersion self(String self) {
		this.self = self;
		return this;
	}

	/**
	 * Get self
	 * 
	 * @return self
	 **/
	@ApiModelProperty(value = "")

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
		JiraVersion jiraVersion = (JiraVersion) o;
		return Objects.equals(this.id, jiraVersion.id) 
				&& Objects.equals(this.projectId, jiraVersion.projectId)
				&& Objects.equals(this.name, jiraVersion.name)
				&& Objects.equals(this.description, jiraVersion.description)
				&& Objects.equals(this.archived, jiraVersion.archived)
				&& Objects.equals(this.released, jiraVersion.released)
				&& Objects.equals(this.releaseDate, jiraVersion.releaseDate)
				&& Objects.equals(this.userStartDate, jiraVersion.userStartDate)
				&& Objects.equals(this.userReleaseDate, jiraVersion.userReleaseDate)
				&& Objects.equals(this.overdue, jiraVersion.overdue)
				&& Objects.equals(this.self, jiraVersion.self);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, projectId, name, description, archived, released, releaseDate, userStartDate, userReleaseDate, overdue, self);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraVersion {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
		sb.append("    released: ").append(toIndentedString(released)).append("\n");
		sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
		sb.append("    userStartDate: ").append(toIndentedString(userStartDate)).append("\n");
		sb.append("    userReleaseDate: ").append(toIndentedString(userReleaseDate)).append("\n");
		sb.append("    overdue: ").append(toIndentedString(overdue)).append("\n");
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
