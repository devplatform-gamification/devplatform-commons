package com.devplatform.model.jira;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssueComment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraProperty {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("key")
	private String key = null;

	@JsonProperty("value")
	private String value = null;

	public JiraProperty id(String id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public JiraProperty key(String key) {
		this.key = key;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public JiraProperty value(String value) {
		this.value = value;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraProperty jiraIssueComment = (JiraProperty) o;
		return Objects.equals(this.id, jiraIssueComment.id) 
				&& Objects.equals(this.key, jiraIssueComment.key)
				&& Objects.equals(this.value, jiraIssueComment.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, key, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraProperty {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
