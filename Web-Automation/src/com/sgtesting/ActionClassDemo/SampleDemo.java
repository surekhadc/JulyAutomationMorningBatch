package com.sgtesting.ActionClassDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Sample
{
	static HashSet<Integer> getHashSetElements()
	{
		HashSet<Integer> obj=new HashSet<Integer>();
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		return obj;
	}
	
	static void assignElementsToArrayList(HashSet<Integer> obj)
	{
		ArrayList<Integer> o=new ArrayList<Integer>();
		Iterator<Integer> ite=obj.iterator();
		while(ite.hasNext())
		{
			o.add(ite.next());
		}
		
		for(int i=0;i<o.size();i++)
		{
			System.out.println(o.get(i));
		}
		
	}
}
public class SampleDemo {
	public static void main(String[] args) {
		HashSet<Integer> o=Sample.getHashSetElements();
		
		Sample.assignElementsToArrayList(o);
		

	}

}
