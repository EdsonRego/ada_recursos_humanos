package com.edsonrego.rh;

import java.math.BigDecimal;

public class TesteRh {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Edson Rego", 97260, new BigDecimal(8200));
        Gerente gerente = new Gerente("Vastir Rego", 123456, new BigDecimal(8200));

        empregado.baterPonto();
        empregado.trabalhar();

        gerente.baterPonto();
        gerente.trabalhar();

        System.out.println(empregado.getSalario());
        System.out.println(gerente.getSalario());

        System.out.println(empregado.toString());
        System.out.println(gerente.toString());
    }
}
