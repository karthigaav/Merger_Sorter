import java.util.Random;


public class Main{
  public static void main(String[] args) throws InterruptedException {
	  
    Random rand = new Random();
    int size = rand.nextInt(50) + 1;
    int a[] = new int[size];
    size = rand.nextInt(50) + 1;
    int b[] = new int[size];
    for(int i = 0; i < a.length; i++)
      a[i] = rand.nextInt(999);
    for(int i = 0; i < b.length; i++)
      b[i] = rand.nextInt(999);
    
    // creating a object sorta to call the Threaded class Sorter
    Sorter sorta = new Sorter(a);
   // creating a object sortb to call the Threaded class Sorter
    Sorter sortb = new Sorter(b);
    //printing the first sorted array
    System.out.println(" ");
    System.out.println(" First sorted array: ");
    // executing the sorta thread run method
    sorta.start(); 
    // Making the sorta thread to die.
    sorta.join();
    // printing the second sorted array
    System.out.println(" ");
    System.out.println(" Second sorted array: ");
 // executing the sortb thread run method
    sortb.start();
    // Making the sortb thread to die.
    sortb.join();
    int[] c = new int[a.length + b.length];
    System.out.println(" ");
    System.out.println("Array Length of a: " + a.length);
    System.out.println("Array Length of b: " + b.length);
    System.out.println("Array Length of c: " + c.length);
    // Creating the merge object using Merger Thread class. 
    Merger merge = new Merger(a, b, c);
    //merged sorted output
    System.out.println(" Merged sorted output: ");
 // executing the merge thread run method
    merge.start();
  
    // Making the merge thread to die.
    merge.join();
  }
}
