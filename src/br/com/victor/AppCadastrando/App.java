package br.com.victor.AppCadastrando;

import br.com.victor.AppCadastrando.dao.ClienteSetDao;
import br.com.victor.AppCadastrando.dao.IClienteDAO;
import br.com.victor.AppCadastrando.domain.Cliente;

import javax.swing.*;


/**
 * @author Victor$
 * @date 9/13/2023$
 * Description:
 */
public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteSetDao();

        String opcao = JOptionPane.showInputDialog(null,"Digite 1 para cadastro, 2 para consultar" +
                " 3 para exclusão, 4 para alteração ou 5 para sair",
                "CADASTRO", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,"Opcão inválida. Digite 1 para cadastrar, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {

            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por vígula como no exemplo: nome, cpf, tel, end, numero, cidade, estado.",
                        "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsulta(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF do cliente.", "CONSULTA",
                        JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExclusao(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF que deseja excluir.",
                        "EXCLUSÃO", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else if (isAlterar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por vígula como no exemplo: nome, cpf, tel, end, numero, cidade, estado.",
                        "AlTERAÇÃO", JOptionPane.INFORMATION_MESSAGE);
                atualizar(dados);
            }

            opcao = JOptionPane.showInputDialog(null,"Digite 1 para cadastro, 2 para consultar," +
                            " 3 para exclusão, 4 para alteração ou 5 para sair",
                    "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void atualizar(String dados) {

        String[] dadosSeparados = dados.split(",");
        Cliente novoCliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2],
                dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        iClienteDAO.alterar(novoCliente);
        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!",
                "SUCESSO", JOptionPane.INFORMATION_MESSAGE);


    }

    private static boolean isAlterar(String opcao) {
        if ("4".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso.",
                "EXCLUSÃO", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isExclusao(String opcao) {
        if ("3".equals(opcao)) {
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

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado com sucesso: " + cliente.toString(),
                    "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!",
                    "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isConsulta(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3],
                dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
        Boolean isCadsatrado = iClienteDAO.cadastrar(cliente);
        if (isCadsatrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!",
                    "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado no sistema!",
                    "ERRO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadastro(String opcao) {
        if (opcao.equals("1")) {
            return true;
        }
        return false;
    }

    private static void sair() {
        String clienteCadastrados = "";
        for (Cliente cliente : iClienteDAO.buscarTodos()) {
            clienteCadastrados += cliente.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, "Clientes cadastrados: " + clienteCadastrados,
                "ATÉ LOGO!", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) ||
                "3".equals(opcao) || "4".equals(opcao) ||
                "5".equals(opcao)) {
            return true;
        }
        return false;
    }
}
