package com.devplatform.model.jira.request;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.jira.custom.JiraCustomFieldOption;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraCustomFieldOptionRequest {
	@JsonProperty("options")
	private List<JiraCustomFieldOption> options = null;

	public JiraCustomFieldOptionRequest(JiraCustomFieldOption option) {
		super();
		if(option != null) {
			List<JiraCustomFieldOption> options = new ArrayList<>();
			options.add(option);
			this.options = options;			
		}
	}

	public JiraCustomFieldOptionRequest(List<JiraCustomFieldOption> options) {
		super();
		this.options = options;
	}

	public JiraCustomFieldOptionRequest options(List<JiraCustomFieldOption> options) {
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
		JiraCustomFieldOptionRequest jiraIssue = (JiraCustomFieldOptionRequest) o;
		return Objects.equals(this.options, jiraIssue.options);
	}

	@Override
	public int hashCode() {
		return Objects.hash(options);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraCustomFieldOptionsRequest {\n");
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
