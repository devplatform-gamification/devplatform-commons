package com.devplatform.model.jira;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraGroup {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("self")
	private String self = null;
	
	@JsonProperty("users")
	private JiraUsers users = null;
	
	@JsonProperty("expand")
	private String expand = null;

	public JiraGroup name(String name) {
		this.name = name;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JiraGroup self(String self) {
		this.self = self;
		return this;
	}

	@ApiModelProperty(required = true, value = "")
	@NotNull
	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}
	
	public JiraGroup users(JiraUsers users) {
		this.users = users;
		return this;
	}

	@ApiModelProperty(value = "")
	public JiraUsers getUsers() {
		return users;
	}

	public void setUsers(JiraUsers users) {
		this.users = users;
	}

	public JiraGroup expand(String expand) {
		this.expand = expand;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraGroup jiraUser = (JiraGroup) o;
		return Objects.equals(this.self, jiraUser.self)
				&& Objects.equals(this.name, jiraUser.name)
				 && Objects.equals(this.users, jiraUser.users)
				 && Objects.equals(this.expand, jiraUser.expand);
	}

	@Override
	public int hashCode() {
		return Objects.hash(self, name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraGroup {\n");
		sb.append("    self: ").append(toIndentedString(self)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    users: ").append(toIndentedString(users)).append("\n");
		sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
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
