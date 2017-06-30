package br.edu.ifsc.matricula.controle;

import java.util.ArrayList;

import br.edu.ifsc.matricula.entidades.Curso;
import br.edu.ifsc.matricula.entidades.CursoDisciplina;
import br.edu.ifsc.matricula.entidades.Disciplina;

public class ControleHorarios {

	public CursoDisciplina detectaConflitoHorario(ArrayList<CursoDisciplina> cursoDisciplinas, Curso curso, Disciplina disciplina, String horario, Integer dia){
		for(CursoDisciplina cd : cursoDisciplinas){
			if(cd.getCurso().equals(curso) && cd.getHorario().equals(horario) && cd.getDiaSemana()==dia && !cd.getDisciplina().equals(disciplina)){
				return cd;
			}
		}
		
		return null;
	}
}
