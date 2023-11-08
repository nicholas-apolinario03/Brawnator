package com.mycompany.brawnator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Brawnator {
    public static void main(String[] args) {
        List<String[]> homem = new ArrayList<>();
        String[] homem1 = {"Ezio", "espada", "orb"};
        String[] homem2 = {"koji", "arco", "espada"};
        String[] homem3 = {"jiro", "espada", "foice"};
        String[] homem4 = {"rayman", "luvas", "machado"};
        String[] homem5 = {"lord vraxx", "vassoura", "pistola"};
        homem.add(homem1);
        homem.add(homem2);
        homem.add(homem3);
        homem.add(homem4);
        homem.add(homem5);

        List<String[]> mulher = new ArrayList<>();
        String[] mulher1 = {"Scalert", "martelo", "lança"};
        String[] mulher2 = {"ada", "pistola", "lança"};
        String[] mulher3 = {"asuri", "garras", "espada"};
        String[] mulher4 = {"jhala", "espada", "machado"};
        String[] mulher5 = {"val", "lâmina", "luvas"};
        mulher.add(mulher1);
        mulher.add(mulher2);
        mulher.add(mulher3);
        mulher.add(mulher4);
        mulher.add(mulher5);

        JFrame janela = new JFrame("Brawnator");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 200);
        
        JPanel painel = new JPanel();
        
        JTextField generoTextField = new JTextField(20);
        generoTextField.setText("Gênero (homem/mulher)");
        JTextField armaPrincipalTextField = new JTextField(20);
        armaPrincipalTextField.setText("Arma Principal");
        JTextField armaSecundariaTextField = new JTextField(20);
        armaSecundariaTextField.setText("Arma Secundária");

        JButton buscarButton = new JButton("Buscar");
        
        JLabel resultadoLabel = new JLabel("Seu personagem é: ");
        resultadoLabel.setVisible(false);
        
        painel.add(resultadoLabel);
        painel.add(generoTextField);
        painel.add(armaPrincipalTextField);
        painel.add(armaSecundariaTextField);
        painel.add(buscarButton);

        janela.add(painel);

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String genero = generoTextField.getText();
                String armaPrincipal = armaPrincipalTextField.getText();
                String armaSecundaria = armaSecundariaTextField.getText();
                boolean encontrado = false;

                List<String[]> personagens = (genero.equals("homem")) ? homem : mulher;

                for (String[] personagem : personagens) {
                    if (personagem[1].equals(armaPrincipal) && personagem[2].equals(armaSecundaria)) {
                        encontrado = true;
                        resultadoLabel.setText("Seu personagem é: " + personagem[0]);
                        resultadoLabel.setVisible(true); 
                        break;
                    }
                }

                if (!encontrado) {
                    resultadoLabel.setText("Personagem não encontrado.");
                    resultadoLabel.setVisible(true);
                }
            }
        });


        janela.setVisible(true);
    }
}
