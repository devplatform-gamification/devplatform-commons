package com.devplatform.model.telegram.request;

import java.math.BigDecimal;
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
public class TelegramSendMessage {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("chat_id")
	private String chat_id = null;

	@JsonProperty("text")
	private String text = null;
	
	@JsonProperty("parse_mode")
	private String parse_mode = "MarkdownV2";

	@JsonProperty("disable_web_page_preview")
	private Boolean disable_web_page_preview = false;

	@JsonProperty("disable_notification")
	private Boolean disable_notification = false;

	@JsonProperty("reply_to_message_id")
	private BigDecimal reply_to_message_id = null;

	@JsonProperty("reply_markup")
	private Object reply_markup = null;

	public TelegramSendMessage(String chat_id, String text) {
		super();
		this.chat_id = chat_id;
		this.text = text;
	}

	public TelegramSendMessage(String chat_id, String text, String parse_mode) {
		this(chat_id, text);
		this.parse_mode = parse_mode;
	}

	public TelegramSendMessage chat_id(String chat_id) {
		this.chat_id = chat_id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getChat_id() {
		return chat_id;
	}

	public void setChat_id(String chat_id) {
		this.chat_id = chat_id;
	}

	public TelegramSendMessage text(String text) {
		this.text = text;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TelegramSendMessage parse_mode(String parse_mode) {
		this.parse_mode = parse_mode;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getParse_mode() {
		return parse_mode;
	}

	public void setParse_mode(String parse_mode) {
		this.parse_mode = parse_mode;
	}
	
	public TelegramSendMessage disable_web_page_preview(Boolean disable_web_page_preview) {
		this.disable_web_page_preview = disable_web_page_preview;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getDisable_web_page_preview() {
		return disable_web_page_preview;
	}

	public void setDisable_web_page_preview(Boolean disable_web_page_preview) {
		this.disable_web_page_preview = disable_web_page_preview;
	}

	public TelegramSendMessage disable_notification(Boolean disable_notification) {
		this.disable_notification = disable_notification;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getDisable_notification() {
		return disable_notification;
	}

	public void setDisable_notification(Boolean disable_notification) {
		this.disable_notification = disable_notification;
	}

	public TelegramSendMessage reply_to_message_id(BigDecimal reply_to_message_id) {
		this.reply_to_message_id = reply_to_message_id;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public BigDecimal getReply_to_message_id() {
		return reply_to_message_id;
	}

	public void setReply_to_message_id(BigDecimal reply_to_message_id) {
		this.reply_to_message_id = reply_to_message_id;
	}

	public TelegramSendMessage reply_markup(Object reply_markup) {
		this.reply_markup = reply_markup;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Object getReply_markup() {
		return reply_markup;
	}

	public void setReply_markup(Object reply_markup) {
		this.reply_markup = reply_markup;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TelegramSendMessage slackChannelMessage = (TelegramSendMessage) o;
		return Objects.equals(this.chat_id, slackChannelMessage.chat_id)
				&& Objects.equals(this.text, slackChannelMessage.text)
				&& Objects.equals(this.parse_mode, slackChannelMessage.parse_mode)
				&& Objects.equals(this.disable_web_page_preview, slackChannelMessage.disable_web_page_preview)
				&& Objects.equals(this.disable_notification, slackChannelMessage.disable_notification)
				&& Objects.equals(this.reply_to_message_id, slackChannelMessage.reply_to_message_id)
				&& Objects.equals(this.reply_markup, slackChannelMessage.reply_markup);
	}

	@Override
	public int hashCode() {
		return Objects.hash(chat_id, text, parse_mode, disable_web_page_preview,
				disable_notification, reply_to_message_id, reply_markup);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TelegramSendMessage {\n");

		sb.append("    chat_id: ").append(toIndentedString(chat_id)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    parse_mode: ").append(toIndentedString(parse_mode)).append("\n");
		sb.append("    disable_web_page_preview: ").append(toIndentedString(disable_web_page_preview)).append("\n");
		sb.append("    disable_notification: ").append(toIndentedString(disable_notification)).append("\n");
		sb.append("    reply_to_message_id: ").append(toIndentedString(reply_to_message_id)).append("\n");
		sb.append("    reply_markup: ").append(toIndentedString(reply_markup)).append("\n");
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
