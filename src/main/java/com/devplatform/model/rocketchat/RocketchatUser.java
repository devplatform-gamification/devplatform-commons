package com.devplatform.model.rocketchat;

import java.util.ArrayList;
import java.util.HashMap;
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
public class RocketchatUser {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("_id")
	private String _id = null;

	@JsonProperty("createdAt")
	private String createdAt = null;
	
	@JsonProperty("roles")
	private ArrayList<String> roles = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("active")
	private Boolean active = null;

	@JsonProperty("username")
	private String username = null;
	
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("services")
	private Object services = null;

	@JsonProperty("emails")
	private ArrayList<Object> emails = null;

	@JsonProperty("status")
	private String status = null;

	@JsonProperty("statusConnection")
	private String statusConnection = null;

	@JsonProperty("lastLogin")
	private String lastLogin = null;

	@JsonProperty("avatarOrigin")
	private String avatarOrigin = null;
	
	@JsonProperty("utcOffset")
	private Integer utcOffset = null;
	
	@JsonProperty("language")
	private String language = null;

	@JsonProperty("statusDefault")
	private String statusDefault = null;

	@JsonProperty("oauth")
	private Object oauth = null;
	
	@JsonProperty("_updatedAt")
	private String _updatedAt = null;
	
	@JsonProperty("statusLivechat")
	private String statusLivechat = null;
	
	@JsonProperty("e2e")
	private Object e2e = null;

	@JsonProperty("requirePasswordChange")
	private Boolean requirePasswordChange = null;

	@JsonProperty("customFields")
	private HashMap<String, Object> customFields = null;

	@JsonProperty("settings")
	private Object settings = null;
	
	public RocketchatUser _id(String _id) {
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

	public RocketchatUser createdAt(String createdAt) {
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

	public RocketchatUser roles(ArrayList<String> roles) {
		this.roles = roles;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
	public Object getServices() {
		return services;
	}

	public void setServices(Object services) {
		this.services = services;
	}

	public RocketchatUser emails(ArrayList<Object> emails) {
		this.emails = emails;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public ArrayList<Object> getEmails() {
		return emails;
	}

	public void setEmails(ArrayList<Object> emails) {
		this.emails = emails;
	}

	public RocketchatUser status(String status) {
		this.status = status;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
	public Integer getUtcOffset() {
		return utcOffset;
	}

	public void setUtcOffset(Integer utcOffset) {
		this.utcOffset = utcOffset;
	}

	public RocketchatUser statusDefault(String statusDefault) {
		this.statusDefault = statusDefault;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getStatusDefault() {
		return statusDefault;
	}

	public void setStatusDefault(String statusDefault) {
		this.statusDefault = statusDefault;
	}

	public RocketchatUser language(String language) {
		this.language = language;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
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
	@NotNull
	public Object getOauth() {
		return oauth;
	}

	public void setOauth(Object oauth) {
		this.oauth = oauth;
	}

	public RocketchatUser _updatedAt(String _updatedAt) {
		this._updatedAt = _updatedAt;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String get_updatedAt() {
		return _updatedAt;
	}

	public void set_updatedAt(String _updatedAt) {
		this._updatedAt = _updatedAt;
	}

	public RocketchatUser statusLivechat(String statusLivechat) {
		this.statusLivechat = statusLivechat;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
	public Object getSettings() {
		return settings;
	}

	public void setSettings(Object settings) {
		this.settings = settings;
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
		return Objects.equals(this._id, slackChannelMessage._id)
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
				&& Objects.equals(this.statusDefault, slackChannelMessage.statusDefault)
				&& Objects.equals(this.oauth, slackChannelMessage.oauth)
				&& Objects.equals(this._updatedAt, slackChannelMessage._updatedAt)
				&& Objects.equals(this.statusLivechat, slackChannelMessage.statusLivechat)
				&& Objects.equals(this.e2e, slackChannelMessage.e2e)
				&& Objects.equals(this.requirePasswordChange, slackChannelMessage.requirePasswordChange)
				&& Objects.equals(this.customFields, slackChannelMessage.customFields)
				&& Objects.equals(this.settings, slackChannelMessage.settings);
	}

	@Override
	public int hashCode() {
		return Objects.hash(_id, createdAt, roles, type, active, username, name, services, emails, 
				status, statusConnection, lastLogin, avatarOrigin, utcOffset, language, 
				statusDefault, oauth, _updatedAt, statusLivechat, e2e, requirePasswordChange, 
				customFields, settings);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatUser {\n");

		sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
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
		sb.append("    statusDefault: ").append(toIndentedString(statusDefault)).append("\n");
		sb.append("    oauth: ").append(toIndentedString(oauth)).append("\n");
		sb.append("    _updatedAt: ").append(toIndentedString(_updatedAt)).append("\n");
		sb.append("    statusLivechat: ").append(toIndentedString(statusLivechat)).append("\n");
		sb.append("    e2e: ").append(toIndentedString(e2e)).append("\n");
		sb.append("    requirePasswordChange: ").append(toIndentedString(requirePasswordChange)).append("\n");
		sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
		sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
