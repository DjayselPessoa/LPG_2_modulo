package aplicacao;

import java.util.Scanner;

import dominio.Pessoa;
import processos.DigitoUnico;

public class Programa {
    
    public static void main(String[] args){
        Pessoa p1 = new Pessoa(1, "Djaysel Pessoa", "djaysel@gmail.com");
        Pessoa p2 = new Pessoa(2, "Ben", "ben@gmail.com");
        Pessoa p3 = new Pessoa(3, "Lih", "lih@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um nome: ");
        String nome = String.valueOf(entrada.nextLine());
        System.out.println("Informe um número inteiro: ");
        Integer numberFim = Integer.parseInt(String.valueOf(entrada.nextInt()));
        entrada.close();
        DigitoUnico.digitounico(nome,numberFim);
        
    }

    
}
