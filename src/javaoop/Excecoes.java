package javaoop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excecoes extends RuntimeException{
    public static void calculoQuociente () {
        int a = 0;
        int b = 300;

        try {
            int quociente = b / a;
        } catch (ArithmeticException ex){
            System.out.println("Ocorreu um erro: " + ex.getMessage());
        } finally {
            System.out.println("Nao pode ser dividido por zero");
        }
    }

    public static void dividir(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Nao pode ser dividido por zero");
        } else {
            double result = a / b;
            System.out.println(result);
        }
    }

    public static void exercicio2(){
        String mensagemFinal = "Esta é a última mensagem";
        try {
            int[] num = new int[5];
            num[5] = 10;
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println(mensagemFinal);
        }
    }

    public static void lerArquivo(String nomeArquivo) throws IOException{
        try {
            String texto = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));
            while ((texto = bufferedReader.readLine()) != null){
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (IOException e){
            System.out.println("Erro ao ler o arquivo especificado");
        }
    }

    public static void lerArquivo2(String nomeArquivo) throws IOException{
        try {
            String texto = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));
            while ((texto = bufferedReader.readLine()) != null){
                System.out.println(texto);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e){
            System.out.println("O arquivo especificado nao foi encontrado");
        }
    }

    public static void maximo() {
        double a = 47d;
        double b = 88d;
        System.out.println(Math.max(a, b));
    }

    public static void minimo() {
        double a = 37d;
        double b = 11d;
        System.out.println(Math.min(a, b));
    }

    public static void potencia() {
        double a = 5d;
        double b = 3d;
        System.out.println(Math.pow(a, b));
    }

    public static void cosseno(){
        double a = 180d;
        a = Math.toRadians(a);
        System.out.println("Math.cos(" + a + ") = " + Math.cos(a));
    }

    public static void raiz(){
        double a = 25d;
        System.out.println(Math.sqrt(a));
    }

    public static void aleatorio(){
        double numeroAleatorio = Math.random() * 1000;
        System.out.printf("%.0f\n", numeroAleatorio);
    }

}
