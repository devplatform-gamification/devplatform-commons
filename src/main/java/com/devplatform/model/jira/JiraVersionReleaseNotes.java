package com.devplatform.model.jira;

import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraVersionReleaseNotes {
	@JsonProperty("project")
	private String project = null;

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

	@JsonProperty("new-features")
	private List<JiraVersionReleaseNoteIssues> newFeatures = null;

	@JsonProperty("improvements")
	private List<JiraVersionReleaseNoteIssues> improvements = null;
	
	@JsonProperty("bugs")
	private List<JiraVersionReleaseNoteIssues> bugs = null;

	@JsonProperty("minor-changes")
	private List<JiraVersionReleaseNoteIssues> minorChanges = null;

	public JiraVersionReleaseNotes project(String project) {
		this.project = project;
		return this;
	}
	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public JiraVersionReleaseNotes version(String version) {
		this.version = version;
		return this;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public JiraVersionReleaseNotes nextVersion(String nextVersion) {
		this.nextVersion = nextVersion;
		return this;
	}

	public String getNextVersion() {
		return nextVersion;
	}

	public void setNextVersion(String nextVersion) {
		this.nextVersion = nextVersion;
	}

	public JiraVersionReleaseNotes releaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
		return this;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public JiraVersionReleaseNotes versionType(String versionType) {
		this.versionType = versionType;
		return this;
	}

	public String getVersionType() {
		return versionType;
	}

	public void setVersionType(String versionType) {
		this.versionType = versionType;
	}

	public JiraVersionReleaseNotes author(JiraUser author) {
		this.author = author;
		return this;
	}

	public JiraUser getAuthor() {
		return author;
	}

	public void setAuthor(JiraUser author) {
		this.author = author;
	}

	public JiraVersionReleaseNotes versionHighlights(String versionHighlights) {
		this.versionHighlights = versionHighlights;
		return this;
	}

	public String getVersionHighlights() {
		return versionHighlights;
	}

	public void setVersionHighlights(String versionHighlights) {
		this.versionHighlights = versionHighlights;
	}

	public JiraVersionReleaseNotes newFeatures(List<JiraVersionReleaseNoteIssues> newFeatures) {
		this.newFeatures = newFeatures;
		return this;
	}

	public List<JiraVersionReleaseNoteIssues> getNewFeatures() {
		return newFeatures;
	}

	public void setNewFeatures(List<JiraVersionReleaseNoteIssues> newFeatures) {
		this.newFeatures = newFeatures;
	}

	public JiraVersionReleaseNotes improvements(List<JiraVersionReleaseNoteIssues> improvements) {
		this.improvements = improvements;
		return this;
	}

	public List<JiraVersionReleaseNoteIssues> getImprovements() {
		return improvements;
	}

	public void setImprovements(List<JiraVersionReleaseNoteIssues> improvements) {
		this.improvements = improvements;
	}

	public JiraVersionReleaseNotes bugs(List<JiraVersionReleaseNoteIssues> bugs) {
		this.bugs = bugs;
		return this;
	}

	public List<JiraVersionReleaseNoteIssues> getBugs() {
		return bugs;
	}

	public void setBugs(List<JiraVersionReleaseNoteIssues> bugs) {
		this.bugs = bugs;
	}

	public JiraVersionReleaseNotes minorChanges(List<JiraVersionReleaseNoteIssues> minorChanges) {
		this.minorChanges = minorChanges;
		return this;
	}

	public List<JiraVersionReleaseNoteIssues> getMinorChanges() {
		return minorChanges;
	}

	public void setMinorChanges(List<JiraVersionReleaseNoteIssues> minorChanges) {
		this.minorChanges = minorChanges;
	}

	public JiraVersionReleaseNotes jql(String jql) {
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
		JiraVersionReleaseNotes jiraUser = (JiraVersionReleaseNotes) o;
		return Objects.equals(this.project, jiraUser.project) && 
				Objects.equals(this.version, jiraUser.version) && 
				Objects.equals(this.nextVersion, jiraUser.nextVersion) &&
				Objects.equals(this.releaseDate, jiraUser.releaseDate)
				&& Objects.equals(this.versionType, jiraUser.versionType)
				&& Objects.equals(this.author, jiraUser.author) && Objects.equals(this.versionHighlights, jiraUser.versionHighlights)
				&& Objects.equals(this.newFeatures, jiraUser.newFeatures) && Objects.equals(this.improvements, jiraUser.improvements)
				&& Objects.equals(this.bugs, jiraUser.bugs) && Objects.equals(this.minorChanges, jiraUser.minorChanges)
				&& Objects.equals(this.jql, jiraUser.jql);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(project, version, nextVersion, releaseDate, versionType, author, versionHighlights, 
				newFeatures, improvements, bugs, minorChanges, jql);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraVersionReleaseNotes {\n");
		sb.append("    project: ").append(toIndentedString(project)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
