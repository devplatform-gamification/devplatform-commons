package com.devplatform.model.jira;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssueComment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssueLinkType {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("outwardName")
	private String outwardName = null;

	@JsonProperty("inwardName")
	private String inwardName = null;

	@JsonProperty("subTask")
	private Boolean subTask = null;

	@JsonProperty("system")
	private Boolean system = null;

	public JiraIssueLinkType id(BigDecimal id) {
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
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public JiraIssueLinkType name(String name) {
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

	public JiraIssueLinkType outwardName(String outwardName) {
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

	public JiraIssueLinkType inwardName(String inwardName) {
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

	public JiraIssueLinkType subTask(Boolean subTask) {
		this.subTask = subTask;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public Boolean getSubTask() {
		return subTask;
	}

	public void setSubTask(Boolean subTask) {
		this.subTask = subTask;
	}

	public JiraIssueLinkType system(Boolean system) {
		this.system = system;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public Boolean getSystem() {
		return system;
	}

	public void setSystem(Boolean system) {
		this.system = system;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraIssueLinkType jiraIssueComment = (JiraIssueLinkType) o;
		return Objects.equals(this.id, jiraIssueComment.id) && Objects.equals(this.name, jiraIssueComment.name)
				&& Objects.equals(this.outwardName, jiraIssueComment.outwardName)
				&& Objects.equals(this.inwardName, jiraIssueComment.inwardName)
				&& Objects.equals(this.subTask, jiraIssueComment.subTask)
				&& Objects.equals(this.system, jiraIssueComment.system);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, outwardName, inwardName, subTask, system);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueLinkType {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    outwardName: ").append(toIndentedString(outwardName)).append("\n");
		sb.append("    inwardName: ").append(toIndentedString(inwardName)).append("\n");
		sb.append("    subTask: ").append(toIndentedString(subTask)).append("\n");
		sb.append("    system: ").append(toIndentedString(system)).append("\n");
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
