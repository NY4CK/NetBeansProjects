package RegistroConsulta;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Listagem {

    public static ArrayList<Registro> lista = new ArrayList();
    private static int Id = 0;

    public static void checagem(Registro ca) {

        try {
            ca.setId(++Id);
            
            if (ca.getNome().isEmpty() || ca.getNome().isBlank()) {
                JOptionPane.showMessageDialog(null, "Preencha o nome do paciente", "Erro", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!validatePhoneNumber(ca.getTelefone()) || ca.getTelefone().isBlank() || ca.getTelefone().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Telefone inválido. Preencha corretamente!\nExemplo: (12) 34567-8910", "Erro", JOptionPane.WARNING_MESSAGE);
                return;

            }
            if (!validarCPF(ca.getCpf()) || ca.getCpf().isBlank() || ca.getCpf().isEmpty()) {
                JOptionPane.showMessageDialog(null, "CPF inválido. Preencha corretamente!\nExemplo: 123.456.789-10", "Erro", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!validarData(ca.getData()) || ca.getData().isBlank() || ca.getData().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Data inválida. Preencha corretamente!\nExemplo: 02/02/2006", "Erro", JOptionPane.WARNING_MESSAGE);

                
                
            } else {

                //System.out.println(ca.getCheckbox());
                lista.add(ca);

                JOptionPane.showMessageDialog(null, "lista adicionada", "OK", JOptionPane.WARNING_MESSAGE);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar na lista", "Erro", JOptionPane.WARNING_MESSAGE);

        }

    }

    public static boolean validatePhoneNumber(String phoneNumber) {

        String regex = "\\(\\d{2}\\) \\d{5}-\\d{4}";
        return phoneNumber.matches(regex);
    }

    public static boolean validarCPF(String CPF) {

        String regexcpf = "\\d{3}.\\d{3}.\\d{3}-\\d{2}";
        return CPF.matches(regexcpf);
    }

    public static boolean validarData(String Data) {
        String regexdata = "\\d{2}/\\d{2}/\\d{4}";
        return Data.matches(regexdata);
    }

    public static ArrayList<Registro> Listar() {
        return lista;
    }
public static boolean excluir(int posicao) {
    if (posicao >= 0 && posicao < lista.size()) {
        lista.remove(posicao);
        return true;
    }
    return false;
}

}
