package com.devplatform.model.rocketchat;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotNull;

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
public class RocketchatRoom {
	@JsonInclude(Include.NON_NULL)
	@JsonProperty("_id")
	private String id;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("rid")
	private String rid;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("t")
	private RocketchatRoomTypeEnum type;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("usernames")
	private List<String> usernames;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("name")
	private String name;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("fname")
	private String fname;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("msgs")
	private BigDecimal msgs;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("usersCount")
	private BigDecimal usersCount;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("u")
	private RocketchatUser owner;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("customFields")
	private Map<String, String> customFields;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("broadcast")
	private Boolean broadcast;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("encrypted")
	private Boolean encrypted;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("ts")
	private String createdAt;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("_updatedAt")
	private String updatedAt;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("ro")
	private Boolean readOnly;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("default")
	private Boolean defaultRoom;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("sysMes")
	private Boolean sysMes;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("lastMessage")
	private RocketchatMessage lastMessage;

	@JsonInclude(Include.NON_NULL)
	@JsonProperty("lm")
	private String lastMessageAt;

	public RocketchatRoom id(String id) {
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

	public RocketchatRoom rid(String rid) {
		this.rid = rid;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public RocketchatRoom type(RocketchatRoomTypeEnum type) {
		this.type = type;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public RocketchatRoomTypeEnum getType() {
		return type;
	}

	public void setType(RocketchatRoomTypeEnum type) {
		this.type = type;
	}

	public RocketchatRoom usernames(List<String> usernames) {
		this.usernames = usernames;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public List<String> getUsernames() {
		return usernames;
	}

	public void setUsernames(List<String> usernames) {
		this.usernames = usernames;
	}

	public RocketchatRoom name(String name) {
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

	public RocketchatRoom fname(String fname) {
		this.fname = fname;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public RocketchatRoom msgs(BigDecimal msgs) {
		this.msgs = msgs;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public BigDecimal getMsgs() {
		return msgs;
	}

	public void setMsgs(BigDecimal msgs) {
		this.msgs = msgs;
	}

	public RocketchatRoom usersCount(BigDecimal usersCount) {
		this.usersCount = usersCount;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public BigDecimal getUsersCount() {
		return usersCount;
	}

	public void setUsersCount(BigDecimal usersCount) {
		this.usersCount = usersCount;
	}

	public RocketchatRoom owner(RocketchatUser owner) {
		this.owner = owner;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public RocketchatUser getOwner() {
		return owner;
	}

	public void setOwner(RocketchatUser owner) {
		this.owner = owner;
	}

	public RocketchatRoom customFields(Map<String, String> customFields) {
		this.customFields = customFields;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Map<String, String> getCustomFields() {
		return customFields;
	}

	public void setCustomFields(Map<String, String> customFields) {
		this.customFields = customFields;
	}

	public RocketchatRoom broadcast(Boolean broadcast) {
		this.broadcast = broadcast;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getBroadcast() {
		return broadcast;
	}

	public void setBroadcast(Boolean broadcast) {
		this.broadcast = broadcast;
	}

	public RocketchatRoom encrypted(Boolean encrypted) {
		this.encrypted = encrypted;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getEncrypted() {
		return encrypted;
	}

	public void setEncrypted(Boolean encrypted) {
		this.encrypted = encrypted;
	}

	public RocketchatRoom createdAt(String createdAt) {
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

	public RocketchatRoom updatedAt(String updatedAt) {
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

	public RocketchatRoom readOnly(Boolean readOnly) {
		this.readOnly = readOnly;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getReadOnly() {
		return readOnly;
	}

	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}

	public RocketchatRoom defaultRoom(Boolean defaultRoom) {
		this.defaultRoom = defaultRoom;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getDefaultRoom() {
		return defaultRoom;
	}

	public void setDefaultRoom(Boolean defaultRoom) {
		this.defaultRoom = defaultRoom;
	}

	public RocketchatRoom sysMes(Boolean sysMes) {
		this.sysMes = sysMes;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public Boolean getSysMes() {
		return sysMes;
	}

	public void setSysMes(Boolean sysMes) {
		this.sysMes = sysMes;
	}

	public RocketchatRoom lastMessage(RocketchatMessage lastMessage) {
		this.lastMessage = lastMessage;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public RocketchatMessage getLastMessage() {
		return lastMessage;
	}

	public void setLastMessage(RocketchatMessage lastMessage) {
		this.lastMessage = lastMessage;
	}

	public RocketchatRoom lastMessageAt(String lastMessageAt) {
		this.lastMessageAt = lastMessageAt;
		return this;
	}

	@ApiModelProperty(value = "")
	@NotNull
	public String getLastMessageAt() {
		return lastMessageAt;
	}

	public void setLastMessageAt(String lastMessageAt) {
		this.lastMessageAt = lastMessageAt;
	}
	
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RocketchatRoom slackChannelMessage = (RocketchatRoom) o;
		return Objects.equals(this.id, slackChannelMessage.id)
				
				&& Objects.equals(this.rid, slackChannelMessage.rid)
				&& Objects.equals(this.type, slackChannelMessage.type)
				&& Objects.equals(this.usernames, slackChannelMessage.usernames)
				&& Objects.equals(this.name, slackChannelMessage.name)
				&& Objects.equals(this.fname, slackChannelMessage.fname)
				&& Objects.equals(this.msgs, slackChannelMessage.msgs)
				&& Objects.equals(this.usersCount, slackChannelMessage.usersCount)
				&& Objects.equals(this.owner, slackChannelMessage.owner)
				&& Objects.equals(this.customFields, slackChannelMessage.customFields)
				&& Objects.equals(this.broadcast, slackChannelMessage.broadcast)
				&& Objects.equals(this.encrypted, slackChannelMessage.encrypted)
				&& Objects.equals(this.createdAt, slackChannelMessage.createdAt)
				&& Objects.equals(this.createdAt, slackChannelMessage.createdAt)
				&& Objects.equals(this.updatedAt, slackChannelMessage.updatedAt)
				&& Objects.equals(this.readOnly, slackChannelMessage.readOnly)
				&& Objects.equals(this.defaultRoom, slackChannelMessage.defaultRoom)
				&& Objects.equals(this.sysMes, slackChannelMessage.sysMes)
				&& Objects.equals(this.lastMessage, slackChannelMessage.lastMessage)
				&& Objects.equals(this.lastMessageAt, slackChannelMessage.lastMessageAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, rid, type, usernames, name, fname, msgs, usersCount, owner, customFields, broadcast,
				encrypted, createdAt, updatedAt, readOnly, defaultRoom, sysMes, lastMessage, lastMessageAt);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RocketchatRoom {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    rid: ").append(toIndentedString(rid)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    usernames: ").append(toIndentedString(usernames)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    fname: ").append(toIndentedString(fname)).append("\n");
		sb.append("    msgs: ").append(toIndentedString(msgs)).append("\n");
		sb.append("    usersCount: ").append(toIndentedString(usersCount)).append("\n");
		sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
		sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
		sb.append("    broadcast: ").append(toIndentedString(broadcast)).append("\n");
		sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
		sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
		sb.append("    defaultRoom: ").append(toIndentedString(defaultRoom)).append("\n");
		sb.append("    sysMes: ").append(toIndentedString(sysMes)).append("\n");
		sb.append("    lastMessage: ").append(toIndentedString(lastMessage)).append("\n");
		sb.append("    lastMessageAt: ").append(toIndentedString(lastMessageAt)).append("\n");
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
