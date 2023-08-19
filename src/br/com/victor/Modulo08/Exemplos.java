package br.com.victor.Modulo08;

/**
 * @author Victor$
 * @date 19/08/2023$
 * Description:
 */
public class Exemplos {

    private int codigo = 1;

    private long codigoMaior = 328190;

    private float valorDecimal = 10.0f;

    private double valorDecimal1 = 10.1;

    private String texto = "Teste";

    private boolean status = false;

    private short valor16Bits;

    private byte valor8Bits;

    public Exemplos(int val) {
        this.codigo = val;
    }

    public String retornarTexto() {
        return "Retornando uma String";
    }

    public int retornarInteiro() {
        int val = 10;
        String texto = "teste";
        this.texto = null;
        return val;
    }

    public long retornarLong(long num) {
        return num;
    }
}
