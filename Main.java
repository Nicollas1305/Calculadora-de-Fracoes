package Questão2;

import java.util.Scanner;
/**
 *
 * @author Nicollas Marinho
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int num, den;
        
        System.out.println("Informe o numerador:");
        num = e.nextInt();
        System.out.println("Informe o denominador:");
        den = e.nextInt();
        
        //num = Integer.parseInt(JOptionPane.showInputDialog( "Informe o numerador:" ));
        //den = Integer.parseInt(JOptionPane.showInputDialog( "Informe o denominador:" ));
        calculoFracao dados = new calculoFracao(num, den);
        		
        int op;
		
            do{  
		System.out.println("1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão \n 5-Sair");	
                op = e.nextInt();	
                
                if( op == 1 ){
                    System.out.println("Informe o numerador: ");
                    int x = e.nextInt();
                    System.out.println("Informe o denominador: ");
                    int y = e.nextInt();
                    dados.soma( x, y);
                }
                    
                if( op == 2 ){
                    System.out.println("Informe o numerador:");
                    int x = e.nextInt();
                    System.out.println("Informe o denominador:");
                    int y = e.nextInt();
                    dados.subtracao( x, y);
                }
                    
                if( op == 3 ){
                    System.out.println("Informe o numerador:");
                    int x = e.nextInt();
                    System.out.println("Informe o denominador:");
                    int y = e.nextInt();
                    dados.multiplicacao( x, y);
                }
                    
                if( op == 4 ){	
                    System.out.println("Informe o numerador:");
                    int x = e.nextInt();
                    System.out.println("Informe o denominador:");
                    int y = e.nextInt();
                    dados.divisao( x, y );
                }
                        
		} while(op!=5);
		System.exit(0);	
    }
    
}
