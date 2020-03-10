package Creational;

public class MainF {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		 Factory animalFactory = new Factory();
	      
	        FactoryAnimal animal = animalFactory.getAnimal("dOg");
	        animal.eat();
	      
	        FactoryAnimal animal2 = animalFactory.getAnimal("CAT");
	        animal2.eat();
	      
	        FactoryAnimal animal3 = animalFactory.getAnimal("raBbIt");
	        animal3.eat();
	    }
	}


