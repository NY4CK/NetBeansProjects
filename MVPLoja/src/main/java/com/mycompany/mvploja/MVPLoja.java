
package com.mycompany.mvploja;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MVPLoja {

    public static void main(String[] args) {

        JFrame janela = new JFrame();
        janela.setSize(300, 200);
        janela.setTitle("MVP Loja");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        JLabel rotulo = new JLabel("Digite o valor da venda:");
        janela.add(rotulo);

        JTextField campoValorVenda = new JTextField(10);
        janela.add(campoValorVenda);

        JButton botao = new JButton("Calcular Total");
        janela.add(botao);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valorVenda = Double.parseDouble(campoValorVenda.getText());

                    if (valorVenda > 500) {
                        JTextField campoDesconto = new JTextField(10);
                        int resultadoDesconto = JOptionPane.showConfirmDialog(janela, campoDesconto, 
                                "Informe o percentual de desconto", JOptionPane.OK_CANCEL_OPTION);
                        
                        if (resultadoDesconto == JOptionPane.OK_OPTION) {
                            double percentualDesconto = Double.parseDouble(campoDesconto.getText());
                            double desconto = valorVenda * (percentualDesconto / 100);
                            double valorTotalComDesconto = valorVenda - desconto;
                            
                            JOptionPane.showMessageDialog(janela, "Valor Total com Desconto: " + valorTotalComDesconto);
                        }
                    } else {
                        JOptionPane.showMessageDialog(janela, "Valor Total: " + valorVenda);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(janela, "Por favor, insira um valor válido.");
                }
            }
        });

        janela.setVisible(true);
    }
}

