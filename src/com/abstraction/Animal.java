package com.abstraction;

abstract public class Animal
{
     double height;
     abstract void talk();
     Animal()
     {
    	 
     }
     Animal(double height)
     {
    	 this.height=height;
     }
     
}
//animal->cat->dog->pets