package Questão2;

/**
 *
 * @author Nicollas Marinho 
 */
public class calculoFracao {
    private int numerador;
    private int denominador;
    
    public calculoFracao( int num, int den ){
            numerador = num;
            denominador = den;
    }
	
        public void soma( int x, int y ){ 
            if(denominador == y){
               denominador = denominador;
               numerador = numerador + x;
               System.out.println(numerador + "/" + denominador);
            }if(denominador != y){
                int soma, aux, auxNum, auxSoma;    
                if(denominador < y){
                    aux = denominador;
                    denominador = y;
                    y = aux;
                }
                soma = denominador;
                while(soma % y !=0){
                    soma += denominador;
                }
                auxSoma = soma;
                auxSoma= auxSoma / denominador;
                auxSoma = auxSoma * numerador;
                ///////////////////// 
                auxNum = soma / y;
                auxNum = auxNum * x;
                              
                System.out.println((auxSoma+auxNum)+ "/" + soma);
            } 
	}
        
        public void subtracao( int x, int y ){
            if(denominador == y){
               denominador = denominador;
               numerador = numerador - x;
               System.out.println(numerador + "/" + denominador);
            }if(denominador != y){
                 int sub, aux, auxSub, auxNum;
                if(denominador < y){
                    aux = denominador;
                    denominador = y;
                    y = aux;
                }
                sub = denominador;
                while(sub % y !=0){
                    sub += denominador; 
                }
                auxSub = sub;
                auxSub = auxSub / denominador;
                auxSub = auxSub * numerador;
                
                auxNum = sub / y;
                auxNum = auxNum * x;
                
                System.out.println((auxSub-auxNum)+ "/" + sub);
            } 
            
	}
        
	public void multiplicacao( int x, int y ){
            numerador = numerador * x;
            denominador = denominador * y;
            System.out.println(numerador + "/" + denominador);
	}
	
	public void divisao( int x, int y ){
            numerador = numerador * y;
            denominador = denominador * x;
            System.out.println(numerador + "/" + denominador);   
	}
}
