package com.devplatform.model.gitlab.event;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.gitlab.GitlabObjectKindEnum;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabMergeRequest
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabEvent {
	@JsonProperty("object_kind")
	protected GitlabObjectKindEnum objectKind = null;

	public GitlabEvent objectKind(GitlabObjectKindEnum objectKind) {
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GitlabEvent other = (GitlabEvent) obj;
		if (objectKind != other.objectKind)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((objectKind == null) ? 0 : objectKind.hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabEvent {\n");
		sb.append("    objectKind: ").append(toIndentedString(objectKind)).append("\n");
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
