package com.devplatform.model.gitlab;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabRepository
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabRepository {
	@JsonProperty("name")
	private String name = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("homepage")
	private String homepage = null;

	@JsonProperty("git_http_url")
	private String gitHttpUrl = null;

	@JsonProperty("git_ssh_url")
	private String gitSshUrl = null;

	@JsonProperty("visibility_level")
	private Integer visibilityLevel = null;

	public GitlabRepository name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "")

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GitlabRepository url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get url
	 * 
	 * @return url
	 **/
	@ApiModelProperty(value = "")

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public GitlabRepository description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public GitlabRepository homepage(String homepage) {
		this.homepage = homepage;
		return this;
	}

	/**
	 * Get homepage
	 * 
	 * @return homepage
	 **/
	@ApiModelProperty(value = "")

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public GitlabRepository gitHttpUrl(String gitHttpUrl) {
		this.gitHttpUrl = gitHttpUrl;
		return this;
	}

	public String getGitHttpUrl() {
		return gitHttpUrl;
	}

	public void setGitHttpUrl(String gitHttpUrl) {
		this.gitHttpUrl = gitHttpUrl;
	}

	public GitlabRepository gitSshUrl(String gitSshUrl) {
		this.gitSshUrl = gitSshUrl;
		return this;
	}

	public String getGitSshUrl() {
		return gitSshUrl;
	}

	public void setGitSshUrl(String gitSshUrl) {
		this.gitSshUrl = gitSshUrl;
	}

	public GitlabRepository visibilityLevel(Integer visibilityLevel) {
		this.visibilityLevel = visibilityLevel;
		return this;
	}

	public Integer getVisibilityLevel() {
		return visibilityLevel;
	}

	public void setVisibilityLevel(Integer visibilityLevel) {
		this.visibilityLevel = visibilityLevel;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabRepository GitlabRepository = (GitlabRepository) o;
		return Objects.equals(this.name, GitlabRepository.name) && Objects.equals(this.url, GitlabRepository.url)
				&& Objects.equals(this.description, GitlabRepository.description)
				&& Objects.equals(this.homepage, GitlabRepository.homepage)
				&& Objects.equals(this.gitHttpUrl, GitlabRepository.gitHttpUrl)
				&& Objects.equals(this.gitSshUrl, GitlabRepository.gitSshUrl)
				&& Objects.equals(this.visibilityLevel, GitlabRepository.visibilityLevel);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, url, description, homepage);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabRepository {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
		sb.append("    gitHttpUrl: ").append(toIndentedString(gitHttpUrl)).append("\n");
		sb.append("    gitSshUrl: ").append(toIndentedString(gitSshUrl)).append("\n");
		sb.append("    visibilityLevel: ").append(toIndentedString(visibilityLevel)).append("\n");
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
