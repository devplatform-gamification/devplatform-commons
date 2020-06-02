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
public class JiraIssueLink {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("sourceIssueId")
	private BigDecimal sourceIssueId = null;

	@JsonProperty("destinationIssueId")
	private BigDecimal destinationIssueId = null;

	@JsonProperty("systemLink")
	private Boolean systemLink = null;

	@JsonProperty("issueLinkType")
	private JiraIssueLinkType issueLinkType = null;

	public JiraIssueLink id(BigDecimal id) {
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
	
	public JiraIssueLink sourceIssueId(BigDecimal sourceIssueId) {
		this.sourceIssueId = sourceIssueId;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public BigDecimal getSourceIssueId() {
		return sourceIssueId;
	}

	public void setSourceIssueId(BigDecimal sourceIssueId) {
		this.sourceIssueId = sourceIssueId;
	}

	public JiraIssueLink destinationIssueId(BigDecimal destinationIssueId) {
		this.destinationIssueId = destinationIssueId;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public BigDecimal getDestinationIssueId() {
		return destinationIssueId;
	}

	public void setDestinationIssueId(BigDecimal destinationIssueId) {
		this.destinationIssueId = destinationIssueId;
	}

	public JiraIssueLink systemLink(Boolean systemLink) {
		this.systemLink = systemLink;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public Boolean getSystemLink() {
		return systemLink;
	}

	public void setSystemLink(Boolean systemLink) {
		this.systemLink = systemLink;
	}

	public JiraIssueLink issueLinkType(JiraIssueLinkType issueLinkType) {
		this.issueLinkType = issueLinkType;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public JiraIssueLinkType getIssueLinkType() {
		return issueLinkType;
	}

	public void setIssueLinkType(JiraIssueLinkType issueLinkType) {
		this.issueLinkType = issueLinkType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraIssueLink jiraIssueComment = (JiraIssueLink) o;
		return Objects.equals(this.id, jiraIssueComment.id) 
				&& Objects.equals(this.sourceIssueId, jiraIssueComment.sourceIssueId)
				&& Objects.equals(this.destinationIssueId, jiraIssueComment.destinationIssueId)
				&& Objects.equals(this.systemLink, jiraIssueComment.systemLink)
				&& Objects.equals(this.issueLinkType, jiraIssueComment.issueLinkType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, sourceIssueId, destinationIssueId, systemLink, issueLinkType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueLink {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    sourceIssueId: ").append(toIndentedString(sourceIssueId)).append("\n");
		sb.append("    destinationIssueId: ").append(toIndentedString(destinationIssueId)).append("\n");
		sb.append("    systemLink: ").append(toIndentedString(systemLink)).append("\n");
		sb.append("    issueLinkType: ").append(toIndentedString(issueLinkType)).append("\n");
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
