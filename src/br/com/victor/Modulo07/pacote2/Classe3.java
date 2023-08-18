package br.com.victor.Modulo07.pacote2;

import br.com.victor.Modulo07.Cliente;
import br.com.victor.Modulo07.ItemVenda;
import br.com.victor.Modulo07.pacote1.Classe1;
import br.com.victor.Modulo07.pacote1.Classe2;

/**
 * @author Victor$
 * @date 18/08/2023$
 *
 *
 */
public class Classe3 extends Classe2 {

    /**
     * Comentário do que o método faz
     *
     * @param args teste
     */

    public static void main(String[] args){
        //this.
        Classe2 classe2 = new Classe2();
        //classe2.propriedadePublica
        Classe1 class1 = new Classe1();
        //class1.propriedadePublica
        //class1.testeVictor
        Cliente cliente = new Cliente();

        ItemVenda  item = new ItemVenda();

        cliente.getValorTotal();
    }

}
