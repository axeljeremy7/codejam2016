import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Problem1 {
	
	static char [][] a = new char[4][4];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new FileReader("tictactoeLarge.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("tictactoeSmallOut2.txt")));
		
		int numCases = Integer.parseInt(in.readLine());
		System.out.println(numCases);
		int t=1;
		
		int i = 0;
		int j = 0;
		String s = "";
		
		while(t<=numCases){
			
			for(i=0; i<4; i++){
				s = in.readLine();
				for(j=0; j<4; j++){
					a[i][j] = s.charAt(j);
					//System.out.print(a[i][j]);
				}
				//System.out.println();
			}
			s = in.readLine();
			//System.out.print("Case #" + t + ": "+ solve());
			
			out.print("Case #" + t + ": "+ solve() +"\n");
		    t = t + 1;
		    //System.out.println("\n");
			
		}
		in.close();
		out.close();
		

	}
		
	
	public static String solve(){
		int i;
		int j;
	
		boolean b [] = new boolean[4];
		boolean b2 [] = new boolean[4];
		
		for(i=0; i<3; i++){
			b[i] = false;
		}
		
		for(i=0; i<3; i++){
			b2[i] = false;
		}
		
		boolean check1 = true;
		boolean check2 = true;
		boolean check3 = true;
		boolean check4 = true;
		//
		boolean check5 = true;
		boolean check6 = true;
		//
		boolean check7 = true;
		boolean check8 = true;
		for(i=0; i<4; i++){
			
			// vertical check
			check1 = true;
			check2 = true;
			// horizontal check
			check3 = true;
			check4 = true;
			
			for(j=0; j<4; j++){
				
				if(check1){
					if(a[i][j] == 'T' || a[i][j] == 'X'){
						check1 = check1 && true;
					}else{
						check1 = check1 && false;
					}
				}
				if(check2){
					if(a[i][j] == 'T' || a[i][j] == 'O'){
						check2 = check2 && true;
					}else{
						check2 = check2 && false;
					}
				}
				//
				if(check3){
					if(a[j][i] == 'T' || a[j][i] == 'X'){
						check3 = check3 && true;
					}else{
						check3 = check3 && false;
					}
				}
				if(check4){
					if(a[j][i] == 'T' || a[j][i] == 'O'){
						check4 = check4 && true;
					}else{
						check4 = check4 && false;
					}
				}
				//
				//
				if(check5){
					if(a[j][j] == 'T' || a[j][j] == 'X'){
						check5 = check5 && true;
					}else{
						check5 = check5 && false;
					}
				}
				if(check6){
					if(a[3-j][j] == 'T' || a[3-j][j] == 'X'){
						check6 = check6 && true;
					}else{
						check6 = check6 && false;
					}
				}
				//
				//
				if(check7){
					if(a[j][j] == 'T' || a[j][j] == 'O'){
						check7 = check7 && true;
					}else{
						check7 = check7 && false;
					}
				}
				
				if(check8){
					if(a[3-j][j] == 'T' || a[3-j][j] == 'O'){
						check8 = check8 && true;
					}else{
						check8 = check8 && false;
					}
				}

				
			}
		
			
			if(check1 || check3 || check6 || check5){
				check6 = false; 
				check5 = false;
				return "X won";
			}
            if(check2 || check4 || check7 || check8){
            	check7 = false; 
				check8 = false;
				return "O won";
			}
            
		}
		
		
		
		for(i=0; i<4; i++){
			for(j=0; j<4; j++){
				if(a[i][j] == '.'){
					
					return "Game has not completed";
				}
			}
			
		}
	    
		return "Draw";
		
	}

}
