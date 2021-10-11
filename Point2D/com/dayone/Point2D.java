package com.dayone;
public class Point2D {
public int x,y,z;
	
	public Point2D(int X, int Y)
	{
		x=X;
		y=Y;
	}
	public String getPoints()
	{
		return "Point ("+x+","+y+")";

	}
	
	public int getDiff() 
	{
		return z = x-y;
	}

}
