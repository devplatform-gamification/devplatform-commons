package com.devplatform.model.telegram;

import java.math.BigDecimal;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class TelegramChat {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("title")
	private String title = null;

	@JsonProperty("username")
	private String username = null;

	@JsonProperty("type")
	private String type = null;
	
	public TelegramChat id(BigDecimal id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(value = "")
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public TelegramChat title(String title) {
		this.title = title;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public TelegramChat username(String username) {
		this.username = username;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public TelegramChat type(String type) {
		this.type = type;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TelegramChat slackChannelMessage = (TelegramChat) o;
		return Objects.equals(this.id, slackChannelMessage.id)
				&& Objects.equals(this.title, slackChannelMessage.title)
				&& Objects.equals(this.username, slackChannelMessage.username)
				&& Objects.equals(this.type, slackChannelMessage.type);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, title, username, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TelegramChat {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
