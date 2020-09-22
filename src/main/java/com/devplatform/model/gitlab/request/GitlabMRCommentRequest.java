package com.devplatform.model.gitlab.request;

import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabMRCommentRequest {
	@JsonProperty("id")
	private BigDecimal id = null;
	
	@JsonProperty("merge_request_iid")
	private BigDecimal mergeRequestIid = null;

	@JsonProperty("body")
	private String body = null;
	
	public GitlabMRCommentRequest() {
		super();
	}

	public GitlabMRCommentRequest(BigDecimal id, BigDecimal mergeRequestIid, String body) {
		super();
		this.id = id;
		this.mergeRequestIid = mergeRequestIid;
		this.body = body;
	}

	public GitlabMRCommentRequest id(BigDecimal id) {
		this.id = id;
		return this;
	}

	@Valid
	@NotNull
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}
	
	public GitlabMRCommentRequest mergeRequestIid(BigDecimal mergeRequestIid) {
		this.mergeRequestIid = mergeRequestIid;
		return this;
	}

	@Valid
	public BigDecimal getMergeRequestIid() {
		return mergeRequestIid;
	}

	public void setMergeRequestIid(BigDecimal mergeRequestIid) {
		this.mergeRequestIid = mergeRequestIid;
	}

	public GitlabMRCommentRequest body(String body) {
		this.body = body;
		return this;
	}

	@Valid
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabMRCommentRequest gitlabCommit = (GitlabMRCommentRequest) o;
		return Objects.equals(this.id, gitlabCommit.id) && Objects.equals(this.mergeRequestIid, gitlabCommit.mergeRequestIid)
				&& Objects.equals(this.body, gitlabCommit.body);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, mergeRequestIid, body);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabMRCommentRequest {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    mergeRequestIid: ").append(toIndentedString(mergeRequestIid)).append("\n");
		sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
