package com.devplatform.model.rocketchat.event;

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
public class RocketchatMessageSent {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("token")
	private String token = null;

	@JsonProperty("bot")
	private Boolean bot = null;

	@JsonProperty("trigger_word")
	private String trigger_word = null;

	@JsonProperty("channel_id")
	private String channel_id = null;

	@JsonProperty("channel_name")
	private String channel_name = null;

	@JsonProperty("message_id")
	private String message_id = null;

	@JsonProperty("timestamp")
	private String timestamp = null;

	@JsonProperty("user_id")
	private String user_id = null;

	@JsonProperty("user_name")
	private String user_name = null;

	@JsonProperty("text")
	private String text = null;

	@JsonProperty("siteUrl")
	private String siteUrl = null;

	public RocketchatMessageSent token(String token) {
		this.token = token;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	public RocketchatMessageSent bot(Boolean bot) {
		this.bot = bot;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public Boolean getBot() {
		return bot;
	}

	public void setBot(Boolean bot) {
		this.bot = bot;
	}

	public RocketchatMessageSent trigger_word(String trigger_word) {
		this.trigger_word = trigger_word;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getTrigger_word() {
		return trigger_word;
	}

	public void setTrigger_word(String trigger_word) {
		this.trigger_word = trigger_word;
	}

	public RocketchatMessageSent channel_id(String channel_id) {
		this.channel_id = channel_id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}

	public RocketchatMessageSent channel_name(String channel_name) {
		this.channel_name = channel_name;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getChannel_name() {
		return channel_name;
	}

	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}

	public RocketchatMessageSent message_id(String message_id) {
		this.message_id = message_id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getMessage_id() {
		return message_id;
	}

	public void setMessage_id(String message_id) {
		this.message_id = message_id;
	}

	public RocketchatMessageSent timestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public RocketchatMessageSent user_id(String user_id) {
		this.user_id = user_id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public RocketchatMessageSent user_name(String user_name) {
		this.user_name = user_name;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public RocketchatMessageSent text(String text) {
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

	public RocketchatMessageSent siteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getSiteUrl() {
		return siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RocketchatMessageSent slackChannelMessage = (RocketchatMessageSent) o;
		return Objects.equals(this.token, slackChannelMessage.token)
				&& Objects.equals(this.bot, slackChannelMessage.bot)
				&& Objects.equals(this.trigger_word, slackChannelMessage.trigger_word)
				&& Objects.equals(this.channel_id, slackChannelMessage.channel_id)
				&& Objects.equals(this.channel_name, slackChannelMessage.channel_name)
				&& Objects.equals(this.message_id, slackChannelMessage.message_id)
				&& Objects.equals(this.timestamp, slackChannelMessage.timestamp)
				&& Objects.equals(this.user_id, slackChannelMessage.user_id)
				&& Objects.equals(this.user_name, slackChannelMessage.user_name)
				&& Objects.equals(this.text, slackChannelMessage.text)
				&& Objects.equals(this.siteUrl, slackChannelMessage.siteUrl);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(token, bot, trigger_word, channel_id, channel_name, message_id, timestamp, user_id, user_name, text, siteUrl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatMessageSent {\n");

		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
		sb.append("    trigger_word: ").append(toIndentedString(trigger_word)).append("\n");
		sb.append("    channel_id: ").append(toIndentedString(channel_id)).append("\n");
		sb.append("    channel_name: ").append(toIndentedString(channel_name)).append("\n");
		sb.append("    message_id: ").append(toIndentedString(message_id)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    user_id: ").append(toIndentedString(user_id)).append("\n");
		sb.append("    user_name: ").append(toIndentedString(user_name)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    siteUrl: ").append(toIndentedString(siteUrl)).append("\n");
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
