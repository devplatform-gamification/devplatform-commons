package com.devplatform.model.jira;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum JiraIssueOpLinkGroupEnum {
	VIEW_ISSUE_OPSBAR("view.issue.opsbar"),
	EDIT_ISSUE("edit-issue_container"),
	COMMENT_ISSUE("comment-issue_container"),
	OPSBAR_MAISACOES("opsbar-operations"),
	OBSBAR_REGISTRAR_TRABALHO("operations-work"),
	OBSBAR_QUADRO_RAPIDO("greenhopper_issue_dropdown"),
	OBSBAR_ANEXAR("operations-attachments"),
	OBSBAR_VOTO_ACOMPANHAR("operations-voteswatchers"),
	OBSBAR_SUBTAREFAS("operations-subtasks"),
	OBSBAR_OPERACOES("operations-operations"),
	OBSBAR_EXCLUIR("operations-delete"),
	OBSBAR_TRANSICOES("opsbar-transitions"),
	OBSBAR_ADMINISTRAR("opsbar-admin"),
	OBSBAR_RESTAURAR("opsbar-restore"),
	VIEW_ISSUE_EXPORTS("view.issue.exports");

	private String value;

	JiraIssueOpLinkGroupEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static JiraIssueOpLinkGroupEnum fromValue(String text) {
		for (JiraIssueOpLinkGroupEnum b : JiraIssueOpLinkGroupEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}