package com.devplatform.model.gitlab;

import java.math.BigDecimal;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabMergeRequestAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabNote {
	@JsonProperty("id")
	private BigDecimal id = null;

	@JsonProperty("type")
	private GitlabNoteTypeEnum type = null;
	
	@JsonProperty("body")
	private String body = null;

	@JsonProperty("attachment")
	private String attachment = null;

	@JsonProperty("author")
	private GitlabUser author = null;

	@JsonProperty("created_at")
	private String createdAt = null;

	@JsonProperty("updated_at")
	private String updatedAt = null;

	@JsonProperty("system")
	private Boolean system = null;

	@JsonProperty("noteable_id")
	private BigDecimal noteableId = null;

	@JsonProperty("noteable_type")
	private GitlabNoteableTypeEnum noteableType = null;
	
	@JsonProperty("resolvable")
	private Boolean resolvable = null;
	
	@JsonProperty("resolved")
	private Boolean resolved = null;
	
	@JsonProperty("resolved_by")
	private BigDecimal resolvedBy = null;
	
	@JsonProperty("confidential")
	private Boolean confidential = null;
	
	@JsonProperty("noteable_iid")
	private BigDecimal noteableIid = null;
	
	@JsonProperty("commands_changes")
	private Object commandsChanges = null;
	
	public GitlabNote id(BigDecimal id) {
		this.id = id;
		return this;
	}
	
	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public GitlabNote noteableId(BigDecimal noteableId) {
		this.noteableId = noteableId;
		return this;
	}
	
	public BigDecimal getNoteableId() {
		return noteableId;
	}

	public void setNoteableId(BigDecimal noteableId) {
		this.noteableId = noteableId;
	}

	public GitlabNote noteableType(GitlabNoteableTypeEnum noteableType) {
		this.noteableType = noteableType;
		return this;
	}
	
	public GitlabNoteableTypeEnum getNoteableType() {
		return noteableType;
	}

	public void setNoteableType(GitlabNoteableTypeEnum noteableType) {
		this.noteableType = noteableType;
	}

	public GitlabNote attachment(String attachment) {
		this.attachment = attachment;
		return this;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	
	public GitlabNote createdAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public GitlabNote updatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}
	
	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public GitlabNote system(Boolean system) {
		this.system = system;
		return this;
	}
	
	public Boolean getSystem() {
		return system;
	}

	public void setSystem(Boolean system) {
		this.system = system;
	}
	
	public GitlabNote type(GitlabNoteTypeEnum type) {
		this.type = type;
		return this;
	}
	
	public GitlabNoteTypeEnum getType() {
		return type;
	}

	public void setType(GitlabNoteTypeEnum type) {
		this.type = type;
	}


	public GitlabNote body(String body) {
		this.body = body;
		return this;
	}
	
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public GitlabNote author(GitlabUser author) {
		this.author = author;
		return this;
	}
	
	public GitlabUser getAuthor() {
		return author;
	}

	public void setAuthor(GitlabUser author) {
		this.author = author;
	}

	public GitlabNote resolvable(Boolean resolvable) {
		this.resolvable = resolvable;
		return this;
	}
	
	public Boolean getResolvable() {
		return resolvable;
	}

	public void setResolvable(Boolean resolvable) {
		this.resolvable = resolvable;
	}

	public GitlabNote resolved(Boolean resolved) {
		this.resolved = resolved;
		return this;
	}
	
	public Boolean getResolved() {
		return resolved;
	}

	public void setResolved(Boolean resolved) {
		this.resolved = resolved;
	}

	public GitlabNote resolvedBy(BigDecimal resolvedBy) {
		this.resolvedBy = resolvedBy;
		return this;
	}
	
	public BigDecimal getResolvedBy() {
		return resolvedBy;
	}

	public void setResolvedBy(BigDecimal resolvedBy) {
		this.resolvedBy = resolvedBy;
	}

	public GitlabNote confidential(Boolean confidential) {
		this.confidential = confidential;
		return this;
	}
	
	public Boolean getConfidential() {
		return confidential;
	}

	public void setConfidential(Boolean confidential) {
		this.confidential = confidential;
	}

	public GitlabNote noteableIid(BigDecimal noteableIid) {
		this.noteableIid = noteableIid;
		return this;
	}
	
	public BigDecimal getNoteableIid() {
		return noteableIid;
	}

	public void setNoteableIid(BigDecimal noteableIid) {
		this.noteableIid = noteableIid;
	}

	public GitlabNote commandsChanges(Object commandsChanges) {
		this.commandsChanges = commandsChanges;
		return this;
	}
	
	public Object getCommandsChanges() {
		return commandsChanges;
	}

	public void setCommandsChanges(Object commandsChanges) {
		this.commandsChanges = commandsChanges;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attachment == null) ? 0 : attachment.hashCode());
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((commandsChanges == null) ? 0 : commandsChanges.hashCode());
		result = prime * result + ((confidential == null) ? 0 : confidential.hashCode());
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((noteableId == null) ? 0 : noteableId.hashCode());
		result = prime * result + ((noteableIid == null) ? 0 : noteableIid.hashCode());
		result = prime * result + ((noteableType == null) ? 0 : noteableType.hashCode());
		result = prime * result + ((resolvable == null) ? 0 : resolvable.hashCode());
		result = prime * result + ((resolved == null) ? 0 : resolved.hashCode());
		result = prime * result + ((resolvedBy == null) ? 0 : resolvedBy.hashCode());
		result = prime * result + ((system == null) ? 0 : system.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
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
		GitlabNote other = (GitlabNote) obj;
		if (attachment == null) {
			if (other.attachment != null)
				return false;
		} else if (!attachment.equals(other.attachment))
			return false;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (commandsChanges == null) {
			if (other.commandsChanges != null)
				return false;
		} else if (!commandsChanges.equals(other.commandsChanges))
			return false;
		if (confidential == null) {
			if (other.confidential != null)
				return false;
		} else if (!confidential.equals(other.confidential))
			return false;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (noteableId == null) {
			if (other.noteableId != null)
				return false;
		} else if (!noteableId.equals(other.noteableId))
			return false;
		if (noteableIid == null) {
			if (other.noteableIid != null)
				return false;
		} else if (!noteableIid.equals(other.noteableIid))
			return false;
		if (noteableType != other.noteableType)
			return false;
		if (resolvable == null) {
			if (other.resolvable != null)
				return false;
		} else if (!resolvable.equals(other.resolvable))
			return false;
		if (resolved == null) {
			if (other.resolved != null)
				return false;
		} else if (!resolved.equals(other.resolved))
			return false;
		if (resolvedBy == null) {
			if (other.resolvedBy != null)
				return false;
		} else if (!resolvedBy.equals(other.resolvedBy))
			return false;
		if (system == null) {
			if (other.system != null)
				return false;
		} else if (!system.equals(other.system))
			return false;
		if (type != other.type)
			return false;
		if (updatedAt == null) {
			if (other.updatedAt != null)
				return false;
		} else if (!updatedAt.equals(other.updatedAt))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabNote {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    body: ").append(toIndentedString(body)).append("\n");
		sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
		sb.append("    author: ").append(toIndentedString(author)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
		sb.append("    system: ").append(toIndentedString(system)).append("\n");
		sb.append("    noteableId: ").append(toIndentedString(noteableId)).append("\n");
		sb.append("    noteableType: ").append(toIndentedString(noteableType)).append("\n");

		sb.append("    resolvable: ").append(toIndentedString(resolvable)).append("\n");
		sb.append("    confidential: ").append(toIndentedString(confidential)).append("\n");
		sb.append("    noteableIid: ").append(toIndentedString(noteableIid)).append("\n");
		sb.append("    commandsChanges: ").append(toIndentedString(commandsChanges)).append("\n");

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
