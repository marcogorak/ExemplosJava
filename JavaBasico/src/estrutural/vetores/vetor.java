package estrutural.vetores;

/**
 *
 * @author MarcoGorak
 * 
 * Exemplo de Vetor em Java
 * 
 */
public class vetor {

    public static void main(String[] args) {
        //Declarando variáveis
        float valor =100.00f;
        int idade [] = new int [10];
	
        // Adicionando o valor de I para cada posição de idade[]
        for(int i=0; i<idade.length; i++) {
            idade[i]=i;
            System.out.println(idade[i]);
        }
    }
    
}
