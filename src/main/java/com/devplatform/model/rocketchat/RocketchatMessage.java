package com.devplatform.model.rocketchat;

import java.util.List;
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
public class RocketchatMessage {
	/**
	 * Gets or Sets type
	 */
	// The _id of message
	@JsonProperty("_id")
	private String _id = null;

	@JsonProperty("rid")
	// The room id of where the message is to be sent
	private String rid = null;
	
	@JsonProperty("tmid")
	// The message's id to create a thread.
	private String tmid = null;

	@JsonProperty("msg")
	// The text of the message to send, is optional because of attachments.
	private String msg = null;
	
	@JsonProperty("alias")
	// This will cause the message's name to appear as the given alias, but your username will still display.
	private String alias = null;
	
	@JsonProperty("emoji")
	// If provided, this will make the avatar on this message be an emoji. Emoji Cheetsheet
	private String emoji = null;
	
	@JsonProperty("avatar")
	// If provided, this will make the avatar use the provided image url.
	private String avatar = null;
	
	@JsonProperty("attachments")
	private List<Object> attachments = null;

	public RocketchatMessage(String rid, String msg) {
		super();
		this.rid = rid;
		this.msg = msg;
	}
	
	public RocketchatMessage(String _id, String rid, String tmid, String msg, String alias, String emoji, String avatar,
			List<Object> attachments) {
		super();
		this._id = _id;
		this.rid = rid;
		this.tmid = tmid;
		this.msg = msg;
		this.alias = alias;
		this.emoji = emoji;
		this.avatar = avatar;
		this.attachments = attachments;
	}

	public RocketchatMessage _id(String _id) {
		this._id = _id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public RocketchatMessage rid(String rid) {
		this.rid = rid;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public RocketchatMessage tmid(String tmid) {
		this.tmid = tmid;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getTmid() {
		return tmid;
	}

	public void setTmid(String tmid) {
		this.tmid = tmid;
	}

	public RocketchatMessage msg(String msg) {
		this.msg = msg;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public RocketchatMessage alias(String alias) {
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

	public RocketchatMessage emoji(String emoji) {
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

	public RocketchatMessage avatar(String avatar) {
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

	public RocketchatMessage attachments(List<Object> attachments) {
		this.attachments = attachments;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public List<Object> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Object> attachments) {
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
		RocketchatMessage slackChannelMessage = (RocketchatMessage) o;
		return Objects.equals(this._id, slackChannelMessage._id)
				&& Objects.equals(this.rid, slackChannelMessage.rid)
				&& Objects.equals(this.tmid, slackChannelMessage.tmid)
				&& Objects.equals(this.msg, slackChannelMessage.msg)
				&& Objects.equals(this.alias, slackChannelMessage.alias)
				&& Objects.equals(this.emoji, slackChannelMessage.emoji)
				&& Objects.equals(this.avatar, slackChannelMessage.avatar)
				&& Objects.equals(this.attachments, slackChannelMessage.attachments);
	}

	@Override
	public int hashCode() {
		return Objects.hash(_id, rid, tmid, msg, alias, emoji, avatar, attachments);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatMessage {\n");

		sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
		sb.append("    rid: ").append(toIndentedString(rid)).append("\n");
		sb.append("    tmid: ").append(toIndentedString(tmid)).append("\n");
		sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
