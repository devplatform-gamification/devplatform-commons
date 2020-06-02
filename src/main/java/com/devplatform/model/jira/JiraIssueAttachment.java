package com.devplatform.model.jira;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssueOptionField
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssueAttachment {
	@JsonProperty("id")
	protected BigDecimal id = null;

	@JsonProperty("filename")
	protected String filename = null;

	@JsonProperty("author")
	protected JiraUser author = null;

	@JsonProperty("created")
	protected String created = null;

	@JsonProperty("size")
	protected BigDecimal size = null;

	@JsonProperty("mimeType")
	protected String mimeType = null;

	@JsonProperty("content")
	protected String content = null;

	@JsonProperty("thumbnail")
	protected String thumbnail = null;

	@JsonProperty("properties")
	protected Map<String, String> properties = null;

	@JsonProperty("self")
	protected String self = null;

	public JiraIssueAttachment id(BigDecimal id) {
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

	public JiraIssueAttachment filename(String filename) {
		this.filename = filename;
		return this;
	}

	/**
	 * Get value
	 * 
	 * @return value
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public JiraIssueAttachment author(JiraUser author) {
		this.author = author;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public JiraUser getAuthor() {
		return author;
	}

	public void setAuthor(JiraUser author) {
		this.author = author;
	}

	public JiraIssueAttachment created(String created) {
		this.created = created;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public JiraIssueAttachment size(BigDecimal size) {
		this.size = size;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public BigDecimal getSize() {
		return size;
	}

	public void setSize(BigDecimal size) {
		this.size = size;
	}

	public JiraIssueAttachment mimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public JiraIssueAttachment content(String content) {
		this.content = content;
		return this;
	}
	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public JiraIssueAttachment thumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
	public JiraIssueAttachment properties(Map<String, String> properties) {
		this.properties = properties;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public Map<String, String> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	public JiraIssueAttachment self(String self) {
		this.self = self;
		return this;
	}

	/**
	 * Get self
	 * 
	 * @return self
	 **/
	@ApiModelProperty(value = "")

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraIssueAttachment jiraIssueOptionField = (JiraIssueAttachment) o;
		return Objects.equals(this.id, jiraIssueOptionField.id)
				&& Objects.equals(this.filename, jiraIssueOptionField.filename)
				&& Objects.equals(this.author, jiraIssueOptionField.author)
				&& Objects.equals(this.created, jiraIssueOptionField.created)
				&& Objects.equals(this.size, jiraIssueOptionField.size)
				&& Objects.equals(this.mimeType, jiraIssueOptionField.mimeType)
				&& Objects.equals(this.content, jiraIssueOptionField.content)
				&& Objects.equals(this.thumbnail, jiraIssueOptionField.thumbnail)
				&& Objects.equals(this.properties, jiraIssueOptionField.properties)
				&& Objects.equals(this.self, jiraIssueOptionField.self);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, filename, author, created, size, mimeType, content, thumbnail, properties, self);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueAttachment {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
		sb.append("    author: ").append(toIndentedString(author)).append("\n");
		sb.append("    created: ").append(toIndentedString(created)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("    content: ").append(toIndentedString(content)).append("\n");
		sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
		sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
		sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
