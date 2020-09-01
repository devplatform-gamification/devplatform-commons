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
public class RocketchatMessageAttachment {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("text")
	private String text = null;

	@JsonProperty("color")
	private String color = null;

	@JsonProperty("ts")
	private String createdAt = null;
	
	@JsonProperty("thumb_url")
	private String thumbUrl = null;
	
	@JsonProperty("message_link")
	private String messageLink = null;

	@JsonProperty("collapsed")
	private Boolean collapsed = null;
	
	@JsonProperty("author_name")
	private String authorName = null;

	@JsonProperty("author_link")
	private String authorLink = null;

	@JsonProperty("author_icon")
	private String authorIcon = null;

	@JsonProperty("title")
	private String title = null;

	@JsonProperty("title_link")
	private String titleLink = null;

	@JsonProperty("title_link_download")
	private Boolean titleLinkDownload = null;

	@JsonProperty("image_url")
	private String imageUrl = null;

	@JsonProperty("audio_url")
	private String audioUrl = null;

	@JsonProperty("video_url")
	private String videoUrl = null;
	
	@JsonProperty("fields")
	private List<RocketchatMessageField> fields = null;
	
	@JsonProperty("attachments")
	private List<RocketchatMessageAttachment> attachments = null;

	public RocketchatMessageAttachment text(String text) {
		this.text = text;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public RocketchatMessageAttachment createdAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public RocketchatMessageAttachment messageLink(String messageLink) {
		this.messageLink = messageLink;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getMessageLink() {
		return messageLink;
	}

	public void setMessageLink(String messageLink) {
		this.messageLink = messageLink;
	}

	public RocketchatMessageAttachment authorName(String authorName) {
		this.authorName = authorName;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public RocketchatMessageAttachment authorIcon(String authorIcon) {
		this.authorIcon = authorIcon;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getAuthorIcon() {
		return authorIcon;
	}

	public void setAuthorIcon(String authorIcon) {
		this.authorIcon = authorIcon;
	}

	public RocketchatMessageAttachment attachments(List<RocketchatMessageAttachment> attachments) {
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
	
	public RocketchatMessageAttachment color(String color) {
		this.color = color;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public RocketchatMessageAttachment thumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getThumbUrl() {
		return thumbUrl;
	}

	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	public RocketchatMessageAttachment collapsed(Boolean collapsed) {
		this.collapsed = collapsed;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getCollapsed() {
		return collapsed;
	}

	public void setCollapsed(Boolean collapsed) {
		this.collapsed = collapsed;
	}

	public RocketchatMessageAttachment authorLink(String authorLink) {
		this.authorLink = authorLink;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getAuthorLink() {
		return authorLink;
	}

	public void setAuthorLink(String authorLink) {
		this.authorLink = authorLink;
	}

	public RocketchatMessageAttachment title(String title) {
		this.title = title;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public RocketchatMessageAttachment titleLink(String titleLink) {
		this.titleLink = titleLink;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getTitleLink() {
		return titleLink;
	}

	public void setTitleLink(String titleLink) {
		this.titleLink = titleLink;
	}

	public RocketchatMessageAttachment titleLinkDownload(Boolean titleLinkDownload) {
		this.titleLinkDownload = titleLinkDownload;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getTitleLinkDownload() {
		return titleLinkDownload;
	}

	public void setTitleLinkDownload(Boolean titleLinkDownload) {
		this.titleLinkDownload = titleLinkDownload;
	}

	public RocketchatMessageAttachment imageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public RocketchatMessageAttachment audioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getAudioUrl() {
		return audioUrl;
	}

	public void setAudioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
	}

	public RocketchatMessageAttachment videoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public RocketchatMessageAttachment fields(List<RocketchatMessageField> fields) {
		this.fields = fields;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public List<RocketchatMessageField> getFields() {
		return fields;
	}

	public void setFields(List<RocketchatMessageField> fields) {
		this.fields = fields;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RocketchatMessageAttachment slackChannelMessage = (RocketchatMessageAttachment) o;
		return Objects.equals(this.text, slackChannelMessage.text)
				&& Objects.equals(this.createdAt, slackChannelMessage.createdAt)
				&& Objects.equals(this.messageLink, slackChannelMessage.messageLink)
				&& Objects.equals(this.authorName, slackChannelMessage.authorName)
				&& Objects.equals(this.authorIcon, slackChannelMessage.authorIcon)

				&& Objects.equals(this.color, slackChannelMessage.color)
				&& Objects.equals(this.thumbUrl, slackChannelMessage.thumbUrl)
				&& Objects.equals(this.collapsed, slackChannelMessage.collapsed)
				&& Objects.equals(this.authorLink, slackChannelMessage.authorLink)
				&& Objects.equals(this.title, slackChannelMessage.title)
				&& Objects.equals(this.titleLink, slackChannelMessage.titleLink)
				&& Objects.equals(this.titleLinkDownload, slackChannelMessage.titleLinkDownload)
				&& Objects.equals(this.imageUrl, slackChannelMessage.imageUrl)
				&& Objects.equals(this.audioUrl, slackChannelMessage.audioUrl)
				&& Objects.equals(this.videoUrl, slackChannelMessage.videoUrl)
				&& Objects.equals(this.fields, slackChannelMessage.fields)
				
				&& Objects.equals(this.attachments, slackChannelMessage.attachments);
	}

	@Override
	public int hashCode() {
		return Objects.hash(text, createdAt, messageLink, authorName, authorIcon, attachments, color,
				thumbUrl, collapsed, authorLink, title, titleLink, titleLinkDownload, imageUrl, 
				audioUrl, videoUrl, fields);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatMessageAttachment {\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    messageLink: ").append(toIndentedString(messageLink)).append("\n");
		sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
		sb.append("    authorIcon: ").append(toIndentedString(authorIcon)).append("\n");
		sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");

		sb.append("    color: ").append(toIndentedString(color)).append("\n");
		sb.append("    thumbUrl: ").append(toIndentedString(thumbUrl)).append("\n");
		sb.append("    collapsed: ").append(toIndentedString(collapsed)).append("\n");
		sb.append("    authorLink: ").append(toIndentedString(authorLink)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    titleLink: ").append(toIndentedString(titleLink)).append("\n");
		sb.append("    titleLinkDownload: ").append(toIndentedString(titleLinkDownload)).append("\n");
		sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
		sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
		sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
		sb.append("    fields: ").append(toIndentedString(fields)).append("\n");

		
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
