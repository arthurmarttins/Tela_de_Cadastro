package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicialView extends JFrame {
    private JLabel labelBoasVindas;
    private JButton botaoCadastroProfessor;
    private JButton botaoCadastroAluno;
    private JButton botaoCadastroDisciplina;
    
    private TelaInicialListener listener;
    
    public TelaInicialView() {
        setTitle("Tela Inicial");
        setSize(780, 460);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        labelBoasVindas = new JLabel("BEM-VINDO A TELA DE CADASTRO"+"\n");
        botaoCadastroProfessor = new JButton("Cadastro de Professor");
        botaoCadastroAluno = new JButton("Cadastro de Aluno");
        botaoCadastroDisciplina = new JButton("Cadastro de Disciplina");
        
        botaoCadastroProfessor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (listener != null) {
                    listener.onCadastroProfessorClicked();
                }
            }
        });
        
        botaoCadastroAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (listener != null) {
                    listener.onCadastroAlunoClicked();
                }
            }
        });
        
        botaoCadastroDisciplina.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (listener != null) {
                    listener.onCadastroDisciplinaClicked();
                }
            }
        });
        
        add(labelBoasVindas);
        add(botaoCadastroProfessor);
        add(botaoCadastroAluno);
        add(botaoCadastroDisciplina);
    }
    
    public void setTelaInicialListener(TelaInicialListener listener) {
        this.listener = listener;
    }
    
    public interface TelaInicialListener {
        void onCadastroProfessorClicked();
        void onCadastroAlunoClicked();
        void onCadastroDisciplinaClicked();
    }
}
