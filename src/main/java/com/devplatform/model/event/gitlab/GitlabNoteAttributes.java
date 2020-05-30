package com.devplatform.model.event.gitlab;

import java.math.BigDecimal;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GitlabMergeRequestAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabNoteAttributes {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("author_id")
	private BigDecimal authorId = null;

	@JsonProperty("noteable_id")
	private BigDecimal noteableId = null;

	@JsonProperty("note")
	private String note = null;

	@JsonProperty("note")
	private NoteableTypeEnum noteableType = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("attachment")
	private String attachment = null;

	@JsonProperty("commit_id")
	private String commitId = null;

	@JsonProperty("created_at")
	private String createdAt = null;

	@JsonProperty("discussion_id")
	private String discussionId = null;

	@JsonProperty("line_code")
	private String lineCode = null;

	@JsonProperty("position")
	private BigDecimal position = null;

	@JsonProperty("original_position")
	private BigDecimal originalPosition = null;

	@JsonProperty("change_position")
	private BigDecimal changePosition = null;

	@JsonProperty("project_id")
	private BigDecimal projectId = null;

	@JsonProperty("resolved_at")
	private String resolvedAt = null;

	@JsonProperty("resolved_by_id")
	private BigDecimal resolvedById = null;

	@JsonProperty("resolved_by_push")
	private String resolvedByPush = null;

	@JsonProperty("updated_at")
	private String updatedAt = null;

	@JsonProperty("updated_by_id")
	private BigDecimal updatedById = null;

	@JsonProperty("system")
	private Boolean system = null;

	@JsonProperty("type")
	private String type = null;

	@JsonProperty("url")
	private String url = null;

	@JsonProperty("st_diff")
	private GitlabStDiff stDiff = null;

	public GitlabNoteAttributes id(BigDecimal id) {
		this.id = id;
		return this;
	}
	
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public GitlabNoteAttributes authorId(BigDecimal authorId) {
		this.authorId = authorId;
		return this;
	}
	
	public BigDecimal getAuthorId() {
		return authorId;
	}

	public void setAuthorId(BigDecimal authorId) {
		this.authorId = authorId;
	}

	public GitlabNoteAttributes noteableId(BigDecimal noteableId) {
		this.noteableId = noteableId;
		return this;
	}
	
	public BigDecimal getNoteableId() {
		return noteableId;
	}

	public void setNoteableId(BigDecimal noteableId) {
		this.noteableId = noteableId;
	}

	public GitlabNoteAttributes note(String note) {
		this.note = note;
		return this;
	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public GitlabNoteAttributes noteableType(NoteableTypeEnum noteableType) {
		this.noteableType = noteableType;
		return this;
	}
	
	public NoteableTypeEnum getNoteableType() {
		return noteableType;
	}

	public void setNoteableType(NoteableTypeEnum noteableType) {
		this.noteableType = noteableType;
	}

	public GitlabNoteAttributes description(String description) {
		this.description = description;
		return this;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public GitlabNoteAttributes attachment(String attachment) {
		this.attachment = attachment;
		return this;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	
	public GitlabNoteAttributes commitId(String commitId) {
		this.commitId = commitId;
		return this;
	}

	public String getCommitId() {
		return commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}
	
	public GitlabNoteAttributes createdAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public GitlabNoteAttributes discussionId(String discussionId) {
		this.discussionId = discussionId;
		return this;
	}

	public String getDiscussionId() {
		return discussionId;
	}

	public void setDiscussionId(String discussionId) {
		this.discussionId = discussionId;
	}
	
	public GitlabNoteAttributes lineCode(String lineCode) {
		this.lineCode = lineCode;
		return this;
	}

	public String getLineCode() {
		return lineCode;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
	}
	
	public GitlabNoteAttributes position(BigDecimal position) {
		this.position = position;
		return this;
	}

	public BigDecimal getPosition() {
		return position;
	}

	public void setPosition(BigDecimal position) {
		this.position = position;
	}

	public GitlabNoteAttributes originalPosition(BigDecimal originalPosition) {
		this.originalPosition = originalPosition;
		return this;
	}

	public BigDecimal getOriginalPosition() {
		return originalPosition;
	}

	public void setOriginalPosition(BigDecimal originalPosition) {
		this.originalPosition = originalPosition;
	}

	public GitlabNoteAttributes changePosition(BigDecimal changePosition) {
		this.changePosition = changePosition;
		return this;
	}

	public BigDecimal getChangePosition() {
		return changePosition;
	}

	public void setChangePosition(BigDecimal changePosition) {
		this.changePosition = changePosition;
	}

	public GitlabNoteAttributes projectId(BigDecimal projectId) {
		this.projectId = projectId;
		return this;
	}

	public BigDecimal getProjectId() {
		return projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	public GitlabNoteAttributes resolvedAt(String resolvedAt) {
		this.resolvedAt = resolvedAt;
		return this;
	}

	public String getResolvedAt() {
		return resolvedAt;
	}

	public void setResolvedAt(String resolvedAt) {
		this.resolvedAt = resolvedAt;
	}

	public GitlabNoteAttributes resolvedById(BigDecimal resolvedById) {
		this.resolvedById = resolvedById;
		return this;
	}
	
	public BigDecimal getResolvedById() {
		return resolvedById;
	}

	public void setResolvedById(BigDecimal resolvedById) {
		this.resolvedById = resolvedById;
	}

	public GitlabNoteAttributes resolvedByPush(String resolvedByPush) {
		this.resolvedByPush = resolvedByPush;
		return this;
	}
	
	public String getResolvedByPush() {
		return resolvedByPush;
	}

	public void setResolvedByPush(String resolvedByPush) {
		this.resolvedByPush = resolvedByPush;
	}

	public GitlabNoteAttributes updatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}
	
	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public GitlabNoteAttributes updatedById(BigDecimal updatedById) {
		this.updatedById = updatedById;
		return this;
	}
	
	public BigDecimal getUpdatedById() {
		return updatedById;
	}

	public void setUpdatedById(BigDecimal updatedById) {
		this.updatedById = updatedById;
	}

	public GitlabNoteAttributes system(Boolean system) {
		this.system = system;
		return this;
	}
	
	public Boolean getSystem() {
		return system;
	}

	public void setSystem(Boolean system) {
		this.system = system;
	}
	
	public GitlabNoteAttributes type(String type) {
		this.type = type;
		return this;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GitlabNoteAttributes url(String url) {
		this.url = url;
		return this;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public GitlabNoteAttributes stDiff(GitlabStDiff stDiff) {
		this.stDiff = stDiff;
		return this;
	}
	
	public GitlabStDiff getStDiff() {
		return stDiff;
	}

	public void setStDiff(GitlabStDiff stDiff) {
		this.stDiff = stDiff;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attachment == null) ? 0 : attachment.hashCode());
		result = prime * result + ((authorId == null) ? 0 : authorId.hashCode());
		result = prime * result + ((changePosition == null) ? 0 : changePosition.hashCode());
		result = prime * result + ((commitId == null) ? 0 : commitId.hashCode());
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((discussionId == null) ? 0 : discussionId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lineCode == null) ? 0 : lineCode.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((noteableId == null) ? 0 : noteableId.hashCode());
		result = prime * result + ((noteableType == null) ? 0 : noteableType.hashCode());
		result = prime * result + ((originalPosition == null) ? 0 : originalPosition.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result + ((resolvedAt == null) ? 0 : resolvedAt.hashCode());
		result = prime * result + ((resolvedById == null) ? 0 : resolvedById.hashCode());
		result = prime * result + ((resolvedByPush == null) ? 0 : resolvedByPush.hashCode());
		result = prime * result + ((stDiff == null) ? 0 : stDiff.hashCode());
		result = prime * result + ((system == null) ? 0 : system.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
		result = prime * result + ((updatedById == null) ? 0 : updatedById.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		GitlabNoteAttributes other = (GitlabNoteAttributes) obj;
		if (attachment == null) {
			if (other.attachment != null)
				return false;
		} else if (!attachment.equals(other.attachment))
			return false;
		if (authorId == null) {
			if (other.authorId != null)
				return false;
		} else if (!authorId.equals(other.authorId))
			return false;
		if (changePosition == null) {
			if (other.changePosition != null)
				return false;
		} else if (!changePosition.equals(other.changePosition))
			return false;
		if (commitId == null) {
			if (other.commitId != null)
				return false;
		} else if (!commitId.equals(other.commitId))
			return false;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (discussionId == null) {
			if (other.discussionId != null)
				return false;
		} else if (!discussionId.equals(other.discussionId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lineCode == null) {
			if (other.lineCode != null)
				return false;
		} else if (!lineCode.equals(other.lineCode))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (noteableId == null) {
			if (other.noteableId != null)
				return false;
		} else if (!noteableId.equals(other.noteableId))
			return false;
		if (noteableType != other.noteableType)
			return false;
		if (originalPosition == null) {
			if (other.originalPosition != null)
				return false;
		} else if (!originalPosition.equals(other.originalPosition))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		if (resolvedAt == null) {
			if (other.resolvedAt != null)
				return false;
		} else if (!resolvedAt.equals(other.resolvedAt))
			return false;
		if (resolvedById == null) {
			if (other.resolvedById != null)
				return false;
		} else if (!resolvedById.equals(other.resolvedById))
			return false;
		if (resolvedByPush == null) {
			if (other.resolvedByPush != null)
				return false;
		} else if (!resolvedByPush.equals(other.resolvedByPush))
			return false;
		if (stDiff == null) {
			if (other.stDiff != null)
				return false;
		} else if (!stDiff.equals(other.stDiff))
			return false;
		if (system == null) {
			if (other.system != null)
				return false;
		} else if (!system.equals(other.system))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (updatedAt == null) {
			if (other.updatedAt != null)
				return false;
		} else if (!updatedAt.equals(other.updatedAt))
			return false;
		if (updatedById == null) {
			if (other.updatedById != null)
				return false;
		} else if (!updatedById.equals(other.updatedById))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabNoteAttributes {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
		sb.append("    noteableId: ").append(toIndentedString(noteableId)).append("\n");
		sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
		sb.append("    note: ").append(toIndentedString(note)).append("\n");
		sb.append("    noteableType: ").append(toIndentedString(noteableType)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
		sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    discussionId: ").append(toIndentedString(discussionId)).append("\n");
		sb.append("    lineCode: ").append(toIndentedString(lineCode)).append("\n");
		sb.append("    position: ").append(toIndentedString(position)).append("\n");
		sb.append("    originalPosition: ").append(toIndentedString(originalPosition)).append("\n");
		sb.append("    changePosition: ").append(toIndentedString(changePosition)).append("\n");
		sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
		sb.append("    resolvedAt: ").append(toIndentedString(resolvedAt)).append("\n");
		sb.append("    resolvedById: ").append(toIndentedString(resolvedById)).append("\n");
		sb.append("    resolvedByPush: ").append(toIndentedString(resolvedByPush)).append("\n");
		sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
		sb.append("    updatedById: ").append(toIndentedString(updatedById)).append("\n");
		sb.append("    system: ").append(toIndentedString(system)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    stDiff: ").append(toIndentedString(stDiff)).append("\n");

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

	/**
	 * Gets or Sets mergeStatus
	 */
	public enum NoteableTypeEnum {

		MERGE_REQUEST("merge_request"),

		COMMIT("Commit"),

		ISSUE("Issue"),

		CODE_SNIPPET("Snippet");

		private String value;

		NoteableTypeEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static NoteableTypeEnum fromValue(String text) {
			for (NoteableTypeEnum b : NoteableTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}
}
