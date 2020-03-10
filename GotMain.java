package Creational;

import java.util.ArrayList;

public class GotMain {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		PrototypeGot k=new PrototypeGot();
		  k.add();
		
		PrototypeGot k1=(PrototypeGot) k.clone();
		ArrayList<String>k11=k1.get();
		k11.add("arya");
		k11.add("bran");
		
		
		PrototypeGot k2=(PrototypeGot) k.clone();
		
		ArrayList<String>k12=k2.get();
		k12.remove("sansa");

		
		System.out.println(k.get());
		System.out.println(k11);
		System.out.println(k12);
		
		
	}

}
