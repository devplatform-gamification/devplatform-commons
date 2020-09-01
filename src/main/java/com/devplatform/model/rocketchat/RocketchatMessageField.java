package com.devplatform.model.rocketchat;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class RocketchatMessageField {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("short")
	private Boolean isShort = null;

	@JsonProperty("title")
	private String title = null;
	
	@JsonProperty("value")
	private String value = null;

	public RocketchatMessageField isShort(Boolean isShort) {
		this.isShort = isShort;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public Boolean getIsShort() {
		return isShort;
	}

	public void setIsShort(Boolean isShort) {
		this.isShort = isShort;
	}

	public RocketchatMessageField title(String title) {
		this.title = title;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public RocketchatMessageField value(String value) {
		this.value = value;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RocketchatMessageField slackChannelMessage = (RocketchatMessageField) o;
		return Objects.equals(this.isShort, slackChannelMessage.isShort)
				&& Objects.equals(this.title, slackChannelMessage.title)
				&& Objects.equals(this.value, slackChannelMessage.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(isShort, title, value);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatMessageFields {\n");
		sb.append("    isShort: ").append(toIndentedString(isShort)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
