package com.java;
/*. Implement switch case in the above enum example where a single value of object m is
 *  checked against all the cases of the switch case.
 *  Based on the value of m, the particular case should be executed*/

enum Month{
	January,Feb,March,April,May,June,July,August,Sept,Oct,Nov,Dec
}
public class Enum {
	public static void main(String args[]) {
		Month m;
		m=Month.April;
		switch(m) {
		case January:
			System.out.println("You choose Month January");
			break;
		case Feb:
			System.out.println("You choose Month Febuary");
			break;
		case March:
			System.out.println("You choose Month March");
			break;
		case April:
			System.out.println("You choose Month April");
			break;
		case May:
			System.out.println("You choose Month May");
			break;
		case June:
			System.out.println("You choose Month June");
			break;
		case July:
			System.out.println("You choose Month July");
			break;
		case August:
			System.out.println("You choose Month August");
			break;
		case Sept:
			System.out.println("You choose Month September");
			break;
		case Oct:
			System.out.println("You choose Month October");
			break;
		case Nov:
			System.out.println("You choose Month November");
			break;
		case Dec:
			System.out.println("You choose Month December");
			break;
		}
	}
}
