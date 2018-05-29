
import java.util.ArrayList;

/**
 *
 * @author Gabriel de Oliveira Ferreira
 */
public class Exemplo01 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        //adicionar 3 números ao ArrayList
        numeros.add(10);// adiciona na posição 0
        numeros.add(20);// adiciona na posição 1
        numeros.add(30);// adiciona na posição 2
        
        System.out.println("Números: ");
        System.out.println(numeros.get(0));//pega na posição 0
        System.out.println(numeros.get(1));//pega na posição 1
        System.out.println(numeros.get(2));//pega na posição 2
        
        System.out.println(
                "Tamanho: " + numeros.size()); // tamanho do ArrayList
        
        numeros.remove(1); // apaga o elemento do ArrayList
        // pelo indice
        
        for(int i = 40; i <= 100; i = i + 10){
        
    }
    }
    
}
