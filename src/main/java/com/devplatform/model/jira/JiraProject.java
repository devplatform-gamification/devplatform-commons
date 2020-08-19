package com.devplatform.model.jira;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraProject
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraProject   {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("key")
	private String key = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("projectTypeKey")
	private String projectTypeKey = null;

	@JsonProperty("avatarUrls")
	private JiraAvatarurls avatarurls = null;

	@JsonProperty("projectCategory")
	private JiraProjectProjectCategory projectCategory = null;

	@JsonProperty("self")
	private String self = null;

	@JsonProperty("expand")
	private String expand = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("email")
	private String email = null;

	@JsonProperty("assigneeType")
	private String assigneeType = null;

	@JsonProperty("versions")
	private List<JiraVersion> versions = null;

	@JsonProperty("archived")
	private Boolean archived = null;

	@JsonProperty("lead")
	private JiraUser lead = null;

	@JsonProperty("components")
	private List<JiraProjectComponent> components = null;

	@JsonProperty("issueTypes")
	private List<JiraIssuetype> issueTypes = null;

	@JsonProperty("roles")
	private Map<String, String> roles = null;

	public JiraProject id(BigDecimal id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * @return id
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public JiraProject key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * Get key
	 * @return key
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public JiraProject name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * @return name
	 **/
	@ApiModelProperty(value = "")

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JiraProject projectTypeKey(String projectTypeKey) {
		this.projectTypeKey = projectTypeKey;
		return this;
	}

	/**
	 * Get projectTypeKey
	 * @return projectTypeKey
	 **/
	@ApiModelProperty(value = "")

	public String getProjectTypeKey() {
		return projectTypeKey;
	}

	public void setProjectTypeKey(String projectTypeKey) {
		this.projectTypeKey = projectTypeKey;
	}

	public JiraProject avatarurls(JiraAvatarurls avatarurls) {
		this.avatarurls = avatarurls;
		return this;
	}

	/**
	 * Get avatarurls
	 * @return avatarurls
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraAvatarurls getAvatarurls() {
		return avatarurls;
	}

	public void setAvatarurls(JiraAvatarurls avatarurls) {
		this.avatarurls = avatarurls;
	}

	public JiraProject self(String self) {
		this.self = self;
		return this;
	}

	/**
	 * Get self
	 * @return self
	 **/
	@ApiModelProperty(value = "")

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public JiraProject projectCategory(JiraProjectProjectCategory projectCategory) {
		this.projectCategory = projectCategory;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public JiraProjectProjectCategory getProjectCategory() {
		return projectCategory;
	}

	public void setProjectCategory(JiraProjectProjectCategory projectCategory) {
		this.projectCategory = projectCategory;
	}

	public JiraProject expand(String expand) {
		this.expand = expand;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public JiraProject description(String description) {
		this.description = description;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public JiraProject url(String url) {
		this.url = url;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public JiraProject email(String email) {
		this.email = email;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public JiraProject assigneeType(String assigneeType) {
		this.assigneeType = assigneeType;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public String getAssigneeType() {
		return assigneeType;
	}

	public void setAssigneeType(String assigneeType) {
		this.assigneeType = assigneeType;
	}

	public JiraProject versions(List<JiraVersion> versions) {
		this.versions = versions;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public List<JiraVersion> getVersions() {
		return versions;
	}

	public void setVersions(List<JiraVersion> versions) {
		this.versions = versions;
	}

	public JiraProject archived(Boolean archived) {
		this.archived = archived;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public Boolean getArchived() {
		return archived;
	}

	public void setArchived(Boolean archived) {
		this.archived = archived;
	}

	public JiraProject lead(JiraUser lead) {
		this.lead = lead;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public JiraUser getLead() {
		return lead;
	}

	public void setLead(JiraUser lead) {
		this.lead = lead;
	}

	public JiraProject components(List<JiraProjectComponent> components) {
		this.components = components;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public List<JiraProjectComponent> getComponents() {
		return components;
	}

	public void setComponents(List<JiraProjectComponent> components) {
		this.components = components;
	}

	public JiraProject issueTypes(List<JiraIssuetype> issueTypes) {
		this.issueTypes = issueTypes;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public List<JiraIssuetype> getIssueTypes() {
		return issueTypes;
	}

	public void setIssueTypes(List<JiraIssuetype> issueTypes) {
		this.issueTypes = issueTypes;
	}

	public JiraProject roles(Map<String, String> roles) {
		this.roles = roles;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public Map<String, String> getRoles() {
		return roles;
	}

	public void setRoles(Map<String, String> roles) {
		this.roles = roles;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraProject jiraProject = (JiraProject) o;
		return Objects.equals(this.id, jiraProject.id) &&
				Objects.equals(this.key, jiraProject.key) &&
				Objects.equals(this.name, jiraProject.name) &&
				Objects.equals(this.projectTypeKey, jiraProject.projectTypeKey) &&
				Objects.equals(this.avatarurls, jiraProject.avatarurls) &&
				Objects.equals(this.projectCategory, jiraProject.projectCategory) &&

				Objects.equals(this.expand, jiraProject.expand) &&
				Objects.equals(this.description, jiraProject.description) &&
				Objects.equals(this.url, jiraProject.url) &&
				Objects.equals(this.email, jiraProject.email) &&
				Objects.equals(this.assigneeType, jiraProject.assigneeType) &&
				Objects.equals(this.archived, jiraProject.archived) &&
				Objects.equals(this.lead, jiraProject.lead) &&
				Objects.equals(this.components, jiraProject.components) &&
				Objects.equals(this.issueTypes, jiraProject.issueTypes) &&
				Objects.equals(this.roles, jiraProject.roles) &&
				
				Objects.equals(this.self, jiraProject.self);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, key, name, projectTypeKey, avatarurls, self, projectCategory,
				expand, description, url, email, assigneeType, archived, lead, components,
				issueTypes, roles);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraProject {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
		sb.append("    avatarurls: ").append(toIndentedString(avatarurls)).append("\n");
		sb.append("    self: ").append(toIndentedString(self)).append("\n");
		sb.append("    projectCategory: ").append(toIndentedString(projectCategory)).append("\n");

		sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
		sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
		sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
		sb.append("    components: ").append(toIndentedString(components)).append("\n");
		sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
		sb.append("    roles: ").append(toIndentedString(roles)).append("\n");

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
