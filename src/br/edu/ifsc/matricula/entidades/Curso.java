package br.edu.ifsc.matricula.entidades;

public class Curso {
	private String codigoCurso;
	private String nome;
	
	public Curso(){
	}
	
	public Curso(String codigoCurso, String nome) {
		this.codigoCurso = codigoCurso;
		this.nome = nome;
	}
	
	public String getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
