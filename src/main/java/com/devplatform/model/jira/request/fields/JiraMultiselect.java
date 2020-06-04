package com.devplatform.model.jira.request.fields;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class JiraMultiselect {
	@JsonProperty("set")
	private List<JiraOptionsValue> set = null;

	public JiraMultiselect(List<String> items) {
		super();
		if(items != null) {
			set = new ArrayList<JiraOptionsValue>();
			for (String item : items) {
				JiraOptionsValue option = new JiraOptionsValue(item);
				set.add(option);
			}
		}
	}

	public JiraMultiselect update(List<JiraOptionsValue> set) {
		this.set = set;
		return this;
	}
	
	@ApiModelProperty(value = "")
	@Valid
	public List<JiraOptionsValue> getSet() {
		return set;
	}

	public void setSet(List<JiraOptionsValue> set) {
		this.set = set;
	}

	@Override
	public int hashCode() {
		return Objects.hash(set);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JiraMultiselect other = (JiraMultiselect) obj;
		return Objects.equals(set, other.set);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraMultiselect {\n");
		sb.append("    set: ").append(toIndentedString(set)).append("\n");
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
