package com.devplatform.model.jira;

import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraUsers {
	@JsonProperty("size")
	private Integer size = null;

	@JsonProperty("items")
	private List<JiraUser> items = null;

	@JsonProperty("max-results")
	private Integer maxResults = null;

	@JsonProperty("start-index")
	private Integer startIndex = null;

	@JsonProperty("end-index")
	private Integer endIndex = null;

	public JiraUsers size(Integer size) {
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

	public JiraUsers items(List<JiraUser> items) {
		this.items = items;
		return this;
	}

	@ApiModelProperty(value = "")
	public List<JiraUser> getItems() {
		return items;
	}

	public void setItems(List<JiraUser> items) {
		this.items = items;
	}
	
	public JiraUsers maxResults(Integer maxResults) {
		this.maxResults = maxResults;
		return this;
	}

	@ApiModelProperty(value = "")
	public Integer getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public JiraUsers startIndex(Integer startIndex) {
		this.startIndex = startIndex;
		return this;
	}

	@ApiModelProperty(value = "")
	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public JiraUsers endIndex(Integer endIndex) {
		this.endIndex = endIndex;
		return this;
	}

	@ApiModelProperty(value = "")
	public Integer getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraUsers jiraUser = (JiraUsers) o;
		return Objects.equals(this.size, jiraUser.size) 
				&& Objects.equals(this.items, jiraUser.items)
				&& Objects.equals(this.maxResults, jiraUser.maxResults)
				&& Objects.equals(this.startIndex, jiraUser.startIndex)
				&& Objects.equals(this.endIndex, jiraUser.endIndex);
	}

	@Override
	public int hashCode() {
		return Objects.hash(size, items, maxResults, startIndex, endIndex);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraUsers {\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    items: ").append(toIndentedString(items)).append("\n");
		sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
		sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
		sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
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
