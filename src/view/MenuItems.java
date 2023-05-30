package view;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuItems extends JMenuItem {
		private static JMenuItem CadastroProfessor = new JMenuItem("Professor");
		private static JMenuItem CadastroAluno = new JMenuItem("Aluno");
		private static JMenuItem CadastroDiciplina = new JMenuItem("Diciplina");
		private static JMenu cadastrar = new JMenu("cadastrar");
		public static JMenu Cadastrar() {
			cadastrar.add(getCadastrarProfessor());
			cadastrar.add(getCadastrarAluno());
			cadastrar.add(getCadastrarDiciplina());
			return cadastrar;
		}
		
		public static JMenuItem getCadastrarProfessor() {
			return CadastroProfessor;
		}
		public static JMenuItem getCadastrarAluno() {
			return CadastroAluno;
		}
		public static JMenuItem getCadastrarDiciplina() {
			return CadastroDiciplina;
		}
}
