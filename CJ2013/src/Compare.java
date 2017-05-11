import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Compare {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new FileReader("tictactoeSmallOut2.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("check2.txt")));
		
		int i = 0 ;
		String s1 [] = new String[1000];
		while(i < 1000){
			s1[i] = in.readLine();
			i = i + 1;
		}
		in.close();
		System.out.println("\n\n\n");
		in = new BufferedReader(new FileReader("A-large.txt"));
		i = 0 ;
		int j = 1;
		String s2 [] = new String[1000];
		while(i < 1000){
			s2[i] = in.readLine();
			if( !s1[i].equalsIgnoreCase(s2[i]) ){
				System.out.println("s2=>  "+ s2[i]);
				System.out.println("s1=>  "+ s1[i]);
				out.println(s2[i]);
				j = j +1;
			}
			i = i + 1;
		}
		in.close();
		out.close();
		
		System.out.println(j + "  DONE");

	}

}
