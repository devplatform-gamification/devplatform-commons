package com.devplatform.model.bot.areasConhecimento;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NivelClassificacaoAreasConhecimentoEnum {
	NIVEL1("1"),
	NIVEL2("2"),
	NIVEL3("3"),
	NIVEL4("4"),
	NIVEL5("5");

	private String value;

	NivelClassificacaoAreasConhecimentoEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static NivelClassificacaoAreasConhecimentoEnum fromValue(String text) {
		for (NivelClassificacaoAreasConhecimentoEnum b : NivelClassificacaoAreasConhecimentoEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}
