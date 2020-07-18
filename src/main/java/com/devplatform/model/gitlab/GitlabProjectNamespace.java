package com.devplatform.model.gitlab;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabProject
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabProjectNamespace {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("path")
	private String path = null;

	@JsonProperty("kind")
	private String kind = null;

	@JsonProperty("full_path")
	private String fullPath = null;

	@JsonProperty("parent_id")
	private BigDecimal parentId = null;

	@JsonProperty("avatar_url")
	private String avatarUrl = null;

	@JsonProperty("web_url")
	private String webUrl = null;

	public GitlabProjectNamespace id(BigDecimal id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public GitlabProjectNamespace name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GitlabProjectNamespace path(String path) {
		this.path = path;
		return this;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public GitlabProjectNamespace kind(String kind) {
		this.kind = kind;
		return this;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public GitlabProjectNamespace fullPath(String fullPath) {
		this.fullPath = fullPath;
		return this;
	}

	public String getFullPath() {
		return fullPath;
	}

	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	public GitlabProjectNamespace parentId(BigDecimal parentId) {
		this.parentId = parentId;
		return this;
	}

	public BigDecimal getParentId() {
		return parentId;
	}

	public void setParentId(BigDecimal parentId) {
		this.parentId = parentId;
	}

	public GitlabProjectNamespace webUrl(String webUrl) {
		this.webUrl = webUrl;
		return this;
	}

	/**
	 * Get webUrl
	 * 
	 * @return webUrl
	 **/
	@ApiModelProperty(value = "")

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public GitlabProjectNamespace avatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
		return this;
	}

	/**
	 * Get avatarUrl
	 * 
	 * @return avatarUrl
	 **/
	@ApiModelProperty(value = "")

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabProjectNamespace gitlabProject = (GitlabProjectNamespace) o;
		return Objects.equals(this.id, gitlabProject.id) && Objects.equals(this.name, gitlabProject.name)
				&& Objects.equals(this.path, gitlabProject.path)
				&& Objects.equals(this.webUrl, gitlabProject.webUrl)
				&& Objects.equals(this.avatarUrl, gitlabProject.avatarUrl)
				&& Objects.equals(this.kind, gitlabProject.kind)
				&& Objects.equals(this.fullPath, gitlabProject.fullPath)
				&& Objects.equals(this.parentId, gitlabProject.parentId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, path, webUrl, avatarUrl, kind, fullPath, parentId);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabProjectNamespace {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    path: ").append(toIndentedString(path)).append("\n");
		sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
		sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
		sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
		sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
		sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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
