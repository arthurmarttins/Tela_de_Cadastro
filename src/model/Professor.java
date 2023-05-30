package model;

/**
 * @author bruno
 *
 */
public class Professor {
	private String nome;
	private String disciplina;
	private String instituicao;
	private float salario;
	// TODO Auto-generated constructor stub
	public Professor(String nome, String disciplina, String instituicao, float salario) {
		
		this.nome = nome;
		this.disciplina = disciplina;
		this.instituicao = instituicao;
		this.salario = salario;
	}
	public  String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
