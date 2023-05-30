package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CadastroAlunoPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private static JTextField nomeAluno;
    private static JTextField nummatricula;
    private static JTextField rgAluno;
    private static JTextField cpfAluno;
    private static JButton cadastrarAluno = null;
    private static JLabel labelNome;
    private static JLabel labelMatricula;
    private static JLabel labelRg;
    private static JLabel labelCpfAluno;

    public CadastroAlunoPanel() {
        setLayout(null);
        setBackground(new Color(20, 20, 70));

        this.setLayout(null);
        this.add(getNomeAluno());
        this.add(getMatricula());
        this.add(getRg());
        this.add(getCpf());
        this.add(getCadastrarAluno());
        this.add(getLabelNome());
        this.add(getLabelMatricula());
        this.add(getLabelRg());
        this.add(getLabelCpf());

        cadastrarAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarAluno();
            }
        });
    }

    public static JTextField getNomeAluno() {
        if (nomeAluno == null) {
            nomeAluno = new JTextField();
            nomeAluno.setBounds(230, 40, 300, 30);
            nomeAluno.setForeground(Color.BLACK);
        }
        return nomeAluno;
    }

    public static JTextField getMatricula() {
        if (nummatricula == null) {
            nummatricula = new JTextField();
            nummatricula.setBounds(230, 100, 300, 30);
            nummatricula.setForeground(Color.BLACK);
        }
        return nummatricula;
    }

    public static JTextField getRg() {
        if (rgAluno == null) {
            rgAluno = new JTextField();
            rgAluno.setBounds(230, 160, 300, 30);
            rgAluno.setForeground(Color.BLACK);
        }
        return rgAluno;
    }

    public static JTextField getCpf() {
        if (cpfAluno == null) {
            cpfAluno = new JTextField();
            cpfAluno.setBounds(230, 220, 300, 30);
            cpfAluno.setForeground(Color.BLACK);
        }
        return cpfAluno;
    }

    public static JButton getCadastrarAluno() {
        if (cadastrarAluno == null) {
            cadastrarAluno = new JButton("Cadastrar Aluno");
            cadastrarAluno.setBounds(230, 260, 300, 30);
            cadastrarAluno.setForeground(Color.BLACK);
        }
        return cadastrarAluno;
    }

    public static JLabel getLabelNome() {
        if (labelNome == null) {
            labelNome = new JLabel("Nome do aluno:");
            labelNome.setVisible(true);
            labelNome.setBounds(230, 0, 200, 50);
            labelNome.setForeground(Color.WHITE);
        }
        return labelNome;
    }

    public static JLabel getLabelMatricula() {
        if (labelMatricula == null) {
            labelMatricula = new JLabel("Matrícula:");
            labelMatricula.setVisible(true);
            labelMatricula.setBounds(230, 60, 200, 50);
            labelMatricula.setForeground(Color.WHITE);
        }
        return labelMatricula;
    }

    public static JLabel getLabelRg() {
        if (labelRg == null) {
            labelRg = new JLabel("RG:");
            labelRg.setVisible(true);
            labelRg.setBounds(230, 120, 220, 50);
            labelRg.setForeground(Color.WHITE);
        }
        return labelRg;
    }

    public static JLabel getLabelCpf() {
        if (labelCpfAluno == null) {
            labelCpfAluno = new JLabel("CPF:");
            labelCpfAluno.setVisible(true);
            labelCpfAluno.setBounds(230, 180, 220, 50);
            labelCpfAluno.setForeground(Color.WHITE);
        }
        return labelCpfAluno;
    }

    private void cadastrarAluno() {
        String nome = nomeAluno.getText();
        String matricula = nummatricula.getText();
        String rg = rgAluno.getText();
        String cpf = cpfAluno.getText();

        String alunoData = "------------------------\n" +"Nome: "+ nome + "\n" +"Matricula: "+ matricula + "\n" +"RG: " + rg + "\n" + "CPF: " + cpf +"\n" +"------------------------";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("alunos.txt", true))) {
            writer.write(alunoData);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Limpar os campos após o cadastro
        nomeAluno.setText("");
        nummatricula.setText("");
        rgAluno.setText("");
        cpfAluno.setText("");
    }
}
