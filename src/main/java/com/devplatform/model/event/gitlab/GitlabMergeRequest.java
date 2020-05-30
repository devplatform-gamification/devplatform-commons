package com.devplatform.model.event.gitlab;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabMergeRequest
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabMergeRequest {
	@JsonProperty("object_kind")
	private GitlabObjectKindEnum objectKind = null;

	@JsonProperty("event_type")
	private GitlabEventTypeEnum eventType = null;

	@JsonProperty("user")
	private GitlabUser user = null;

	@JsonProperty("project")
	private GitlabProject project = null;

	@JsonProperty("object_attributes")
	private GitlabMergeRequestAttributes objectAttributes = null;

	@JsonProperty("labels")
	@Valid
	private List<GitlabLabel> labels = null;

	@JsonProperty("changes")
	private GitlabEventChanges changes = null;

	@JsonProperty("repository")
	private GitlabRepository repository = null;

	public GitlabMergeRequest objectKind(GitlabObjectKindEnum objectKind) {
		this.objectKind = objectKind;
		return this;
	}

	@NotNull
	public GitlabObjectKindEnum getObjectKind() {
		return objectKind;
	}

	public void setObjectKind(GitlabObjectKindEnum objectKind) {
		this.objectKind = objectKind;
	}

	public GitlabMergeRequest eventType(GitlabEventTypeEnum eventType) {
		this.eventType = eventType;
		return this;
	}

	@NotNull
	public GitlabEventTypeEnum getEventType() {
		return eventType;
	}

	public void setEventType(GitlabEventTypeEnum eventType) {
		this.eventType = eventType;
	}

	public GitlabMergeRequest user(GitlabUser user) {
		this.user = user;
		return this;
	}

	@NotNull
	@Valid
	public GitlabUser getUser() {
		return user;
	}

	public void setUser(GitlabUser user) {
		this.user = user;
	}

	public GitlabMergeRequest project(GitlabProject project) {
		this.project = project;
		return this;
	}

	@NotNull
	@Valid
	public GitlabProject getProject() {
		return project;
	}

	public void setProject(GitlabProject project) {
		this.project = project;
	}

	public GitlabMergeRequest objectAttributes(GitlabMergeRequestAttributes objectAttributes) {
		this.objectAttributes = objectAttributes;
		return this;
	}

	@Valid
	public GitlabMergeRequestAttributes getObjectAttributes() {
		return objectAttributes;
	}

	public void setObjectAttributes(GitlabMergeRequestAttributes objectAttributes) {
		this.objectAttributes = objectAttributes;
	}

	public GitlabMergeRequest labels(List<GitlabLabel> labels) {
		this.labels = labels;
		return this;
	}

	public GitlabMergeRequest addLabelsItem(GitlabLabel labelsItem) {
		if (this.labels == null) {
			this.labels = new ArrayList<GitlabLabel>();
		}
		this.labels.add(labelsItem);
		return this;
	}

	public List<GitlabLabel> getLabels() {
		return labels;
	}

	public void setLabels(List<GitlabLabel> labels) {
		this.labels = labels;
	}

	public GitlabMergeRequest changes(GitlabEventChanges changes) {
		this.changes = changes;
		return this;
	}

	@Valid
	public GitlabEventChanges getChanges() {
		return changes;
	}

	public void setChanges(GitlabEventChanges changes) {
		this.changes = changes;
	}

	public GitlabMergeRequest repository(GitlabRepository repository) {
		this.repository = repository;
		return this;
	}

	@Valid
	public GitlabRepository getRepository() {
		return repository;
	}

	public void setRepository(GitlabRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabMergeRequest GitlabMergeRequest = (GitlabMergeRequest) o;
		return Objects.equals(this.objectKind, GitlabMergeRequest.objectKind)
				&& Objects.equals(this.eventType, GitlabMergeRequest.eventType) && Objects.equals(this.user, GitlabMergeRequest.user)
				&& Objects.equals(this.project, GitlabMergeRequest.project)
				&& Objects.equals(this.objectAttributes, GitlabMergeRequest.objectAttributes)
				&& Objects.equals(this.labels, GitlabMergeRequest.labels) && Objects.equals(this.changes, GitlabMergeRequest.changes)
				&& Objects.equals(this.repository, GitlabMergeRequest.repository);
	}

	@Override
	public int hashCode() {
		return Objects.hash(objectKind, eventType, user, project, objectAttributes, labels, changes, repository);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabMergeRequest {\n");

		sb.append("    objectKind: ").append(toIndentedString(objectKind)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    user: ").append(toIndentedString(user)).append("\n");
		sb.append("    project: ").append(toIndentedString(project)).append("\n");
		sb.append("    objectAttributes: ").append(toIndentedString(objectAttributes)).append("\n");
		sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
		sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
