package br.com.victor.Modulo11.set;

import br.com.victor.Modulo11.domain.Aluno;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rodrigo.pires
 */
public class ExemploHashSetAluno {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploConsultando();
        exemploRemover();
        exemploListaSolo();
    }

    private static void exemploListaSolo() {
        System.out.println("**** ExemploListaSolo ****");

        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno A = new Aluno("Victor Renan", "Engenharia de Software", 10);
        Aluno B = new Aluno("Gizelle Batista", "Marketing Digital", 10);
        Aluno C = new Aluno("Maria Silva", "Letras", 10);

        conjunto.add(A);
        conjunto.add(B);
        conjunto.add(C);
        System.out.println(conjunto);
        System.out.println("Após remover");
        conjunto.remove(C);
        System.out.println(conjunto);

        boolean contem = conjunto.contains(C);
        if (!contem) {
            System.out.println("Aluno não encontrado!");
        } else {
            System.out.println("Aluno encontrado!");
        }

    }


    private static void exemploRemover() {
        System.out.println("**** exemploRemover ****");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 10);
        Aluno e = new Aluno("Teste", "OpenOffice", 10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);

        conjunto.remove(a);
        System.out.println(conjunto);

        System.out.println("Imprir usando for");
        for (Aluno aluno : conjunto) {
            System.out.println(aluno);
        }
    }

    private static void exemploConsultando() {
        System.out.println("**** exemploConsultando ****");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 10);
        Aluno e = new Aluno("Teste", "OpenOffice", 10);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto.contains(e));
    }

    /**
     * Para não repetir objetos na lista de alunos é necessário que a classe
     * Aluno implemente o equals e hashcode
     */
    private static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno e = new Aluno("Victor Renan", "Engenharia de Software", 9);
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        conjunto.add(e);
        //System.out.println(conjunto);

        for (Aluno aluno : conjunto) {
            System.out.println(aluno.getNome());
        }
        for (Aluno curso : conjunto) {
            System.out.println(curso.getCurso());
        }
    }
}
