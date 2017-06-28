package br.edu.ifsc.matricula.entidades;

public class Disciplina {
	private String codigoDisciplina;
	private String nome;
	
	public Disciplina(){
	}
	
	public Disciplina(String nome, String codigoDisciplina){
		this.codigoDisciplina = codigoDisciplina;
		this.nome = nome;
	}
	
	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}
	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
