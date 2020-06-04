package com.devplatform.model.jira;

import java.util.List;
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
public class JiraIssueOpLinkGroup {
	@JsonProperty("id")
	private JiraIssueOpLinkGroupEnum id = null;

	@JsonProperty("header")
	private JiraIssueOpLinkGroupHeader header = null;

	@JsonProperty("links")
	private List<JiraIssueOpLinkGroupLink> links = null;

	@JsonProperty("groups")
	private List<JiraIssueOpLinkGroup> groups = null;

	@JsonProperty("weight")
	private Integer weight = null;

	public JiraIssueOpLinkGroup id(JiraIssueOpLinkGroupEnum id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public JiraIssueOpLinkGroupEnum getId() {
		return id;
	}

	public void setId(JiraIssueOpLinkGroupEnum id) {
		this.id = id;
	}
	
	public JiraIssueOpLinkGroup header(JiraIssueOpLinkGroupHeader header) {
		this.header = header;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public JiraIssueOpLinkGroupHeader getHeader() {
		return header;
	}

	public void setHeader(JiraIssueOpLinkGroupHeader header) {
		this.header = header;
	}

	public JiraIssueOpLinkGroup links(List<JiraIssueOpLinkGroupLink> links) {
		this.links = links;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public List<JiraIssueOpLinkGroupLink> getLinks() {
		return links;
	}

	public void setLinks(List<JiraIssueOpLinkGroupLink> links) {
		this.links = links;
	}

	public JiraIssueOpLinkGroup groups(List<JiraIssueOpLinkGroup> groups) {
		this.groups = groups;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public List<JiraIssueOpLinkGroup> getGroups() {
		return groups;
	}

	public void setGroups(List<JiraIssueOpLinkGroup> groups) {
		this.groups = groups;
	}

	public JiraIssueOpLinkGroup weight(Integer weight) {
		this.weight = weight;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraIssueOpLinkGroup jiraIssueComment = (JiraIssueOpLinkGroup) o;
		return Objects.equals(this.id, jiraIssueComment.id) 
				&& Objects.equals(this.header, jiraIssueComment.header)
				&& Objects.equals(this.links, jiraIssueComment.links)
				&& Objects.equals(this.groups, jiraIssueComment.groups)
				&& Objects.equals(this.weight, jiraIssueComment.weight);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, header, links, groups, weight);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueOpLinkGroup {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    header: ").append(toIndentedString(header)).append("\n");
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
		sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
		sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
