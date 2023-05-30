package controller;
import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import model.Professor;
import model.Aluno;
import model.Disciplina;

import java.util.ArrayList;

public class CriadorDeArquivoController {
	public void createFileProfessor(ArrayList<Professor> professores) throws IOException {
		FileWriter arq = new FileWriter("professor.txt");
		PrintWriter Gravararq = new PrintWriter(arq);
		
		Gravararq.printf("Tabela de Professores cadastrados:", professores);
		Gravararq.printf("\n", professores);
		Gravararq.printf("\n", professores);
		for(Professor professor : professores) {
			
			
			Gravararq.printf("Nome: " + professor.getNome()+"\n", professores);
			Gravararq.printf("Diciplina " + professor.getDisciplina()+"\n", professores);
			Gravararq.printf("Instituição: " + professor.getInstituicao()+"\n", professores);
			Gravararq.printf("Salario: " + professor.getSalario()+"\n", professores);
			Gravararq.printf("\n", professores);
			Gravararq.printf("\n", professores);
		}
		
		
	
	
		arq.close();
	}
	
	public void createFileAluno(ArrayList<Aluno> alunos) throws IOException {
		FileWriter arq = new FileWriter("aluno.txt");
		PrintWriter Gravararq = new PrintWriter(arq);
		
		Gravararq.printf("Tabela de Alunos cadastrados:", alunos);
		Gravararq.printf("\n", alunos);
	
		Gravararq.printf("\n", alunos);
		for(Aluno aluno : alunos) {
			
			
			Gravararq.printf("Nome: " + aluno.getNome()+"\n", alunos);
			Gravararq.printf("Matricula " + aluno.getMatricula()+"\n", alunos);
			Gravararq.printf("RG: " + aluno.getRg()+"\n",alunos);
			Gravararq.printf("CPF: " + aluno.getCpf()+"\n", alunos);
			Gravararq.printf("\n", alunos);
			Gravararq.printf("\n", alunos);
		}
		
		
	
	
		arq.close();
	}
	
	public void createFileDisciplina(ArrayList<Disciplina> diciplinas) throws IOException {
		FileWriter arq = new FileWriter("diciplina.txt");
		PrintWriter Gravararq = new PrintWriter(arq);
		
		Gravararq.printf("Tabela de Diciplinas cadastradas:", diciplinas);
		Gravararq.printf("\n", diciplinas);
	
		Gravararq.printf("\n", diciplinas);
		for(Disciplina diciplina : diciplinas) {
			
			
			Gravararq.printf("Nome: " + diciplina.getNome()+"\n", diciplinas);
			Gravararq.printf("Codigo " + diciplina.getCodigo()+"\n", diciplinas);
			Gravararq.printf("Carga Horaria: " + diciplina.getCargaHoraria()+"\n",diciplinas);
			Gravararq.printf("Descrição: " + diciplina.getDescricao() +"\n", diciplinas);
			Gravararq.printf("\n", diciplinas);
			Gravararq.printf("\n", diciplinas);
		}
		
		
	
	
		arq.close();
	}
}
