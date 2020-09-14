package com.devplatform.model.bot.areasConhecimento;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class ClassificacaoAreaConhecimento {
	private String nome = null;

	private Integer totalIssues = null;

	private Double percentual = null;
	
	private Integer ordem = null;

	private NivelClassificacaoAreasConhecimentoEnum nivel = null;
	
	public ClassificacaoAreaConhecimento(String nome, Integer totalIssues, Double percentual) {
		super();
		this.nome = nome;
		this.totalIssues = totalIssues;
		this.percentual = percentual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTotalIssues() {
		return totalIssues;
	}

	public void setTotalIssues(Integer totalIssues) {
		this.totalIssues = totalIssues;
	}

	public Double getPercentual() {
		return percentual;
	}

	public void setPercentual(Double percentual) {
		this.percentual = percentual;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public NivelClassificacaoAreasConhecimentoEnum getNivel() {
		return nivel;
	}

	public void setNivel(NivelClassificacaoAreasConhecimentoEnum nivel) {
		this.nivel = nivel;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ClassificacaoAreaConhecimento jiraUser = (ClassificacaoAreaConhecimento) o;
		return Objects.equals(this.nome, jiraUser.nome) && 
				Objects.equals(this.totalIssues, jiraUser.totalIssues) &&
				Objects.equals(this.percentual, jiraUser.percentual) &&
				Objects.equals(this.ordem, jiraUser.ordem) &&
				Objects.equals(this.nivel, jiraUser.nivel);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, totalIssues, percentual, ordem, nivel);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ClassificacaoAreaConhecimento {\n");
		sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
		sb.append("    totalIssues: ").append(toIndentedString(totalIssues)).append("\n");
		sb.append("    percentual: ").append(toIndentedString(percentual)).append("\n");
		sb.append("    ordem: ").append(toIndentedString(ordem)).append("\n");
		sb.append("    nivel: ").append(toIndentedString(nivel)).append("\n");
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
