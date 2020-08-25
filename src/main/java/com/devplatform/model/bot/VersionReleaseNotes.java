package com.devplatform.model.bot;

import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.jira.JiraUser;
import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class VersionReleaseNotes {
	@JsonProperty("project")
	private String project = null;

	@JsonProperty("issueKey")
	private String issueKey = null;

	@JsonProperty("gitlab-project-id")
	private String gitlabProjectId = null;
	
	@JsonProperty("gitlab-project-url")
	private String gitlabProjectUrl = null;

	@JsonProperty("affected-version")
	private String affectedVersion = null;

	@JsonProperty("version")
	private String version = null;

	@JsonProperty("next-version")
	private String nextVersion = null;

	@JsonProperty("release-date")
	private String releaseDate = null;

	@JsonProperty("version-type")
	private String versionType = null;

	@JsonProperty("author")
	private JiraUser author = null;

	@JsonProperty("version-highlights")
	private String versionHighlights = null;

	@JsonProperty("jql")
	private String jql = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("new-features")
	private List<VersionReleaseNoteIssues> newFeatures = null;

	@JsonProperty("improvements")
	private List<VersionReleaseNoteIssues> improvements = null;
	
	@JsonProperty("bugs")
	private List<VersionReleaseNoteIssues> bugs = null;

	@JsonProperty("minor-changes")
	private List<VersionReleaseNoteIssues> minorChanges = null;

	public VersionReleaseNotes project(String project) {
		this.project = project;
		return this;
	}
	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	public String getIssueKey() {
		return issueKey;
	}

	public void setIssueKey(String issueKey) {
		this.issueKey = issueKey;
	}

	public String getGitlabProjectId() {
		return gitlabProjectId;
	}

	public void setGitlabProjectId(String gitlabProjectId) {
		this.gitlabProjectId = gitlabProjectId;
	}
	
	public String getGitlabProjectUrl() {
		return gitlabProjectUrl;
	}

	public void setGitlabProjectUrl(String gitlabProjectUrl) {
		this.gitlabProjectUrl = gitlabProjectUrl;
	}

	public VersionReleaseNotes version(String version) {
		this.version = version;
		return this;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getAffectedVersion() {
		return affectedVersion;
	}

	public void setAffectedVersion(String affectedVersion) {
		this.affectedVersion = affectedVersion;
	}

	public VersionReleaseNotes nextVersion(String nextVersion) {
		this.nextVersion = nextVersion;
		return this;
	}

	public String getNextVersion() {
		return nextVersion;
	}

	public void setNextVersion(String nextVersion) {
		this.nextVersion = nextVersion;
	}

	public VersionReleaseNotes releaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
		return this;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public VersionReleaseNotes versionType(String versionType) {
		this.versionType = versionType;
		return this;
	}

	public String getVersionType() {
		return versionType;
	}

	public void setVersionType(String versionType) {
		this.versionType = versionType;
	}

	public VersionReleaseNotes author(JiraUser author) {
		this.author = author;
		return this;
	}

	public JiraUser getAuthor() {
		return author;
	}

	public void setAuthor(JiraUser author) {
		this.author = author;
	}

	public VersionReleaseNotes versionHighlights(String versionHighlights) {
		this.versionHighlights = versionHighlights;
		return this;
	}

	public String getVersionHighlights() {
		return versionHighlights;
	}

	public void setVersionHighlights(String versionHighlights) {
		this.versionHighlights = versionHighlights;
	}

	public VersionReleaseNotes newFeatures(List<VersionReleaseNoteIssues> newFeatures) {
		this.newFeatures = newFeatures;
		return this;
	}

	public List<VersionReleaseNoteIssues> getNewFeatures() {
		return newFeatures;
	}

	public void setNewFeatures(List<VersionReleaseNoteIssues> newFeatures) {
		this.newFeatures = newFeatures;
	}

	public VersionReleaseNotes improvements(List<VersionReleaseNoteIssues> improvements) {
		this.improvements = improvements;
		return this;
	}

	public List<VersionReleaseNoteIssues> getImprovements() {
		return improvements;
	}

	public void setImprovements(List<VersionReleaseNoteIssues> improvements) {
		this.improvements = improvements;
	}

	public VersionReleaseNotes bugs(List<VersionReleaseNoteIssues> bugs) {
		this.bugs = bugs;
		return this;
	}

	public List<VersionReleaseNoteIssues> getBugs() {
		return bugs;
	}

	public void setBugs(List<VersionReleaseNoteIssues> bugs) {
		this.bugs = bugs;
	}

	public VersionReleaseNotes minorChanges(List<VersionReleaseNoteIssues> minorChanges) {
		this.minorChanges = minorChanges;
		return this;
	}

	public List<VersionReleaseNoteIssues> getMinorChanges() {
		return minorChanges;
	}

	public void setMinorChanges(List<VersionReleaseNoteIssues> minorChanges) {
		this.minorChanges = minorChanges;
	}

	public VersionReleaseNotes url(String url) {
		this.url = url;
		return this;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public VersionReleaseNotes jql(String jql) {
		this.jql = jql;
		return this;
	}
	
	public String getJql() {
		return jql;
	}

	public void setJql(String jql) {
		this.jql = jql;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		VersionReleaseNotes jiraUser = (VersionReleaseNotes) o;
		return Objects.equals(this.project, jiraUser.project) && 
				Objects.equals(this.issueKey, jiraUser.issueKey) &&
				Objects.equals(this.gitlabProjectId, jiraUser.gitlabProjectId) &&
				Objects.equals(this.gitlabProjectUrl, jiraUser.gitlabProjectUrl) &&
				Objects.equals(this.version, jiraUser.version) && 
				Objects.equals(this.affectedVersion, jiraUser.affectedVersion) &&
				Objects.equals(this.nextVersion, jiraUser.nextVersion) &&
				Objects.equals(this.releaseDate, jiraUser.releaseDate)
				&& Objects.equals(this.versionType, jiraUser.versionType)
				&& Objects.equals(this.author, jiraUser.author) && Objects.equals(this.versionHighlights, jiraUser.versionHighlights)
				&& Objects.equals(this.newFeatures, jiraUser.newFeatures) && Objects.equals(this.improvements, jiraUser.improvements)
				&& Objects.equals(this.bugs, jiraUser.bugs) && Objects.equals(this.minorChanges, jiraUser.minorChanges)
				&& Objects.equals(this.jql, jiraUser.jql)
				&& Objects.equals(this.url, jiraUser.url);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(project, issueKey, gitlabProjectId, gitlabProjectUrl, version, affectedVersion, nextVersion, releaseDate, versionType, author, versionHighlights, 
				newFeatures, improvements, bugs, minorChanges, jql);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraVersionReleaseNotes {\n");
		sb.append("    project: ").append(toIndentedString(project)).append("\n");
		sb.append("    issueKey: ").append(toIndentedString(issueKey)).append("\n");
		sb.append("    gitlabProjectId: ").append(toIndentedString(gitlabProjectId)).append("\n");
		sb.append("    gitlabProjectUrl: ").append(toIndentedString(gitlabProjectUrl)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    affectedVersion: ").append(toIndentedString(affectedVersion)).append("\n");
		sb.append("    nextVersion: ").append(toIndentedString(nextVersion)).append("\n");
		sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
		sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
		sb.append("    author: ").append(toIndentedString(author)).append("\n");
		sb.append("    versionHighlights: ").append(toIndentedString(versionHighlights)).append("\n");
		sb.append("    newFeatures: ").append(toIndentedString(newFeatures)).append("\n");
		sb.append("    improvements: ").append(toIndentedString(improvements)).append("\n");
		sb.append("    bugs: ").append(toIndentedString(bugs)).append("\n");
		sb.append("    minorChanges: ").append(toIndentedString(minorChanges)).append("\n");
		sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
