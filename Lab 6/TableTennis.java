import java.io.*;
import java.util.*;
 
 
public class Main{
 
 
public int TableTennis(int a[], int n, long k){
	int pow = 0;
	int ret = a[0];
	if(a.length == 1) return ret;
	for (int i=1; i<n && pow < k; ++i){
		 if (ret <= a[i]) {
			ret = a[i]; pow=1; 
		}
		else pow++;
 
	}
	return ret;
}
 
 
 
	public static void main(String[] args){
 
 
	Scanner s = new Scanner(System.in);
 
int n = s.nextInt();
long k = s.nextLong();
int[] arr = new int[n];
int i= 0;
 
while(s.hasNext()){
	arr[i] = s.nextInt();
	i++;
 
}
 
Main s1 = new Main();
	System.out.println(s1.TableTennis(arr, n,k));
	}
 
 
}
