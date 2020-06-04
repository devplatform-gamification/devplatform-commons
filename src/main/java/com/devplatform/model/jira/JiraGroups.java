package com.devplatform.model.jira;

import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraGroups {
	@JsonProperty("size")
	private Integer size = null;

	@JsonProperty("items")
	private List<JiraGroup> items = null;

	public JiraGroups size(Integer size) {
		this.size = size;
		return this;
	}

	@ApiModelProperty(value = "")
	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public List<JiraGroup> getItems() {
		return items;
	}

	public void setItems(List<JiraGroup> items) {
		this.items = items;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraGroups jiraUser = (JiraGroups) o;
		return Objects.equals(this.size, jiraUser.size) && Objects.equals(this.items, jiraUser.items);
	}

	@Override
	public int hashCode() {
		return Objects.hash(size, items);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraGroups {\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
