package com.devplatform.model.jira.custom;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraCustomField {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("fieldName")
	private String fieldName = null;

	@JsonProperty("self")
	private String self = null;

	@JsonProperty("typeKey")
	private String typeKey = null;

	@JsonProperty("typeName")
	private String typeName = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("options")
	private List<JiraCustomFieldOption> options = null;

	public JiraCustomField id(BigDecimal id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public JiraCustomField self(String self) {
		this.self = self;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public JiraCustomField fieldName(String fieldName) {
		this.fieldName = fieldName;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public JiraCustomField typeKey(String typeKey) {
		this.typeKey = typeKey;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getTypeKey() {
		return typeKey;
	}

	public void setTypeKey(String typeKey) {
		this.typeKey = typeKey;
	}

	public JiraCustomField typeName(String typeName) {
		this.typeName = typeName;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public JiraCustomField description(String description) {
		this.description = description;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public JiraCustomField options(List<JiraCustomFieldOption> options) {
		this.options = options;
		return this;
	}

	@ApiModelProperty(value = "")
	public List<JiraCustomFieldOption> getOptions() {
		return options;
	}

	public void setOptions(List<JiraCustomFieldOption> options) {
		this.options = options;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraCustomField jiraIssue = (JiraCustomField) o;
		return Objects.equals(this.id, jiraIssue.id) && Objects.equals(this.self, jiraIssue.self)
				&& Objects.equals(this.fieldName, jiraIssue.fieldName) && Objects.equals(this.typeKey, jiraIssue.typeKey)
				&& Objects.equals(this.typeName, jiraIssue.typeName) && Objects.equals(this.description, jiraIssue.description)
				&& Objects.equals(this.options, jiraIssue.options);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, self, fieldName, typeKey, typeName, description, options);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraCustomField {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
		sb.append("    self: ").append(toIndentedString(self)).append("\n");
		sb.append("    typeKey: ").append(toIndentedString(typeKey)).append("\n");
		sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
