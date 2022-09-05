package com.java;
import java.util.Scanner;
/*Create two user-defined exceptions named “TooHot” and “TooCold” to check the
temperature (in Celsius) given by the user is too hot or too cold.
If temperature > 35, throw exception “TooHot”.
 If temperature <5, throw exception “TooCold”.
Otherwise, print “Normal” and convert it to Farenheit.*/
public class Hotandcold {
	static void checkTemp(int temp)throws TemperatureException{
		if(temp > 35 ) {
			throw new TooHotException("TooHot");
		}
		else if(temp<5){
			throw new TooColdException("TooCold");
		}
		else {
			
			throw new TemperatureException("The temperature is normal :" + (temp*1.8+32) );
		}
	}
	public static  void main(String args[]) {
		Scanner num= new Scanner(System.in);
		int tem=num.nextInt();
		try {
			Hotandcold.checkTemp(tem);
		} catch (TemperatureException e) {
			System.out.println(e.getMessage());
		}
	}

}
