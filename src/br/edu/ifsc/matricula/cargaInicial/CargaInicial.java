package br.edu.ifsc.matricula.cargaInicial;

import java.util.ArrayList;

import br.edu.ifsc.matricula.entidades.*;

public class CargaInicial {
	
	public void realizaCargaInicial(ArrayList<Curso> cursos, ArrayList<Disciplina> disiciplina, ArrayList<CursoDisciplina> cursoDisciplina){
		for (int i=0; i<10; i++){
			Curso curso = new Curso(""+i, "Curso "+(i+1));
			Disciplina disciplina = new Disciplina("Disciplina "+(i+1), ""+i);
			cursos.add(curso);
		}
	}
}
