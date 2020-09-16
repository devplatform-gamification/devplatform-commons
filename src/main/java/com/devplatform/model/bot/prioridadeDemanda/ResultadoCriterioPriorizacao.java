package com.devplatform.model.bot.prioridadeDemanda;

public class ResultadoCriterioPriorizacao{
	private String nome;
	private String mensagem;
	private Integer pontuacao;
	
	public ResultadoCriterioPriorizacao(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Integer getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("class ResultadoCriterioPriorizacao{\n    nome:     ");
		builder.append(nome);
		builder.append("\n    mensagem:     ");
		builder.append(mensagem);
		builder.append("\n    pontuacao:     ");
		builder.append(pontuacao);
		builder.append("\n}");
		return builder.toString();
	}
}