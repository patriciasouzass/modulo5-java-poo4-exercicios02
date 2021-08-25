package javaoop;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("----------- Exercício 1-1 -----------");
        Excecoes.calculoQuociente();

        System.out.println("----------- Exercício 2 -----------");
        Excecoes.exercicio2();

        System.out.println("----------- Exercício 3 - FileNotFoundException -----------");
        Excecoes.lerArquivo2("AulaExcecoes");

        System.out.println("----------- Exercício 3 - IOException -----------");
        Excecoes.lerArquivo("AulaExcecoes");

        System.out.println("----------- Exercício 4 -----------");
        Excecoes.minimo();
        Excecoes.maximo();
        Excecoes.potencia();
        Excecoes.cosseno();
        Excecoes.raiz();
        Excecoes.aleatorio();

        System.out.println("----------- Exercício 1-2 -----------");
        Excecoes.dividir(300, 0);
    }
}
