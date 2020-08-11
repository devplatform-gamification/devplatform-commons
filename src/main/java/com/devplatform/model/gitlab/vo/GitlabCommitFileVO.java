package com.devplatform.model.gitlab.vo;

import javax.annotation.Generated;

import org.springframework.validation.annotation.Validated;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabCommitFileVO {
	private String path = null;

	private String content = null;

	private Boolean base64 = null;

	public GitlabCommitFileVO(String path, String content, Boolean base64) {
		super();
		this.path = path;
		this.content = content;
		this.base64 = base64;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getBase64() {
		return base64;
	}

	public void setBase64(Boolean base64) {
		this.base64 = base64;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("class GitlabCommitFileVO{\n    path:     ");
		builder.append(path);
		builder.append("\n    content:     ");
		builder.append(content);
		builder.append("\n    binary:     ");
		builder.append(base64);
		builder.append("\n}");
		return builder.toString();
	}
}
