package com.devplatform.model.slack;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.slack.event.SlackEventTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class SlackChannelMessage {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("type")
	private SlackEventTypeEnum type = null;

	@JsonProperty("subtype")
	private String subtype = null;

	@JsonProperty("text")
	private String text = null;

	@JsonProperty("ts")
	private String ts = null;

	@JsonProperty("bot_id")
	private String bot_id = null;

	@JsonProperty("user")
	private String user = null;

	@JsonProperty("username")
	private String username = null;

	@JsonProperty("team")
	private String team = null;

	@JsonProperty("channel")
	private String channel = null;

	@JsonProperty("event_ts")
	private String event_ts = null;

	@JsonProperty("channel_type")
	private String channel_type = null;

	@JsonProperty("attachments")
	private List<Object> attachments = null;

	@JsonProperty("blocks")
	private List<Object> blocks = null;

	@JsonProperty("edited")
	private SlackChannelMessageEdited edited = null;

	public SlackChannelMessage type(SlackEventTypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")

	public SlackEventTypeEnum getType() {
		return type;
	}

	public void setType(SlackEventTypeEnum type) {
		this.type = type;
	}

	public SlackChannelMessage subtype(String subtype) {
		this.subtype = subtype;
		return this;
	}

	/**
	 * Get subtype
	 * 
	 * @return subtype
	 **/
	@ApiModelProperty(example = "channel_join", value = "")

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public SlackChannelMessage text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * Get text
	 * 
	 * @return text
	 **/
	@ApiModelProperty(example = "<@U023BECGF|bobby> has joined the channel", value = "")

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public SlackChannelMessage ts(String ts) {
		this.ts = ts;
		return this;
	}

	/**
	 * Get ts
	 * 
	 * @return ts
	 **/
	@ApiModelProperty(example = "1403051575.000407", value = "")
	@NotNull
	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public SlackChannelMessage user(String user) {
		this.user = user;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public SlackChannelMessage bot_id(String bot_id) {
		this.bot_id = bot_id;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getBot_id() {
		return bot_id;
	}

	public void setBot_id(String bot_id) {
		this.bot_id = bot_id;
	}

	public SlackChannelMessage username(String username) {
		this.username = username;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public SlackChannelMessage team(String team) {
		this.team = team;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public SlackChannelMessage channel(String channel) {
		this.channel = channel;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public SlackChannelMessage event_ts(String event_ts) {
		this.event_ts = event_ts;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getEvent_ts() {
		return event_ts;
	}

	public void setEvent_ts(String event_ts) {
		this.event_ts = event_ts;
	}

	public SlackChannelMessage channel_type(String channel_type) {
		this.channel_type = channel_type;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getChannel_type() {
		return channel_type;
	}

	public void setChannel_type(String channel_type) {
		this.channel_type = channel_type;
	}

	public SlackChannelMessage blocks(List<Object> blocks) {
		this.blocks = blocks;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public List<Object> getBlocks() {
		return blocks;
	}

	public void setBlocks(List<Object> blocks) {
		this.blocks = blocks;
	}
	
	public SlackChannelMessage attachments(List<Object> attachments) {
		this.attachments = attachments;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public List<Object> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Object> attachments) {
		this.attachments = attachments;
	}

	public SlackChannelMessage edited(SlackChannelMessageEdited edited) {
		this.edited = edited;
		return this;
	}

	/**
	 * Get edited
	 * 
	 * @return edited
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public SlackChannelMessageEdited getEdited() {
		return edited;
	}

	public void setEdited(SlackChannelMessageEdited edited) {
		this.edited = edited;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SlackChannelMessage slackChannelMessage = (SlackChannelMessage) o;
		return Objects.equals(this.type, slackChannelMessage.type)
				&& Objects.equals(this.subtype, slackChannelMessage.subtype)
				&& Objects.equals(this.text, slackChannelMessage.text)
				&& Objects.equals(this.ts, slackChannelMessage.ts)
				&& Objects.equals(this.user, slackChannelMessage.user)
				&& Objects.equals(this.edited, slackChannelMessage.edited);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, subtype, text, ts, user, team, channel, channel_type, event_ts, attachments, blocks, edited);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SlackChannelMessage {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
		sb.append("    bot_id: ").append(toIndentedString(bot_id)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    user: ").append(toIndentedString(user)).append("\n");
		sb.append("    team: ").append(toIndentedString(team)).append("\n");
		sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
		sb.append("    channel_type: ").append(toIndentedString(channel_type)).append("\n");
		sb.append("    event_ts: ").append(toIndentedString(event_ts)).append("\n");
		sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
		sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
		sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
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
