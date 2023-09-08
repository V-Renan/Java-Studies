package br.com.victor.AppCadastro;

import br.com.victor.AppCadastro.dao.ClienteMapDAO;
import br.com.victor.AppCadastro.dao.IClienteDAO;
import br.com.victor.AppCadastro.domain.Cliente;

import javax.swing.*;


/**
 * @author Victor$
 * @date 9/7/2023$
 * Description:
 */
public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);

        }

        while (isOpcaoValida(opcao)) {
            if (isopcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por vírgula conforme o exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o cpf para fazer a busca.", "Consultar", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExclusao(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o cpf para fazer a exclusão.", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else if (isAlterar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados separados por vírgula conforme o exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado.", "Alteração", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consulta, 3 para cadastro, 4 para exclusão ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static Boolean isAlterar(String opcao) {
        if ("4".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void alterar(String dados) {
        String[] dadosSeparados = dados.split(",");
        String cpf = dadosSeparados[1]; // CPF é o segundo elemento.
        Cliente clienteExistente = iClienteDAO.consultar(Long.parseLong(cpf));
        if (clienteExistente != null) {
            clienteExistente.setNome(dadosSeparados[0]);
            clienteExistente.setTel(Long.valueOf(dadosSeparados[2]));
            clienteExistente.setEnd(dadosSeparados[3]);
            clienteExistente.setNumero(Integer.valueOf(dadosSeparados[4]));
            clienteExistente.setCidade(dadosSeparados[5]);
            clienteExistente.setEstado(dadosSeparados[6]);
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado para alteração!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static Boolean isExclusao(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente exluido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isopcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static Boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado com sucesso!" + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo", "sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }

}

