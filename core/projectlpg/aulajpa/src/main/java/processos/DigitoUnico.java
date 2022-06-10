package processos;

import java.util.Scanner;

public class DigitoUnico {
    public static void digitounico(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um nome: ");
        String nome = String.valueOf(entrada.nextLine());

        System.out.println("Informe um número inteiro: ");
        Integer numberFim = Integer.parseInt(String.valueOf(entrada.nextInt()));

        entrada.close();
        String numberStr = numberFim.toString();

        char[] digitosLista = numberStr.toCharArray();
        Integer ant = 0;
        Integer num = 0;
        Integer cont = 0;
        
        for (int i =0; i < digitosLista.length; i++) {
           
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
        
        String numberStr2 = num.toString();

        num = 0;
        cont = 0;
        ant = 0;
        char[] digitosLista2 = numberStr2.toCharArray();
        if(digitosLista2.length < 3){
            for (int x = 0; x < digitosLista2.length; x++){
                if(cont == 0){
                    num = num + Integer.parseInt(String.valueOf(digitosLista2[x]));
                    ant = num;
                    System.out.println((cont+1)+"º valor de num: "+num);
                }else{
                    num = num + Integer.parseInt(String.valueOf(digitosLista2[x]));
                    System.out.println("-> "+ant+" + "+String.valueOf(digitosLista[x])+" ");
                    ant = num;
                    System.out.println((cont+1)+"º valor de num: "+num);
                }
                
                cont++;
            }

        }
        

        System.out.println("Olá "+nome+"\nO valor final do número é: "+num);
        
        

    }
        
}
