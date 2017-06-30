package br.edu.ifsc.matricula.testes;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import br.edu.ifsc.matricula.cargaInicial.CargaInicial;
import br.edu.ifsc.matricula.controle.ControleHorarios;
import br.edu.ifsc.matricula.entidades.Curso;
import br.edu.ifsc.matricula.entidades.CursoDisciplina;
import br.edu.ifsc.matricula.entidades.Disciplina;

public class TesteControleHorario {
	@Test
	public void detectaConflitoDeHorario(){
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		ArrayList<CursoDisciplina> cursoDisciplinas = new ArrayList<CursoDisciplina>();
		
		CargaInicial cargaInicial = new CargaInicial();
		ControleHorarios controleHorarios = new ControleHorarios();
		
		cargaInicial.realizaCargaInicial(cursos, disciplinas, cursoDisciplinas);
		
		for(CursoDisciplina horarios : cursoDisciplinas){
			
			CursoDisciplina cursoDiscTmp = controleHorarios.detectaConflitoHorario(cursoDisciplinas, horarios.getCurso(), horarios.getDisciplina(), horarios.getHorario(), horarios.getDiaSemana());
			
			if(cursoDiscTmp!=null){
				//Se o objeto for de valor diferente significa que existe um erro no metodo de teste de conflito
				Assert.assertEquals(cursoDiscTmp.getHorario()+cursoDiscTmp.getCurso().getNome(), horarios.getHorario()+horarios.getCurso().getNome());
				break;
			}
		}
		
		//Se nao encontrar um conflito detecta erro. No cenario simulado deve haver um conflito
		Assert.assertEquals(1,2);
	}
}
