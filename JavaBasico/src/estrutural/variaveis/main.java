
package estrutural.variaveis;

import java.util.Scanner;

/**
 *
 * @author MarcoGorak
 */
public class main {


    public static void main(String[] args) {
        
    		//Exemplo de tipos de variáveis em Java
    		
        String nome;
        int idade;
        double moeda;
        
        //Instanciando um Objetivo de uma classe extrangeira para extrair dados do teclado.
        Scanner scanner = new Scanner(System.in);
        
        //sysout - CTRL + Espaço
        System.out.println();
        
        
        //Escrevendo uma mensagem no console e esperando um retorno do teclado do usuário do tipo String.
        System.out.println("Escreva seu nome: ");
        nome = scanner.nextLine();
        
        //Escrevendo uma mensagem no console e esperando um retorno do teclado do usuário do tipo inteiro.
        System.out.println("Escreva sua idade: ");
        idade = scanner.nextInt();
        
        
        //Estrutura de decisão em Java
        if (idade>=18) {
        		//Concatenação de variáveis
            System.out.println("Usuário Maior de Idade \nSeu nome:" + nome + "\nSua idade é: " + idade);
        } else {
        		//Concatenação de variáveis
            System.out.println("Usuário Menor de Idade \nSeu nome:" + nome + "\nSua idade é: " + idade);
        }
        
        
    }
    
}
