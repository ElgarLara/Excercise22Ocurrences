package com.Excercise22Ocurrance.app;

import java.util.Random;


public class Ocurrencess {

	public static void main(String[] args) {
		//constant
		final int ELEMENTS=10000;
		//Variable
		
		//objects
		//Scanner input=new Scanner(System.in);
		Random numbers=new Random(System.nanoTime());
		
		//initiaiton
		int[]miArray=new int[ELEMENTS];
		for(int i=0;i<ELEMENTS;i++)
		{
			miArray[i]=numbers.nextInt(101);
		}
		
		//process
		int ocurrences=0;
		for(int element:miArray)
		{
			if(miHash.contaisnKey(element));
			{
				ocurrences=miHash.get(element);
				ocurrences++;
				miHash.put(element, miHash.get(element)+1);
			}
			else
			{
				miHash.put(element,1);
				
			}
			/*miHash.putIfAbsent(element, 1);
		*/
			
		}
		
		
		//por cada elemento que contenga la llave 
		
		
		//generar una tira de un vector del 1000 elementos, del 1 al 100(0 a 100=101)
		/*for(int i:miArray)
		{
			System.out.println(" "+i);
		}
		*/
//para cada elemento que se encuentre dentro del array(lista)
	}

}
