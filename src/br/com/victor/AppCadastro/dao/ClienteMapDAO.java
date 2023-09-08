package br.com.victor.AppCadastro.dao;

import br.com.victor.AppCadastro.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Victor$
 * @date 9/7/2023$
 * Description:
 */
public class ClienteMapDAO implements IClienteDAO{

    private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }


    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())) {
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = this.map.get(cpf);

        if (clienteCadastrado != null) {
            this.map.remove(clienteCadastrado.getCpf());
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            cliente.setNome(cliente.getNome());
            cliente.setTel(cliente.getTel());
            cliente.setNumero(cliente.getNumero());
            cliente.setEnd(cliente.getEnd());
            cliente.setCidade(cliente.getCidade());
            cliente.setEstado(cliente.getEstado());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}
