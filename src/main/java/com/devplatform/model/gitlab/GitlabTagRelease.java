package com.devplatform.model.gitlab;

import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabTagRelease {
	@JsonProperty("tag_name")
	private String tag_name = null;

	@JsonProperty("description")
	private String description = null;

	public GitlabTagRelease tag_name(String tag_name) {
		this.tag_name = tag_name;
		return this;
	}

	@Valid
	public String getTag_name() {
		return tag_name;
	}
	
	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
	}
	
	public GitlabTagRelease description(String description) {
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
		GitlabTagRelease gitlabCommit = (GitlabTagRelease) o;
		return Objects.equals(this.tag_name, gitlabCommit.tag_name) && Objects.equals(this.description, gitlabCommit.description);
	}


	@Override
	public int hashCode() {
		return Objects.hash(tag_name, description);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabTagRelease {\n");
		sb.append("    tag_name: ").append(toIndentedString(tag_name)).append("\n");
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
