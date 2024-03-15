import java.time.LocalTime;

public class Main
{
	public static void main(String[] args)throws Exception {
		int[] test = new int[10];
		for(int i=0;i<10;i++)
		{
		    test[i] = randint(1,10);
		    Thread.sleep(1000*i);
		    System.out.println("Running "+i+"th iteration");
		}
		System.out.println("Printing results");
		for(int i=0;i<10;i++)
		{
		    System.out.println(test[i]);
		}
	}
	
	public static double rand()
	{
	    LocalTime currentTime = LocalTime.now();
	    int[] numberlist = {currentTime.getHour()/10, currentTime.getHour()%10, currentTime.getMinute()/10, currentTime.getMinute()%10, currentTime.getSecond()/10, currentTime.getSecond()%10};
	    int seed = numberlist[5];
	    int pos = (numberlist[4]*numberlist[3]+numberlist[2]*numberlist[1]+numberlist[1])%100;
	    int[] rnd = new int[100];
	    rnd[0] = seed;
	    int a = 5*numberlist[3]+7*numberlist[1]+17*numberlist[4]+13*numberlist[2];
	    int c = 34*numberlist[2]+57*numberlist[4]+29*numberlist[1]+77*numberlist[3];
	    int m = 169*numberlist[1]+121*numberlist[5]+55*numberlist[2]+81*numberlist[4];
	    
	    for(int i=1;i<pos+1;i++)
	    {
	        rnd[i] = (rnd[i-1]*a+c)%m;
	    }
	    
	    double val = rnd[pos];
	    //System.out.println("Real Val: "+val);
	    
	    while(val>1)
	    {
	        val = val/10;
	    }
	    
	    return val;
	}
	public static int randint(int a, int b)
	{
	    double val = rand();
	    //System.out.println("Val: "+val);
	    val = val*(b-a+1);
	    return (int)val;
	}
}
