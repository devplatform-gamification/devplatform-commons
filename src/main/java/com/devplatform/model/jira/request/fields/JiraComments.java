package com.devplatform.model.jira.request.fields;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class JiraComments {
	@JsonProperty("comment")
	private List<Map<String, JiraComment>> comment = null;

	public JiraComments(String text) {
		super();
		if(text != null) {
			comment = new ArrayList<>();
			Map<String, JiraComment> add = new HashMap<>();
			JiraComment body = new JiraComment(text);
			add.put("add", body);
			comment.add(add);
		}
	}
	
	public JiraComments comment(List<Map<String, JiraComment>> comment) {
		this.comment = comment;
		return this;
	}

	@ApiModelProperty(value = "comment")
	@Valid
	public List<Map<String, JiraComment>> getComment() {
		return comment;
	}

	public void setComment(List<Map<String, JiraComment>> comment) {
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
		JiraComments other = (JiraComments) obj;
		return Objects.equals(comment, other.comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraComments {\n");
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
