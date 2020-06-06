package com.devplatform.model.slack.request;

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
public class SlackSendMessage {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("channel")
	private String channel = null;

	@JsonProperty("text")
	private String text = null;
	
	@JsonProperty("mrkdwn")
	private Boolean mrkdwn = true;

	@JsonProperty("link_names")
	private Boolean link_names = null;

	@JsonProperty("as_user")
	private Boolean as_user = null;

	@JsonProperty("username")
	private String username = null;

	@JsonProperty("icon_url")
	private String icon_url = null;

	@JsonProperty("ts")
	private String ts = null;

	@JsonProperty("attachments")
	private List<Object> attachments = null;

	@JsonProperty("blocks")
	private List<Object> blocks = null;

	public SlackSendMessage(String channel, String text) {
		super();
		this.channel = channel;
		this.text = text;
	}

	public SlackSendMessage(String channel, String text, Boolean mrkdwn, Boolean link_names, Boolean as_user,
			String username, String icon_url, String ts, List<Object> attachments, List<Object> blocks) {
		super();
		this.channel = channel;
		this.text = text;
		this.mrkdwn = mrkdwn;
		this.link_names = link_names;
		this.as_user = as_user;
		this.username = username;
		this.icon_url = icon_url;
		this.ts = ts;
		this.attachments = attachments;
		this.blocks = blocks;
	}

	public SlackSendMessage channel(String channel) {
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

	public SlackSendMessage text(String text) {
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

	public SlackSendMessage mrkdwn(Boolean mrkdwn) {
		this.mrkdwn = mrkdwn;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getMrkdwn() {
		return mrkdwn;
	}

	public void setMrkdwn(Boolean mrkdwn) {
		this.mrkdwn = mrkdwn;
	}

	public SlackSendMessage link_names(Boolean link_names) {
		this.link_names = link_names;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getLink_names() {
		return link_names;
	}

	public void setLink_names(Boolean link_names) {
		this.link_names = link_names;
	}

	public SlackSendMessage as_user(Boolean as_user) {
		this.as_user = as_user;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getAs_user() {
		return as_user;
	}

	public void setAs_user(Boolean as_user) {
		this.as_user = as_user;
	}

	public SlackSendMessage username(String username) {
		this.username = username;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public SlackSendMessage icon_url(String icon_url) {
		this.icon_url = icon_url;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getIcon_url() {
		return icon_url;
	}

	public void setIcon_url(String icon_url) {
		this.icon_url = icon_url;
	}

	public SlackSendMessage ts(String ts) {
		this.ts = ts;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public SlackSendMessage attachments(List<Object> attachments) {
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

	public SlackSendMessage blocks(List<Object> blocks) {
		this.blocks = blocks;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public List<Object> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Object> blocks) {
		this.blocks = blocks;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SlackSendMessage slackChannelMessage = (SlackSendMessage) o;
		return Objects.equals(this.channel, slackChannelMessage.channel)
				&& Objects.equals(this.text, slackChannelMessage.text)
				&& Objects.equals(this.mrkdwn, slackChannelMessage.mrkdwn)
				&& Objects.equals(this.link_names, slackChannelMessage.link_names)
				&& Objects.equals(this.as_user, slackChannelMessage.as_user)
				&& Objects.equals(this.username, slackChannelMessage.username)
				&& Objects.equals(this.icon_url, slackChannelMessage.icon_url)
				&& Objects.equals(this.ts, slackChannelMessage.ts)
				&& Objects.equals(this.attachments, slackChannelMessage.attachments)
				&& Objects.equals(this.blocks, slackChannelMessage.blocks);
	}

	@Override
	public int hashCode() {
		return Objects.hash(channel, text, mrkdwn, link_names, as_user, username, icon_url, ts, attachments, blocks);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SlackSendMessage {\n");

		sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    mrkdwn: ").append(toIndentedString(mrkdwn)).append("\n");
		sb.append("    link_names: ").append(toIndentedString(link_names)).append("\n");
		sb.append("    as_user: ").append(toIndentedString(as_user)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    icon_url: ").append(toIndentedString(icon_url)).append("\n");
		sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
		sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
		sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
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
