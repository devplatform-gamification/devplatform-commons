package com.devplatform.model.bot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class ListItemsWithListOfStrings {
	@JsonProperty("items")
	private Map<String, List<String>> items = null;
	
	public Map<String, List<String>> getItems() {
		return items;
	}

	public void setItems(Map<String, List<String>> items) {
		this.items = items;
	}

	public void addItems(String key, List<String> value) {
		if(this.items == null) {
			this.items = new HashMap<String, List<String>>();
		}
		this.items.put(key, value);
	}
	
	public List<String> getItemValue(String key) {
		if(this.items == null) {
			this.items = new HashMap<String, List<String>>();
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
		ListItemsWithListOfStrings releaseItem = (ListItemsWithListOfStrings) o;
		return Objects.equals(this.items, releaseItem.items);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(items);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ListItemsWithListOfStrings {\n");
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
