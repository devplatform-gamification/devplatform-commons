package com.devplatform.model.gitlab;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GitlabMergeRequestAttributes
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabDiscussion {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("individual_note")
	private Boolean individualNote = null;

	@JsonProperty("notes")
	private List<GitlabNote> notes = null;

	public GitlabDiscussion id(String id) {
		this.id = id;
		return this;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GitlabDiscussion individualNote(Boolean individualNote) {
		this.individualNote = individualNote;
		return this;
	}
	
	public Boolean getIndividualNote() {
		return individualNote;
	}

	public void setIndividualNote(Boolean individualNote) {
		this.individualNote = individualNote;
	}

	public GitlabDiscussion notes(List<GitlabNote> notes) {
		this.notes = notes;
		return this;
	}
	
	public List<GitlabNote> getNotes() {
		return notes;
	}

	public void setNotes(List<GitlabNote> notes) {
		this.notes = notes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((individualNote == null) ? 0 : individualNote.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
		GitlabDiscussion other = (GitlabDiscussion) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (individualNote == null) {
			if (other.individualNote != null)
				return false;
		} else if (!individualNote.equals(other.individualNote))
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabNoteAttributes {\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    individualNote: ").append(toIndentedString(individualNote)).append("\n");
		sb.append("    notes: ").append(toIndentedString(notes)).append("\n");

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
