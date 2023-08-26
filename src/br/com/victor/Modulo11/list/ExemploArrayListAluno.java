package br.com.victor.Modulo11.list;

import br.com.victor.Modulo11.domain.Aluno;
import br.com.victor.Modulo11.domain.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author rodrigo.pires
 */
public class ExemploArrayListAluno {

    public static void main(String args[]) {
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {
        System.out.println("****** exemploListaSimplesOrdenadaClasseExterna ******");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Victor Renan", "Engenharia de Software", 0);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {
        System.out.println("****** exemploListaSimplesOrdenadaComparatorAluno ******");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 20);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 30);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 10);
        Aluno d = new Aluno("Victor Renan", "Engenharia de Software", 10);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        System.out.println("Lista sem ordenação" + lista);
        //Collections.sort(lista);
        System.out.println("Lista com ordenação" + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista com ordenação por nota" + lista);

        System.out.println("");

        System.out.println("------------------------------------------------------------------------");

        for (Aluno aluno : lista) {
            System.out.println("Nome: " + aluno.getNome() + " | Curso: " + aluno.getCurso() + " | Nota: " + aluno.getNota());
        }

        System.out.println();
        System.out.println("------------------------------------------------------------------------");
    }
}
