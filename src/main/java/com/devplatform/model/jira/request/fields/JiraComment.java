package com.devplatform.model.jira.request.fields;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class JiraComment {
	@JsonProperty("comment")
	private List<Map<String, Map<String, String>>> comment = null;

	public JiraComment(String text) {
		super();
		if(text != null) {
			comment = new ArrayList<>();
			Map<String, Map<String, String>> add = new HashMap<>();
			Map<String, String> body = new HashMap<String, String>();
			body.put("body", text);
			add.put("add", body);
			comment.add(add);
		}
	}
	
	public JiraComment comment(List<Map<String, Map<String, String>>> comment) {
		this.comment = comment;
		return this;
	}

	@ApiModelProperty(value = "comment")
	@Valid
	public List<Map<String, Map<String, String>>> getComment() {
		return comment;
	}

	public void setComment(List<Map<String, Map<String, String>>> comment) {
		this.comment = comment;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(comment);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JiraComment other = (JiraComment) obj;
		return Objects.equals(comment, other.comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraComment {\n");
		sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
