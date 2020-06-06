package com.devplatform.model.slack;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class SlackUserProfile {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("avatar_hash")
	private String avatar_hash = null;

	@JsonProperty("status_text")
	private String status_text = null;

	@JsonProperty("status_emoji")
	private String status_emoji = null;

	@JsonProperty("real_name")
	private String real_name = null;

	@JsonProperty("display_name")
	private String display_name = null;

	@JsonProperty("real_name_normalized")
	private String real_name_normalized = null;

	@JsonProperty("display_name_normalized")
	private String display_name_normalized = null;

	@JsonProperty("email")
	private String email = null;

	@JsonProperty("image_original")
	private String image_original = null;
	
	@JsonProperty("image_24")
	private String image_24 = null;
	
	@JsonProperty("image_32")
	private String image_32 = null;

	@JsonProperty("image_48")
	private String image_48 = null;

	@JsonProperty("image_72")
	private String image_72 = null;

	@JsonProperty("image_192")
	private String image_192 = null;

	@JsonProperty("image_512")
	private String image_512 = null;

	@JsonProperty("team")
	private String team = null;

	public SlackUserProfile avatar_hash(String avatar_hash) {
		this.avatar_hash = avatar_hash;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getAvatar_hash() {
		return avatar_hash;
	}

	public void setAvatar_hash(String avatar_hash) {
		this.avatar_hash = avatar_hash;
	}

	public SlackUserProfile status_text(String status_text) {
		this.status_text = status_text;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getStatus_text() {
		return status_text;
	}

	public void setStatus_text(String status_text) {
		this.status_text = status_text;
	}

	public SlackUserProfile status_emoji(String status_emoji) {
		this.status_emoji = status_emoji;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getStatus_emoji() {
		return status_emoji;
	}

	public void setStatus_emoji(String status_emoji) {
		this.status_emoji = status_emoji;
	}

	public SlackUserProfile real_name(String real_name) {
		this.real_name = real_name;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public SlackUserProfile display_name(String display_name) {
		this.display_name = display_name;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	public SlackUserProfile real_name_normalized(String real_name_normalized) {
		this.real_name_normalized = real_name_normalized;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getReal_name_normalized() {
		return real_name_normalized;
	}

	public void setReal_name_normalized(String real_name_normalized) {
		this.real_name_normalized = real_name_normalized;
	}

	public SlackUserProfile display_name_normalized(String display_name_normalized) {
		this.display_name_normalized = display_name_normalized;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getDisplay_name_normalized() {
		return display_name_normalized;
	}

	public void setDisplay_name_normalized(String display_name_normalized) {
		this.display_name_normalized = display_name_normalized;
	}

	public SlackUserProfile email(String email) {
		this.email = email;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SlackUserProfile image_original(String image_original) {
		this.image_original = image_original;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getImage_original() {
		return image_original;
	}

	public void setImage_original(String image_original) {
		this.image_original = image_original;
	}

	public SlackUserProfile image_24(String image_24) {
		this.image_24 = image_24;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getImage_24() {
		return image_24;
	}

	public void setImage_24(String image_24) {
		this.image_24 = image_24;
	}

	public SlackUserProfile image_32(String image_32) {
		this.image_32 = image_32;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getImage_32() {
		return image_32;
	}

	public void setImage_32(String image_32) {
		this.image_32 = image_32;
	}

	public SlackUserProfile image_48(String image_48) {
		this.image_48 = image_48;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getImage_48() {
		return image_48;
	}

	public void setImage_48(String image_48) {
		this.image_48 = image_48;
	}

	public SlackUserProfile image_72(String image_72) {
		this.image_72 = image_72;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getImage_72() {
		return image_72;
	}

	public void setImage_72(String image_72) {
		this.image_72 = image_72;
	}

	public SlackUserProfile image_192(String image_192) {
		this.image_192 = image_192;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getImage_192() {
		return image_192;
	}

	public void setImage_192(String image_192) {
		this.image_192 = image_192;
	}

	public SlackUserProfile image_512(String image_512) {
		this.image_512 = image_512;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getImage_512() {
		return image_512;
	}

	public void setImage_512(String image_512) {
		this.image_512 = image_512;
	}

	public SlackUserProfile team(String team) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SlackUserProfile slackChannelMessage = (SlackUserProfile) o;
		return Objects.equals(this.avatar_hash, slackChannelMessage.avatar_hash)
				&& Objects.equals(this.status_text, slackChannelMessage.status_text)
				&& Objects.equals(this.status_emoji, slackChannelMessage.status_emoji)
				&& Objects.equals(this.real_name, slackChannelMessage.real_name)
				&& Objects.equals(this.display_name, slackChannelMessage.display_name)
				&& Objects.equals(this.real_name_normalized, slackChannelMessage.real_name_normalized)
				&& Objects.equals(this.display_name_normalized, slackChannelMessage.display_name_normalized)
				&& Objects.equals(this.email, slackChannelMessage.email)
				&& Objects.equals(this.team, slackChannelMessage.team)
				&& Objects.equals(this.image_original, slackChannelMessage.image_original)
				&& Objects.equals(this.image_24, slackChannelMessage.image_24)
				&& Objects.equals(this.image_32, slackChannelMessage.image_32)
				&& Objects.equals(this.image_48, slackChannelMessage.image_48)
				&& Objects.equals(this.image_72, slackChannelMessage.image_72)
				&& Objects.equals(this.image_192, slackChannelMessage.image_192)
				&& Objects.equals(this.image_512, slackChannelMessage.image_512);
	}

	@Override
	public int hashCode() {
		return Objects.hash(avatar_hash, status_text, status_emoji, real_name, display_name, 
				real_name_normalized, display_name_normalized, email, team,
				image_original, image_24, image_32, image_48, image_72, image_192, image_512);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SlackUserProfile {\n");

		sb.append("    avatar_hash: ").append(toIndentedString(avatar_hash)).append("\n");
		sb.append("    status_text: ").append(toIndentedString(status_text)).append("\n");
		sb.append("    status_emoji: ").append(toIndentedString(status_emoji)).append("\n");
		sb.append("    real_name: ").append(toIndentedString(real_name)).append("\n");
		sb.append("    display_name: ").append(toIndentedString(display_name)).append("\n");
		sb.append("    real_name_normalized: ").append(toIndentedString(real_name_normalized)).append("\n");
		sb.append("    display_name_normalized: ").append(toIndentedString(display_name_normalized)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    team: ").append(toIndentedString(team)).append("\n");
		sb.append("    image_original: ").append(toIndentedString(image_original)).append("\n");
		sb.append("    image_24: ").append(toIndentedString(image_24)).append("\n");
		sb.append("    image_32: ").append(toIndentedString(image_32)).append("\n");
		sb.append("    image_48: ").append(toIndentedString(image_48)).append("\n");
		sb.append("    image_72: ").append(toIndentedString(image_72)).append("\n");
		sb.append("    image_192: ").append(toIndentedString(image_192)).append("\n");
		sb.append("    image_512: ").append(toIndentedString(image_512)).append("\n");
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
