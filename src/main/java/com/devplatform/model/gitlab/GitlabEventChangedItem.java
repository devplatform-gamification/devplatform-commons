package com.devplatform.model.gitlab;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabEventChanges
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabEventChangedItem<E> {
	@JsonProperty("previous")
	private E previous;

	@JsonProperty("current")
	private E current;

	@ApiModelProperty(value = "")
	public E getPrevious() {
		return previous;
	}

	public void setPrevious(E previous) {
		this.previous = previous;
	}

	public GitlabEventChangedItem<E> previous(E previous) {
		this.previous = previous;
		return this;
	}

	@ApiModelProperty(value = "")
	public E getCurrent() {
		return current;
	}

	public void setCurrent(E current) {
		this.current = current;
	}

	public GitlabEventChangedItem<E> current(E current) {
		this.current = current;
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GitlabEventChangedItem<?> other = (GitlabEventChangedItem<?>) obj;
		if (current == null) {
			if (other.current != null)
				return false;
		} else if (!current.equals(other.current))
			return false;
		if (previous == null) {
			if (other.previous != null)
				return false;
		} else if (!previous.equals(other.previous))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabEventChanges {\n");

		sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
		sb.append("    current: ").append(toIndentedString(current)).append("\n");
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
