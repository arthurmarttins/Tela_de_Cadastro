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

public class CadastroDisciplinaPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private static JTextField nomeDisciplina;
    private static JTextField codigoDisciplina;
    private static JTextField cargaHoraria;
    private static JTextField descricaoDisciplina;
    private static JButton cadastrarDisciplina = null;
    private static JLabel labelNomeDisciplina;
    private static JLabel labelCodigoDisciplina;
    private static JLabel labelCargaHoraria;
    private static JLabel labelDescricaoDisciplina;

    public CadastroDisciplinaPanel() {
        setLayout(null);
        setBackground(new Color(20, 20, 70));

        this.setLayout(null);
        this.add(getNomeDisciplina());
        this.add(getCodigoDisciplina());
        this.add(getCargaHoraria());
        this.add(getDescricaoDisciplina());
        this.add(getCadastrarDisciplina());
        this.add(getLabelNomeDisciplina());
        this.add(getLabelCodigoDisciplina());
        this.add(getLabelCargaHoraria());
        this.add(getLabelDescricaoDisciplina());

        cadastrarDisciplina.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarDisciplina();
            }
        });
    }

    public static JTextField getNomeDisciplina() {
        if (nomeDisciplina == null) {
            nomeDisciplina = new JTextField();
            nomeDisciplina.setBounds(230, 40, 300, 30);
            nomeDisciplina.setForeground(Color.BLACK);
        }
        return nomeDisciplina;
    }

    public static JTextField getCodigoDisciplina() {
        if (codigoDisciplina == null) {
            codigoDisciplina = new JTextField();
            codigoDisciplina.setBounds(230, 100, 300, 30);
            codigoDisciplina.setForeground(Color.BLACK);
        }
        return codigoDisciplina;
    }

    public static JTextField getCargaHoraria() {
        if (cargaHoraria == null) {
            cargaHoraria = new JTextField();
            cargaHoraria.setBounds(230, 160, 300, 30);
            cargaHoraria.setForeground(Color.BLACK);
        }
        return cargaHoraria;
    }

    public static JTextField getDescricaoDisciplina() {
        if (descricaoDisciplina == null) {
            descricaoDisciplina = new JTextField();
            descricaoDisciplina.setBounds(230, 220, 300, 30);
            descricaoDisciplina.setForeground(Color.BLACK);
        }
        return descricaoDisciplina;
    }

    public static JButton getCadastrarDisciplina() {
        if (cadastrarDisciplina == null) {
            cadastrarDisciplina = new JButton("Cadastrar Disciplina");
            cadastrarDisciplina.setBounds(230, 260, 300, 30);
            cadastrarDisciplina.setForeground(Color.BLACK);
        }
        return cadastrarDisciplina;
    }

    public static JLabel getLabelNomeDisciplina() {
        if (labelNomeDisciplina == null) {
            labelNomeDisciplina = new JLabel("Nome da disciplina:");
            labelNomeDisciplina.setVisible(true);
            labelNomeDisciplina.setBounds(230, 0, 200, 50);
            labelNomeDisciplina.setForeground(Color.WHITE);
        }
        return labelNomeDisciplina;
    }

    public static JLabel getLabelCodigoDisciplina() {
        if (labelCodigoDisciplina == null) {
            labelCodigoDisciplina = new JLabel("Código da Disciplina:");
            labelCodigoDisciplina.setVisible(true);
            labelCodigoDisciplina.setBounds(230, 60, 220, 50);
            labelCodigoDisciplina.setForeground(Color.WHITE);
        }
        return labelCodigoDisciplina;
    }

    public static JLabel getLabelCargaHoraria() {
        if (labelCargaHoraria == null) {
            labelCargaHoraria = new JLabel("Carga horária:");
            labelCargaHoraria.setVisible(true);
            labelCargaHoraria.setBounds(230, 120, 260, 50);
            labelCargaHoraria.setForeground(Color.WHITE);
        }
        return labelCargaHoraria;
    }

    public static JLabel getLabelDescricaoDisciplina() {
        if (labelDescricaoDisciplina == null) {
            labelDescricaoDisciplina = new JLabel("Descrição da disciplina:");
            labelDescricaoDisciplina.setVisible(true);
            labelDescricaoDisciplina.setBounds(230, 180, 260, 50);
            labelDescricaoDisciplina.setForeground(Color.WHITE);
        }
        return labelDescricaoDisciplina;
    }

    private void cadastrarDisciplina() {
        String nome = nomeDisciplina.getText();
        String codigo = codigoDisciplina.getText();
        String cargaHor = cargaHoraria.getText();
        String descricao = descricaoDisciplina.getText();

        String disciplinaData = "------------------------\n"
								+"Nome: "+ nome + "\n" 
								+"Codigo: "+ codigo + "\n" 
								+"Carga Horaria: " + cargaHor + "\n" 
								+ "Descrição: " + descricao +"\n"
								+"------------------------";
        		
       

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("disciplinas.txt", true))) {
            writer.write(disciplinaData);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Limpar os campos após o cadastro
        nomeDisciplina.setText("");
        codigoDisciplina.setText("");
        cargaHoraria.setText("");
        descricaoDisciplina.setText("");
    }
}
