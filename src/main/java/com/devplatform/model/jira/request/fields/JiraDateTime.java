package com.devplatform.model.jira.request.fields;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class JiraDateTime {
	private List<Map<String, String>> body = null;

	public JiraDateTime(String dateTime) {
		super();
		this.body = new ArrayList<>();
		Map<String, String> body = new HashMap<>();
		body.put("set", dateTime);
		this.body.add(body);
	}
	
	public List<Map<String, String>> getBody() {
		return body;
	}

	public void setBody(List<Map<String, String>> body) {
		this.body = body;
	}

	@Override
	public int hashCode() {
		return Objects.hash(body);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JiraDateTime other = (JiraDateTime) obj;
		return Objects.equals(body, other.body);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraTextArea {\n");
		sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
