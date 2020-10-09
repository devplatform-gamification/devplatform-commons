package com.devplatform.model.gitlab.event;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.gitlab.GitlabBuild;
import com.devplatform.model.gitlab.GitlabCommit;
import com.devplatform.model.gitlab.GitlabMergeRequestAttributes;
import com.devplatform.model.gitlab.GitlabPipelineAttributes;
import com.devplatform.model.gitlab.GitlabProject;
import com.devplatform.model.gitlab.GitlabUser;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabMergeRequest
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabEventPipeline extends GitlabEvent {
	@JsonProperty("object_attributes")
	private GitlabPipelineAttributes objectAttributes = null;
	
	@JsonProperty("merge_request")
	private GitlabMergeRequestAttributes mergeRequest = null;
	
	@JsonProperty("user")
	private GitlabUser user = null;

	@JsonProperty("project")
	private GitlabProject project = null;

	@JsonProperty("commit")
	private GitlabCommit commit = null;

	@JsonProperty("builds")
	private List<GitlabBuild> builds = null;

	public GitlabEventPipeline objectAttributes(GitlabPipelineAttributes objectAttributes) {
		this.objectAttributes = objectAttributes;
		return this;
	}

	public GitlabPipelineAttributes getObjectAttributes() {
		return objectAttributes;
	}

	public void setObjectAttributes(GitlabPipelineAttributes objectAttributes) {
		this.objectAttributes = objectAttributes;
	}

	public GitlabEventPipeline mergeRequest(GitlabMergeRequestAttributes mergeRequest) {
		this.mergeRequest = mergeRequest;
		return this;
	}

	public GitlabMergeRequestAttributes getMergeRequest() {
		return mergeRequest;
	}

	public void setMergeRequest(GitlabMergeRequestAttributes mergeRequest) {
		this.mergeRequest = mergeRequest;
	}

	public GitlabEventPipeline user(GitlabUser user) {
		this.user = user;
		return this;
	}

	public GitlabUser getUser() {
		return user;
	}

	public void setUser(GitlabUser user) {
		this.user = user;
	}

	public GitlabEventPipeline project(GitlabProject project) {
		this.project = project;
		return this;
	}

	public GitlabProject getProject() {
		return project;
	}

	public void setProject(GitlabProject project) {
		this.project = project;
	}

	public GitlabEventPipeline commit(GitlabCommit commit) {
		this.commit = commit;
		return this;
	}

	public GitlabCommit getCommit() {
		return commit;
	}

	public void setCommit(GitlabCommit commit) {
		this.commit = commit;
	}

	public GitlabEventPipeline builds(List<GitlabBuild> builds) {
		this.builds = builds;
		return this;
	}

	public List<GitlabBuild> getBuilds() {
		return builds;
	}

	public void setBuilds(List<GitlabBuild> builds) {
		this.builds = builds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((builds == null) ? 0 : builds.hashCode());
		result = prime * result + ((commit == null) ? 0 : commit.hashCode());
		result = prime * result + ((mergeRequest == null) ? 0 : mergeRequest.hashCode());
		result = prime * result + ((objectAttributes == null) ? 0 : objectAttributes.hashCode());
		result = prime * result + ((project == null) ? 0 : project.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GitlabEventPipeline other = (GitlabEventPipeline) obj;
		if (builds == null) {
			if (other.builds != null)
				return false;
		} else if (!builds.equals(other.builds))
			return false;
		if (commit == null) {
			if (other.commit != null)
				return false;
		} else if (!commit.equals(other.commit))
			return false;
		if (mergeRequest == null) {
			if (other.mergeRequest != null)
				return false;
		} else if (!mergeRequest.equals(other.mergeRequest))
			return false;
		if (objectAttributes == null) {
			if (other.objectAttributes != null)
				return false;
		} else if (!objectAttributes.equals(other.objectAttributes))
			return false;
		if (project == null) {
			if (other.project != null)
				return false;
		} else if (!project.equals(other.project))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabEventPipeline {\n");
		sb.append("    objectKind: ").append(toIndentedString(objectKind)).append("\n");
		sb.append("    objectAttributes: ").append(toIndentedString(objectAttributes)).append("\n");
		sb.append("    mergeRequest: ").append(toIndentedString(mergeRequest)).append("\n");
		sb.append("    user: ").append(toIndentedString(user)).append("\n");
		sb.append("    project: ").append(toIndentedString(project)).append("\n");
		sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
		sb.append("    builds: ").append(toIndentedString(builds)).append("\n");
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
