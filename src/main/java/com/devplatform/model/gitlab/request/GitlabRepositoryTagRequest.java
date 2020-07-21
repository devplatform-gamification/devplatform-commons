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
public class GitlabRepositoryTagRequest {
	@JsonProperty("tag_name")
	private String tagName = null;

	@JsonProperty("ref")
	private String ref = null;

	@JsonProperty("message")
	private String message = null;

	@JsonProperty("release_description")
	private String releaseDescription = null;

	public GitlabRepositoryTagRequest tagName(String tagName) {
		this.tagName = tagName;
		return this;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public GitlabRepositoryTagRequest ref(String ref) {
		this.ref = ref;
		return this;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public GitlabRepositoryTagRequest message(String message) {
		this.message = message;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public GitlabRepositoryTagRequest releaseDescription(String releaseDescription) {
		this.releaseDescription = releaseDescription;
		return this;
	}

	public String getReleaseDescription() {
		return releaseDescription;
	}

	public void setReleaseDescription(String releaseDescription) {
		this.releaseDescription = releaseDescription;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabRepositoryTagRequest gitlabCommit = (GitlabRepositoryTagRequest) o;
		return Objects.equals(this.tagName, gitlabCommit.tagName)
				 && Objects.equals(this.ref, gitlabCommit.ref)
				 && Objects.equals(this.message, gitlabCommit.message)
				 && Objects.equals(this.releaseDescription, gitlabCommit.releaseDescription);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tagName, ref, message, releaseDescription);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabRepositoryTagRequest {\n");
		sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
		sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    releaseDescription: ").append(toIndentedString(releaseDescription)).append("\n");
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
