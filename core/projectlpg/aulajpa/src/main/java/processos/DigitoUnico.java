package processos;

import java.util.Scanner;

public class DigitoUnico {
    public static void digitounico(){
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um nome: ");
        String nome = String.valueOf(entrada.nextLine());

        System.out.println("Informe um número inteiro: ");
        Integer numberFim = Integer.parseInt(String.valueOf(entrada.nextInt()));

        entrada.close();

        // Convertendo integer para String
        String numberStr = numberFim.toString();
        // separando cada elemento da String para dentro de uma lista de char
        char[] digitosLista = numberStr.toCharArray();
        // variável de controle de tamanho
        Integer tam = digitosLista.length;
        // Controle de loop
        boolean active = false;
        // confirmando ter mais de um dígito o número informado
        if(tam > 1){
            active = true;
        }
        // inicializando variáveis de controle e exibição ( ant -> número anterior )
        Integer ant = 0;
        Integer num = 0;
        Integer cont = 0;

        // Se active for true
        while(active){
            // restartando as variáveis no scopo interno do loop
            ant = 0;
            num = 0;
            cont = 0;
            
            for (int i =0; i < tam; i++) {
            
                if(cont == 0){
                    num = num + Integer.parseInt(String.valueOf(digitosLista[i]));
                    ant = num;
                    System.out.println((cont+1)+"º valor de num: "+num);
                }else{
                    num = num + Integer.parseInt(String.valueOf(digitosLista[i]));
                    System.out.println("-> "+ant+" + "+String.valueOf(digitosLista[i])+" ");
                    ant = num;
                    System.out.println((cont+1)+"º valor de num: "+num);
                }
                
                cont++;
            }
            // zerando lista e remontando parâmetros e reiniciando tam para validação do loop
            digitosLista = new char[]{};
            numberStr = num.toString();
            digitosLista = numberStr.toCharArray();
            tam = digitosLista.length;

            if(tam > 1){
                active = true;
            }else if(tam == 1){
                active = false;
            }                        
            

        }
        // último estágio
        System.out.println("Olá "+nome+"\nO Digito Único do número "+numberFim+" <é> "+num);

    }
        
}
