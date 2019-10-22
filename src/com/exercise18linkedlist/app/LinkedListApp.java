package com.exercise18linkedlist.app;

import java.util.LinkedList; 
import java.util.ArrayList;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Queue;
import java.util.Random;
public class LinkedListApp {

	public static void main(String[] args) {
		//constant declaration
		final int ELEMENTS = 100;
		//declarar coleccion
		Random numbers = new Random();
		LinkedList<Byte> miListita = new LinkedList<Byte>();
		ArrayList<Byte> miArreglito = new ArrayList<Byte>();
		Stack<Integer> miPilita = new Stack<Integer>();
		HashMap<Integer, String> diccionarioBebe = new HashMap<Integer, String>();
		PriorityQueue<Double> miColita = new PriorityQueue<Double>();
		
		miListita.add((byte)5); //agregar elementos
		miListita.add((byte)10);
		miListita.add((byte)20);
		miListita.add((byte)30);
		miListita.add((byte)40);
		
		miListita.set(0, (byte) 2);//this is slower than an arraylist
		System.out.println(miListita.get(1));//this method is better than an ArrayList
		System.out.println(miListita);
		/*System.out.println(miListita.remove());//se va el ultimo elemento y lo elimina de la coleccion
		System.out.println(miListita.remove());
		System.out.println(miListita.remove());
		System.out.println(miListita.remove());
		System.out.println(miListita.remove());*/
		Byte number=2;
		System.out.println(miListita.size());
		System.out.println(miListita.isEmpty());
		System.out.println(miListita.contains(2));
		miListita.clear();
		System.out.println(miListita);
		
		for(int i=0;i<ELEMENTS;i++)
		{
			
			miListita.add((byte) numbers.nextInt(100));
		}
		System.out.println(miListita);
		
		Iterator iteradorBebe = miListita.iterator();
		while(iteradorBebe.hasNext());
		{
			System.out.println(iteradorBebe.next());
		}
		for(Byte miNumber : miListita)
		{
			System.out.println(miNumber);
		}
	}
	

}
