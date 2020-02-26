package cse360assign2;

/*
 * Author: Damon Williams
 * ClassId: 340
 * Assignment: CSE360 Assignment 1
 */

public class SimpleList {
	private int[] list;
	private int count;
	
	SimpleList()
	{
		list = new int[10];
		count = 0;
	}
		
	public void add(int input)
	{
		if(count < 10)
		{
			int[] tempList = new int[10];
			
			for(int index = 0; index < count; index++)
			{
				tempList[index + 1] = list[index]; 
			}
			for(int index = 0; index < count; index++)
			{
				list[index + 1] =  tempList[index + 1];
			}
			list[0] = input;
			 count++;
		}
		
	}
		
	public void remove(int input)
	{
		for(int index = 0; index < 10; index++)
		{
			if( list[index] == input)
			{
				int tempList[] = new int[10];
				
				for(int innerIndex = 0; innerIndex <index; innerIndex++)
				{
					tempList[innerIndex] = list[index];
				}
				for(int innerIndex = index + 1; innerIndex <count; innerIndex++)
				{
					tempList[innerIndex - 1] = list[innerIndex];
				}
				count--;
				for(int innerIndex = 0; innerIndex < count; innerIndex++)
				{
					list[innerIndex] = tempList[innerIndex];
				}
				index = 100;
			}
		}
	}
	
	public int count()
	{
		return count;
	}
		
	public String toString()
	{
		String temp= "";
		for(int index = 0; index < count; index++)
		{
		temp = temp + " " + list[index];	
		}
		return temp.trim();
	}
	
	public int search(int input)
	{
		int returnVariable = -1;
		
		for(int index = 0; index < 10; index++)
		{
			if(list[index] == input)
			{
				returnVariable = index;
			}
		}
		return returnVariable;
	}
	
}
