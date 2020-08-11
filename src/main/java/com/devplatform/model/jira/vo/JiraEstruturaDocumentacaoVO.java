package com.devplatform.model.jira.vo;

import java.math.BigDecimal;

import org.apache.commons.lang3.StringUtils;

import com.devplatform.model.jira.JiraIssueFieldOptionWithChild;

public class JiraEstruturaDocumentacaoVO {
	private Boolean estruturaInformadaValida = false;
	private Boolean estruturaInformadaManualmente = false;
	
	private BigDecimal categoriaId;					
	private String categoriaValue;
	private String categoriaNomeParaExibicao;
	private String categoriaPathDiretorio;
	private Boolean categoriaValida = false;
	private Boolean categoriaIndicadaOutros = false;
	
	private BigDecimal subCategoriaId;
	private String subCategoriaValue;
	private String subCategoriaNomeParaExibicao;
	private String subCategoriaPathDiretorio;
	private Boolean subCategoriaValida = false;
	private Boolean subCategoriaIndicadaOutros = false;
	
	private static final String ESTRUTURA_DOCUMENTACAO_OPCAO_MANUAL = "especificar";
	
	public JiraEstruturaDocumentacaoVO(JiraIssueFieldOptionWithChild estruturaDocumetacao, String nomeParaExibicaoDocumentacao, String pathDiretorioPrincipal) {
		super();
		
		if(estruturaDocumetacao != null && estruturaDocumetacao.getValue() != null) {
			if(!estruturaDocumetacao.getValue().contains(ESTRUTURA_DOCUMENTACAO_OPCAO_MANUAL)) {
				setCategoriaId(estruturaDocumetacao.getId());
				setCategoriaValue(estruturaDocumetacao.getValue());
				setCategoriaValida(true);
			}else {
				setCategoriaIndicadaOutros(true);
				// verifica se foi especifiada a opcao manualmente realmente
				if(StringUtils.isNotBlank(pathDiretorioPrincipal) && StringUtils.isNotBlank(nomeParaExibicaoDocumentacao)) {
					setCategoriaNomeParaExibicao(nomeParaExibicaoDocumentacao);
					setCategoriaPathDiretorio(pathDiretorioPrincipal);
					setCategoriaValida(true);
					setEstruturaInformadaManualmente(true);
				}
			}
			if(!getEstruturaInformadaManualmente() && estruturaDocumetacao.getChild() != null) {
				if(!estruturaDocumetacao.getChild().getValue().contains(ESTRUTURA_DOCUMENTACAO_OPCAO_MANUAL)) {
					setSubCategoriaId(estruturaDocumetacao.getChild().getId());
					setSubCategoriaValue(estruturaDocumetacao.getChild().getValue());
					setSubCategoriaValida(true);
				}else {
					setSubCategoriaIndicadaOutros(true);
					// verifica se foi especifiada a opcao manualmente realmente
					if(StringUtils.isNotBlank(pathDiretorioPrincipal) && StringUtils.isNotBlank(nomeParaExibicaoDocumentacao)) {
						setSubCategoriaNomeParaExibicao(nomeParaExibicaoDocumentacao);
						setSubCategoriaPathDiretorio(pathDiretorioPrincipal);
						setSubCategoriaValida(true);
						setEstruturaInformadaManualmente(true);
					}
				}
			}
		}
		setEstruturaInformadaValida((getCategoriaValida() && getSubCategoriaValida()) || getEstruturaInformadaManualmente());		
	}
	
	public Boolean getEstruturaInformadaValida() {
		return estruturaInformadaValida;
	}

	public void setEstruturaInformadaValida(Boolean estruturaInformadaValida) {
		this.estruturaInformadaValida = estruturaInformadaValida;
	}

	public Boolean getEstruturaInformadaManualmente() {
		return estruturaInformadaManualmente;
	}
	public void setEstruturaInformadaManualmente(Boolean estruturaInformadaManualmente) {
		this.estruturaInformadaManualmente = estruturaInformadaManualmente;
	}
	public BigDecimal getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(BigDecimal categoriaId) {
		this.categoriaId = categoriaId;
	}
	public String getCategoriaValue() {
		return categoriaValue;
	}
	public void setCategoriaValue(String categoriaValue) {
		this.categoriaValue = categoriaValue;
	}
	public String getCategoriaNomeParaExibicao() {
		return categoriaNomeParaExibicao;
	}
	public void setCategoriaNomeParaExibicao(String categoriaNomeParaExibicao) {
		this.categoriaNomeParaExibicao = categoriaNomeParaExibicao;
	}
	public String getCategoriaPathDiretorio() {
		return categoriaPathDiretorio;
	}
	public void setCategoriaPathDiretorio(String categoriaPathDiretorio) {
		this.categoriaPathDiretorio = categoriaPathDiretorio;
	}
	
	public Boolean getCategoriaValida() {
		return categoriaValida;
	}
	public void setCategoriaValida(Boolean categoriaValida) {
		this.categoriaValida = categoriaValida;
	}
	public Boolean getCategoriaIndicadaOutros() {
		return categoriaIndicadaOutros;
	}
	public void setCategoriaIndicadaOutros(Boolean categoriaIndicadaOutros) {
		this.categoriaIndicadaOutros = categoriaIndicadaOutros;
	}
	public BigDecimal getSubCategoriaId() {
		return subCategoriaId;
	}
	public void setSubCategoriaId(BigDecimal subCategoriaId) {
		this.subCategoriaId = subCategoriaId;
	}
	public String getSubCategoriaValue() {
		return subCategoriaValue;
	}
	public void setSubCategoriaValue(String subCategoriaValue) {
		this.subCategoriaValue = subCategoriaValue;
	}
	public String getSubCategoriaNomeParaExibicao() {
		return subCategoriaNomeParaExibicao;
	}
	public void setSubCategoriaNomeParaExibicao(String subCategoriaNomeParaExibicao) {
		this.subCategoriaNomeParaExibicao = subCategoriaNomeParaExibicao;
	}
	public String getSubCategoriaPathDiretorio() {
		return subCategoriaPathDiretorio;
	}
	public void setSubCategoriaPathDiretorio(String subCategoriaPathDiretorio) {
		this.subCategoriaPathDiretorio = subCategoriaPathDiretorio;
	}
	public Boolean getSubCategoriaValida() {
		return subCategoriaValida;
	}
	public void setSubCategoriaValida(Boolean subCategoriaValida) {
		this.subCategoriaValida = subCategoriaValida;
	}

	public Boolean getSubCategoriaIndicadaOutros() {
		return subCategoriaIndicadaOutros;
	}
	public void setSubCategoriaIndicadaOutros(Boolean subCategoriaIndicadaOutros) {
		this.subCategoriaIndicadaOutros = subCategoriaIndicadaOutros;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("class JiraEstruturaDocumentacaoBean{\n    estruturaInformadaValida:     ");
		builder.append(estruturaInformadaValida);
		builder.append("\n    estruturaInformadaManualmente:     ");
		builder.append(estruturaInformadaManualmente);
		builder.append("\n    categoriaId:     ");
		builder.append(categoriaId);
		builder.append("\n    categoriaValue:     ");
		builder.append(categoriaValue);
		builder.append("\n    categoriaNomeParaExibicao:     ");
		builder.append(categoriaNomeParaExibicao);
		builder.append("\n    categoriaPathDiretorio:     ");
		builder.append(categoriaPathDiretorio);
		builder.append("\n    categoriaValida:     ");
		builder.append(categoriaValida);
		builder.append("\n    categoriaIndicadaOutros:     ");
		builder.append(categoriaIndicadaOutros);
		builder.append("\n    subCategoriaId:     ");
		builder.append(subCategoriaId);
		builder.append("\n    subCategoriaValue:     ");
		builder.append(subCategoriaValue);
		builder.append("\n    subCategoriaNomeParaExibicao:     ");
		builder.append(subCategoriaNomeParaExibicao);
		builder.append("\n    subCategoriaPathDiretorio:     ");
		builder.append(subCategoriaPathDiretorio);
		builder.append("\n    subCategoriaValida:     ");
		builder.append(subCategoriaValida);
		builder.append("\n    subCategoriaIndicadaOutros:     ");
		builder.append(subCategoriaIndicadaOutros);
		builder.append("\n}");
		return builder.toString();
	}
}
