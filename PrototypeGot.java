package Creational;

import java.awt.List;
import java.util.ArrayList;

public class PrototypeGot implements Cloneable
{


	private ArrayList<String> a;
	
	public PrototypeGot()
	{
		a=new ArrayList<String>();
		
	}
	
	public PrototypeGot(ArrayList<String> temp)
	{
		this.a=temp;
	}

	public void add()
	{
		a.add("jon");
		a.add("dany");
		a.add("tryion");
		a.add("sansa");
		
	}
	
	
	public ArrayList<String> get()
	{
		return a;
	}
	
	
	@Override
	
	public Object clone() throws CloneNotSupportedException{
		ArrayList<String> temp = new ArrayList<String>();
		for(String s : this.get()){
			temp.add(s);
		}
		return new PrototypeGot(temp);
}
}

