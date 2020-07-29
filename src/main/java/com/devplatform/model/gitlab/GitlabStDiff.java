package com.devplatform.model.gitlab;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class GitlabStDiff {
	@JsonProperty("diff")
	private String diff = null;

	@JsonProperty("new_path")
	private String newPath = null;

	@JsonProperty("old_path")
	private String oldPath = null;

	@JsonProperty("a_mode")
	private String aMode = null;

	@JsonProperty("b_mode")
	private String bMode = null;

	@JsonProperty("new_file")
	private Boolean newFile = null;

	@JsonProperty("renamed_file")
	private Boolean renamedFile = null;

	@JsonProperty("deleted_file")
	private Boolean deletedFile = null;

	public GitlabStDiff diff(String diff) {
		this.diff = diff;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getDiff() {
		return diff;
	}

	public void setDiff(String diff) {
		this.diff = diff;
	}

	public GitlabStDiff newPath(String newPath) {
		this.newPath = newPath;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getNewPath() {
		return newPath;
	}

	public void setNewPath(String newPath) {
		this.newPath = newPath;
	}

	public GitlabStDiff oldPath(String oldPath) {
		this.oldPath = oldPath;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getOldPath() {
		return oldPath;
	}

	public void setOldPath(String oldPath) {
		this.oldPath = oldPath;
	}

	public GitlabStDiff aMode(String aMode) {
		this.aMode = aMode;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getaMode() {
		return aMode;
	}

	public void setaMode(String aMode) {
		this.aMode = aMode;
	}

	public GitlabStDiff bMode(String bMode) {
		this.bMode = bMode;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getbMode() {
		return bMode;
	}

	public void setbMode(String bMode) {
		this.bMode = bMode;
	}

	public GitlabStDiff newFile(Boolean newFile) {
		this.newFile = newFile;
		return this;
	}

	@ApiModelProperty(value = "")
	public Boolean getNewFile() {
		return newFile;
	}

	public void setNewFile(Boolean newFile) {
		this.newFile = newFile;
	}

	public GitlabStDiff renamedFile(Boolean renamedFile) {
		this.renamedFile = renamedFile;
		return this;
	}

	@ApiModelProperty(value = "")
	public Boolean getRenamedFile() {
		return renamedFile;
	}

	public void setRenamedFile(Boolean renamedFile) {
		this.renamedFile = renamedFile;
	}

	public GitlabStDiff deletedFile(Boolean deletedFile) {
		this.deletedFile = deletedFile;
		return this;
	}

	@ApiModelProperty(value = "")
	public Boolean getDeletedFile() {
		return deletedFile;
	}

	public void setDeletedFile(Boolean deletedFile) {
		this.deletedFile = deletedFile;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aMode == null) ? 0 : aMode.hashCode());
		result = prime * result + ((bMode == null) ? 0 : bMode.hashCode());
		result = prime * result + ((deletedFile == null) ? 0 : deletedFile.hashCode());
		result = prime * result + ((diff == null) ? 0 : diff.hashCode());
		result = prime * result + ((newFile == null) ? 0 : newFile.hashCode());
		result = prime * result + ((newPath == null) ? 0 : newPath.hashCode());
		result = prime * result + ((oldPath == null) ? 0 : oldPath.hashCode());
		result = prime * result + ((renamedFile == null) ? 0 : renamedFile.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GitlabStDiff other = (GitlabStDiff) obj;
		if (aMode == null) {
			if (other.aMode != null)
				return false;
		} else if (!aMode.equals(other.aMode))
			return false;
		if (bMode == null) {
			if (other.bMode != null)
				return false;
		} else if (!bMode.equals(other.bMode))
			return false;
		if (deletedFile == null) {
			if (other.deletedFile != null)
				return false;
		} else if (!deletedFile.equals(other.deletedFile))
			return false;
		if (diff == null) {
			if (other.diff != null)
				return false;
		} else if (!diff.equals(other.diff))
			return false;
		if (newFile == null) {
			if (other.newFile != null)
				return false;
		} else if (!newFile.equals(other.newFile))
			return false;
		if (newPath == null) {
			if (other.newPath != null)
				return false;
		} else if (!newPath.equals(other.newPath))
			return false;
		if (oldPath == null) {
			if (other.oldPath != null)
				return false;
		} else if (!oldPath.equals(other.oldPath))
			return false;
		if (renamedFile == null) {
			if (other.renamedFile != null)
				return false;
		} else if (!renamedFile.equals(other.renamedFile))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabStDiff {\n");

		sb.append("    diff: ").append(toIndentedString(diff)).append("\n");
		sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");

		sb.append("    oldPath: ").append(toIndentedString(oldPath)).append("\n");
		sb.append("    aMode: ").append(toIndentedString(aMode)).append("\n");
		sb.append("    bMode: ").append(toIndentedString(bMode)).append("\n");
		sb.append("    newFile: ").append(toIndentedString(newFile)).append("\n");
		sb.append("    renamedFile: ").append(toIndentedString(renamedFile)).append("\n");
		sb.append("    deletedFile: ").append(toIndentedString(deletedFile)).append("\n");

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
