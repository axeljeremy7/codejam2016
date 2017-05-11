import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;

public class Problem3 {
	
	static PrintWriter out;

	public static void main(String[] args) throws Exception, IOException{
		
		BufferedReader in;// = new BufferedReader(new FileReader("p3input1.txt"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("p3out1.txt")));
		
		int numCases=1;// = Integer.parseInt(in.readLine());
		//System.out.println(numCases);
		int t=1;
		String n ;
		
		while(t<=numCases){
			//n = in.readLine();
			//System.out.print("Case #" + t + ": "+ solve(n) + "\n");
			//out.print("Case #" + t + ": "+ solve(n) + "\n");
			t = t + 1;
		}
		
		int n1 = 16, j = 50;
	    char[] s1 = new char[n1];
	    Arrays.fill(s1, '0');
	    s1[n1-1] = '1';
	    s1[n1/2-1] = '1';
	    BigInteger[] mult = new BigInteger[11];
	    for (int i = 2; i <= 10; i++) {
	    	System.out.println(new String(s1));
	    	mult[i] = new BigInteger(new String(s1), i);// from base i to base 10
	    	System.out.println(i + " =>  i=>  "+ mult[i]);
	    }
	    System.out.println("\n\n");
	    char[] s2 = new char[n1];
	    Arrays.fill(s2, '0');
	    s2[n1/2] = '1';
	    //000000001 0000000  = s1
	    BigInteger a1 = mult[2];

	    System.out.println("s2=>  "+ new String(s2)) ;
	    int count = 0;
	    for (int i = 1; count < j; i += 2) {
	      BigInteger add = new BigInteger(new String(s2), 2);
	      
	      System.out.println("base 2 to 10 =>  "+ add) ;
	      
	      add = add.add(new BigInteger(""+i));
	      
	      System.out.println("+i =>  " + i) ;
	      System.out.println("add =>  "+ add) ;
	      
	      BigInteger result = add.multiply(a1);
	      
	      System.out.println("a1 =>  "+ a1) ;
	      System.out.println("add.multiply(a1) =>  "+ result) ;
	      
	      System.out.println("\n result.toString(2) =>  "+ result.toString(2) + "\n") ;
	      out.print(result.toString(2)); // in base 2 
	      
	      for (int k = 2; k <= 10; k++){
	    	  System.out.println("mult[ " + k+ " ] ==> "+ mult[k]);
	    	  out.print(" "+mult[k]);
	      }
	      System.out.println("\n\n\n") ;
	      count++;
	      out.println();
	    }
		
		//in.close();
		out.close();

	}
	
	public static int solve(String n){
		
		return 0;
	}

}
