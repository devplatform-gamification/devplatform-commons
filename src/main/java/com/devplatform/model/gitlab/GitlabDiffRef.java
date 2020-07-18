package com.devplatform.model.gitlab;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabDiffRef {

	@JsonProperty("base_sha")
	private String baseSha = null;

	@JsonProperty("head_sha")
	private String headSha = null;

	@JsonProperty("start_sha")
	private String startSha = null;

	public GitlabDiffRef baseSha(String baseSha) {
		this.baseSha = baseSha;
		return this;
	}

	public String getBaseSha() {
		return baseSha;
	}

	public void setBaseSha(String baseSha) {
		this.baseSha = baseSha;
	}

	public GitlabDiffRef headSha(String headSha) {
		this.headSha = headSha;
		return this;
	}

	public String getHeadSha() {
		return headSha;
	}

	public void setHeadSha(String headSha) {
		this.headSha = headSha;
	}

	public GitlabDiffRef startSha(String startSha) {
		this.startSha = startSha;
		return this;
	}

	public String getStartSha() {
		return startSha;
	}

	public void setStartSha(String startSha) {
		this.startSha = startSha;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabDiffRef gitlabCommit = (GitlabDiffRef) o;
		return Objects.equals(this.baseSha, gitlabCommit.baseSha)
				&& Objects.equals(this.headSha, gitlabCommit.headSha)
				&& Objects.equals(this.startSha, gitlabCommit.startSha);
	}

	@Override
	public int hashCode() {
		return Objects.hash(baseSha, headSha, startSha);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabDiffRef {\n");

		sb.append("    baseSha: ").append(toIndentedString(baseSha)).append("\n");
		sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
		sb.append("    startSha: ").append(toIndentedString(startSha)).append("\n");
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
