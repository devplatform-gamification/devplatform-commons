package com.devplatform.model.jira.request;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssueComment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
@JsonInclude(Include.NON_NULL)
public class JiraIssueLinkTypeRequest {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("outward")
	private String outwardName = null;

	@JsonProperty("inward")
	private String inwardName = null;

	public JiraIssueLinkTypeRequest id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "")
	@Valid
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public JiraIssueLinkTypeRequest name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "")
	@Valid
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JiraIssueLinkTypeRequest outwardName(String outwardName) {
		this.outwardName = outwardName;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getOutwardName() {
		return outwardName;
	}

	public void setOutwardName(String outwardName) {
		this.outwardName = outwardName;
	}

	public JiraIssueLinkTypeRequest inwardName(String inwardName) {
		this.inwardName = inwardName;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getInwardName() {
		return inwardName;
	}

	public void setInwardName(String inwardName) {
		this.inwardName = inwardName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraIssueLinkTypeRequest jiraIssueComment = (JiraIssueLinkTypeRequest) o;
		return Objects.equals(this.id, jiraIssueComment.id) && Objects.equals(this.name, jiraIssueComment.name)
				&& Objects.equals(this.outwardName, jiraIssueComment.outwardName)
				&& Objects.equals(this.inwardName, jiraIssueComment.inwardName);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, outwardName, inwardName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueLinkTypeRequest {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    outwardName: ").append(toIndentedString(outwardName)).append("\n");
		sb.append("    inwardName: ").append(toIndentedString(inwardName)).append("\n");
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
