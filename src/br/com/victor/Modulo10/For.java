package br.com.victor.Modulo10;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor$
 * @date 22/08/2023$
 * Description:
 */
public class For {

    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Linha " + i);
            valores.add(i);
        }

        for (Integer i : valores) {
            System.out.println("Linha² " + i);
        }

        valores.forEach(i -> System.out.println("Linha³ " + i));
    }
}
