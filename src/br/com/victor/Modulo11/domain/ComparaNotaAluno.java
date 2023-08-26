package br.com.victor.Modulo11.domain;

import java.util.Comparator;

/**
 * @author rodrigo.pires
 */
public class ComparaNotaAluno implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        //return Double.valueOf(o1.getNota()).compareTo(Double.valueOf(o2.getNota()));
        //return Double.compare(o2.getNota(), o1.getNota());
        return Double.compare(o2.getNota(), o1.getNota());
    }
}
