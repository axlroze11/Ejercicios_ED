
package busqueda;

import java.util.Scanner;

public class Busqueda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        int busqueda[]={12,18,-20,0,15,12,9,6};
        int seBusca;
        System.out.println("Digite el valor a buscar:");
        seBusca=entrada.nextInt();
        
        boolean find =  false;
        
        for (int i = 0; i < busqueda.length && find==false; i++) {
            if(seBusca==busqueda[i]){
                find=true;
                System.out.println("Posicion del numero buscado es "+i);
            }
        }
    }
    
}
