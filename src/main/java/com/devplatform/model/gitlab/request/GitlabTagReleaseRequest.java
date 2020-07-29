package com.devplatform.model.gitlab.request;

import java.util.Objects;

import javax.annotation.Generated;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabTagReleaseRequest {
	@JsonProperty("description")
	private String description = null;

	public GitlabTagReleaseRequest() {
		super();
		// dummy constructor
	}

	public GitlabTagReleaseRequest(String description) {
		super();
		this.description = description;
	}

	public GitlabTagReleaseRequest description(String description) {
		this.description = description;
		return this;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabTagReleaseRequest gitlabCommit = (GitlabTagReleaseRequest) o;
		return Objects.equals(this.description, gitlabCommit.description);
	}


	@Override
	public int hashCode() {
		return Objects.hash(description);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabTagReleaseRequest {\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
