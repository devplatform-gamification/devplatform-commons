package com.devplatform.model.jira;

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
public class JiraIssueOpLinkGroupHeader {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("iconClass")
	private String iconClass = null;

	@JsonProperty("label")
	private String label = null;

	@JsonProperty("title")
	private String title = null;

	public JiraIssueOpLinkGroupHeader id(String id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public JiraIssueOpLinkGroupHeader iconClass(String iconClass) {
		this.iconClass = iconClass;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getIconClass() {
		return iconClass;
	}

	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}

	public JiraIssueOpLinkGroupHeader label(String label) {
		this.label = label;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public JiraIssueOpLinkGroupHeader title(String title) {
		this.title = title;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraIssueOpLinkGroupHeader jiraIssueComment = (JiraIssueOpLinkGroupHeader) o;
		return Objects.equals(this.id, jiraIssueComment.id) 
				&& Objects.equals(this.iconClass, jiraIssueComment.iconClass)
				&& Objects.equals(this.label, jiraIssueComment.label)
				&& Objects.equals(this.title, jiraIssueComment.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, iconClass, label, title);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueOpLinkGroupHeader {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    iconClass: ").append(toIndentedString(iconClass)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
