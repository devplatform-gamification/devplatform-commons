package com.devplatform.model.gitlab.event;

import java.math.BigDecimal;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.gitlab.GitlabMergeRequestAttributes;
import com.devplatform.model.gitlab.GitlabNoteAttributes;
import com.devplatform.model.gitlab.GitlabObjectKindEnum;
import com.devplatform.model.gitlab.GitlabProject;
import com.devplatform.model.gitlab.GitlabRepository;
import com.devplatform.model.gitlab.GitlabUser;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabMergeRequest
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabEventNote {
	@JsonProperty("object_kind")
	private GitlabObjectKindEnum objectKind = null;

	@JsonProperty("event_type")
	private GitlabEventTypeEnum eventType = null;

	@JsonProperty("user")
	private GitlabUser user = null;

	@JsonProperty("project_id")
	private BigDecimal projectId = null;

	@JsonProperty("project")
	private GitlabProject project = null;

	@JsonProperty("object_attributes")
	private GitlabNoteAttributes objectAttributes = null;

	@JsonProperty("repository")
	private GitlabRepository repository = null;

	@JsonProperty("merge_request")
	private GitlabMergeRequestAttributes mergeRequest = null;

	public GitlabEventNote objectKind(GitlabObjectKindEnum objectKind) {
		this.objectKind = objectKind;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull

	public GitlabObjectKindEnum getObjectKind() {
		return objectKind;
	}

	public void setObjectKind(GitlabObjectKindEnum objectKind) {
		this.objectKind = objectKind;
	}

	public GitlabEventNote eventType(GitlabEventTypeEnum eventType) {
		this.eventType = eventType;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public GitlabEventTypeEnum getEventType() {
		return eventType;
	}

	public void setEventType(GitlabEventTypeEnum eventType) {
		this.eventType = eventType;
	}

	public GitlabEventNote user(GitlabUser user) {
		this.user = user;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	@Valid
	public GitlabUser getUser() {
		return user;
	}

	public void setUser(GitlabUser user) {
		this.user = user;
	}

	public GitlabEventNote projectId(BigDecimal projectId) {
		this.projectId = projectId;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public BigDecimal getProjectId() {
		return projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	public GitlabEventNote project(GitlabProject project) {
		this.project = project;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	@Valid
	public GitlabProject getProject() {
		return project;
	}

	public void setProject(GitlabProject project) {
		this.project = project;
	}

	public GitlabEventNote objectAttributes(GitlabNoteAttributes objectAttributes) {
		this.objectAttributes = objectAttributes;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	@Valid
	public GitlabNoteAttributes getObjectAttributes() {
		return objectAttributes;
	}

	public void setObjectAttributes(GitlabNoteAttributes objectAttributes) {
		this.objectAttributes = objectAttributes;
	}

	public GitlabEventNote repository(GitlabRepository repository) {
		this.repository = repository;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public GitlabRepository getRepository() {
		return repository;
	}

	public void setRepository(GitlabRepository repository) {
		this.repository = repository;
	}

	public GitlabEventNote mergeRequest(GitlabMergeRequestAttributes mergeRequest) {
		this.mergeRequest = mergeRequest;
		return this;
	}

	@ApiModelProperty(value = "")
	public GitlabMergeRequestAttributes getMergeRequest() {
		return mergeRequest;
	}

	public void setMergeRequest(GitlabMergeRequestAttributes mergeRequest) {
		this.mergeRequest = mergeRequest;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GitlabEventNote other = (GitlabEventNote) obj;
		if (eventType != other.eventType)
			return false;
		if (mergeRequest == null) {
			if (other.mergeRequest != null)
				return false;
		} else if (!mergeRequest.equals(other.mergeRequest))
			return false;
		if (objectAttributes == null) {
			if (other.objectAttributes != null)
				return false;
		} else if (!objectAttributes.equals(other.objectAttributes))
			return false;
		if (objectKind != other.objectKind)
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		if (repository == null) {
			if (other.repository != null)
				return false;
		} else if (!repository.equals(other.repository))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((objectKind == null) ? 0 : objectKind.hashCode());
		result = prime * result + ((eventType == null) ? 0 : eventType.hashCode());
		result = prime * result + ((objectAttributes == null) ? 0 : objectAttributes.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result + ((repository == null) ? 0 : repository.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + ((mergeRequest == null) ? 0 : mergeRequest.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabEventNote {\n");

		sb.append("    objectKind: ").append(toIndentedString(objectKind)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    user: ").append(toIndentedString(user)).append("\n");
		sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
		sb.append("    project: ").append(toIndentedString(project)).append("\n");
		sb.append("    objectAttributes: ").append(toIndentedString(objectAttributes)).append("\n");
		sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
		sb.append("    mergeRequest: ").append(toIndentedString(mergeRequest)).append("\n");
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
