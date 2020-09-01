package com.devplatform.model.rocketchat;

import java.util.List;
import java.util.Map;
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
	private String id = null;

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
	
	@JsonProperty("ts")
	private String createdAt = null;
	
	@JsonProperty("u")
	private RocketchatUser createdBy = null;
	
	@JsonProperty("_updatedAt")
	private String updatedAt = null;
	
	@JsonProperty("urls")
	private List<Map<String, Object>> urls = null;
	
	@JsonProperty("mentions")
	private List<Map<String, String>> mentions = null;

	@JsonProperty("channels")
	private List<Map<String, String>> channels = null;
	
	@JsonProperty("editedAt")
	private String editedAt = null;

	@JsonProperty("editedBy")
	private RocketchatUser editedBy = null;

	@JsonProperty("attachments")
	private List<RocketchatMessageAttachment> attachments = null;

	public RocketchatMessage(String rid, String msg) {
		super();
		this.rid = rid;
		this.msg = msg;
	}
	
	public RocketchatMessage() {
		super();
	}

	public RocketchatMessage id(String id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	
	public RocketchatMessage createdAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public RocketchatMessage createdBy(RocketchatUser createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public RocketchatUser getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(RocketchatUser createdBy) {
		this.createdBy = createdBy;
	}

	public RocketchatMessage updatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public RocketchatMessage urls(List<Map<String, Object>> urls) {
		this.urls = urls;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public List<Map<String, Object>> getUrls() {
		return urls;
	}

	public void setUrls(List<Map<String, Object>> urls) {
		this.urls = urls;
	}

	public RocketchatMessage mentions(List<Map<String, String>> mentions) {
		this.mentions = mentions;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public List<Map<String, String>> getMentions() {
		return mentions;
	}

	public void setMentions(List<Map<String, String>> mentions) {
		this.mentions = mentions;
	}

	public RocketchatMessage channels(List<Map<String, String>> channels) {
		this.channels = channels;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public List<Map<String, String>> getChannels() {
		return channels;
	}

	public void setChannels(List<Map<String, String>> channels) {
		this.channels = channels;
	}

	public RocketchatMessage editedAt(String editedAt) {
		this.editedAt = editedAt;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getEditedAt() {
		return editedAt;
	}

	public void setEditedAt(String editedAt) {
		this.editedAt = editedAt;
	}

	public RocketchatMessage editedBy(RocketchatUser editedBy) {
		this.editedBy = editedBy;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public RocketchatUser getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(RocketchatUser editedBy) {
		this.editedBy = editedBy;
	}

	public RocketchatMessage attachments(List<RocketchatMessageAttachment> attachments) {
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
		RocketchatMessage slackChannelMessage = (RocketchatMessage) o;
		return Objects.equals(this.id, slackChannelMessage.id)
				&& Objects.equals(this.rid, slackChannelMessage.rid)
				&& Objects.equals(this.tmid, slackChannelMessage.tmid)
				&& Objects.equals(this.msg, slackChannelMessage.msg)
				&& Objects.equals(this.alias, slackChannelMessage.alias)
				&& Objects.equals(this.emoji, slackChannelMessage.emoji)
				&& Objects.equals(this.avatar, slackChannelMessage.avatar)
				
				&& Objects.equals(this.createdAt, slackChannelMessage.createdAt)
				&& Objects.equals(this.createdBy, slackChannelMessage.createdBy)
				&& Objects.equals(this.updatedAt, slackChannelMessage.updatedAt)
				&& Objects.equals(this.urls, slackChannelMessage.urls)
				&& Objects.equals(this.mentions, slackChannelMessage.mentions)
				&& Objects.equals(this.channels, slackChannelMessage.channels)
				&& Objects.equals(this.editedAt, slackChannelMessage.editedAt)
				&& Objects.equals(this.editedBy, slackChannelMessage.editedBy)
				
				&& Objects.equals(this.attachments, slackChannelMessage.attachments);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, rid, tmid, msg, alias, emoji, avatar,
				createdAt, createdBy, updatedAt, urls, mentions, channels, editedAt, editedBy, attachments);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatMessage {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    rid: ").append(toIndentedString(rid)).append("\n");
		sb.append("    tmid: ").append(toIndentedString(tmid)).append("\n");
		sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
		sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
		sb.append("    emoji: ").append(toIndentedString(emoji)).append("\n");
		sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
		sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
		sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
		sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
		sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
		sb.append("    editedAt: ").append(toIndentedString(editedAt)).append("\n");
		sb.append("    editedBy: ").append(toIndentedString(editedBy)).append("\n");
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
