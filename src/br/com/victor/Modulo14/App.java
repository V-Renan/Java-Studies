package br.com.victor.Modulo14;

import br.com.victor.Modulo14.dao.ClienteMapDAO;
import br.com.victor.Modulo14.dao.IClienteDAO;
import br.com.victor.Modulo14.domain.Cliente;

import javax.swing.*;

/**
 * @author Victor$
 * @date 9/5/2023$
 * Description:
 */
public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair", "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null, "Opção inválida digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair", "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por vírgula conforme exemplo: Nome, CPF, Telefone, Endereço, número, Cidade, Estado", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o cpf", "Consultar", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isOpcaoExluir(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o cpf", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else if (isAtualizar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por vírgula, conforme exmeplo: Nome, CPF, Telefone, Enderenço, Número, Cidade, Estado", "Atualização", JOptionPane.INFORMATION_MESSAGE);
                atualizar(dados);
            }


            opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }

        opcao = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isAtualizar(String opcao) {
        if ("4".equals(opcao)) {
            return true;
        }
        return false;
    }

    public static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static boolean isOpcaoExluir(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    public static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null,"Cliente excluído com sucesso: ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        //Tentar validar se todos os campos estão preenchidos.
        //Se não tiver, passar null no construtor onde o valor é nulo
        //Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],null,dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6])
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo: ", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isopcaoCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }


}
