package com.devplatform.model.rocketchat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class RocketchatUser {
	/**
	 * Gets or Sets type
	 */
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("_id")
	private String id = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("createdAt")
	private String createdAt = null;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("roles")
	private ArrayList<String> roles = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("type")
	private String type = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("active")
	private Boolean active = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("username")
	private String username = null;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("name")
	private String name = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("services")
	private Object services = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("emails")
	private List<RocketchatEmail> emails = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("status")
	private String status = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("statusConnection")
	private String statusConnection = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("lastLogin")
	private String lastLogin = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("avatarOrigin")
	private String avatarOrigin = null;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("utcOffset")
	private Integer utcOffset = null;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("language")
	private String language = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("avatarETag")
	private String avatarETag = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("statusText")
	private String statusText = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("bio")
	private String bio = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("oauth")
	private Object oauth = null;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("_updatedAt")
	private String updatedAt = null;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("statusLivechat")
	private String statusLivechat = null;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("e2e")
	private Object e2e = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("requirePasswordChange")
	private Boolean requirePasswordChange = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("customFields")
	private HashMap<String, Object> customFields = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("settings")
	private Object settings = null;
	
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("banners")
	private Map<String, RocketchatBanner> banners = null;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("__rooms")
	private List<String> rooms = null;
	

	public RocketchatUser id(String id) {
		this.id = id;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RocketchatUser createdAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public RocketchatUser roles(ArrayList<String> roles) {
		this.roles = roles;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public ArrayList<String> getRoles() {
		return roles;
	}

	public void setRoles(ArrayList<String> roles) {
		this.roles = roles;
	}

	public RocketchatUser type(String type) {
		this.type = type;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public RocketchatUser active(Boolean active) {
		this.active = active;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public RocketchatUser username(String username) {
		this.username = username;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public RocketchatUser name(String name) {
		this.name = name;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RocketchatUser services(Object services) {
		this.services = services;
		return this;
	}

	@ApiModelProperty(value = "")
	public Object getServices() {
		return services;
	}

	public void setServices(Object services) {
		this.services = services;
	}

	public RocketchatUser emails(List<RocketchatEmail> emails) {
		this.emails = emails;
		return this;
	}

	@ApiModelProperty(value = "")
	public List<RocketchatEmail> getEmails() {
		return emails;
	}

	public void setEmails(List<RocketchatEmail> emails) {
		this.emails = emails;
	}

	public RocketchatUser status(String status) {
		this.status = status;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public RocketchatUser statusConnection(String statusConnection) {
		this.statusConnection = statusConnection;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getStatusConnection() {
		return statusConnection;
	}

	public void setStatusConnection(String statusConnection) {
		this.statusConnection = statusConnection;
	}

	public RocketchatUser lastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public RocketchatUser avatarOrigin(String avatarOrigin) {
		this.avatarOrigin = avatarOrigin;
		return this;
	}

	@ApiModelProperty(value = "")

	public String getAvatarOrigin() {
		return avatarOrigin;
	}

	public void setAvatarOrigin(String avatarOrigin) {
		this.avatarOrigin = avatarOrigin;
	}

	public RocketchatUser utcOffset(Integer utcOffset) {
		this.utcOffset = utcOffset;
		return this;
	}

	@ApiModelProperty(value = "")
	
	public Integer getUtcOffset() {
		return utcOffset;
	}

	public void setUtcOffset(Integer utcOffset) {
		this.utcOffset = utcOffset;
	}

	public RocketchatUser statusText(String statusText) {
		this.statusText = statusText;
		return this;
	}

	@ApiModelProperty(value = "")
	
	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public RocketchatUser language(String language) {
		this.language = language;
		return this;
	}

	@ApiModelProperty(value = "")
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public RocketchatUser oauth(Object oauth) {
		this.oauth = oauth;
		return this;
	}

	@ApiModelProperty(value = "")
	
	public Object getOauth() {
		return oauth;
	}

	public void setOauth(Object oauth) {
		this.oauth = oauth;
	}

	public RocketchatUser updatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	@ApiModelProperty(value = "")
	
	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public RocketchatUser statusLivechat(String statusLivechat) {
		this.statusLivechat = statusLivechat;
		return this;
	}

	@ApiModelProperty(value = "")
	
	public String getStatusLivechat() {
		return statusLivechat;
	}

	public void setStatusLivechat(String statusLivechat) {
		this.statusLivechat = statusLivechat;
	}

	public RocketchatUser e2e(Object e2e) {
		this.e2e = e2e;
		return this;
	}

	@ApiModelProperty(value = "")
	
	public Object getE2e() {
		return e2e;
	}

	public void setE2e(Object e2e) {
		this.e2e = e2e;
	}

	public RocketchatUser requirePasswordChange(Boolean requirePasswordChange) {
		this.requirePasswordChange = requirePasswordChange;
		return this;
	}

	@ApiModelProperty(value = "")
	
	public Boolean getRequirePasswordChange() {
		return requirePasswordChange;
	}

	public void setRequirePasswordChange(Boolean requirePasswordChange) {
		this.requirePasswordChange = requirePasswordChange;
	}

	public RocketchatUser customFields(HashMap<String, Object> customFields) {
		this.customFields = customFields;
		return this;
	}

	@ApiModelProperty(value = "")
	
	public HashMap<String, Object> getCustomFields() {
		return customFields;
	}

	public void setCustomFields(HashMap<String, Object> customFields) {
		this.customFields = customFields;
	}

	public RocketchatUser settings(Object settings) {
		this.settings = settings;
		return this;
	}

	@ApiModelProperty(value = "")
	
	public Object getSettings() {
		return settings;
	}

	public void setSettings(Object settings) {
		this.settings = settings;
	}
	
	public RocketchatUser settings(String avatarETag) {
		this.avatarETag = avatarETag;
		return this;
	}

	@ApiModelProperty(value = "")
	
	public String getAvatarETag() {
		return avatarETag;
	}

	public void setAvatarETag(String avatarETag) {
		this.avatarETag = avatarETag;
	}

	public RocketchatUser bio(String bio) {
		this.bio = bio;
		return this;
	}

	@ApiModelProperty(value = "")
	
	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public RocketchatUser banners(Map<String, RocketchatBanner> banners) {
		this.banners = banners;
		return this;
	}

	@ApiModelProperty(value = "")
	public Map<String, RocketchatBanner> getBanners() {
		return banners;
	}

	public void setBanners(Map<String, RocketchatBanner> banners) {
		this.banners = banners;
	}

	public RocketchatUser rooms(List<String> rooms) {
		this.rooms = rooms;
		return this;
	}

	@ApiModelProperty(value = "")
	
	public List<String> getRooms() {
		return rooms;
	}

	public void setRooms(List<String> rooms) {
		this.rooms = rooms;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RocketchatUser slackChannelMessage = (RocketchatUser) o;
		return Objects.equals(this.id, slackChannelMessage.id)
				&& Objects.equals(this.createdAt, slackChannelMessage.createdAt)
				&& Objects.equals(this.roles, slackChannelMessage.roles)
				&& Objects.equals(this.type, slackChannelMessage.type)
				&& Objects.equals(this.active, slackChannelMessage.active)
				&& Objects.equals(this.username, slackChannelMessage.username)
				&& Objects.equals(this.name, slackChannelMessage.name)
				&& Objects.equals(this.services, slackChannelMessage.services)
				&& Objects.equals(this.emails, slackChannelMessage.emails)
				&& Objects.equals(this.status, slackChannelMessage.status)
				&& Objects.equals(this.statusConnection, slackChannelMessage.statusConnection)
				&& Objects.equals(this.lastLogin, slackChannelMessage.lastLogin)
				&& Objects.equals(this.avatarOrigin, slackChannelMessage.avatarOrigin)
				&& Objects.equals(this.utcOffset, slackChannelMessage.utcOffset)
				&& Objects.equals(this.language, slackChannelMessage.language)
				&& Objects.equals(this.statusText, slackChannelMessage.statusText)
				&& Objects.equals(this.oauth, slackChannelMessage.oauth)
				&& Objects.equals(this.updatedAt, slackChannelMessage.updatedAt)
				&& Objects.equals(this.statusLivechat, slackChannelMessage.statusLivechat)
				&& Objects.equals(this.e2e, slackChannelMessage.e2e)
				&& Objects.equals(this.requirePasswordChange, slackChannelMessage.requirePasswordChange)
				&& Objects.equals(this.customFields, slackChannelMessage.customFields)
				&& Objects.equals(this.settings, slackChannelMessage.settings)
				
				&& Objects.equals(this.avatarETag, slackChannelMessage.avatarETag)
				&& Objects.equals(this.bio, slackChannelMessage.bio)
				&& Objects.equals(this.banners, slackChannelMessage.banners)
				&& Objects.equals(this.rooms, slackChannelMessage.rooms);
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(id, createdAt, roles, type, active, username, name, services, emails, 
				status, statusConnection, lastLogin, avatarOrigin, utcOffset, language, 
				statusText, oauth, updatedAt, statusLivechat, e2e, requirePasswordChange, 
				customFields, settings, avatarETag, bio, banners, rooms);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatUser {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    active: ").append(toIndentedString(active)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    services: ").append(toIndentedString(services)).append("\n");
		sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    statusConnection: ").append(toIndentedString(statusConnection)).append("\n");
		sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
		sb.append("    avatarOrigin: ").append(toIndentedString(avatarOrigin)).append("\n");
		sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
		sb.append("    language: ").append(toIndentedString(language)).append("\n");
		sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
		sb.append("    oauth: ").append(toIndentedString(oauth)).append("\n");
		sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
		sb.append("    statusLivechat: ").append(toIndentedString(statusLivechat)).append("\n");
		sb.append("    e2e: ").append(toIndentedString(e2e)).append("\n");
		sb.append("    requirePasswordChange: ").append(toIndentedString(requirePasswordChange)).append("\n");
		sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
		sb.append("    settings: ").append(toIndentedString(settings)).append("\n");

		sb.append("    avatarETag: ").append(toIndentedString(avatarETag)).append("\n");
		sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
		sb.append("    banners: ").append(toIndentedString(banners)).append("\n");
		sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
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
