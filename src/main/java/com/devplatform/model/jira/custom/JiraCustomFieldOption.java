package com.devplatform.model.jira.custom;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssue
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraCustomFieldOption {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("sequence")
	private Integer sequence = null;

	@JsonProperty("self")
	private String self = null;

	@JsonProperty("value")
	private String value = null;

	@JsonProperty("enabled")
	private Boolean enabled = null;

	@JsonProperty("cascadingOptions")
	private List<JiraCustomFieldOption> cascadingOptions = null;

	public JiraCustomFieldOption id(BigDecimal id) {
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

	public JiraCustomFieldOption self(String self) {
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
	
	public JiraCustomFieldOption sequence(Integer sequence) {
		this.sequence = sequence;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public JiraCustomFieldOption value(String value) {
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

	public JiraCustomFieldOption enabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public JiraCustomFieldOption cascadingOptions(List<JiraCustomFieldOption> cascadingOptions) {
		this.cascadingOptions = cascadingOptions;
		return this;
	}

	@ApiModelProperty(value = "")
	public List<JiraCustomFieldOption> getCascadingOptions() {
		return cascadingOptions;
	}

	public void setCascadingOptions(List<JiraCustomFieldOption> cascadingOptions) {
		this.cascadingOptions = cascadingOptions;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraCustomFieldOption jiraIssue = (JiraCustomFieldOption) o;
		return Objects.equals(this.id, jiraIssue.id) && Objects.equals(this.self, jiraIssue.self)
				&& Objects.equals(this.sequence, jiraIssue.sequence) && Objects.equals(this.value, jiraIssue.value)
				&& Objects.equals(this.enabled, jiraIssue.enabled) && Objects.equals(this.cascadingOptions, jiraIssue.cascadingOptions);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, self, sequence, value, enabled, cascadingOptions);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraCustomFieldOption {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    self: ").append(toIndentedString(self)).append("\n");
		sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
		sb.append("    cascadingOptions: ").append(toIndentedString(cascadingOptions)).append("\n");
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
