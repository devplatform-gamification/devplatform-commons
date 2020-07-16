package com.devplatform.model.gitlab.response;

import java.math.BigInteger;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabRepositoryFile   {
	@JsonProperty("file_name")
	private String fileName = null;

	@JsonProperty("file_path")
	private String filePath = null;

	@JsonProperty("size")
	private BigInteger size = null;

	@JsonProperty("encoding")
	private String encoding = null;

	@JsonProperty("content")
	private String content = null;

	@JsonProperty("content_sha256")
	private String contentSha256 = null;

	@JsonProperty("ref")
	private String ref = null;

	@JsonProperty("blob_id")
	private String blobId = null;

	@JsonProperty("commit_id")
	private String commitId = null;

	@JsonProperty("last_commit_id")
	private String lastCommitId = null;

	public GitlabRepositoryFile fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public GitlabRepositoryFile filePath(String filePath) {
		this.filePath = filePath;
		return this;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public GitlabRepositoryFile size(BigInteger size) {
		this.size = size;
		return this;
	}

	public BigInteger getSize() {
		return size;
	}

	public void setSize(BigInteger size) {
		this.size = size;
	}

	public GitlabRepositoryFile encoding(String encoding) {
		this.encoding = encoding;
		return this;
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public GitlabRepositoryFile content(String content) {
		this.content = content;
		return this;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public GitlabRepositoryFile contentSha256(String contentSha256) {
		this.contentSha256 = contentSha256;
		return this;
	}

	public String getContentSha256() {
		return contentSha256;
	}

	public void setContentSha256(String contentSha256) {
		this.contentSha256 = contentSha256;
	}

	public GitlabRepositoryFile ref(String ref) {
		this.ref = ref;
		return this;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public GitlabRepositoryFile blobId(String blobId) {
		this.blobId = blobId;
		return this;
	}

	public String getBlobId() {
		return blobId;
	}

	public void setBlobId(String blobId) {
		this.blobId = blobId;
	}

	public GitlabRepositoryFile commitId(String commitId) {
		this.commitId = commitId;
		return this;
	}

	public String getCommitId() {
		return commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}

	public GitlabRepositoryFile lastCommitId(String lastCommitId) {
		this.lastCommitId = lastCommitId;
		return this;
	}

	public String getLastCommitId() {
		return lastCommitId;
	}

	public void setLastCommitId(String lastCommitId) {
		this.lastCommitId = lastCommitId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GitlabRepositoryFile gitlabUser = (GitlabRepositoryFile) o;
		return Objects.equals(this.fileName, gitlabUser.fileName) &&
				Objects.equals(this.filePath, gitlabUser.filePath) &&
				Objects.equals(this.size, gitlabUser.size) &&
				Objects.equals(this.encoding, gitlabUser.encoding) &&
				Objects.equals(this.content, gitlabUser.content) &&
				Objects.equals(this.contentSha256, gitlabUser.contentSha256) &&
				Objects.equals(this.ref, gitlabUser.ref) &&
				Objects.equals(this.blobId, gitlabUser.blobId) &&
				Objects.equals(this.commitId, gitlabUser.commitId) &&
				Objects.equals(this.lastCommitId, gitlabUser.lastCommitId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fileName, filePath, size, encoding, content, contentSha256, ref, blobId, commitId, lastCommitId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabRepositoryFile {\n");
		sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
		sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
		sb.append("    content: ").append(toIndentedString(content)).append("\n");
		sb.append("    contentSha256: ").append(toIndentedString(contentSha256)).append("\n");
		sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
		sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
		sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
		sb.append("    lastCommitId: ").append(toIndentedString(lastCommitId)).append("\n");
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
