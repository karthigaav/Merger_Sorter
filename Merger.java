//Merger class using Thread 
public class Merger extends Thread {
	
	private int[] a;
	private int[] b;
	private int[] c;
	
	public Merger(int[] a, int[] b, int[] c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void run()
	{
		 int index = 0, i = 0, j = 0;
		    while(i < a.length && j < b.length)
		      if(a[i] < b[j])
		        c[index++] = a[i++];
		      else
		        c[index++] = b[j++];
		    if(i < a.length)
		      for(int k = i; i < a.length; i++)
		        c[index++] = a[i];
		    if(j < b.length)
		      for(int k = j; j < b.length; j++)
		    	  c[index++] = b[j];
	
	       // Prints merged sorted array.
		    for(int s = 0; s < c.length; s++)
		        System.out.print(this.c[s] + " "); 
	}
	
}
