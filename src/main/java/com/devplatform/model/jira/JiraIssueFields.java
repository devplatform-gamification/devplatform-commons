package com.devplatform.model.jira;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.jira.request.JiraIssueLinkRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraIssueFields
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraIssueFields {
	@JsonProperty("project")
	private JiraProject project = null;

	@JsonProperty("issuetype")
	private JiraIssuetype issuetype = null;

	@JsonProperty("environment")
	private String environment = null;

	@JsonProperty("customfield_11205")
	private JiraIssueFieldOptionWithChild funcionalidade = null;

	@JsonProperty("customfield_11302")
	@Valid
	private List<JiraIssueFieldOption> perfil = null;

	@JsonProperty("creator")
	private JiraUser creator = null;

	@JsonProperty("reporter")
	private JiraUser reporter = null;

	@JsonProperty("created")
	private String created = null;

	@JsonProperty("summary")
	private String summary = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("attachment")
	@Valid
	private List<JiraIssueAttachment> attachment = null;

	@JsonProperty("versions")
	@Valid
	private List<JiraVersion> versions = null;

	@JsonProperty("labels")
	@Valid
	private List<String> labels = null;

	@JsonProperty("customfield_11200")
	private String sistema = null;

	@JsonProperty("customfield_13004")
	private JiraIssueFieldOption servico = null;

	@JsonProperty("customfield_13601")
	private String parentLink = null;

	@JsonProperty("subtasks")
	@Valid
	private List<JiraIssue> subtasks = null;

	@JsonProperty("customfield_13700")
	@Valid
	private List<String> informacoesPendentes = null;

	@JsonProperty("priority")
	private JiraIssueFieldsPriority priority = null;

	@JsonProperty("customfield_10204")
	private Integer businessValue = null;

	@JsonProperty("customfield_13921")
	@Valid
	private List<JiraIssueFieldOption> areasConhecimento = null;

	@JsonProperty("customfield_10201")
	@Valid
	private List<String> epicTheme = null;

	@JsonProperty("customfield_11503")
	private JiraIssueFieldOption potencialDiminuicaoIssues = null;

	@JsonProperty("customfield_11502")
	private JiraIssueFieldOption complexidade = null;

	@JsonProperty("issuelinks")
	@Valid
	private List<JiraIssueLinkRequest> issuelinks = null;

	@JsonProperty("customfield_11700")
	@Valid
	private List<JiraIssueFieldOption> tribunalRequisitante = null;

	@JsonProperty("votes")
	private JiraIssueFieldsVotes votes = null;

	@JsonProperty("watches")
	private JiraIssueFieldsWatches watches = null;

	@JsonProperty("assignee")
	private JiraUser assignee = null;

	@JsonProperty("status")
	private JiraStatus status = null;

	@JsonProperty("updated")
	private String updated = null;

	@JsonProperty("customfield_11900")
	private JiraIssueFieldOption fabricaDesenvolvimento = null;

	@JsonProperty("customfield_11401")
	private JiraIssueFieldOption sprintGrupo = null;

	@JsonProperty("customfield_12303")
	private JiraUser responsavelCodificacao = null;

	@JsonProperty("customfield_13500")
	private Object desenvolvimento = null;

	@JsonProperty("customfield_13605")
	private Object gitBranch = null;

	@JsonProperty("customfield_13606")
	private Object gitCommitsReferenced = null;
	
	@JsonProperty("customfield_13006")
	private String imagemDocker = null;

	@JsonProperty("customfield_13005")
	private String branchsRelacionados = null;

	@JsonProperty("customfield_12509")
	private String mrAbertos = null;

	@JsonProperty("customfield_12505")
	private String mrAceitos = null;

	@JsonProperty("timeestimate")
	private BigDecimal timeestimate = null;

	@JsonProperty("timespent")
	private BigDecimal timespent = null;

	@JsonProperty("duedate")
	private String duedate = null;

	@JsonProperty("customfield_11901")
	private JiraIssueFieldOption fabricaTeste = null;

	@JsonProperty("customfield_12000")
	private JiraUser responsavelTeste = null;

	@JsonProperty("customfield_13834")
	private Integer aprovacoesNecessarias = null;

	@JsonProperty("customfield_13835")
	private Integer aprovacoesRealizadas = null;

	@JsonProperty("customfield_13836")
	private String aprovadoPor = null;

	@JsonProperty("resolution")
	private JiraIssueFieldsResolution resolution = null;

	@JsonProperty("resolutiondate")
	private String resolutiondate = null;

	@JsonProperty("customfield_13837")
	private String notasRelease = null;

	@JsonProperty("fixVersions")
	@Valid
	private List<JiraVersion> fixVersions = null;

	@JsonProperty("customfield_13909")
	private String destaquesReleaseNotes = null;

	@JsonProperty("customfield_13908")
	private String msgLancamentoGenerico = null;

	@JsonProperty("customfield_13916")
	private String msgLancamentoTelegram = null;

	@JsonProperty("customfield_12800")
	private JiraIssueFieldSimple grupoAtribuicao = null;

	/* início - lancamento de versao */
	@JsonProperty("customfield_13906")
	private JiraIssueFieldOption tipoVersao = null;

	@JsonProperty("customfield_13913")
	private String versaoSeraLancada = null;
	
	@JsonProperty("customfield_14002")
	private List<JiraIssueFieldOption> gerarVersaoAutomaticamente = null;

	@JsonProperty("customfield_13917")
	private String proximaVersao = null;
	
	@JsonProperty("customfield_13912")
	private String dtGeracaoCodigoFonte = null;

	@JsonProperty("customfield_13805")
	private String tagCodigoFonte = null;
	
	@JsonProperty("customfield_13903")
	private JiraUser responsavelExecucao = null;
	
	/* fim - lancamento versao */
	/* inicio - documentacao */
	@JsonProperty("customfield_14004")
	private JiraIssueFieldOptionWithChild estruturaDocumentacao = null;

	@JsonProperty("customfield_14006")
	private String nomeParaExibicaoDocumentacao = null;

	@JsonProperty("customfield_14005")
	private String pathDiretorioPrincipal = null;

	@JsonProperty("customfield_13910")
	private String dtDisponibilizacaoDocumentacao = null;

	@JsonProperty("customfield_13911")
	private String urlPublicacaoDocumentacao = null;

	@JsonProperty("customfield_14008")
	private String dtDisponibilizacaoHomologacaoDocumentacao = null;

	@JsonProperty("customfield_14007")
	private String urlHomologacaoDocumentacao = null;

	@JsonProperty("customfield_14009")
	private List<JiraIssueFieldOption> publicarDocumentacaoAutomaticamente = null;
	/* fim documentacao */
	
	@JsonProperty("comment")
	private JiraIssueFieldsComment comment = null;

	public JiraIssueFields project(JiraProject project) {
		this.project = project;
		return this;
	}

	/**
	 * Get project
	 * 
	 * @return project
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public JiraProject getProject() {
		return project;
	}

	public void setProject(JiraProject project) {
		this.project = project;
	}

	public JiraIssueFields issuetype(JiraIssuetype issuetype) {
		this.issuetype = issuetype;
		return this;
	}

	/**
	 * Get issuetype
	 * 
	 * @return issuetype
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public JiraIssuetype getIssuetype() {
		return issuetype;
	}

	public void setIssuetype(JiraIssuetype issuetype) {
		this.issuetype = issuetype;
	}

	public JiraIssueFields environment(String environment) {
		this.environment = environment;
		return this;
	}

	/**
	 * Ambiente
	 * 
	 * @return environment
	 **/
	@ApiModelProperty(value = "Ambiente")

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public JiraIssueFields funcionalidade(JiraIssueFieldOptionWithChild funcionalidade) {
		this.funcionalidade = funcionalidade;
		return this;
	}

	/**
	 * Get funcionalidade
	 * 
	 * @return funcionalidade
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraIssueFieldOptionWithChild getFuncionalidade() {
		return funcionalidade;
	}

	public void setFuncionalidade(JiraIssueFieldOptionWithChild funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	public JiraIssueFields perfil(List<JiraIssueFieldOption> perfil) {
		this.perfil = perfil;
		return this;
	}

	public JiraIssueFields addPerfilItem(JiraIssueFieldOption perfilItem) {
		if (this.perfil == null) {
			this.perfil = new ArrayList<JiraIssueFieldOption>();
		}
		this.perfil.add(perfilItem);
		return this;
	}

	/**
	 * Perfil
	 * 
	 * @return perfil
	 **/
	@ApiModelProperty(value = "Perfil")

	public List<JiraIssueFieldOption> getPerfil() {
		return perfil;
	}

	public void setPerfil(List<JiraIssueFieldOption> perfil) {
		this.perfil = perfil;
	}

	public JiraIssueFields creator(JiraUser creator) {
		this.creator = creator;
		return this;
	}

	/**
	 * Get creator
	 * 
	 * @return creator
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraUser getCreator() {
		return creator;
	}

	public void setCreator(JiraUser creator) {
		this.creator = creator;
	}

	public JiraIssueFields reporter(JiraUser reporter) {
		this.reporter = reporter;
		return this;
	}

	/**
	 * Get reporter
	 * 
	 * @return reporter
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public JiraUser getReporter() {
		return reporter;
	}

	public void setReporter(JiraUser reporter) {
		this.reporter = reporter;
	}

	public JiraIssueFields created(String created) {
		this.created = created;
		return this;
	}

	/**
	 * Criado em
	 * 
	 * @return created
	 **/
	@ApiModelProperty(value = "Criado em")

	@Valid
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public JiraIssueFields summary(String summary) {
		this.summary = summary;
		return this;
	}

	/**
	 * Resumo
	 * 
	 * @return summary
	 **/
	@ApiModelProperty(required = true, value = "Resumo")
	@NotNull

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public JiraIssueFields description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public JiraIssueFields attachment(List<JiraIssueAttachment> attachment) {
		this.attachment = attachment;
		return this;
	}

	public JiraIssueFields addAttachmentItem(JiraIssueAttachment attachmentItem) {
		if (this.attachment == null) {
			this.attachment = new ArrayList<JiraIssueAttachment>();
		}
		this.attachment.add(attachmentItem);
		return this;
	}

	/**
	 * Anexos
	 * 
	 * @return attachment
	 **/
	@ApiModelProperty(value = "Anexos")

	public List<JiraIssueAttachment> getAttachment() {
		return attachment;
	}

	public void setAttachment(List<JiraIssueAttachment> attachment) {
		this.attachment = attachment;
	}

	public JiraIssueFields versions(List<JiraVersion> versions) {
		this.versions = versions;
		return this;
	}

	public JiraIssueFields addVersionsItem(JiraVersion versionsItem) {
		if (this.versions == null) {
			this.versions = new ArrayList<JiraVersion>();
		}
		this.versions.add(versionsItem);
		return this;
	}

	/**
	 * Versões Afetadas
	 * 
	 * @return versions
	 **/
	@ApiModelProperty(value = "Versões Afetadas")
	@Valid
	public List<JiraVersion> getVersions() {
		return versions;
	}

	public void setVersions(List<JiraVersion> versions) {
		this.versions = versions;
	}

	public JiraIssueFields labels(List<String> labels) {
		this.labels = labels;
		return this;
	}

	public JiraIssueFields addLabelsItem(String labelsItem) {
		if (this.labels == null) {
			this.labels = new ArrayList<String>();
		}
		this.labels.add(labelsItem);
		return this;
	}

	/**
	 * Get labels
	 * 
	 * @return labels
	 **/
	@ApiModelProperty(value = "")

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public JiraIssueFields sistema(String sistema) {
		this.sistema = sistema;
		return this;
	}

	/**
	 * sistema
	 * 
	 * @return sistema
	 **/
	@ApiModelProperty(value = "sistema")

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public JiraIssueFields servico(JiraIssueFieldOption servico) {
		this.servico = servico;
		return this;
	}

	/**
	 * Get servico
	 * 
	 * @return servico
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraIssueFieldOption getServico() {
		return servico;
	}

	public void setServico(JiraIssueFieldOption servico) {
		this.servico = servico;
	}

	public JiraIssueFields parentLink(String parentLink) {
		this.parentLink = parentLink;
		return this;
	}

	/**
	 * Parent link
	 * 
	 * @return parentLink
	 **/
	@ApiModelProperty(value = "Parent link")

	public String getParentLink() {
		return parentLink;
	}

	public void setParentLink(String parentLink) {
		this.parentLink = parentLink;
	}

	public JiraIssueFields subtasks(List<JiraIssue> subtasks) {
		this.subtasks = subtasks;
		return this;
	}

	public JiraIssueFields addSubtasksItem(JiraIssue subtasksItem) {
		if (this.subtasks == null) {
			this.subtasks = new ArrayList<JiraIssue>();
		}
		this.subtasks.add(subtasksItem);
		return this;
	}

	/**
	 * Get subtasks
	 * 
	 * @return subtasks
	 **/
	@ApiModelProperty(value = "")
	@Valid
	public List<JiraIssue> getSubtasks() {
		return subtasks;
	}

	public void setSubtasks(List<JiraIssue> subtasks) {
		this.subtasks = subtasks;
	}

	public JiraIssueFields informacoesPendentes(List<String> informacoesPendentes) {
		this.informacoesPendentes = informacoesPendentes;
		return this;
	}

	public JiraIssueFields addInformacoesPendentesItem(String informacoesPendentesItem) {
		if (this.informacoesPendentes == null) {
			this.informacoesPendentes = new ArrayList<String>();
		}
		this.informacoesPendentes.add(informacoesPendentesItem);
		return this;
	}

	/**
	 * Informações da demanda pendentes
	 * 
	 * @return informacoesPendentes
	 **/
	@ApiModelProperty(value = "Informações da demanda pendentes")

	public List<String> getInformacoesPendentes() {
		return informacoesPendentes;
	}

	public void setInformacoesPendentes(List<String> informacoesPendentes) {
		this.informacoesPendentes = informacoesPendentes;
	}

	public JiraIssueFields priority(JiraIssueFieldsPriority priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get priority
	 * 
	 * @return priority
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraIssueFieldsPriority getPriority() {
		return priority;
	}

	public void setPriority(JiraIssueFieldsPriority priority) {
		this.priority = priority;
	}

	public JiraIssueFields businessValue(Integer businessValue) {
		this.businessValue = businessValue;
		return this;
	}

	/**
	 * Business value
	 * 
	 * @return businessValue
	 **/
	@ApiModelProperty(value = "Business value")

	public Integer getBusinessValue() {
		return businessValue;
	}

	public void setBusinessValue(Integer businessValue) {
		this.businessValue = businessValue;
	}

	public JiraIssueFields areasConhecimento(List<JiraIssueFieldOption> areasConhecimento) {
		this.areasConhecimento = areasConhecimento;
		return this;
	}

	@ApiModelProperty(value = "Áreas de conhecimento")
	public List<JiraIssueFieldOption>  getAreasConhecimento() {
		return areasConhecimento;
	}

	public void setAreasConhecimento(List<JiraIssueFieldOption>  areasConhecimento) {
		this.areasConhecimento = areasConhecimento;
	}

	public JiraIssueFields epicTheme(List<String> epicTheme) {
		this.epicTheme = epicTheme;
		return this;
	}

	public JiraIssueFields addEpicThemeItem(String epicThemeItem) {
		if (this.epicTheme == null) {
			this.epicTheme = new ArrayList<String>();
		}
		this.epicTheme.add(epicThemeItem);
		return this;
	}

	/**
	 * Epic/Theme
	 * 
	 * @return epicTheme
	 **/
	@ApiModelProperty(value = "Epic/Theme")
	public List<String> getEpicTheme() {
		return epicTheme;
	}

	public void setEpicTheme(List<String> epicTheme) {
		this.epicTheme = epicTheme;
	}

	public JiraIssueFields potencialDiminuicaoIssues(JiraIssueFieldOption potencialDiminuicaoIssues) {
		this.potencialDiminuicaoIssues = potencialDiminuicaoIssues;
		return this;
	}

	/**
	 * Get potencialDiminuicaoIssues
	 * 
	 * @return potencialDiminuicaoIssues
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraIssueFieldOption getPotencialDiminuicaoIssues() {
		return potencialDiminuicaoIssues;
	}

	public void setPotencialDiminuicaoIssues(JiraIssueFieldOption potencialDiminuicaoIssues) {
		this.potencialDiminuicaoIssues = potencialDiminuicaoIssues;
	}

	public JiraIssueFields complexidade(JiraIssueFieldOption complexidade) {
		this.complexidade = complexidade;
		return this;
	}

	/**
	 * Get complexidade
	 * 
	 * @return complexidade
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraIssueFieldOption getComplexidade() {
		return complexidade;
	}

	public void setComplexidade(JiraIssueFieldOption complexidade) {
		this.complexidade = complexidade;
	}

	public JiraIssueFields issuelinks(List<JiraIssueLinkRequest> issuelinks) {
		this.issuelinks = issuelinks;
		return this;
	}

	public JiraIssueFields addIssuelinksItem(JiraIssueLinkRequest issuelinksItem) {
		if (this.issuelinks == null) {
			this.issuelinks = new ArrayList<JiraIssueLinkRequest>();
		}
		this.issuelinks.add(issuelinksItem);
		return this;
	}

	/**
	 * Pendências Linkadas
	 * 
	 * @return issuelinks
	 **/
	@ApiModelProperty(value = "Pendências Linkadas")

	public List<JiraIssueLinkRequest> getIssuelinks() {
		return issuelinks;
	}

	public void setIssuelinks(List<JiraIssueLinkRequest> issuelinks) {
		this.issuelinks = issuelinks;
	}

	public JiraIssueFields tribunalRequisitante(List<JiraIssueFieldOption> tribunalRequisitante) {
		this.tribunalRequisitante = tribunalRequisitante;
		return this;
	}

	public JiraIssueFields addTribunalRequisitanteItem(JiraIssueFieldOption tribunalRequisitanteItem) {
		if (this.tribunalRequisitante == null) {
			this.tribunalRequisitante = new ArrayList<JiraIssueFieldOption>();
		}
		this.tribunalRequisitante.add(tribunalRequisitanteItem);
		return this;
	}

	/**
	 * Tribunal requisitante
	 * 
	 * @return tribunalRequisitante
	 **/
	@ApiModelProperty(value = "Tribunal requisitante")

	public List<JiraIssueFieldOption> getTribunalRequisitante() {
		return tribunalRequisitante;
	}

	public void setTribunalRequisitante(List<JiraIssueFieldOption> tribunalRequisitante) {
		this.tribunalRequisitante = tribunalRequisitante;
	}

	public JiraIssueFields votes(JiraIssueFieldsVotes votes) {
		this.votes = votes;
		return this;
	}

	/**
	 * Get votes
	 * 
	 * @return votes
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraIssueFieldsVotes getVotes() {
		return votes;
	}

	public void setVotes(JiraIssueFieldsVotes votes) {
		this.votes = votes;
	}

	public JiraIssueFields watches(JiraIssueFieldsWatches watches) {
		this.watches = watches;
		return this;
	}

	/**
	 * Get watches
	 * 
	 * @return watches
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraIssueFieldsWatches getWatches() {
		return watches;
	}

	public void setWatches(JiraIssueFieldsWatches watches) {
		this.watches = watches;
	}

	public JiraIssueFields assignee(JiraUser assignee) {
		this.assignee = assignee;
		return this;
	}

	/**
	 * Get assignee
	 * 
	 * @return assignee
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraUser getAssignee() {
		return assignee;
	}

	public void setAssignee(JiraUser assignee) {
		this.assignee = assignee;
	}

	public JiraIssueFields status(JiraStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraStatus getStatus() {
		return status;
	}

	public void setStatus(JiraStatus status) {
		this.status = status;
	}

	public JiraIssueFields updated(String updated) {
		this.updated = updated;
		return this;
	}

	/**
	 * Atualizado em
	 * 
	 * @return updated
	 **/
	@ApiModelProperty(value = "Atualizado em")

	@Valid
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public JiraIssueFields fabricaDesenvolvimento(JiraIssueFieldOption fabricaDesenvolvimento) {
		this.fabricaDesenvolvimento = fabricaDesenvolvimento;
		return this;
	}

	/**
	 * Get fabricaDesenvolvimento
	 * 
	 * @return fabricaDesenvolvimento
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraIssueFieldOption getFabricaDesenvolvimento() {
		return fabricaDesenvolvimento;
	}

	public void setFabricaDesenvolvimento(JiraIssueFieldOption fabricaDesenvolvimento) {
		this.fabricaDesenvolvimento = fabricaDesenvolvimento;
	}

	public JiraIssueFields sprintGrupo(JiraIssueFieldOption sprintGrupo) {
		this.sprintGrupo = sprintGrupo;
		return this;
	}

	/**
	 * Get sprintGrupo
	 * 
	 * @return sprintGrupo
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraIssueFieldOption getSprintGrupo() {
		return sprintGrupo;
	}

	public void setSprintGrupo(JiraIssueFieldOption sprintGrupo) {
		this.sprintGrupo = sprintGrupo;
	}

	public JiraIssueFields responsavelCodificacao(JiraUser responsavelCodificacao) {
		this.responsavelCodificacao = responsavelCodificacao;
		return this;
	}

	/**
	 * Get responsavelCodificacao
	 * 
	 * @return responsavelCodificacao
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraUser getResponsavelCodificacao() {
		return responsavelCodificacao;
	}

	public void setResponsavelCodificacao(JiraUser responsavelCodificacao) {
		this.responsavelCodificacao = responsavelCodificacao;
	}

	public JiraIssueFields desenvolvimento(Object desenvolvimento) {
		this.desenvolvimento = desenvolvimento;
		return this;
	}

	/**
	 * Desenvolvimento
	 * 
	 * @return desenvolvimento
	 **/
	@ApiModelProperty(value = "Desenvolvimento")

	public Object getDesenvolvimento() {
		return desenvolvimento;
	}

	public void setDesenvolvimento(Object desenvolvimento) {
		this.desenvolvimento = desenvolvimento;
	}
	
	public JiraIssueFields gerarVersaoAutomaticamente(List<JiraIssueFieldOption> gerarVersaoAutomaticamente) {
		this.gerarVersaoAutomaticamente = gerarVersaoAutomaticamente;
		return this;
	}

	public JiraIssueFields addGerarVersaoAutomaticamenteItem(JiraIssueFieldOption gerarVersaoAutomaticamenteItem) {
		if (this.gerarVersaoAutomaticamente == null) {
			this.gerarVersaoAutomaticamente = new ArrayList<JiraIssueFieldOption>();
		}
		this.gerarVersaoAutomaticamente.add(gerarVersaoAutomaticamenteItem);
		return this;
	}

	@ApiModelProperty(value = "Gerar Versao Automaticamente")
	public List<JiraIssueFieldOption> getGerarVersaoAutomaticamente() {
		return gerarVersaoAutomaticamente;
	}

	public void setGerarVersaoAutomaticamente(List<JiraIssueFieldOption> gerarVersaoAutomaticamente) {
		this.gerarVersaoAutomaticamente = gerarVersaoAutomaticamente;
	}

	public JiraIssueFields gitBranch(Object gitBranch) {
		this.gitBranch = gitBranch;
		return this;
	}

	/**
	 * gitBranch
	 * 
	 * @return gitBranch
	 **/
	@ApiModelProperty(value = "gitBranch")

	public Object getGitBranch() {
		return gitBranch;
	}

	public void setGitBranch(Object gitBranch) {
		this.gitBranch = gitBranch;
	}

	public JiraIssueFields gitCommitsReferenced(Object gitCommitsReferenced) {
		this.gitCommitsReferenced = gitCommitsReferenced;
		return this;
	}

	/**
	 * gitCommitsReferenced
	 * 
	 * @return gitCommitsReferenced
	 **/
	@ApiModelProperty(value = "gitCommitsReferenced")

	public Object getGitCommitsReferenced() {
		return gitCommitsReferenced;
	}

	public void setGitCommitsReferenced(Object gitCommitsReferenced) {
		this.gitCommitsReferenced = gitCommitsReferenced;
	}

	public JiraIssueFields timeestimate(BigDecimal timeestimate) {
		this.timeestimate = timeestimate;
		return this;
	}

	/**
	 * Tempo Restante
	 * 
	 * @return timeestimate
	 **/
	@ApiModelProperty(value = "Tempo Restante")

	@Valid
	public BigDecimal getTimeestimate() {
		return timeestimate;
	}

	public void setTimeestimate(BigDecimal timeestimate) {
		this.timeestimate = timeestimate;
	}

	public JiraIssueFields timespent(BigDecimal timespent) {
		this.timespent = timespent;
		return this;
	}

	/**
	 * Tempo Gasto
	 * 
	 * @return timespent
	 **/
	@ApiModelProperty(value = "Tempo Gasto")

	@Valid
	public BigDecimal getTimespent() {
		return timespent;
	}

	public void setTimespent(BigDecimal timespent) {
		this.timespent = timespent;
	}

	public JiraIssueFields duedate(String duedate) {
		this.duedate = duedate;
		return this;
	}

	/**
	 * Data para Ficar Pronto
	 * 
	 * @return duedate
	 **/
	@ApiModelProperty(value = "Data para Ficar Pronto")

	@Valid
	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public JiraIssueFields fabricaTeste(JiraIssueFieldOption fabricaTeste) {
		this.fabricaTeste = fabricaTeste;
		return this;
	}

	/**
	 * Get fabricaTeste
	 * 
	 * @return fabricaTeste
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraIssueFieldOption getFabricaTeste() {
		return fabricaTeste;
	}

	public void setFabricaTeste(JiraIssueFieldOption fabricaTeste) {
		this.fabricaTeste = fabricaTeste;
	}

	public JiraIssueFields responsavelTeste(JiraUser responsavelTeste) {
		this.responsavelTeste = responsavelTeste;
		return this;
	}

	/**
	 * Get responsavelTeste
	 * 
	 * @return responsavelTeste
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraUser getResponsavelTeste() {
		return responsavelTeste;
	}

	public void setResponsavelTeste(JiraUser responsavelTeste) {
		this.responsavelTeste = responsavelTeste;
	}

	public JiraIssueFields aprovacoesNecessarias(Integer aprovacoesNecessarias) {
		this.aprovacoesNecessarias = aprovacoesNecessarias;
		return this;
	}

	/**
	 * Aprovações necessárias
	 * 
	 * @return aprovacoesNecessarias
	 **/
	@ApiModelProperty(value = "Aprovações necessárias")

	public Integer getAprovacoesNecessarias() {
		return aprovacoesNecessarias;
	}

	public void setAprovacoesNecessarias(Integer aprovacoesNecessarias) {
		this.aprovacoesNecessarias = aprovacoesNecessarias;
	}

	public JiraIssueFields aprovacoesRealizadas(Integer aprovacoesRealizadas) {
		this.aprovacoesRealizadas = aprovacoesRealizadas;
		return this;
	}

	/**
	 * Aprovações realizadas
	 * 
	 * @return aprovacoesRealizadas
	 **/
	@ApiModelProperty(value = "Aprovações realizadas")

	public Integer getAprovacoesRealizadas() {
		return aprovacoesRealizadas;
	}

	public void setAprovacoesRealizadas(Integer aprovacoesRealizadas) {
		this.aprovacoesRealizadas = aprovacoesRealizadas;
	}

	public JiraIssueFields aprovadoPor(String aprovadoPor) {
		this.aprovadoPor = aprovadoPor;
		return this;
	}

	/**
	 * Aprovado por
	 * 
	 * @return aprovadoPor
	 **/
	@ApiModelProperty(value = "Aprovado por")

	public String getAprovadoPor() {
		return aprovadoPor;
	}

	public void setAprovadoPor(String aprovadoPor) {
		this.aprovadoPor = aprovadoPor;
	}

	public JiraIssueFields resolution(JiraIssueFieldsResolution resolution) {
		this.resolution = resolution;
		return this;
	}

	/**
	 * Get resolution
	 * 
	 * @return resolution
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public JiraIssueFieldsResolution getResolution() {
		return resolution;
	}

	public void setResolution(JiraIssueFieldsResolution resolution) {
		this.resolution = resolution;
	}

	public JiraIssueFields resolutiondate(String resolutiondate) {
		this.resolutiondate = resolutiondate;
		return this;
	}

	/**
	 * Get resolutiondate
	 * 
	 * @return resolutiondate
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public String getResolutiondate() {
		return resolutiondate;
	}

	public void setResolutiondate(String resolutiondate) {
		this.resolutiondate = resolutiondate;
	}

	public JiraIssueFields notasRelease(String notasRelease) {
		this.notasRelease = notasRelease;
		return this;
	}

	/**
	 * Notas de release
	 * 
	 * @return notasRelease
	 **/
	@ApiModelProperty(value = "Notas de release")
	public String getNotasRelease() {
		return notasRelease;
	}

	public void setNotasRelease(String notasRelease) {
		this.notasRelease = notasRelease;
	}

	public JiraIssueFields fixVersions(List<JiraVersion> fixVersions) {
		this.fixVersions = fixVersions;
		return this;
	}

	public JiraIssueFields addFixVersionsItem(JiraVersion fixVersionsItem) {
		if (this.fixVersions == null) {
			this.fixVersions = new ArrayList<JiraVersion>();
		}
		this.fixVersions.add(fixVersionsItem);
		return this;
	}

	/**
	 * Get fixVersions
	 * 
	 * @return fixVersions
	 **/
	@ApiModelProperty(value = "")
	@Valid
	public List<JiraVersion> getFixVersions() {
		return fixVersions;
	}

	public void setFixVersions(List<JiraVersion> fixVersions) {
		this.fixVersions = fixVersions;
	}

	public JiraIssueFields destaquesReleaseNotes(String destaquesReleaseNotes) {
		this.destaquesReleaseNotes = destaquesReleaseNotes;
		return this;
	}

	/**
	 * Destaques notas de release
	 * 
	 * @return destaquesReleaseNotes
	 **/
	@ApiModelProperty(value = "Destaques notas de release")
	public String getDestaquesReleaseNotes() {
		return destaquesReleaseNotes;
	}

	public void setDestaquesReleaseNotes(String destaquesReleaseNotes) {
		this.destaquesReleaseNotes = destaquesReleaseNotes;
	}

	public JiraIssueFields grupoAtribuicao(JiraIssueFieldSimple grupoAtribuicao) {
		this.grupoAtribuicao = grupoAtribuicao;
		return this;
	}

	/**
	 * Destaques notas de release
	 * 
	 * @return destaquesReleaseNotes
	 **/
	@ApiModelProperty(value = "Grupo responsavel pela atribuicao")

	public JiraIssueFieldSimple getGrupoAtribuicao() {
		return grupoAtribuicao;
	}

	public void setGrupoAtribuicao(JiraIssueFieldSimple grupoAtribuicao) {
		this.grupoAtribuicao = grupoAtribuicao;
	}


	public JiraIssueFields msgLancamentoGenerico(String msgLancamentoGenerico) {
		this.msgLancamentoGenerico = msgLancamentoGenerico;
		return this;
	}

	public String getMsgLancamentoGenerico() {
		return msgLancamentoGenerico;
	}

	public void setMsgLancamentoGenerico(String msgLancamentoGenerico) {
		this.msgLancamentoGenerico = msgLancamentoGenerico;
	}

	public JiraIssueFields msgLancamentoTelegram(String msgLancamentoTelegram) {
		this.msgLancamentoTelegram = msgLancamentoTelegram;
		return this;
	}

	public String getMsgLancamentoTelegram() {
		return msgLancamentoTelegram;
	}

	public void setMsgLancamentoTelegram(String msgLancamentoTelegram) {
		this.msgLancamentoTelegram = msgLancamentoTelegram;
	}

	public JiraIssueFields tipoVersao(JiraIssueFieldOption tipoVersao) {
		this.tipoVersao = tipoVersao;
		return this;
	}

	public JiraIssueFieldOption getTipoVersao() {
		return tipoVersao;
	}

	public void setTipoVersao(JiraIssueFieldOption tipoVersao) {
		this.tipoVersao = tipoVersao;
	}

	public JiraIssueFields versaoSeraLancada(String versaoSeraLancada) {
		this.versaoSeraLancada = versaoSeraLancada;
		return this;
	}

	public String getVersaoSeraLancada() {
		return versaoSeraLancada;
	}

	public void setVersaoSeraLancada(String versaoSeraLancada) {
		this.versaoSeraLancada = versaoSeraLancada;
	}

	public JiraIssueFields proximaVersao(String proximaVersao) {
		this.proximaVersao = proximaVersao;
		return this;
	}

	public String getProximaVersao() {
		return proximaVersao;
	}

	public void setProximaVersao(String proximaVersao) {
		this.proximaVersao = proximaVersao;
	}

	public JiraIssueFields dtDisponibilizacaoDocumentacao(String dtDisponibilizacaoDocumentacao) {
		this.dtDisponibilizacaoDocumentacao = dtDisponibilizacaoDocumentacao;
		return this;
	}

	public String getDtDisponibilizacaoDocumentacao() {
		return dtDisponibilizacaoDocumentacao;
	}

	public void setDtDisponibilizacaoDocumentacao(String dtDisponibilizacaoDocumentacao) {
		this.dtDisponibilizacaoDocumentacao = dtDisponibilizacaoDocumentacao;
	}

	public JiraIssueFields urlPublicacaoDocumentacao(String urlPublicacaoDocumentacao) {
		this.urlPublicacaoDocumentacao = urlPublicacaoDocumentacao;
		return this;
	}

	public String getUrlPublicacaoDocumentacao() {
		return urlPublicacaoDocumentacao;
	}

	public void setUrlPublicacaoDocumentacao(String urlPublicacaoDocumentacao) {
		this.urlPublicacaoDocumentacao = urlPublicacaoDocumentacao;
	}

	public JiraIssueFields dtGeracaoCodigoFonte(String dtGeracaoCodigoFonte) {
		this.dtGeracaoCodigoFonte = dtGeracaoCodigoFonte;
		return this;
	}

	public String getDtGeracaoCodigoFonte() {
		return dtGeracaoCodigoFonte;
	}

	public void setDtGeracaoCodigoFonte(String dtGeracaoCodigoFonte) {
		this.dtGeracaoCodigoFonte = dtGeracaoCodigoFonte;
	}

	public JiraIssueFields tagCodigoFonte(String tagCodigoFonte) {
		this.tagCodigoFonte = tagCodigoFonte;
		return this;
	}

	public String getTagCodigoFonte() {
		return tagCodigoFonte;
	}

	public void setTagCodigoFonte(String tagCodigoFonte) {
		this.tagCodigoFonte = tagCodigoFonte;
	}

	public JiraIssueFields responsavelExecucao(JiraUser responsavelExecucao) {
		this.responsavelExecucao = responsavelExecucao;
		return this;
	}

	public JiraUser getResponsavelExecucao() {
		return responsavelExecucao;
	}

	public void setResponsavelExecucao(JiraUser responsavelExecucao) {
		this.responsavelExecucao = responsavelExecucao;
	}
	
	public String getBranchsRelacionados() {
		return branchsRelacionados;
	}

	public void setBranchsRelacionados(String branchsRelacionados) {
		this.branchsRelacionados = branchsRelacionados;
	}
	
	public String getMrAbertos() {
		return mrAbertos;
	}

	public void setMrAbertos(String mrAbertos) {
		this.mrAbertos = mrAbertos;
	}

	public String getMrAceitos() {
		return mrAceitos;
	}

	public void setMrAceitos(String mrAceitos) {
		this.mrAceitos = mrAceitos;
	}

	public JiraIssueFields imagemDocker(String imagemDocker) {
		this.imagemDocker = imagemDocker;
		return this;
	}

	public String getImagemDocker() {
		return imagemDocker;
	}

	public void setImagemDocker(String imagemDocker) {
		this.imagemDocker = imagemDocker;
	}

	public JiraIssueFields estruturaDocumentacao(JiraIssueFieldOptionWithChild estruturaDocumentacao) {
		this.estruturaDocumentacao = estruturaDocumentacao;
		return this;
	}

	public JiraIssueFieldOptionWithChild getEstruturaDocumentacao() {
		return estruturaDocumentacao;
	}

	public void setEstruturaDocumentacao(JiraIssueFieldOptionWithChild estruturaDocumentacao) {
		this.estruturaDocumentacao = estruturaDocumentacao;
	}

	public JiraIssueFields nomeParaExibicaoDocumentacao(String nomeParaExibicaoDocumentacao) {
		this.nomeParaExibicaoDocumentacao = nomeParaExibicaoDocumentacao;
		return this;
	}

	public String getNomeParaExibicaoDocumentacao() {
		return nomeParaExibicaoDocumentacao;
	}

	public void setNomeParaExibicaoDocumentacao(String nomeParaExibicaoDocumentacao) {
		this.nomeParaExibicaoDocumentacao = nomeParaExibicaoDocumentacao;
	}

	public JiraIssueFields pathDiretorioPrincipal(String pathDiretorioPrincipal) {
		this.pathDiretorioPrincipal = pathDiretorioPrincipal;
		return this;
	}

	public String getPathDiretorioPrincipal() {
		return pathDiretorioPrincipal;
	}

	public void setPathDiretorioPrincipal(String pathDiretorioPrincipal) {
		this.pathDiretorioPrincipal = pathDiretorioPrincipal;
	}

	public JiraIssueFields dtDisponibilizacaoHomologacaoDocumentacao(String dtDisponibilizacaoHomologacaoDocumentacao) {
		this.dtDisponibilizacaoHomologacaoDocumentacao = dtDisponibilizacaoHomologacaoDocumentacao;
		return this;
	}

	public String getDtDisponibilizacaoHomologacaoDocumentacao() {
		return dtDisponibilizacaoHomologacaoDocumentacao;
	}

	public void setDtDisponibilizacaoHomologacaoDocumentacao(String dtDisponibilizacaoHomologacaoDocumentacao) {
		this.dtDisponibilizacaoHomologacaoDocumentacao = dtDisponibilizacaoHomologacaoDocumentacao;
	}

	public JiraIssueFields urlHomologacaoDocumentacao(String urlHomologacaoDocumentacao) {
		this.urlHomologacaoDocumentacao = urlHomologacaoDocumentacao;
		return this;
	}

	public String getUrlHomologacaoDocumentacao() {
		return urlHomologacaoDocumentacao;
	}

	public void setUrlHomologacaoDocumentacao(String urlHomologacaoDocumentacao) {
		this.urlHomologacaoDocumentacao = urlHomologacaoDocumentacao;
	}

	public JiraIssueFields publicarDocumentacaoAutomaticamente(List<JiraIssueFieldOption> publicarDocumentacaoAutomaticamente) {
		this.publicarDocumentacaoAutomaticamente = publicarDocumentacaoAutomaticamente;
		return this;
	}

	public List<JiraIssueFieldOption> getPublicarDocumentacaoAutomaticamente() {
		return publicarDocumentacaoAutomaticamente;
	}

	public void setPublicarDocumentacaoAutomaticamente(List<JiraIssueFieldOption> publicarDocumentacaoAutomaticamente) {
		this.publicarDocumentacaoAutomaticamente = publicarDocumentacaoAutomaticamente;
	}

	public JiraIssueFields comment(JiraIssueFieldsComment comment) {
		this.comment = comment;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public JiraIssueFieldsComment getComment() {
		return comment;
	}

	public void setComment(JiraIssueFieldsComment comment) {
		this.comment = comment;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraIssueFields jiraIssueFields = (JiraIssueFields) o;
		return Objects.equals(this.project, jiraIssueFields.project)
				&& Objects.equals(this.issuetype, jiraIssueFields.issuetype)
				&& Objects.equals(this.environment, jiraIssueFields.environment)
				&& Objects.equals(this.funcionalidade, jiraIssueFields.funcionalidade)
				&& Objects.equals(this.perfil, jiraIssueFields.perfil)
				&& Objects.equals(this.creator, jiraIssueFields.creator)
				&& Objects.equals(this.reporter, jiraIssueFields.reporter)
				&& Objects.equals(this.created, jiraIssueFields.created)
				&& Objects.equals(this.summary, jiraIssueFields.summary)
				&& Objects.equals(this.description, jiraIssueFields.description)
				&& Objects.equals(this.attachment, jiraIssueFields.attachment)
				&& Objects.equals(this.versions, jiraIssueFields.versions)
				&& Objects.equals(this.labels, jiraIssueFields.labels)
				&& Objects.equals(this.sistema, jiraIssueFields.sistema)
				&& Objects.equals(this.servico, jiraIssueFields.servico)
				&& Objects.equals(this.parentLink, jiraIssueFields.parentLink)
				&& Objects.equals(this.subtasks, jiraIssueFields.subtasks)
				&& Objects.equals(this.informacoesPendentes, jiraIssueFields.informacoesPendentes)
				&& Objects.equals(this.priority, jiraIssueFields.priority)
				&& Objects.equals(this.businessValue, jiraIssueFields.businessValue)
				&& Objects.equals(this.epicTheme, jiraIssueFields.epicTheme)
				&& Objects.equals(this.potencialDiminuicaoIssues, jiraIssueFields.potencialDiminuicaoIssues)
				&& Objects.equals(this.complexidade, jiraIssueFields.complexidade)
				&& Objects.equals(this.issuelinks, jiraIssueFields.issuelinks)
				&& Objects.equals(this.tribunalRequisitante, jiraIssueFields.tribunalRequisitante)
				&& Objects.equals(this.votes, jiraIssueFields.votes)
				&& Objects.equals(this.watches, jiraIssueFields.watches)
				&& Objects.equals(this.assignee, jiraIssueFields.assignee)
				&& Objects.equals(this.status, jiraIssueFields.status)
				&& Objects.equals(this.updated, jiraIssueFields.updated)
				&& Objects.equals(this.fabricaDesenvolvimento, jiraIssueFields.fabricaDesenvolvimento)
				&& Objects.equals(this.sprintGrupo, jiraIssueFields.sprintGrupo)
				&& Objects.equals(this.responsavelCodificacao, jiraIssueFields.responsavelCodificacao)
				&& Objects.equals(this.desenvolvimento, jiraIssueFields.desenvolvimento)
				&& Objects.equals(this.gerarVersaoAutomaticamente, jiraIssueFields.gerarVersaoAutomaticamente)
				
				&& Objects.equals(this.gitBranch, jiraIssueFields.gitBranch)
				&& Objects.equals(this.gitCommitsReferenced, jiraIssueFields.gitCommitsReferenced)
				&& Objects.equals(this.timeestimate, jiraIssueFields.timeestimate)
				&& Objects.equals(this.timespent, jiraIssueFields.timespent)
				&& Objects.equals(this.duedate, jiraIssueFields.duedate)
				&& Objects.equals(this.fabricaTeste, jiraIssueFields.fabricaTeste)
				&& Objects.equals(this.responsavelTeste, jiraIssueFields.responsavelTeste)
				&& Objects.equals(this.aprovacoesNecessarias, jiraIssueFields.aprovacoesNecessarias)
				&& Objects.equals(this.aprovacoesRealizadas, jiraIssueFields.aprovacoesRealizadas)
				&& Objects.equals(this.aprovadoPor, jiraIssueFields.aprovadoPor)
				&& Objects.equals(this.resolution, jiraIssueFields.resolution)
				&& Objects.equals(this.resolutiondate, jiraIssueFields.resolutiondate)
				&& Objects.equals(this.notasRelease, jiraIssueFields.notasRelease)
				&& Objects.equals(this.fixVersions, jiraIssueFields.fixVersions)
				&& Objects.equals(this.destaquesReleaseNotes, jiraIssueFields.destaquesReleaseNotes)
				
				&& Objects.equals(this.msgLancamentoGenerico, jiraIssueFields.msgLancamentoGenerico)
				&& Objects.equals(this.msgLancamentoTelegram, jiraIssueFields.msgLancamentoTelegram)
				&& Objects.equals(this.grupoAtribuicao, jiraIssueFields.grupoAtribuicao)
				&& Objects.equals(this.tipoVersao, jiraIssueFields.tipoVersao)
				&& Objects.equals(this.versaoSeraLancada, jiraIssueFields.versaoSeraLancada)
				&& Objects.equals(this.proximaVersao, jiraIssueFields.proximaVersao)
				&& Objects.equals(this.dtDisponibilizacaoDocumentacao, jiraIssueFields.dtDisponibilizacaoDocumentacao)
				&& Objects.equals(this.urlPublicacaoDocumentacao, jiraIssueFields.urlPublicacaoDocumentacao)
				&& Objects.equals(this.dtGeracaoCodigoFonte, jiraIssueFields.dtGeracaoCodigoFonte)
				&& Objects.equals(this.tagCodigoFonte, jiraIssueFields.tagCodigoFonte)
				&& Objects.equals(this.responsavelExecucao, jiraIssueFields.responsavelExecucao)

				&& Objects.equals(this.branchsRelacionados, jiraIssueFields.branchsRelacionados)
				&& Objects.equals(this.mrAbertos, jiraIssueFields.mrAbertos)
				&& Objects.equals(this.mrAceitos, jiraIssueFields.mrAceitos)
				&& Objects.equals(this.imagemDocker, jiraIssueFields.imagemDocker)
				&& Objects.equals(this.estruturaDocumentacao, jiraIssueFields.estruturaDocumentacao)
				&& Objects.equals(this.nomeParaExibicaoDocumentacao, jiraIssueFields.nomeParaExibicaoDocumentacao)
				&& Objects.equals(this.pathDiretorioPrincipal, jiraIssueFields.pathDiretorioPrincipal)
				&& Objects.equals(this.dtDisponibilizacaoHomologacaoDocumentacao, jiraIssueFields.dtDisponibilizacaoHomologacaoDocumentacao)
				&& Objects.equals(this.urlHomologacaoDocumentacao, jiraIssueFields.urlHomologacaoDocumentacao)
				&& Objects.equals(this.publicarDocumentacaoAutomaticamente, jiraIssueFields.publicarDocumentacaoAutomaticamente)
				
				&& Objects.equals(this.comment, jiraIssueFields.comment);
	}

	@Override
	public int hashCode() {
		return Objects.hash(project, issuetype, environment, funcionalidade, perfil, creator, reporter, created,
				summary, description, attachment, versions, labels, sistema, servico, parentLink, subtasks,
				informacoesPendentes, priority, businessValue, epicTheme, potencialDiminuicaoIssues, complexidade,
				issuelinks, tribunalRequisitante, votes, watches, assignee, status, updated, fabricaDesenvolvimento,
				sprintGrupo, responsavelCodificacao, desenvolvimento, gerarVersaoAutomaticamente,
				gitBranch, gitCommitsReferenced, timeestimate,
				timespent, duedate, fabricaTeste, responsavelTeste, aprovacoesNecessarias, aprovacoesRealizadas,
				aprovadoPor, resolution, resolutiondate, notasRelease, fixVersions, destaquesReleaseNotes, 
				grupoAtribuicao, msgLancamentoGenerico, msgLancamentoTelegram, tipoVersao, versaoSeraLancada, 
				proximaVersao, dtDisponibilizacaoDocumentacao, urlPublicacaoDocumentacao, dtGeracaoCodigoFonte, tagCodigoFonte,
				responsavelExecucao,
				
				branchsRelacionados, mrAbertos, mrAceitos,
				imagemDocker, estruturaDocumentacao, nomeParaExibicaoDocumentacao, pathDiretorioPrincipal,
				dtDisponibilizacaoHomologacaoDocumentacao, urlHomologacaoDocumentacao, publicarDocumentacaoAutomaticamente,
				
				comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraIssueFields {\n");
		sb.append("    project: ").append(toIndentedString(project)).append("\n");
		sb.append("    issuetype: ").append(toIndentedString(issuetype)).append("\n");
		sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
		sb.append("    funcionalidade: ").append(toIndentedString(funcionalidade)).append("\n");
		sb.append("    perfil: ").append(toIndentedString(perfil)).append("\n");
		sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
		sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
		sb.append("    created: ").append(toIndentedString(created)).append("\n");
		sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
		sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
		sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("    sistema: ").append(toIndentedString(sistema)).append("\n");
		sb.append("    servico: ").append(toIndentedString(servico)).append("\n");
		sb.append("    parentLink: ").append(toIndentedString(parentLink)).append("\n");
		sb.append("    subtasks: ").append(toIndentedString(subtasks)).append("\n");
		sb.append("    informacoesPendentes: ").append(toIndentedString(informacoesPendentes)).append("\n");
		sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
		sb.append("    businessValue: ").append(toIndentedString(businessValue)).append("\n");
		sb.append("    epicTheme: ").append(toIndentedString(epicTheme)).append("\n");
		sb.append("    potencialDiminuicaoIssues: ").append(toIndentedString(potencialDiminuicaoIssues)).append("\n");
		sb.append("    complexidade: ").append(toIndentedString(complexidade)).append("\n");
		sb.append("    issuelinks: ").append(toIndentedString(issuelinks)).append("\n");
		sb.append("    tribunalRequisitante: ").append(toIndentedString(tribunalRequisitante)).append("\n");
		sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
		sb.append("    watches: ").append(toIndentedString(watches)).append("\n");
		sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
		sb.append("    sprintGrupo: ").append(toIndentedString(sprintGrupo)).append("\n");
		sb.append("    grupoAtribuicao: ").append(toIndentedString(grupoAtribuicao)).append("\n");
		sb.append("    fabricaDesenvolvimento: ").append(toIndentedString(fabricaDesenvolvimento)).append("\n");
		sb.append("    responsavelCodificacao: ").append(toIndentedString(responsavelCodificacao)).append("\n");
		sb.append("    desenvolvimento: ").append(toIndentedString(desenvolvimento)).append("\n");
		sb.append("    gerarVersaoAutomaticamente: ").append(toIndentedString(gerarVersaoAutomaticamente)).append("\n");
		sb.append("    gitBranch: ").append(toIndentedString(gitBranch)).append("\n");
		sb.append("    gitCommitsReferenced: ").append(toIndentedString(gitCommitsReferenced)).append("\n");
		sb.append("    timeestimate: ").append(toIndentedString(timeestimate)).append("\n");
		sb.append("    timespent: ").append(toIndentedString(timespent)).append("\n");
		sb.append("    duedate: ").append(toIndentedString(duedate)).append("\n");
		sb.append("    fabricaTeste: ").append(toIndentedString(fabricaTeste)).append("\n");
		sb.append("    responsavelTeste: ").append(toIndentedString(responsavelTeste)).append("\n");
		sb.append("    aprovacoesNecessarias: ").append(toIndentedString(aprovacoesNecessarias)).append("\n");
		sb.append("    aprovacoesRealizadas: ").append(toIndentedString(aprovacoesRealizadas)).append("\n");
		sb.append("    aprovadoPor: ").append(toIndentedString(aprovadoPor)).append("\n");
		sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
		sb.append("    resolutiondate: ").append(toIndentedString(resolutiondate)).append("\n");
		sb.append("    notasRelease: ").append(toIndentedString(notasRelease)).append("\n");
		sb.append("    fixVersions: ").append(toIndentedString(fixVersions)).append("\n");
		sb.append("    destaquesReleaseNotes: ").append(toIndentedString(destaquesReleaseNotes)).append("\n");
		sb.append("    msgLancamentoGenerico: ").append(toIndentedString(msgLancamentoGenerico)).append("\n");
		sb.append("    msgLancamentoTelegram: ").append(toIndentedString(msgLancamentoTelegram)).append("\n");
		sb.append("    tipoVersao: ").append(toIndentedString(tipoVersao)).append("\n");
		sb.append("    versaoSeraLancada: ").append(toIndentedString(versaoSeraLancada)).append("\n");
		sb.append("    proximaVersao: ").append(toIndentedString(proximaVersao)).append("\n");
		sb.append("    dtDisponibilizacaoDocumentacao: ").append(toIndentedString(dtDisponibilizacaoDocumentacao)).append("\n");
		sb.append("    urlPublicacaoDocumentacao: ").append(toIndentedString(urlPublicacaoDocumentacao)).append("\n");
		sb.append("    dtGeracaoCodigoFonte: ").append(toIndentedString(dtGeracaoCodigoFonte)).append("\n");
		sb.append("    tagCodigoFonte: ").append(toIndentedString(tagCodigoFonte)).append("\n");
		sb.append("    responsavelExecucao: ").append(toIndentedString(responsavelExecucao)).append("\n");

		sb.append("    branchsRelacionados: ").append(toIndentedString(branchsRelacionados)).append("\n");
		
		sb.append("    mrAbertos: ").append(toIndentedString(mrAbertos)).append("\n");
		sb.append("    mrAceitos: ").append(toIndentedString(mrAceitos)).append("\n");
		
		sb.append("    imagemDocker: ").append(toIndentedString(imagemDocker)).append("\n");
		sb.append("    estruturaDocumentacao: ").append(toIndentedString(estruturaDocumentacao)).append("\n");
		sb.append("    nomeParaExibicaoDocumentacao: ").append(toIndentedString(nomeParaExibicaoDocumentacao)).append("\n");
		sb.append("    pathDiretorioPrincipal: ").append(toIndentedString(pathDiretorioPrincipal)).append("\n");
		sb.append("    dtDisponibilizacaoHomologacaoDocumentacao: ").append(toIndentedString(dtDisponibilizacaoHomologacaoDocumentacao)).append("\n");
		sb.append("    urlHomologacaoDocumentacao: ").append(toIndentedString(urlHomologacaoDocumentacao)).append("\n");
		sb.append("    publicarDocumentacaoAutomaticamente: ").append(toIndentedString(publicarDocumentacaoAutomaticamente)).append("\n");
		
		sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
