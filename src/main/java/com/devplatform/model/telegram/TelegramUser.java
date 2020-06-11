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
public class TelegramUser {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("is_bot")
	private Boolean is_bot = null;

	@JsonProperty("first_name")
	private String first_name = null;

	@JsonProperty("username")
	private String username = null;
	
	@JsonProperty("can_join_groups")
	private Boolean can_join_groups = null;

	@JsonProperty("can_read_all_group_messages")
	private Boolean can_read_all_group_messages = null;

	@JsonProperty("supports_inline_queries")
	private Boolean supports_inline_queries = null;

	public TelegramUser id(BigDecimal id) {
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

	public TelegramUser is_bot(Boolean is_bot) {
		this.is_bot = is_bot;
		return this;
	}
	
	@ApiModelProperty(value = "")
	public Boolean getIs_bot() {
		return is_bot;
	}

	public void setIs_bot(Boolean is_bot) {
		this.is_bot = is_bot;
	}

	public TelegramUser first_name(String first_name) {
		this.first_name = first_name;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public TelegramUser username(String username) {
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

	public TelegramUser can_join_groups(Boolean can_join_groups) {
		this.can_join_groups = can_join_groups;
		return this;
	}

	@ApiModelProperty(value = "")
	public Boolean getCan_join_groups() {
		return can_join_groups;
	}

	public void setCan_join_groups(Boolean can_join_groups) {
		this.can_join_groups = can_join_groups;
	}

	public TelegramUser can_read_all_group_messages(Boolean can_read_all_group_messages) {
		this.can_read_all_group_messages = can_read_all_group_messages;
		return this;
	}

	@ApiModelProperty(value = "")
	public Boolean getCan_read_all_group_messages() {
		return can_read_all_group_messages;
	}

	public void setCan_read_all_group_messages(Boolean can_read_all_group_messages) {
		this.can_read_all_group_messages = can_read_all_group_messages;
	}

	public TelegramUser supports_inline_queries(Boolean supports_inline_queries) {
		this.supports_inline_queries = supports_inline_queries;
		return this;
	}

	@ApiModelProperty(value = "")
	public Boolean getSupports_inline_queries() {
		return supports_inline_queries;
	}

	public void setSupports_inline_queries(Boolean supports_inline_queries) {
		this.supports_inline_queries = supports_inline_queries;
	}
	
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TelegramUser slackChannelMessage = (TelegramUser) o;
		return Objects.equals(this.id, slackChannelMessage.id)
				&& Objects.equals(this.is_bot, slackChannelMessage.is_bot)
				&& Objects.equals(this.first_name, slackChannelMessage.first_name)
				&& Objects.equals(this.username, slackChannelMessage.username)
				&& Objects.equals(this.can_join_groups, slackChannelMessage.can_join_groups)
				&& Objects.equals(this.can_read_all_group_messages, slackChannelMessage.can_read_all_group_messages)
				&& Objects.equals(this.supports_inline_queries, slackChannelMessage.supports_inline_queries);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, is_bot, first_name, username, can_join_groups, 
				can_read_all_group_messages, supports_inline_queries);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TelegramUser {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    is_bot: ").append(toIndentedString(is_bot)).append("\n");
		sb.append("    first_name: ").append(toIndentedString(first_name)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    can_join_groups: ").append(toIndentedString(can_join_groups)).append("\n");
		sb.append("    can_read_all_group_messages: ").append(toIndentedString(can_read_all_group_messages)).append("\n");
		sb.append("    supports_inline_queries: ").append(toIndentedString(supports_inline_queries)).append("\n");
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
