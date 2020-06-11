package com.devplatform.model.telegram;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class TelegramMessage {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("message_id")
	private BigDecimal message_id = null;

	@JsonProperty("from")
	private TelegramUser from = null;

	@JsonProperty("date")
	private String date = null;
	
	@JsonProperty("text")
	private String text = null;

	@JsonProperty("chat")
	private TelegramChat chat = null;

	@JsonProperty("entities")
	private List<Object> entities = null;

	public TelegramMessage message_id(BigDecimal message_id) {
		this.message_id = message_id;
		return this;
	}

	@ApiModelProperty(value = "")
	public BigDecimal getMessage_id() {
		return message_id;
	}
	
	public void setMessage_id(BigDecimal message_id) {
		this.message_id = message_id;
	}

	public TelegramMessage from(TelegramUser from) {
		this.from = from;
		return this;
	}

	@ApiModelProperty(value = "")
	public TelegramUser getFrom() {
		return from;
	}

	public void setFrom(TelegramUser from) {
		this.from = from;
	}

	public TelegramMessage date(String date) {
		this.date = date;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public TelegramMessage text(String text) {
		this.text = text;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TelegramMessage chat(TelegramChat chat) {
		this.chat = chat;
		return this;
	}

	@ApiModelProperty(value = "")
	public TelegramChat getChat() {
		return chat;
	}

	public void setChat(TelegramChat chat) {
		this.chat = chat;
	}

	public TelegramMessage entities(List<Object> entities) {
		this.entities = entities;
		return this;
	}

	@ApiModelProperty(value = "")
	public List<Object> getEntities() {
		return entities;
	}

	public void setEntities(List<Object> entities) {
		this.entities = entities;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TelegramMessage slackChannelMessage = (TelegramMessage) o;
		return Objects.equals(this.message_id, slackChannelMessage.message_id)
				&& Objects.equals(this.from, slackChannelMessage.from)
				&& Objects.equals(this.date, slackChannelMessage.date)
				&& Objects.equals(this.text, slackChannelMessage.text)
				&& Objects.equals(this.chat, slackChannelMessage.chat)
				&& Objects.equals(this.entities, slackChannelMessage.entities);
	}

	@Override
	public int hashCode() {
		return Objects.hash(message_id, from, date, text, chat, entities);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TelegramMessage {\n");
		sb.append("    message_id: ").append(toIndentedString(message_id)).append("\n");
		sb.append("    from: ").append(toIndentedString(from)).append("\n");
		sb.append("    chat: ").append(toIndentedString(chat)).append("\n");
		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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
