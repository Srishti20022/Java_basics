package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//import java.util.Scanner;

class MyReader {
    BufferedReader reader;
    StringTokenizer currentTokens;
    public MyReader(BufferedReader readerToReadFrom) {
       this.reader = readerToReadFrom;
       this.currentTokens = new StringTokenizer(readNextLine());
    }

    public String nextToken() {
       while (!currentTokens.hasMoreTokens()) {
          String line = readNextLine();
          // If end of file reached, throw an exception
          if (line == null) throw new RuntimeException("End of file reached while parsing");
          currentTokens = new StringTokenizer(line);
       }
       return currentTokens.nextToken();
    }

    private String readNextLine() {
       try {  // try-catch block required to handle IOException
          return reader.readLine();
       } catch (IOException e) {
          throw new RuntimeException(e);
       }
    }
 }
public class SpamClassificationusingNeuralNet {

	public static void main(String[] args)  {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		//Scanner scn = new Scanner(System.in);
		MyReader myReader = new MyReader(bReader);
		String firstToken = myReader.nextToken();
		int t = Integer.parseInt(firstToken);
		int n , min , max,spam,nspam,x ;//spam counts spammers//nspam counts non spammers
		//x keeps the multiple unit 
		int []w = null;int[]b = null;
		
		for (int i = 0; i < t; i++) {
			firstToken = myReader.nextToken();
			n = Integer.parseInt(firstToken);
			firstToken = myReader.nextToken();
			min = Integer.parseInt(firstToken);
			firstToken = myReader.nextToken();
			max = Integer.parseInt(firstToken);
			spam = nspam = 0;
			b =new int[n];//0th w and 1st b
			w =new int[n];
			for (int j = 0; j < n; j++) {
				firstToken = myReader.nextToken();
				w[j]= Integer.parseInt(firstToken);
				firstToken = myReader.nextToken();
				b[j]= Integer.parseInt(firstToken);
			}
			for (int j = min; j <= max; j++) {
				x = j;
				for (int j2 = 0; j2 < n; j2++) {
					x = (w[j2]*x)+b[j2];
				}
				if(x%2==0) {
					nspam++;
				}else {
					spam++;
				}
			}
			System.out.println(nspam+"  "+spam);
		}
		//scn.close();
	}

}
