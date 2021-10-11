package com.dayone;

public class Point2DTest {
	public static void main(String[] args)
	{
		Point2D P1 = new Point2D(500,200);
		System.out.println(P1.getPoints());
		System.out.println("The difference between two points is:"+P1.getDiff());
	}

}
