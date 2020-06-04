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
public class JiraIssueOpLinkGroupLink {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("styleClass")
	private String styleClass = null;

	@JsonProperty("iconClass")
	private String iconClass = null;

	@JsonProperty("label")
	private String label = null;

	@JsonProperty("title")
	private String title = null;

	@JsonProperty("href")
	private String href = null;

	@JsonProperty("weight")
	private Integer weight = null;

	public JiraIssueOpLinkGroupLink id(String id) {
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

	public JiraIssueOpLinkGroupLink styleClass(String styleClass) {
		this.styleClass = styleClass;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getStyleClass() {
		return styleClass;
	}

	public void setStyleClass(String styleClass) {
		this.styleClass = styleClass;
	}

	public JiraIssueOpLinkGroupLink iconClass(String iconClass) {
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

	public JiraIssueOpLinkGroupLink label(String label) {
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

	public JiraIssueOpLinkGroupLink title(String title) {
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

	public JiraIssueOpLinkGroupLink href(String href) {
		this.href = href;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public JiraIssueOpLinkGroupLink weight(Integer weight) {
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
		JiraIssueOpLinkGroupLink jiraIssueComment = (JiraIssueOpLinkGroupLink) o;
		return Objects.equals(this.id, jiraIssueComment.id) 
				&& Objects.equals(this.styleClass, jiraIssueComment.styleClass)
				&& Objects.equals(this.iconClass, jiraIssueComment.iconClass)
				&& Objects.equals(this.label, jiraIssueComment.label)
				&& Objects.equals(this.title, jiraIssueComment.title)
				&& Objects.equals(this.href, jiraIssueComment.href)
				&& Objects.equals(this.weight, jiraIssueComment.weight);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, styleClass, iconClass, label, title, href, weight);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueOpLinkGroupLink {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    styleClass: ").append(toIndentedString(styleClass)).append("\n");
		sb.append("    iconClass: ").append(toIndentedString(iconClass)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
