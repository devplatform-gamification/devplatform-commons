package com.devplatform.model.gitlab;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabEventChanges
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabEventChanges {
	@JsonProperty("updated_at")
	private GitlabEventChangedItem<String> updatedAt = null;

	@JsonProperty("updated_by_id")
	private GitlabEventChangedItem<Integer> updatedById = null;
	
	@JsonProperty("total_time_spent")
	private GitlabEventChangedItem<Integer> totalTimeSpent = null;

	@JsonProperty("labels")
	private GitlabEventChangedItem<List<GitlabLabel>> labels = null;

	
	
	@ApiModelProperty(value = "")
	public GitlabEventChangedItem<String> getupdatedAt() {
		return updatedAt;
	}

	public void setupdatedAt(GitlabEventChangedItem<String> updatedAt) {
		this.updatedAt = updatedAt;
	}

	public GitlabEventChanges updatedAt(GitlabEventChangedItem<String> updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	@ApiModelProperty(value = "")
	public GitlabEventChangedItem<Integer> getupdatedById() {
		return updatedById;
	}

	public void setupdatedById(GitlabEventChangedItem<Integer> updatedById) {
		this.updatedById = updatedById;
	}

	public GitlabEventChanges updatedById(GitlabEventChangedItem<Integer> updatedById) {
		this.updatedById = updatedById;
		return this;
	}
	
	@ApiModelProperty(value = "")
	public GitlabEventChangedItem<List<GitlabLabel>> getLabels() {
		return labels;
	}

	public void setLabels(GitlabEventChangedItem<List<GitlabLabel>> labels) {
		this.labels = labels;
	}

	public GitlabEventChanges labels(GitlabEventChangedItem<List<GitlabLabel>> labels) {
		this.labels = labels;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public GitlabEventChangedItem<Integer> getTotalTimeSpent() {
		return totalTimeSpent;
	}

	public void setTotalTimeSpent(GitlabEventChangedItem<Integer> totalTimeSpent) {
		this.totalTimeSpent = totalTimeSpent;
	}

	public GitlabEventChanges totalTimeSpent(GitlabEventChangedItem<Integer> totalTimeSpent) {
		this.totalTimeSpent = totalTimeSpent;
		return this;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabEventChanges gitlabEventChanges = (GitlabEventChanges) o;
		return Objects.equals(this.totalTimeSpent, gitlabEventChanges.totalTimeSpent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(totalTimeSpent);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabEventChanges {\n");

		sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("    totalTimeSpent: ").append(toIndentedString(totalTimeSpent)).append("\n");
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