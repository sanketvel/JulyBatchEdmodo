package com.icertis.webautomation.utils;
import java.util.Random;

public class Helper 
{

	public static String get_Random(int range)
	{
		Random r = new Random();
		return Long.toString (Math.abs (r.nextLong ()), range);
		
		
	}
	
}
