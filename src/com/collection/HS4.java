package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HS4
{
  public static void main(String[] args)
  {

      HashSet hs=new HashSet();
      hs.add(new Pen(10));
      hs.add(new Pen(20));
    //  hs.add(new Pen(10));
      hs.add(new Pen(50));
      hs.add(new Pen(30));
      System.out.println(hs);
      
      ArrayList al=new ArrayList<>(hs);
      
      System.out.println(al);
      Collections.sort(al);
      System.out.println(al);
      
    //  HashSet hs=new HashSet<>(al)
      
  }
}
