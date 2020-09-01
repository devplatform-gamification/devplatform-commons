package com.devplatform.model.rocketchat.request;

import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.rocketchat.RocketchatMessageAttachment;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class RocketchatPostMessageRequest {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("channel")
	private String channel = null;

	@JsonProperty("text")
	private String text = null;
	
	@JsonProperty("alias")
	private String alias = null;

	@JsonProperty("emoji")
	private String emoji = null;

	@JsonProperty("avatar")
	private String avatar = null;

	@JsonProperty("attachments")
	private List<RocketchatMessageAttachment> attachments = null;

	public RocketchatPostMessageRequest() {
		super();
	}

	public RocketchatPostMessageRequest(String channel, String text) {
		super();
		this.channel = channel;
		this.text = text;
	}

	public RocketchatPostMessageRequest channel(String channel) {
		this.channel = channel;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public RocketchatPostMessageRequest text(String text) {
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

	public RocketchatPostMessageRequest alias(String alias) {
		this.alias = alias;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public RocketchatPostMessageRequest emoji(String emoji) {
		this.emoji = emoji;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getEmoji() {
		return emoji;
	}

	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}

	public RocketchatPostMessageRequest avatar(String avatar) {
		this.avatar = avatar;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public RocketchatPostMessageRequest attachments(List<RocketchatMessageAttachment> attachments) {
		this.attachments = attachments;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public List<RocketchatMessageAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<RocketchatMessageAttachment> attachments) {
		this.attachments = attachments;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RocketchatPostMessageRequest slackChannelMessage = (RocketchatPostMessageRequest) o;
		return Objects.equals(this.channel, slackChannelMessage.channel)
				&& Objects.equals(this.text, slackChannelMessage.text)
				&& Objects.equals(this.alias, slackChannelMessage.alias)
				&& Objects.equals(this.emoji, slackChannelMessage.emoji)
				&& Objects.equals(this.avatar, slackChannelMessage.avatar)
				&& Objects.equals(this.attachments, slackChannelMessage.attachments);
	}

	@Override
	public int hashCode() {
		return Objects.hash(channel, text, alias, emoji, avatar, attachments);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatPostMessageRequest {\n");
		sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
		sb.append("    emoji: ").append(toIndentedString(emoji)).append("\n");
		sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
		sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
