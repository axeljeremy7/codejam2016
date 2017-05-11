import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.TreeSet;

public class Problem3 {
	
	static TreeSet<BigInteger> FSN = new TreeSet<BigInteger>();
	static BufferedReader br;
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		
		File inputFile = new File( "p3input1.txt" );
		FileReader fr = new FileReader( inputFile );
		br = new BufferedReader( fr );
		
		int numOfTestCases = Integer.parseInt( br.readLine() );
		
		File outputFile = new File( "p3out11.txt" );
		outputFile.delete();
		outputFile.createNewFile();
		FileWriter fw = new FileWriter( outputFile );
		bw = new BufferedWriter( fw );
		BigInteger A;
		BigInteger B;
		int i;
		for (i = 1; i <=numOfTestCases; i++ )
		{
			String[] ab = br.readLine().split(" ");
			A = new BigInteger( ab[0] );
			//System.out.println("BigInteger A=>" + A);
			B = new BigInteger( ab[1] );
			//System.out.println("BigInteger B=>" + B);
						
			//bw.append( "Case #"+i+": " + solve( A, B ) + "\n" );
			//bw.flush();
			//System.out.println("\n");
		}
		System.out.println("\n\n");
		
		solve();
		int num = 0;
		for ( BigInteger bi : FSN )
		{
			
			if(bi.compareTo( new BigInteger("10000000200000002") ) < 0){
				System.out.println(bi + "  " + Math.sqrt(bi.doubleValue()) );
			}else{
				System.out.println(bi);// + "  " + Math.sqrt( bi.doubleValue() ) );
			}
			
			num=num+1;
		}
		System.out.println("\n" + num);
		bw.flush();
		fw.flush();
		
		bw.close();
		fw.close();

	}
	
	public static String solve(){//BigInteger A, BigInteger B
		int i;
		String s = "";
		BigInteger bi;
		String one = "1";
		String two = "2";
		FSN.add( new BigInteger("1"));
		FSN.add( new BigInteger("4"));
		FSN.add( new BigInteger("9"));
		String uno = "1";
		for(i=0 ; i<15; i++){
			bi = new BigInteger( one + uno);
			FSN.add( bi.pow(2) );
			bi = new BigInteger( one + s + one );
			FSN.add( bi.pow(2) );
			bi = new BigInteger( one + s + one + s + one );
			FSN.add( bi.pow(2) );
			bi = new BigInteger( one + s + two + s + one );
			FSN.add( bi.pow(2) );
			bi = new BigInteger( two + s + two );
			FSN.add( bi.pow(2) );
			
			uno = uno + "1";
			s = s + "0";
		}
		return "";
	}

}
