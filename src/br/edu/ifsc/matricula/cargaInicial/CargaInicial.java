package br.edu.ifsc.matricula.cargaInicial;

import java.util.ArrayList;

import br.edu.ifsc.matricula.entidades.*;

public class CargaInicial {
	
	public void realizaCargaInicial(ArrayList<Curso> cursos, ArrayList<Disciplina> disciplinas, ArrayList<CursoDisciplina> cursoDisciplinas){
		for (int i=0; i<10; i++){
			Curso curso = new Curso(""+i, "Curso "+(i+1));
			Disciplina disciplina = new Disciplina("Disciplina "+(i+1), ""+i);
			cursos.add(curso);
			disciplinas.add(disciplina);
		}
		
		cursoDisciplinas.add(new CursoDisciplina(cursos.get(0), disciplinas.get(1), "08:00", 2));
		cursoDisciplinas.add(new CursoDisciplina(cursos.get(0), disciplinas.get(1), "10:00", 3));
		cursoDisciplinas.add(new CursoDisciplina(cursos.get(0), disciplinas.get(2), "10:00", 3));
		cursoDisciplinas.add(new CursoDisciplina(cursos.get(0), disciplinas.get(2), "10:00", 4));
	}
}
