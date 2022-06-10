package processos;

public class DigitoUnico {
    public static void digitounico(String name, Integer numberInt){
        
        String numberStr = numberInt.toString();
        char[] digitosLista = numberStr.toCharArray();
        Integer num = 0;
        Integer cont = 0;
        // System.out.println("ok1");
        for (int i =0; i < digitosLista.length; i++) {
            num = num + Integer.parseInt(String.valueOf(digitosLista[i]));
            System.out.println((cont+1)+"º valor de num: "+num);
            cont++;
        }
        
        String numberStr2 = num.toString();
        num = 0;
        cont = 0;
        char[] digitosLista2 = numberStr2.toCharArray();
        
        for (int x = 0; x < digitosLista2.length;x++){
            num = num + Integer.parseInt(String.valueOf(digitosLista2[x]));
            System.out.println((cont+1)+"º valor de num: "+num);
            cont++;
        }

        System.out.println("O valor final do número é: "+num);
        
        

    }
        
}
