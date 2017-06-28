package br.edu.ifsc.matricula.entidades;

public class CursoDisciplina {
	private Curso curso;
	private Disciplina disciplina;
	private String horario;
	private Integer diaSemana;
	
	public CursoDisciplina(){
	}
	
	public CursoDisciplina(Curso curso, Disciplina disciplina, String horario, Integer diaSemana) {
		super();
		this.curso = curso;
		this.disciplina = disciplina;
		this.horario = horario;
		this.diaSemana = diaSemana;
	}
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Integer getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(Integer diaSemana) {
		this.diaSemana = diaSemana;
	}
}
