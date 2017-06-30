package br.edu.ifsc.matricula;

import java.util.ArrayList;

import br.edu.ifsc.matricula.cargaInicial.CargaInicial;
import br.edu.ifsc.matricula.controle.ControleHorarios;
import br.edu.ifsc.matricula.entidades.*;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		ArrayList<CursoDisciplina> cursoDisciplinas = new ArrayList<CursoDisciplina>();
		
		CargaInicial cargaInicial = new CargaInicial();
		ControleHorarios controleHorarios = new ControleHorarios();
		
		cargaInicial.realizaCargaInicial(cursos, disciplinas, cursoDisciplinas);
	}

}
