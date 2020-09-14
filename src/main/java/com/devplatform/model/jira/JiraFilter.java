package com.devplatform.model.jira;

import java.util.Objects;

import javax.annotation.Generated;
import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraFilter {
	@JsonProperty("self")
	private String self = null;

	@JsonProperty("id")
	private String id = null;

	@JsonProperty("name")
	private String name = null;
	
	@JsonProperty("description")
	private String description = null;
	
	@JsonProperty("owner")
	private JiraUser owner = null;

	@JsonProperty("jql")
	private String jql = null;

	@JsonProperty("viewUrl")
	private String viewUrl = null;

	@JsonProperty("searchUrl")
	private String searchUrl = null;

	@JsonProperty("favourite")
	private Boolean favourite = null;

	@JsonProperty("editable")
	private Boolean editable = null;

	@JsonProperty("sharePermissions")
	private Object sharePermissions = null;

	@JsonProperty("sharedUsers")
	private Object sharedUsers = null;

	@JsonProperty("subscriptions")
	private Object subscriptions = null;
	
	public JiraFilter self(String self) {
		this.self = self;
		return this;
	}

	@Valid
	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public JiraFilter id(String id) {
		this.id = id;
		return this;
	}

	@Valid
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public JiraFilter name(String name) {
		this.name = name;
		return this;
	}

	@Valid
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JiraFilter description(String description) {
		this.description = description;
		return this;
	}

	@Valid
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public JiraFilter owner(JiraUser owner) {
		this.owner = owner;
		return this;
	}

	@Valid
	public JiraUser getOwner() {
		return owner;
	}

	public void setOwner(JiraUser owner) {
		this.owner = owner;
	}

	public JiraFilter jql(String jql) {
		this.jql = jql;
		return this;
	}

	@Valid
	public String getJql() {
		return jql;
	}

	public void setJql(String jql) {
		this.jql = jql;
	}

	public JiraFilter viewUrl(String viewUrl) {
		this.viewUrl = viewUrl;
		return this;
	}

	@Valid
	public String getViewUrl() {
		return viewUrl;
	}

	public void setViewUrl(String viewUrl) {
		this.viewUrl = viewUrl;
	}

	public JiraFilter searchUrl(String searchUrl) {
		this.searchUrl = searchUrl;
		return this;
	}

	@Valid
	public String getSearchUrl() {
		return searchUrl;
	}

	public void setSearchUrl(String searchUrl) {
		this.searchUrl = searchUrl;
	}

	public JiraFilter favourite(Boolean favourite) {
		this.favourite = favourite;
		return this;
	}

	@Valid
	public Boolean getFavourite() {
		return favourite;
	}

	public void setFavourite(Boolean favourite) {
		this.favourite = favourite;
	}

	public JiraFilter editable(Boolean editable) {
		this.editable = editable;
		return this;
	}

	@Valid
	public Boolean getEditable() {
		return editable;
	}

	public void setEditable(Boolean editable) {
		this.editable = editable;
	}

	public JiraFilter sharePermissions(Object sharePermissions) {
		this.sharePermissions = sharePermissions;
		return this;
	}

	@Valid
	public Object getSharePermissions() {
		return sharePermissions;
	}

	public void setSharePermissions(Object sharePermissions) {
		this.sharePermissions = sharePermissions;
	}

	public JiraFilter sharedUsers(Object sharedUsers) {
		this.sharedUsers = sharedUsers;
		return this;
	}

	@Valid
	public Object getSharedUsers() {
		return sharedUsers;
	}

	public void setSharedUsers(Object sharedUsers) {
		this.sharedUsers = sharedUsers;
	}

	public JiraFilter subscriptions(Object subscriptions) {
		this.subscriptions = subscriptions;
		return this;
	}

	@Valid
	public Object getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(Object subscriptions) {
		this.subscriptions = subscriptions;
	}
	
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraFilter gitlabCommit = (JiraFilter) o;
		return Objects.equals(this.self, gitlabCommit.self)
				&& Objects.equals(this.id, gitlabCommit.id)
				&& Objects.equals(this.name, gitlabCommit.name)
				&& Objects.equals(this.description, gitlabCommit.description)
				&& Objects.equals(this.owner, gitlabCommit.owner)
				&& Objects.equals(this.jql, gitlabCommit.jql)
				&& Objects.equals(this.viewUrl, gitlabCommit.viewUrl)
				&& Objects.equals(this.searchUrl, gitlabCommit.searchUrl)
				&& Objects.equals(this.favourite, gitlabCommit.favourite)
				&& Objects.equals(this.editable, gitlabCommit.editable)
				&& Objects.equals(this.sharePermissions, gitlabCommit.sharePermissions)
				&& Objects.equals(this.sharedUsers, gitlabCommit.sharedUsers)
				&& Objects.equals(this.subscriptions, gitlabCommit.subscriptions);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(self, id, name, description, owner, jql, viewUrl, searchUrl, 
				favourite, editable, sharePermissions, sharedUsers, subscriptions);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraFilter {\n");
		sb.append("    self: ").append(toIndentedString(self)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
		sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
		sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
		sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
		sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
		sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
		sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
		sb.append("    sharedUsers: ").append(toIndentedString(sharedUsers)).append("\n");
		sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");

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
