package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Janela extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel labelBoasVindas;
    private JLabel segundaFrase;
    private JButton botaoCadastroProfessor;
    private JButton botaoCadastroAluno;
    private JButton botaoCadastroDisciplina;

    private CadastroProfessorPanel cadastroProfessorPanel;
    private CadastroAlunoPanel cadastroAlunoPanel;
    private CadastroDisciplinaPanel cadastroDisciplinaPanel;

    public Janela() {
        setTitle("Tela Inicial");
        setSize(780, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(20, 20, 70)); // Define a cor de fundo como azul escuro
                g.fillRect(0, 0, getWidth(), getHeight());
              
             
            }
        };
        
       

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Adiciona margem interna

        labelBoasVindas = new JLabel("BEM-VINDO A TELA DE CADASTRO\n");
        labelBoasVindas.setFont(new Font("Arial", Font.BOLD, 24));
        labelBoasVindas.setForeground(Color.WHITE); // Define a cor do texto para branco

        segundaFrase = new JLabel("Por favor, selecione uma opção abaixo:");
        segundaFrase.setFont(new Font("Arial", Font.PLAIN, 16));
        segundaFrase.setForeground(Color.WHITE); // Define a cor do texto para branco

        botaoCadastroProfessor = new JButton("PROFESSOR");
        botaoCadastroAluno = new JButton("ALUNO");
        botaoCadastroDisciplina = new JButton("DISCIPLINA");

        Font buttonFont = new Font("Arial", Font.PLAIN, 13);

        botaoCadastroProfessor.setFont(buttonFont);
        botaoCadastroAluno.setFont(buttonFont);
        botaoCadastroDisciplina.setFont(buttonFont);

        botaoCadastroProfessor.setForeground(Color.BLACK); // Define a cor do texto para branco
        botaoCadastroAluno.setForeground(Color.BLACK); // Define a cor do texto para branco
        botaoCadastroDisciplina.setForeground(Color.BLACK); // Define a cor do texto para branco

        JPanel labelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        labelPanel.setOpaque(false); // Torna o painel transparente
        labelPanel.add(labelBoasVindas);

        JPanel secondLabelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        secondLabelPanel.setOpaque(false); // Torna o painel transparente
        secondLabelPanel.add(segundaFrase);

        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Define espaçamento entre os botões
        buttonsPanel.setOpaque(false); // Torna o painel transparente
        buttonsPanel.add(botaoCadastroProfessor);
        buttonsPanel.add(botaoCadastroAluno);
        buttonsPanel.add(botaoCadastroDisciplina);

        mainPanel.add(labelPanel);
        mainPanel.add(Box.createVerticalStrut(20)); // Adiciona espaço vertical
        mainPanel.add(secondLabelPanel);
        mainPanel.add(Box.createVerticalStrut(20)); // Adiciona espaço vertical
        mainPanel.add(buttonsPanel);

        setContentPane(mainPanel); // Define o painel personalizado como conteúdo principal

        // Centraliza a janela na tela
        setLocationRelativeTo(null);

        cadastroProfessorPanel = new CadastroProfessorPanel();
        cadastroAlunoPanel = new CadastroAlunoPanel();
        cadastroDisciplinaPanel = new CadastroDisciplinaPanel();

        // Configura os listeners dos botões
        botaoCadastroProfessor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCadastroProfessorPanel();
            }
        });

        botaoCadastroAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCadastroAlunoPanel();
            }
        });

        botaoCadastroDisciplina.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCadastroDisciplinaPanel();
            }
        });
    }
    
    public void showCadastroProfessorPanel() {
        JFrame frame = new JFrame("Cadastro de Professor");
        frame.setSize(780, 460); // Define as mesmas dimensões da tela inicial
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(cadastroProfessorPanel);
        frame.setLocationRelativeTo(null); // Centraliza a janela
        frame.setVisible(true);
    }


    public void showCadastroAlunoPanel() {
        JFrame frame = new JFrame("Cadastro de Aluno");
        frame.setSize(780, 460); // Define as mesmas dimensões da tela inicial
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(cadastroAlunoPanel);
        frame.setLocationRelativeTo(null); // Centraliza a janela
        frame.setVisible(true);
    }

    public void showCadastroDisciplinaPanel() {
        JFrame frame = new JFrame("Cadastro de Disciplina");
        frame.setSize(780, 460); // Define as mesmas dimensões da tela inicial
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(cadastroDisciplinaPanel);
        frame.setLocationRelativeTo(null); // Centraliza a janela
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Janela view = new Janela();
        view.setVisible(true);
    }
}
