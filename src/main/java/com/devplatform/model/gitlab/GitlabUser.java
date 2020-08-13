package com.devplatform.model.gitlab;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabUser   {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("username")
	private String username = null;

	@JsonProperty("state")
	private GitlabUserStateEnum state = null;

	@JsonProperty("avatar_url")
	private String avatarUrl = null;

	@JsonProperty("web_url")
	private String webUrl = null;

	@JsonProperty("created_at")
	private String createdAt = null;

	@JsonProperty("bio")
	private String bio = null;

	@JsonProperty("bio_html")
	private String bioHtml = null;

	@JsonProperty("location")
	private String location = null;

	@JsonProperty("public_email")
	private String publicEmail = null;

	@JsonProperty("skype")
	private String skype = null;

	@JsonProperty("linkedin")
	private String linkedin = null;

	@JsonProperty("twitter")
	private String twitter = null;

	@JsonProperty("website_url")
	private String websiteUrl = null;

	@JsonProperty("organization")
	private String organization = null;

	@JsonProperty("job_title")
	private String jobTitle = null;

	@JsonProperty("work_information")
	private String workInformation = null;

	@JsonProperty("last_sign_in_at")
	private String lastSignInAt = null;

	@JsonProperty("confirmed_at")
	private String confirmedAt = null;

	@JsonProperty("last_activity_on")
	private String lastActivityOn = null;

	@JsonProperty("current_sign_in_at")
	private String currentSignInAt = null;

	@JsonProperty("email")
	private String email = null;

	@JsonProperty("theme_id")
	private BigDecimal themeId = null;

	@JsonProperty("color_scheme_id")
	private BigDecimal colorSchemeId = null;

	@JsonProperty("projects_limit")
	private BigDecimal projectsLimit = null;

	@JsonProperty("identities")
	private List<GitlabUserIdentity> identities = null;

	@JsonProperty("can_create_group")
	private Boolean canCreateGroup = null;

	@JsonProperty("can_create_project")
	private Boolean canCreateProject = null;

	@JsonProperty("two_factor_enabled")
	private Boolean twoFactorEnabled = null;

	@JsonProperty("external")
	private Boolean external = null;

	@JsonProperty("private_profile")
	private Boolean privateProfile = null;

	@JsonProperty("is_admin")
	private Boolean isAdmin = null;

	@JsonProperty("note")
	private String note = null;

	public GitlabUser id(BigDecimal id) {
		this.id = id;
		return this;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public GitlabUser name(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GitlabUser username(String username) {
		this.username = username;
		return this;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public GitlabUser state(GitlabUserStateEnum state) {
		this.state = state;
		return this;
	}

	public GitlabUserStateEnum getState() {
		return state;
	}

	public void setState(GitlabUserStateEnum state) {
		this.state = state;
	}

	public GitlabUser avatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
		return this;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public GitlabUser webUrl(String webUrl) {
		this.webUrl = webUrl;
		return this;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public GitlabUser createdAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public GitlabUser bio(String bio) {
		this.bio = bio;
		return this;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public GitlabUser bioHtml(String bioHtml) {
		this.bioHtml = bioHtml;
		return this;
	}

	public String getBioHtml() {
		return bioHtml;
	}

	public void setBioHtml(String bioHtml) {
		this.bioHtml = bioHtml;
	}

	public GitlabUser location(String location) {
		this.location = location;
		return this;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public GitlabUser publicEmail(String publicEmail) {
		this.publicEmail = publicEmail;
		return this;
	}

	public String getPublicEmail() {
		return publicEmail;
	}

	public void setPublicEmail(String publicEmail) {
		this.publicEmail = publicEmail;
	}

	public GitlabUser skype(String skype) {
		this.skype = skype;
		return this;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public GitlabUser linkedin(String linkedin) {
		this.linkedin = linkedin;
		return this;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public GitlabUser twitter(String twitter) {
		this.twitter = twitter;
		return this;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public GitlabUser websiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
		return this;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public GitlabUser organization(String organization) {
		this.organization = organization;
		return this;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public GitlabUser jobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
		return this;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public GitlabUser workInformation(String workInformation) {
		this.workInformation = workInformation;
		return this;
	}

	public String getWorkInformation() {
		return workInformation;
	}

	public void setWorkInformation(String workInformation) {
		this.workInformation = workInformation;
	}

	public GitlabUser lastSignInAt(String lastSignInAt) {
		this.lastSignInAt = lastSignInAt;
		return this;
	}

	public String getLastSignInAt() {
		return lastSignInAt;
	}

	public void setLastSignInAt(String lastSignInAt) {
		this.lastSignInAt = lastSignInAt;
	}

	public GitlabUser confirmedAt(String confirmedAt) {
		this.confirmedAt = confirmedAt;
		return this;
	}

	public String getConfirmedAt() {
		return confirmedAt;
	}

	public void setConfirmedAt(String confirmedAt) {
		this.confirmedAt = confirmedAt;
	}

	public GitlabUser lastActivityOn(String lastActivityOn) {
		this.lastActivityOn = lastActivityOn;
		return this;
	}

	public String getLastActivityOn() {
		return lastActivityOn;
	}

	public void setLastActivityOn(String lastActivityOn) {
		this.lastActivityOn = lastActivityOn;
	}

	public GitlabUser currentSignInAt(String currentSignInAt) {
		this.currentSignInAt = currentSignInAt;
		return this;
	}

	public String getCurrentSignInAt() {
		return currentSignInAt;
	}

	public void setCurrentSignInAt(String currentSignInAt) {
		this.currentSignInAt = currentSignInAt;
	}

	public GitlabUser email(String email) {
		this.email = email;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public GitlabUser themeId(BigDecimal themeId) {
		this.themeId = themeId;
		return this;
	}

	public BigDecimal getThemeId() {
		return themeId;
	}

	public void setThemeId(BigDecimal themeId) {
		this.themeId = themeId;
	}

	public GitlabUser colorSchemeId(BigDecimal colorSchemeId) {
		this.colorSchemeId = colorSchemeId;
		return this;
	}

	public BigDecimal getColorSchemeId() {
		return colorSchemeId;
	}

	public void setColorSchemeId(BigDecimal colorSchemeId) {
		this.colorSchemeId = colorSchemeId;
	}

	public GitlabUser projectsLimit(BigDecimal projectsLimit) {
		this.projectsLimit = projectsLimit;
		return this;
	}

	public BigDecimal getProjectsLimit() {
		return projectsLimit;
	}

	public void setProjectsLimit(BigDecimal projectsLimit) {
		this.projectsLimit = projectsLimit;
	}

	public GitlabUser identities(List<GitlabUserIdentity> identities) {
		this.identities = identities;
		return this;
	}

	public List<GitlabUserIdentity> getIdentities() {
		return identities;
	}

	public void setIdentities(List<GitlabUserIdentity> identities) {
		this.identities = identities;
	}

	public GitlabUser canCreateGroup(Boolean canCreateGroup) {
		this.canCreateGroup = canCreateGroup;
		return this;
	}

	public Boolean getCanCreateGroup() {
		return canCreateGroup;
	}

	public void setCanCreateGroup(Boolean canCreateGroup) {
		this.canCreateGroup = canCreateGroup;
	}

	public GitlabUser canCreateProject(Boolean canCreateProject) {
		this.canCreateProject = canCreateProject;
		return this;
	}

	public Boolean getCanCreateProject() {
		return canCreateProject;
	}

	public void setCanCreateProject(Boolean canCreateProject) {
		this.canCreateProject = canCreateProject;
	}

	public GitlabUser twoFactorEnabled(Boolean twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
		return this;
	}

	public Boolean getTwoFactorEnabled() {
		return twoFactorEnabled;
	}

	public void setTwoFactorEnabled(Boolean twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
	}

	public GitlabUser external(Boolean external) {
		this.external = external;
		return this;
	}

	public Boolean getExternal() {
		return external;
	}

	public void setExternal(Boolean external) {
		this.external = external;
	}

	public GitlabUser privateProfile(Boolean privateProfile) {
		this.privateProfile = privateProfile;
		return this;
	}

	public Boolean getPrivateProfile() {
		return privateProfile;
	}

	public void setPrivateProfile(Boolean privateProfile) {
		this.privateProfile = privateProfile;
	}

	public GitlabUser isAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
		return this;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public GitlabUser note(String note) {
		this.note = note;
		return this;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabUser gitlabUser = (GitlabUser) o;
		return Objects.equals(this.id, gitlabUser.id) &&
				Objects.equals(this.name, gitlabUser.name) &&
				Objects.equals(this.username, gitlabUser.username) &&
				Objects.equals(this.state, gitlabUser.state) &&
				Objects.equals(this.avatarUrl, gitlabUser.avatarUrl) &&
				Objects.equals(this.webUrl, gitlabUser.webUrl) &&
				Objects.equals(this.createdAt, gitlabUser.createdAt) &&
				Objects.equals(this.bio, gitlabUser.bio) &&
				Objects.equals(this.bioHtml, gitlabUser.bioHtml) &&
				Objects.equals(this.location, gitlabUser.location) &&
				Objects.equals(this.publicEmail, gitlabUser.publicEmail) &&
				Objects.equals(this.skype, gitlabUser.skype) &&
				Objects.equals(this.linkedin, gitlabUser.linkedin) &&
				Objects.equals(this.twitter, gitlabUser.twitter) &&
				Objects.equals(this.websiteUrl, gitlabUser.websiteUrl) &&
				Objects.equals(this.organization, gitlabUser.organization) &&
				Objects.equals(this.jobTitle, gitlabUser.jobTitle) &&
				Objects.equals(this.themeId, gitlabUser.themeId) &&
				Objects.equals(this.colorSchemeId, gitlabUser.colorSchemeId) &&
				Objects.equals(this.projectsLimit, gitlabUser.projectsLimit) &&
				Objects.equals(this.identities, gitlabUser.identities) &&
				Objects.equals(this.canCreateGroup, gitlabUser.canCreateGroup) &&
				Objects.equals(this.canCreateProject, gitlabUser.canCreateProject) &&
				Objects.equals(this.twoFactorEnabled, gitlabUser.twoFactorEnabled) &&
				Objects.equals(this.external, gitlabUser.external) &&
				Objects.equals(this.privateProfile, gitlabUser.privateProfile) &&
				Objects.equals(this.isAdmin, gitlabUser.isAdmin) &&
				Objects.equals(this.note, gitlabUser.note);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, username, state, avatarUrl, webUrl, createdAt, bio, bioHtml, 
				location, publicEmail, skype, linkedin, twitter, websiteUrl, organization, jobTitle,
				workInformation, lastSignInAt, confirmedAt, lastActivityOn, currentSignInAt, email,
				themeId, colorSchemeId, projectsLimit, identities, canCreateGroup, canCreateProject,
				twoFactorEnabled, external, privateProfile, isAdmin, note);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabUser {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");

		sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
		sb.append("    bioHtml: ").append(toIndentedString(bioHtml)).append("\n");
		sb.append("    workInformation: ").append(toIndentedString(workInformation)).append("\n");
		sb.append("    lastSignInAt: ").append(toIndentedString(lastSignInAt)).append("\n");
		sb.append("    confirmedAt: ").append(toIndentedString(confirmedAt)).append("\n");
		sb.append("    lastActivityOn: ").append(toIndentedString(lastActivityOn)).append("\n");
		sb.append("    currentSignInAt: ").append(toIndentedString(currentSignInAt)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    themeId: ").append(toIndentedString(themeId)).append("\n");
		sb.append("    colorSchemeId: ").append(toIndentedString(colorSchemeId)).append("\n");
		sb.append("    projectsLimit: ").append(toIndentedString(projectsLimit)).append("\n");
		sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
		sb.append("    canCreateGroup: ").append(toIndentedString(canCreateGroup)).append("\n");
		sb.append("    canCreateProject: ").append(toIndentedString(canCreateProject)).append("\n");
		sb.append("    twoFactorEnabled: ").append(toIndentedString(twoFactorEnabled)).append("\n");
		sb.append("    external: ").append(toIndentedString(external)).append("\n");

		sb.append("    privateProfile: ").append(toIndentedString(privateProfile)).append("\n");
		sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
		sb.append("    note: ").append(toIndentedString(note)).append("\n");

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
