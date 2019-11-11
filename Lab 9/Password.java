import java.util.*;
import java.io.*;


public class Main{


	public int Solution(int n, int k){

			int temp = Math.floor(Math.pow(n, 0.5));

			HashMap<Integer, Integer> mp = new HashMap<>();
			for(int i=0; i<= temp; ++i){
				if(n%i == 0) {
					mp.add(n/i, 1);
					mp.add(i, 1);
				}

			}


			if(mp.size() >= k){
				int inc = 1;

				for(Map.Entry e : mp.entrySet()){
					if(inc == k) return mp.getKey();
					inc ++;

				}

			}

			return -1;

	}



}