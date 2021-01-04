package com.inheritance;

public class Animal1 
{
    double height;
	double weight;
    void talks()
    {
    	System.out.println("Animal talks...");
    }
    Animal1()
    {
    	
    }
    
    public Animal1(double height, double weight)
    {
	
		this.height = height;
		this.weight = weight;
	}
}
    class Dog1 extends Animal1 
    {
    	public Dog1() 
    	{
			
		}

		public Dog1(double height, double weight) 
		{
			super(height, weight);
		}

		void sniff()
    	{
    		System.out.println("dog sniffs...");
    	}
    }
   /* class mainclass3
    {
    public static void main(String[] args)
	{
          Dog1 d1=new Dog1(33.3,23.3);
          System.out.println("height="+d1.height);
          System.out.println("weight="+d1.weight);
          
         d1.sniff();
         d1.talks();
         
          
	}
    }*/
  
    class mainclass3
    {
    	static void display(Animal1 x)
    	{
    		System.out.println(x.height);
    		System.out.println(x.height);

    	}
        public static void main(String[] args)
        {
        	Dog1 d = new Dog1(33.3,23.3);
        	display(d);
        	d.sniff();
        	d.talks();
        	
        	Dog1 d1=new Dog1(12.5,12.0);
        	display(d1);
        	d1.sniff();
        	d1.talks();
        	
        	Animal1 a1=new Animal1(12,25);
        	
        }

    
    }


    
    
    
    
    