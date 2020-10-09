package com.devplatform.model.bot;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class ListItemsWithNumber {
	@JsonProperty("items")
	private Map<String, Integer> items = null;
	
	public Map<String, Integer> getItems() {
		return items;
	}

	public void setItems(Map<String, Integer> items) {
		this.items = items;
	}

	public void addItems(String key, Integer value) {
		if(this.items == null) {
			this.items = new HashMap<String, Integer>();
		}
		this.items.put(key, value);
	}
	
	public Integer getItemValue(String key) {
		if(this.items == null) {
			this.items = new HashMap<String, Integer>();
		}
		return this.items.get(key);
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ListItemsWithNumber releaseItem = (ListItemsWithNumber) o;
		return Objects.equals(this.items, releaseItem.items);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(items);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ListItemsWithNumber {\n");
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
