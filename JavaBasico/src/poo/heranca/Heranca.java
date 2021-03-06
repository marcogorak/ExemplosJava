
package poo.heranca;

import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author MarcoGorak
 * 
 * Exemplo de Herança envolvendo duas classes Usuário e Aluno.
 * 
 */
public class Heranca {


    public static void main(String[] args) {
        // criando objeto entrada para receber dados
        Scanner entrada  = new Scanner(System .in);
		
		System.out.println("Digite seu nome:");
                // varaiavel nome recebendo o conteúdo digitado pelo usuário
		String nome = entrada.nextLine();
		// usando nextLine =  gets ( capturando a linha toda ) 
		
                //Criando Objeto da classe Usuario
		Usuario user = new Usuario();
                //Armazenando o conteúdo da variável nome no objeto user
		user.setNome(nome);
				
                
		System.out.println("Digite seu CPF:");
		// varaiavel cpf recebendo o conteúdo digitado pelo usuário
                String cpf = entrada.nextLine();
                //Armazenando o conteúdo da variável cpf no objeto user
		user.setCPF(cpf);
		
		//Criação do Objeto aluno
		Aluno aluno = new Aluno();
		System.out.println("Digite seu nome:"); 
		nome = entrada.nextLine(); 
		aluno.setNome(nome);
		
                /**
                 * Apresentando o nome armazenado pelo objeto user e do objeto aluno
                 */
		System.out.println("O nome do Objeto user é: "+ user.getNome());
		System.out.println("O nome do aluno  é: "+ aluno.getNome());
		
		
                /**
                 * Como armazenar informações digitadas pelo usuário através da
                 * interface gráfica utilizando JOptionPane.
                 * 
                 * nome = JOptionPane.showInputDialog("Digite o nome do usuário: ");
                 */
		
		

    }
    
}
