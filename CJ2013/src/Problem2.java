import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Problem2 {
	static int[][] a = new int[100][100];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new FileReader("p2smallinput.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("p2out1.txt")));
		
		int numCases = Integer.parseInt(in.readLine());
		System.out.println(numCases);
		
		int t=1;
		int r;
		int c;
		int i;
		int j;
		String [] s1;
		
		while(t<=numCases){
			
			s1 = in.readLine().split(" ");
			r = Integer.parseInt(s1[0]);
			c = Integer.parseInt(s1[1]);	
			System.out.println(r + " "+ c + "");
			for(i=0; i<r; i++){
				s1 = in.readLine().split(" ");
				for(j=0; j<c; j++){
					a[i][j] = Integer.parseInt(s1[j]);	
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			//
			System.out.println("Case #"+t+": "+solve(r,c)+"\n");
			out.print("Case #"+t+": "+solve(r,c)+"\n");
			//
			t = t + 1;
			
		}
		in.close();
		out.close();

	}
	
	public static String solve(int n,int m){
		int i;
		int j;
		int k;
		boolean ok;
		for ( i=0; i<n; ++i) {
	        for ( j=0; j<m; ++j) {
	            int c = a[i][j];
	            
	            ok = true;
	            for ( k=0; k<n; ++k) {
	                if (a[k][j] > c) {
	                    ok = false;
	                    break;
	                }
	            }
	            if (ok) continue;

	            ok = true;
	            for ( k=0; k<m; ++k) {
	                if (a[i][k] > c) {
	                    ok = false;
	                    break;
	                }
	            }
	            
	            if (!ok) {
	                return "NO";
	            }
	        }
	    }
		return "YES";
	}

}
