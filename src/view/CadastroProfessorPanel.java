package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CadastroProfessorPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private static JTextField nomeProfessor;
    private static JTextField disciplinaProfessor;
    private static JTextField instituicaoProfessor;
    private static JTextField salarioProfessor;
    private static JButton cadastrarProfessor = null;
    private static JLabel labelNome;
    private static JLabel labelDisciplina;
    private static JLabel labelInstituicao;
    private static JLabel labelSalario;

    public CadastroProfessorPanel() {
        setLayout(null);
        setBackground(new Color(20, 20, 70)); // Define a cor de fundo como azul escuro

        add(getNomeProfessor());
        add(getDisciplinaProfessor());
        add(getInstituicaoProfessor());
        add(getSalarioProfessor());
        add(getCadastrarProfessor());
        add(getLabelNome());
        add(getLabelDisciplina());
        add(getLabelInstituicao());
        add(getLabelSalario());

        cadastrarProfessor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarProfessor();
            }
        });
    }

    public static JTextField getNomeProfessor() {
        if (nomeProfessor == null) {
            nomeProfessor = new JTextField();
            nomeProfessor.setBounds(230, 40, 300, 30);
            nomeProfessor.setForeground(Color.BLACK); 
        }
        return nomeProfessor;
    }

    public static JTextField getDisciplinaProfessor() {
        if (disciplinaProfessor == null) {
            disciplinaProfessor = new JTextField();
            disciplinaProfessor.setBounds(230, 100, 300, 30);
            disciplinaProfessor.setForeground(Color.BLACK); 
        }
        return disciplinaProfessor;
    }

    public static JTextField getInstituicaoProfessor() {
        if (instituicaoProfessor == null) {
            instituicaoProfessor = new JTextField();
            instituicaoProfessor.setBounds(230, 160, 300, 30);
            instituicaoProfessor.setForeground(Color.BLACK); 
        }
        return instituicaoProfessor;
    }

    public static JTextField getSalarioProfessor() {
        if (salarioProfessor == null) {
            salarioProfessor = new JTextField();
            salarioProfessor.setBounds(230, 220, 300, 30);
            salarioProfessor.setForeground(Color.BLACK); 
        }
        return salarioProfessor;
    }

    public static JButton getCadastrarProfessor() {
        if (cadastrarProfessor == null) {
            cadastrarProfessor = new JButton("Cadastrar Professor");
            cadastrarProfessor.setBounds(230, 260, 300, 30);
            cadastrarProfessor.setForeground(Color.BLACK);
        }
        return cadastrarProfessor;
    }

    public static JLabel getLabelNome() {
        if (labelNome == null) {
            labelNome = new JLabel("Nome:");
            labelNome.setVisible(true);
            labelNome.setBounds(230, 0, 200, 50);
            labelNome.setForeground(Color.WHITE);
        }
        return labelNome;
    }

    public static JLabel getLabelDisciplina() {
        if (labelDisciplina == null) {
            labelDisciplina = new JLabel("Disciplina:");
            labelDisciplina.setVisible(true);
            labelDisciplina.setBounds(230, 60, 200, 50);
            labelDisciplina.setForeground(Color.WHITE); 
        }
        return labelDisciplina;
    }

    public static JLabel getLabelInstituicao() {
        if (labelInstituicao == null) {
            labelInstituicao = new JLabel("Instituição:");
            labelInstituicao.setVisible(true);
            labelInstituicao.setBounds(230, 120, 220, 50);
            labelInstituicao.setForeground(Color.WHITE); 
        }
        return labelInstituicao;
    }

    public static JLabel getLabelSalario() {
        if (labelSalario == null) {
            labelSalario = new JLabel("Salário:");
            labelSalario.setVisible(true);
            labelSalario.setBounds(230, 180, 220, 50);
            labelSalario.setForeground(Color.WHITE); 
        }
        return labelSalario;
        
    }

    private void cadastrarProfessor() {
        String nome = nomeProfessor.getText();
        String disciplina = disciplinaProfessor.getText();
        String instituicao = instituicaoProfessor.getText();
        String salario = salarioProfessor.getText();

        String professorData = "------------------------\n"
        						+"Nome: "+ nome + "\n" 
        						+"Disciplina: "+ disciplina + "\n" 
        						+"Instituição: " + instituicao + "\n" 
        						+ "Salário: " + salario +"\n"
        						+"------------------------";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("professores.txt", true))) {
            writer.write(professorData);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Limpar os campos após o cadastro
        nomeProfessor.setText("");
        disciplinaProfessor.setText("");
        instituicaoProfessor.setText("");
        salarioProfessor.setText("");
    }
}
