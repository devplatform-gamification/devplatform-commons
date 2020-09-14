package com.devplatform.model.bot.areasConhecimento;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.validation.annotation.Validated;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class PontuacoesAreasConhecimento {
	private Integer totalIssues = null;

	private List<ClassificacaoAreaConhecimento> classificacoesAreasConhecimento = null;

	public PontuacoesAreasConhecimento(Integer totalIssues) {
		super();
		this.totalIssues = totalIssues;
		this.classificacoesAreasConhecimento = new ArrayList<>();
	}

	public Integer getTotalIssues() {
		return totalIssues;
	}

	public void setTotalIssues(Integer totalIssues) {
		this.totalIssues = totalIssues;
	}

	public List<ClassificacaoAreaConhecimento> getClassificacoesAreasConhecimento() {
		return classificacoesAreasConhecimento;
	}

	public void setClassificacoesAreasConhecimento(List<ClassificacaoAreaConhecimento> classificacoesAreasConhecimento) {
		this.classificacoesAreasConhecimento = classificacoesAreasConhecimento;
	}
	
	public void addClassificacaoAreasConhecimento(ClassificacaoAreaConhecimento classificacaoAreasConhecimento) {
		this.classificacoesAreasConhecimento.add(classificacaoAreasConhecimento);
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PontuacoesAreasConhecimento jiraUser = (PontuacoesAreasConhecimento) o;
		return Objects.equals(this.totalIssues, jiraUser.totalIssues)
				&& Objects.equals(this.classificacoesAreasConhecimento, jiraUser.classificacoesAreasConhecimento);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(totalIssues, classificacoesAreasConhecimento);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PontuacoesAreasConhecimento {\n");
		sb.append("    totalIssues: ").append(toIndentedString(totalIssues)).append("\n");
		sb.append("    classificacoesAreasConhecimento: ").append(toIndentedString(classificacoesAreasConhecimento)).append("\n");
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
