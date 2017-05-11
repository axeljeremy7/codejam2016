import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Problem2 {
	
	static PrintWriter out;

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("p2input1.txt"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("p2out1.txt")));
		
		int numCases = Integer.parseInt(in.readLine());
		System.out.println(numCases);
		int t=1;
		String n ;
		
		while(t<=numCases){
			n = in.readLine();
			System.out.print("Case #" + t + ": "+ solve(n) + "\n");
			out.print("Case #" + t + ": "+ solve(n) + "\n");
			t = t + 1;
		}
		
		in.close();
		out.close();

	}
	/**
	 * Is the minimum number of times you will need to execute the maneuver to get all the pancakes happy side up.
	 * @param n
	 * @return a string 
	 */
	public static int solve(String n){
		char [] a = n.toCharArray();
		int l  = a.length;
		int i ;
		int count = 0;
		for(i=0; i<=l-2; i++){
			if(a[i] != a[i+1]){
				count = count + 1;
			}
		}
		
		if(a[l-1] == '-'){
			count = count + 1;
		}

		return count;
	}

}
