package com.devplatform.model.gitlab.response;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabRepositoryTree   {
	  @JsonProperty("id")
	  private String id = null;

	  @JsonProperty("name")
	  private String name = null;

	  @JsonProperty("type")
	  private String type = null;

	  @JsonProperty("path")
	  private String path = null;

	  @JsonProperty("mode")
	  private String mode = null;

	  public GitlabRepositoryTree id(String id) {
		  this.id = id;
		  return this;
	  }

	  /**
	   * Get id
	   * @return id
	  **/
	  @ApiModelProperty(value = "")
	  public String getId() {
		  return id;
	  }
	  public void setId(String id) {
		  this.id = id;
	  }
	
	  public GitlabRepositoryTree name(String name) {
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

	  public GitlabRepositoryTree type(String type) {
		  this.type = type;
		  return this;
	  }

	  /**
	   * Get type
	   * @return type
	  **/
	  @ApiModelProperty(value = "")
	  public String getType() {
		  return type;
	  }

	  public void setType(String type) {
		  this.type = type;
	  }

	  public GitlabRepositoryTree path(String path) {
		  this.path = path;
		  return this;
	  }

	  /**
	   * Get type
	   * @return type
	  **/
	  @ApiModelProperty(value = "")
	  public String getPath() {
		  return path;
	  }

	  public void setPath(String path) {
		  this.path = path;
	  }

	  public GitlabRepositoryTree mode(String mode) {
		  this.mode = mode;
		  return this;
	  }

	  /**
	   * Get mode
	   * @return mode
	  **/
	  @ApiModelProperty(value = "")
	  public String getMode() {
		  return mode;
	  }

	  public void setMode(String mode) {
		  this.mode = mode;
	  }

	  @Override
	  public boolean equals(java.lang.Object o) {
		  if (this == o) {
			  return true;
		  }
		  if (o == null || getClass() != o.getClass()) {
			  return false;
		  }
		  GitlabRepositoryTree gitlabUser = (GitlabRepositoryTree) o;
		  return Objects.equals(this.name, gitlabUser.name) &&
				  Objects.equals(this.id, gitlabUser.id) &&
				  Objects.equals(this.type, gitlabUser.type) &&
				  Objects.equals(this.path, gitlabUser.path) &&
				  Objects.equals(this.mode, gitlabUser.mode);
	  }

	  @Override
	  public int hashCode() {
		  return Objects.hash(id, name, type, path, mode);
	  }

	  @Override
	  public String toString() {
		  StringBuilder sb = new StringBuilder();
		  sb.append("class GitlabRepositoryTree {\n");

		  sb.append("    id: ").append(toIndentedString(id)).append("\n");
		  sb.append("    name: ").append(toIndentedString(name)).append("\n");
		  sb.append("    type: ").append(toIndentedString(type)).append("\n");
		  sb.append("    path: ").append(toIndentedString(path)).append("\n");
		  sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
