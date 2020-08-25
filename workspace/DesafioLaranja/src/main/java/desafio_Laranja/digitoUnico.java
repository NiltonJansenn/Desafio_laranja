package desafio_Laranja;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
/*  
 * Dígito Único
 *Definimos um dígito único de um inteiro usando as seguintes
 *regras:
 *Dado um inteiro, precisamos encontrar o dígito único do inteiro.
 *Se x tem apenas um dígito, então o seu dígito único é x.
 *Caso contrário, o dígito único de x é igual ao dígito único da
 *soma dos dígitos de x.
 *Por exemplo, o dígito único de 9875 será calculado como:
 *digito_unico(9875)9+8+7+5=29
 *digito_unico(29)2+9=11
 *digito_unico(11)1+1=2
 *digito_unico(2)=2
 *Dado dois números n e k, P deverá ser criado da concatenação da string
 *n * k.
 *Exemplo:
 *n=9875 e k=4 então p = 9875 9875 9875 9875
 *digitoUnico§ = digitoUnico(9875987598759875)
 * 5+7+8+9+5+7+8+9+5+7+8+9+5+7+8+9=116
 *digitoUnico§=digitoUnico(116)
 *1+1+6=8
 *digitoUnico§=digitoUnico(8)
 *A função digitoUnico deverá ter os seguintes parâmetros;
 *1. n: uma string representado um inteiro. 1<=n<=10ˆ1000000
 *2. k: um inteiro representando o número de vezes da concatenação
 *1<=k<=10ˆ5
 *3. A função digitoUnico deverá obrigatoriamente retornar um
 *inteiro.
*  */


public class digitoUnico{
	static HashMap< Integer , Integer > digUnico =new LinkedHashMap< Integer , Integer >();

	public static int digitoUnico(int n){
        if (n < 10){
            return n;
        }
        else{
           int soma=0;
           while (n != 0){
              soma = soma + n%10;
              n = n/10;
           }
		   
           return digitoUnico(soma);
        }
    }
   
    public int digitoUnicoSS(String n, int k){
      
        int soma=0;
		int P = 0;
		
        for (int i=0;i<n.length(); i++){
        	
            soma+= n.charAt(i) - '0';
        	 }
      
		P = soma*k;
		 return cache(P);
    }
	
    
    /*
    CACHE
    *Deverá ser criado um cache em memória para guardar os
    *últimos 10 cálculos realizados de digitoUnicos, este cache é
    *independente de usuário, ou seja, se um cálculo já foi realizado e
    *está no cache não será necessário executar a função de dígito
    *único. Não é permitido utilização de frameworks de mercado
    *para o cache.
    */
	
     public static int cache (int valor ){
		
		for (int i =0 ; i < 10;  i++) {
		digUnico.put(valor, valor);	
		
		if (  digUnico.get(valor) != valor) {
			
		    System.out.println(" acessou " + digitoUnico(valor) );
		}
		
		}
		System.out.println("o valor do cache e:" + valor);
		for ( Entry<Integer, Integer> entry: digUnico.entrySet()) {
			
	     	digUnico.entrySet( );
						
		}
		
		return valor;
		
				
		
	 }
	
	

}

