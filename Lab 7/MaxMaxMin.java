import java.io.*;
import java.util.*;


public class Main{


public int MaxMaxMin(int a[], int n, int k){

	int ret = a[0];

	if(k == 1) {

		for(int i=0; i<n ; i++){
			if(ret > a[i]) ret = a[i];
		}
		return ret;

	}
	else if (k == 2){

		return Math.max(a[0], a[n-1]);


	}
	else{

		for(int i=1; i<n; ++i){
			if(ret < a[i]) ret=a[i];
		}
		return ret;
	}
}



 
	public static void main(String[] args){
 
 
	Scanner s = new Scanner(System.in);
 
int n = s.nextInt();
int k = s.nextInt();
int[] arr = new int[n];
int i= 0;
 
while(s.hasNext()){
	arr[i] = s.nextInt();
	i++;
 
}
 
Main s1 = new Main();
	System.out.println(s1.MaxMaxMin(arr, n,k));
	}
 
 



}
