package com.devplatform.model.event.gitlab;

import java.math.BigDecimal;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabLabel {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("title")
	private String title = null;

	@JsonProperty("color")
	private String color = null;

	@JsonProperty("project_id")
	private BigDecimal projectId = null;

	@JsonProperty("created_at")
	private String createdAt = null;

	@JsonProperty("template")
	private String template = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("group_id")
	private String groupId = null;

	@ApiModelProperty(value = "")
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public GitlabLabel id(BigDecimal id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public GitlabLabel title(String title) {
		this.title = title;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public GitlabLabel color(String color) {
		this.color = color;
		return this;
	}

	@ApiModelProperty(value = "")
	public BigDecimal getprojectId() {
		return projectId;
	}

	public void setprojectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	public GitlabLabel projectId(BigDecimal projectId) {
		this.projectId = projectId;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getcreatedAt() {
		return createdAt;
	}

	public void setcreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public GitlabLabel createdAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public GitlabLabel template(String template) {
		this.template = template;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public GitlabLabel description(String description) {
		this.description = description;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GitlabLabel type(String type) {
		this.type = type;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public GitlabLabel groupId(String groupId) {
		this.groupId = groupId;
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GitlabLabel other = (GitlabLabel) obj;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabLabel {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    color: ").append(toIndentedString(color)).append("\n");
		sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    template: ").append(toIndentedString(template)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
