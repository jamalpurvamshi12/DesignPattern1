package Creational;

public class Factory 
{

	
	
	 public FactoryAnimal getAnimal(String animal) 
	 {
	        if(animal.equals(null)) return null;
	        
	        if(animal.equalsIgnoreCase("Dog")) {
	            return new DogFactory();
	        } else if(animal.equalsIgnoreCase("Cat")) {
	            return new CatFactory();
	        } else if(animal.equalsIgnoreCase("Rabbit")) {
	            return new RabbitFactory();
	        }
	        return null;        
	    }  
	}

