/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the start range:");
		int start_range=sc.nextInt();
		System.out.print("Enter the end range:");
		int end_range=sc.nextInt();
		int count=0;
		for(int index=1;index<=end_range;index++)
		{
		    String num=String.valueOf(index);
		    int len=num.length();
		        if(num.charAt(0)=='1')
		        {
		            count++;
		        }
		}
		System.out.print(count);
}
}
