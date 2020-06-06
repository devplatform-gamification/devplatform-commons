package com.devplatform.model.slack;

import java.math.BigDecimal;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class SlackUser {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("team_id")
	private String team_id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("deleted")
	private Boolean deleted = null;

	@JsonProperty("color")
	private String color = null;

	@JsonProperty("real_name")
	private String real_name = null;

	@JsonProperty("tz")
	private String tz = null;

	@JsonProperty("tz_label")
	private String tz_label = null;

	@JsonProperty("tz_offset")
	private Integer tz_offset = null;
	
	@JsonProperty("profile")
	private SlackUserProfile profile = null;
	
	@JsonProperty("is_admin")
	private Boolean is_admin = null;

	@JsonProperty("is_primary_owner")
	private Boolean is_primary_owner = null;

	@JsonProperty("is_restricted")
	private Boolean is_restricted = null;

	@JsonProperty("is_ultra_restricted")
	private Boolean is_ultra_restricted = null;

	@JsonProperty("is_bot")
	private Boolean is_bot = null;

	@JsonProperty("updated")
	private BigDecimal updated = null;

	@JsonProperty("is_app_user")
	private Boolean is_app_user = null;

	@JsonProperty("has_2fa")
	private Boolean has_2fa = null;

	public SlackUser id(String id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ApiModelProperty(value = "")
	public String getTeam_id() {
		return team_id;
	}

	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}

	@ApiModelProperty(value = "")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ApiModelProperty(value = "")
	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	@ApiModelProperty(value = "")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@ApiModelProperty(value = "")
	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	@ApiModelProperty(value = "")
	public String getTz() {
		return tz;
	}

	public void setTz(String tz) {
		this.tz = tz;
	}

	@ApiModelProperty(value = "")
	public String getTz_label() {
		return tz_label;
	}

	public void setTz_label(String tz_label) {
		this.tz_label = tz_label;
	}

	@ApiModelProperty(value = "")
	public Integer getTz_offset() {
		return tz_offset;
	}

	public void setTz_offset(Integer tz_offset) {
		this.tz_offset = tz_offset;
	}

	@ApiModelProperty(value = "")
	public SlackUserProfile getProfile() {
		return profile;
	}

	public void setProfile(SlackUserProfile profile) {
		this.profile = profile;
	}

	@ApiModelProperty(value = "")
	public Boolean getIs_admin() {
		return is_admin;
	}

	public void setIs_admin(Boolean is_admin) {
		this.is_admin = is_admin;
	}

	@ApiModelProperty(value = "")
	public Boolean getIs_primary_owner() {
		return is_primary_owner;
	}

	public void setIs_primary_owner(Boolean is_primary_owner) {
		this.is_primary_owner = is_primary_owner;
	}

	@ApiModelProperty(value = "")
	public Boolean getIs_restricted() {
		return is_restricted;
	}

	public void setIs_restricted(Boolean is_restricted) {
		this.is_restricted = is_restricted;
	}

	@ApiModelProperty(value = "")
	public Boolean getIs_ultra_restricted() {
		return is_ultra_restricted;
	}

	public void setIs_ultra_restricted(Boolean is_ultra_restricted) {
		this.is_ultra_restricted = is_ultra_restricted;
	}

	@ApiModelProperty(value = "")
	public Boolean getIs_bot() {
		return is_bot;
	}

	public void setIs_bot(Boolean is_bot) {
		this.is_bot = is_bot;
	}

	@ApiModelProperty(value = "")
	public BigDecimal getUpdated() {
		return updated;
	}

	public void setUpdated(BigDecimal updated) {
		this.updated = updated;
	}

	@ApiModelProperty(value = "")
	public Boolean getIs_app_user() {
		return is_app_user;
	}

	public void setIs_app_user(Boolean is_app_user) {
		this.is_app_user = is_app_user;
	}

	@ApiModelProperty(value = "")
	public Boolean getHas_2fa() {
		return has_2fa;
	}

	public void setHas_2fa(Boolean has_2fa) {
		this.has_2fa = has_2fa;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SlackUser slackChannelMessage = (SlackUser) o;
		return Objects.equals(this.id, slackChannelMessage.id)
				&& Objects.equals(this.team_id, slackChannelMessage.team_id)
				&& Objects.equals(this.name, slackChannelMessage.name)
				&& Objects.equals(this.deleted, slackChannelMessage.deleted)
				&& Objects.equals(this.color, slackChannelMessage.color)
				&& Objects.equals(this.real_name, slackChannelMessage.real_name)
				&& Objects.equals(this.tz, slackChannelMessage.tz)
				&& Objects.equals(this.tz_label, slackChannelMessage.tz_label)
				&& Objects.equals(this.tz_offset, slackChannelMessage.tz_offset)
				&& Objects.equals(this.profile, slackChannelMessage.profile)
				&& Objects.equals(this.is_admin, slackChannelMessage.is_admin)
				&& Objects.equals(this.is_primary_owner, slackChannelMessage.is_primary_owner)
				&& Objects.equals(this.is_restricted, slackChannelMessage.is_restricted)
				&& Objects.equals(this.is_ultra_restricted, slackChannelMessage.is_ultra_restricted)
				&& Objects.equals(this.is_bot, slackChannelMessage.is_bot)
				&& Objects.equals(this.updated, slackChannelMessage.updated)
				&& Objects.equals(this.is_app_user, slackChannelMessage.is_app_user)
				&& Objects.equals(this.has_2fa, slackChannelMessage.has_2fa);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, team_id, name, deleted, color, real_name, tz, tz_label, tz_offset, 
				profile, is_admin, is_primary_owner, is_restricted, is_ultra_restricted, is_bot, 
				updated, is_app_user, has_2fa);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SlackUser {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    team_id: ").append(toIndentedString(team_id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
		sb.append("    color: ").append(toIndentedString(color)).append("\n");
		sb.append("    real_name: ").append(toIndentedString(real_name)).append("\n");
		sb.append("    tz: ").append(toIndentedString(tz)).append("\n");
		sb.append("    tz_label: ").append(toIndentedString(tz_label)).append("\n");
		sb.append("    tz_offset: ").append(toIndentedString(tz_offset)).append("\n");
		sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
		sb.append("    is_admin: ").append(toIndentedString(is_admin)).append("\n");
		sb.append("    is_primary_owner: ").append(toIndentedString(is_primary_owner)).append("\n");
		sb.append("    is_restricted: ").append(toIndentedString(is_restricted)).append("\n");
		sb.append("    is_ultra_restricted: ").append(toIndentedString(is_ultra_restricted)).append("\n");
		sb.append("    is_bot: ").append(toIndentedString(is_bot)).append("\n");
		sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
		sb.append("    is_app_user: ").append(toIndentedString(is_app_user)).append("\n");
		sb.append("    has_2fa: ").append(toIndentedString(has_2fa)).append("\n");
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
