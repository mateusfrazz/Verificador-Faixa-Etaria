package controle.desafios;

import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Pegando a Faixa Etaria do usuario
        System.out.println("Informe sua idade por gentileza: ");
        int faixaetaria = entrada.nextInt();

        //Criando condições para cada faixa Etaria
        if (faixaetaria >= 0 && faixaetaria <= 12) {
            System.out.println("Você está na faixa etaria categorizada para crianças");
        }
        if (faixaetaria >= 13 && faixaetaria <= 19) {
            System.out.println("Você está na faixa Etaria Categorizada para Adolescentes");
        }
        if (faixaetaria >= 20 && faixaetaria <= 59){
            System.out.println("Você está na faixa etaria categorizada para Adultos");
        }
        if (faixaetaria >= 60){
            System.out.println("Você está na faixa Etaria categorizada para Idosos");
        }

    }
}
