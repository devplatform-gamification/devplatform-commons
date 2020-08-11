package com.devplatform.model.gitlab;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabProjectVariable {

	@JsonProperty("variable_type")
	private String variableType = "env_var";

	@JsonProperty("key")
	private String key = null;

	@JsonProperty("value")
	private String value = null;

	@JsonProperty("protected")
	private Boolean protectedValue = null;

	@JsonProperty("masked")
	private Boolean maskedValue = null;

	@JsonProperty("environment_scope")
	private String environmentScope = null;

	public GitlabProjectVariable variableType(String variableType) {
		this.variableType = variableType;
		return this;
	}

	public String getVariableType() {
		return variableType;
	}

	public void setVariableType(String variableType) {
		this.variableType = variableType;
	}

	public GitlabProjectVariable key(String key) {
		this.key = key;
		return this;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public GitlabProjectVariable value(String value) {
		this.value = value;
		return this;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public GitlabProjectVariable protectedValue(Boolean protectedValue) {
		this.protectedValue = protectedValue;
		return this;
	}

	public Boolean getProtectedValue() {
		return protectedValue;
	}

	public void setProtectedValue(Boolean protectedValue) {
		this.protectedValue = protectedValue;
	}

	public GitlabProjectVariable maskedValue(Boolean maskedValue) {
		this.maskedValue = maskedValue;
		return this;
	}

	public Boolean getMaskedValue() {
		return maskedValue;
	}

	public void setMaskedValue(Boolean maskedValue) {
		this.maskedValue = maskedValue;
	}

	public GitlabProjectVariable environmentScope(String environmentScope) {
		this.environmentScope = environmentScope;
		return this;
	}

	public String getEnvironmentScope() {
		return environmentScope;
	}

	public void setEnvironmentScope(String environmentScope) {
		this.environmentScope = environmentScope;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabProjectVariable gitlabCommit = (GitlabProjectVariable) o;
		return Objects.equals(this.variableType, gitlabCommit.variableType)
				&& Objects.equals(this.key, gitlabCommit.key)
				&& Objects.equals(this.value, gitlabCommit.value)
				&& Objects.equals(this.protectedValue, gitlabCommit.protectedValue)
				&& Objects.equals(this.maskedValue, gitlabCommit.maskedValue)
				&& Objects.equals(this.environmentScope, gitlabCommit.environmentScope);
	}

	@Override
	public int hashCode() {
		return Objects.hash(variableType, key, value, protectedValue, maskedValue, environmentScope);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabProjectVariable {\n");
		sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    protectedValue: ").append(toIndentedString(protectedValue)).append("\n");
		sb.append("    maskedValue: ").append(toIndentedString(maskedValue)).append("\n");
		sb.append("    environmentScope: ").append(toIndentedString(environmentScope)).append("\n");
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
