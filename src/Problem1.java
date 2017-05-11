import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Problem1 {
	
	public static Integer[] arr = new Integer[10];
	static PrintWriter out;

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("p1input1.txt"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("p1out1.txt")));
		
		int numCases = Integer.parseInt(in.readLine());
		System.out.println(numCases);
		int t=1;
		int n ;
		while(t<=numCases){
			n = Integer.parseInt(in.readLine());
			System.out.print("Case #" + t + ": ");
			out.print("Case #" + t + ": "+ solve(n) + "\n");
			arr = new Integer[10];// I FORGOT THIS!!!
			t = t + 1;
		}
		in.close();
		out.close();

	}
	
	/**
	 * 
	 * @param n
	 * @return a String as the last seen number
	 */
	public static String solve(int n){
		
		
		if (n == 0) {
		      //out.print("INSOMNIA\n");
		      //System.out.println("INSOMNIA: ");
		      return "INSOMNIA";
		}
		
		int seen = 1;
		int t = n;
		int j = 1;
		int i;
		int last = n;
		while (true){
			
			last = t;
			while(t>0){
				arr[t%10]=1;// seen
				t = t/10;
			}
			for (i= 0; i < 10; i++) {
				if(arr[i] == null){
					seen = 0;
					 break;
				}
				else{
					seen = 1;
				}
			}
			
			if(seen==1){
				//System.out.print(last + "\n");
				return String.valueOf(last);
			}
			j = j + 1;
			t = j*n;
			
		}
		
		
		
	}

}
