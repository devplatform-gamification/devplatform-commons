package com.devplatform.model.gitlab;

import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabArtifactFile {
	@JsonProperty("filename")
	private String filename = null;

	@JsonProperty("size")
	private BigDecimal size = null;

	public GitlabArtifactFile filename(String filename) {
		this.filename = filename;
		return this;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public GitlabArtifactFile size(BigDecimal size) {
		this.size = size;
		return this;
	}

	public BigDecimal getSize() {
		return size;
	}

	public void setSize(BigDecimal size) {
		this.size = size;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabArtifactFile gitlabCommitAuthor = (GitlabArtifactFile) o;
		return Objects.equals(this.filename, gitlabCommitAuthor.filename)
				&& Objects.equals(this.size, gitlabCommitAuthor.size);
	}

	@Override
	public int hashCode() {
		return Objects.hash(filename, size);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabArtifactFile {\n");
		sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
