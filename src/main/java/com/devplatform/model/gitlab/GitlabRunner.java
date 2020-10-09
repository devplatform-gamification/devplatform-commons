package com.devplatform.model.gitlab;

import java.math.BigDecimal;
import java.util.Objects;

import javax.annotation.Generated;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabRunner {
	@JsonProperty("id")
	private BigDecimal id = null;
	
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("active")
	private Boolean active = null;

	@JsonProperty("is_shared")
	private Boolean isShared = null;

	@JsonProperty("online")
	private Boolean online = null;

	@JsonProperty("ip_address")
	private String ipAddress = null;

	@JsonProperty("status")
	private String status = null;
	
	public GitlabRunner id(BigDecimal id) {
		this.id = id;
		return this;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public GitlabRunner name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GitlabRunner description(String description) {
		this.description = description;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public GitlabRunner active(Boolean active) {
		this.active = active;
		return this;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public GitlabRunner isShared(Boolean isShared) {
		this.isShared = isShared;
		return this;
	}

	public Boolean getIsShared() {
		return isShared;
	}

	public void setIsShared(Boolean isShared) {
		this.isShared = isShared;
	}

	public GitlabRunner online(Boolean online) {
		this.online = online;
		return this;
	}

	public Boolean getOnline() {
		return online;
	}

	public void setOnline(Boolean online) {
		this.online = online;
	}

	public GitlabRunner ipAddress(String ipAddress) {
		this.ipAddress = ipAddress;
		return this;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public GitlabRunner status(String status) {
		this.status = status;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabRunner gitlabCommitAuthor = (GitlabRunner) o;
		return Objects.equals(this.id, gitlabCommitAuthor.id)
				&& Objects.equals(this.name, gitlabCommitAuthor.name)
				&& Objects.equals(this.description, gitlabCommitAuthor.description)
				&& Objects.equals(this.active, gitlabCommitAuthor.active)
				&& Objects.equals(this.isShared, gitlabCommitAuthor.isShared)
				&& Objects.equals(this.online, gitlabCommitAuthor.online)
				&& Objects.equals(this.ipAddress, gitlabCommitAuthor.ipAddress)
				&& Objects.equals(this.status, gitlabCommitAuthor.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, description, active, isShared, online, ipAddress, status);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabRunner {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    active: ").append(toIndentedString(active)).append("\n");
		sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
		sb.append("    online: ").append(toIndentedString(online)).append("\n");
		sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
