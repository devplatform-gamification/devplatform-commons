package com.devplatform.model.gitlab;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabMergeRequestAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabPipelineAttributes {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("ref")
	private String ref = null;

	@JsonProperty("tag")
	private Boolean tag = null;

	@JsonProperty("sha")
	private String sha = null;

	@JsonProperty("before_sha")
	private String beforeSha = null;

	@JsonProperty("source")
	private String source = null;

	@JsonProperty("status")
	private GitlabPipelineStatusEnum status = null;

	@JsonProperty("stages")
	private List<String> stages = null;

	@JsonProperty("created_at")
	private String createdAt = null;

	@JsonProperty("finished_at")
	private String finishedAt = null;

	@JsonProperty("duration")
	private BigDecimal duration = null;

	@JsonProperty("variables")
	private List<GitlabProjectVariable> variables = null;
	
	public GitlabPipelineAttributes id(BigDecimal id) {
		this.id = id;
		return this;
	}
	
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public GitlabPipelineAttributes ref(String ref) {
		this.ref = ref;
		return this;
	}
	
	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public GitlabPipelineAttributes tag(Boolean tag) {
		this.tag = tag;
		return this;
	}
	
	public Boolean getTag() {
		return tag;
	}

	public void setTag(Boolean tag) {
		this.tag = tag;
	}

	public GitlabPipelineAttributes sha(String sha) {
		this.sha = sha;
		return this;
	}
	
	public String getSha() {
		return sha;
	}

	public void setSha(String sha) {
		this.sha = sha;
	}

	public GitlabPipelineAttributes beforeSha(String beforeSha) {
		this.beforeSha = beforeSha;
		return this;
	}
	
	public String getBeforeSha() {
		return beforeSha;
	}

	public void setBeforeSha(String beforeSha) {
		this.beforeSha = beforeSha;
	}

	public GitlabPipelineAttributes source(String source) {
		this.source = source;
		return this;
	}
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public GitlabPipelineAttributes status(GitlabPipelineStatusEnum status) {
		this.status = status;
		return this;
	}
	
	public GitlabPipelineStatusEnum getStatus() {
		return status;
	}

	public void setStatus(GitlabPipelineStatusEnum status) {
		this.status = status;
	}

	public GitlabPipelineAttributes stages(List<String> stages) {
		this.stages = stages;
		return this;
	}
	
	public List<String> getStages() {
		return stages;
	}

	public void setStages(List<String> stages) {
		this.stages = stages;
	}

	public GitlabPipelineAttributes createdAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public GitlabPipelineAttributes finishedAt(String finishedAt) {
		this.finishedAt = finishedAt;
		return this;
	}
	
	public String getFinishedAt() {
		return finishedAt;
	}

	public void setFinishedAt(String finishedAt) {
		this.finishedAt = finishedAt;
	}

	public GitlabPipelineAttributes duration(BigDecimal duration) {
		this.duration = duration;
		return this;
	}
	
	public BigDecimal getDuration() {
		return duration;
	}

	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	public GitlabPipelineAttributes variables(List<GitlabProjectVariable> variables) {
		this.variables = variables;
		return this;
	}
	
	public List<GitlabProjectVariable> getVariables() {
		return variables;
	}

	public void setVariables(List<GitlabProjectVariable> variables) {
		this.variables = variables;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((beforeSha == null) ? 0 : beforeSha.hashCode());
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((finishedAt == null) ? 0 : finishedAt.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
		result = prime * result + ((sha == null) ? 0 : sha.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((stages == null) ? 0 : stages.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		result = prime * result + ((variables == null) ? 0 : variables.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GitlabPipelineAttributes other = (GitlabPipelineAttributes) obj;
		if (beforeSha == null) {
			if (other.beforeSha != null)
				return false;
		} else if (!beforeSha.equals(other.beforeSha))
			return false;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (finishedAt == null) {
			if (other.finishedAt != null)
				return false;
		} else if (!finishedAt.equals(other.finishedAt))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		if (sha == null) {
			if (other.sha != null)
				return false;
		} else if (!sha.equals(other.sha))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (stages == null) {
			if (other.stages != null)
				return false;
		} else if (!stages.equals(other.stages))
			return false;
		if (status != other.status)
			return false;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		if (variables == null) {
			if (other.variables != null)
				return false;
		} else if (!variables.equals(other.variables))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabPipelineAttributes {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
		sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
		sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
		sb.append("    beforeSha: ").append(toIndentedString(beforeSha)).append("\n");
		sb.append("    source: ").append(toIndentedString(source)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
		sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
		sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
