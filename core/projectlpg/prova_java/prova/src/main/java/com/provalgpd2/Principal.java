package com.provalgpd2;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class Principal {
    private Principal() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        //Parte 1 (Vale 2 pontos)
		//Crie uma variável qualquer do tipo String
		//e imprima a msg na tela seguida da variável "Olá!! " + variavel...
		//*************************
        String palavra = "professor!";
        System.out.println("Olá!! "+ palavra);
        //**************************
		//Parte 2 (Vale 2 pontos)
		//Declare uma variável qualquer do tipo inteiro
		// Agora, crie uma variável 
		// resultado (você define o tipo) e
		// multiplique essa variável por 100 e divida por 3
		// Mostre o valor da variável resultado 
		//*************************
        Integer num = 14;
        Double resultado = 0.0;
        resultado = (double) ((num * 100) /3);
        System.out.println("Resultado é: "+resultado);
        //**************************
		//Parte 3 (Vale 3 pontos)
		// De forma geral, quando se quer aplicar um
		//valor a um rendimento de juros simples, 
		// Seguimos a seguinte fórmula: J = C.i.n
		// Onde J = Juros
		// C = Capital investido
		// i = Taxa de juros
		// n = Total de mêses
		//Assim, se por exemplo, eu investir 2000.00
		// Com uma taxa de juros simples de 10% ao mês
		//Durante 6 meses eu terei um capital de 
		// R$ 3200,00. Num é legal?
		//Mas, ficar calculando isso dá dor de cabeça!
		//Daí, você foi convocado a implementar essa 
		//Lógica usando o java. Simbora!
		//Leia do teclado cada variável e faça o cálculo
		// leitura inteiro: input.nextInt();
		// leitura decimal: input.nextDouble();
        /* Padrão! Não remover */	
		Scanner input = new Scanner(System.in);
		/* */
        Double juros, i, n, c;
        
        System.out.println("Informe o valor da Taxa de Juros: ");
        i = Double.parseDouble(String.valueOf(input.nextDouble()));
        System.out.println("Informe o Capital Investido: ");
        c = Double.parseDouble(String.valueOf(input.nextDouble()));
        System.out.println("Informe o Total de meses: ");
        n = Double.parseDouble(String.valueOf(input.nextDouble()));
        /* Padrão! Não remover */	
		input.close();
		/* */
        juros = (c * (i/100)) * n;
        Double resultado3 = juros+c; 
        System.out.println("O resultado dos juros simples é: "+juros+"\nO capital investido mais o juros resulta em: "+(resultado3));

        //**************************
		//Parte 4 (Vale 3 pontos)
		// Por fim, supondo que o usuário resgatou todo o seu
		//Dinheiro investido e decidiu gastar R$ 100,00 todo mês
		//Em quantos meses ele terá dinheiro para gastar?
		//faça um código usando OBRIGATORIAMENTE o 
		//for, while OU do-while
		//e mostre o número de meses na tela.
		//***************************

        Double gasto = 100.0;
        Integer cont = 1;
        System.out.println("valor inicial: "+resultado3);
        for(Double y = 100.0; y <= resultado3; y = y + 100){
            System.out.println("\n"+cont+"º gasto de 100.0, resultando em: "+(resultado3-gasto)+"\nQuantidade de meses decorridos: "+cont);
            cont++;
            gasto = gasto + 100;
        }
		
    }
}
