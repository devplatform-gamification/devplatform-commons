package com.devplatform.model.bot.approvals;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TipoPermissaoMREnum {
	COM_PERMISSAO("com_permissao"),
	SEM_PERMISSAO_AUTOR_COMMIT("sem_permissao_autor_commit"),
	SEM_PERMISSAO_RESPONSAVEL_CODIFICACAO("sem_permissao_codificador_responsavel"),
	SEM_PERMISSAO_ALTEROU_LABEL_ERRADA("sem_permissao_alterou_label_errada"),
	SEM_PERMISSAO_MERGE_NAO_MERGEAVEL("sem_permissao_merge_nao_mergeavel"),
	SEM_PERMISSAO_NAO_EH_REVISOR("sem_permissao_nao_revisor");


	private String value;

	TipoPermissaoMREnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static TipoPermissaoMREnum fromValue(String text) {
		for (TipoPermissaoMREnum b : TipoPermissaoMREnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
