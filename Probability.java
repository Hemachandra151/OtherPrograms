//Function that returns A 70% of the time, B 20% of the time and C 10% of the time

import java.util.Random;

public class Main
{
    static int a=0,b=0,c=0;
	public static void main(String[] args) {
		char res;
		
		for(int i=0;i<100;i++)
		{
		    res = getVal();
		    count(res);
		}
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		System.out.println("C:"+c);
	}
	
	public static char getVal(){
	    Random r = new Random();
	    int rn = r.nextInt(101);
	    
	    if(rn<=70)
	    return 'A';
	    
	    else if(rn<=90)
	    return 'B';
	    
	    else
	    return 'C';
	}
	
	public static void count(char ch){
	    if(ch=='A')
	    a++;
	    
	    else if(ch=='B')
	    b++;
	    
	    else
	    c++;
	}
}
