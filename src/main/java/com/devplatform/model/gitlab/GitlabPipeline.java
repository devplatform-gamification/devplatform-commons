package com.devplatform.model.gitlab;

import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabPipeline {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("sha")
	private String sha = null;

	@JsonProperty("ref")
	private String ref = null;

	@JsonProperty("status")
	private GitlabPipelineStatusEnum status = null;

	@JsonProperty("created_at")
	private String createdAt = null;

	@JsonProperty("updated_at")
	private String updatedAt = null;

	@JsonProperty("web_url")
	private String webUrl = null;

	public GitlabPipeline id(BigDecimal id) {
		this.id = id;
		return this;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public GitlabPipeline sha(String sha) {
		this.sha = sha;
		return this;
	}

	public String getSha() {
		return sha;
	}

	public void setSha(String sha) {
		this.sha = sha;
	}

	public GitlabPipeline ref(String ref) {
		this.ref = ref;
		return this;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public GitlabPipeline status(GitlabPipelineStatusEnum status) {
		this.status = status;
		return this;
	}

	public GitlabPipelineStatusEnum getStatus() {
		return status;
	}

	public void setStatus(GitlabPipelineStatusEnum status) {
		this.status = status;
	}
	
	public GitlabPipeline createdAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public GitlabPipeline updatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public GitlabPipeline webUrl(String webUrl) {
		this.webUrl = webUrl;
		return this;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabPipeline gitlabCommit = (GitlabPipeline) o;
		return Objects.equals(this.status, gitlabCommit.status) && Objects.equals(this.sha, gitlabCommit.sha)
				&& Objects.equals(this.ref, gitlabCommit.ref) && Objects.equals(this.status, gitlabCommit.status)
				&& Objects.equals(this.createdAt, gitlabCommit.createdAt) && Objects.equals(this.updatedAt, gitlabCommit.updatedAt)
				&& Objects.equals(this.webUrl, gitlabCommit.webUrl);
	}

	@JsonProperty("status")
	@Override
	public int hashCode() {
		return Objects.hash(status, sha, ref, status, createdAt, updatedAt, webUrl);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabPipeline {\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
		sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
		sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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
