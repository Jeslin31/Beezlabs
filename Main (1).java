/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] name=sc.nextLine().split(":");
		int hour=Integer.valueOf(name[0]);
		int minute=Integer.valueOf(name[1]);
		minute/=5;
		if(hour>12)
		{
		    hour-=12;
		}
		int diff=Math.abs(hour-minute);
		int angle=diff*30;
		System.out.println(angle+" degree");
}
}
