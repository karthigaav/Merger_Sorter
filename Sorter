
public class Sorter extends Thread {

	private int[] a;
	
	public Sorter(int[] a)
	{
		this.a = a;
	}
	public void run()
	{
	    // sorting the array
		for(int i = 0; i < a.length; i++){
		      int pos = i;
		      int min = a[i];
		      for (int j = i + 1; j < a.length; j++)
		        if(a[j] < min){
		          min = a[j];
		          pos = j;
		        }
		      a[pos] = a[i];
		      a[i] = min;
		      //System.out.println("The sorted output is:");
		 //    System.out.print(a[i]);
	}
		//  Prints the sorted array
		 for(int x = 0; x< this.a.length; x++)
		        System.out.print(this.a[x] +" ");
	}
}

