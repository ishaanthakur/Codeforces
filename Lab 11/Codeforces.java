import java.util.*;
import java.io.*;

public class Main{


		public void dfs(int k, int[] C, long[][] MM, ArrayList<Integer>[] arr, int num){


			long o = 1-C[k]; long z = C[k];
			for(int i : arr[k] ){

				dfs(i);

				   z = (z * MM[1][i] + z * MM[0][i]) % num;
				  o = (o * MM[1][i] + o * MM[0][i] + z * MM[1][i]) % num;
			}
			MM[0][i] = z; MM[1][i] = o;
		}

	public int Solution(int n, int[] p, int[] colors){

		

			int num = 1000000007; ArrayList<Integer>[] arr = new ArrayList[100010];
			long[][] MM = new long[2][100010]; 
			for(int i=1; i<n; i++) arr[p[i]].add(i);

				dfs(0, colors, MM, arr, num);
			return (int)MM[1][0];




	}


	public static void main(String[] args){

		BufferedReader in= null;
		try {
			in= new BufferedReader(new InputStreamReader(System.in));
			String[] line= in.readLine().split("\\s+");

			int n= Integer.parseInt(line[0]);
		


			String[] pref= in.readLine().split(" ");

			int[] p = new int[n-1];
			int[] colors = new int[n];


			for(int i=0; i< n-1; i++){
				p[i] = Integer.parseInt(pref[i]);
			}
			String[] pref2= in.readLine().split(" ");
			for(int i=0; i<n; i++){

				colors[i] = Integer.parseInt(pref2[i]);
			}

			

			in.close();
			Main k1= new Main();
			System.out.println(k1.Solution(n, p, colors));
			

		} catch (Exception e) {
			System.out.println("");

		}
	}

}