package Array;
import java.util.*;

public class rightrotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
	    int k = sc.nextInt();
	    for(int i=0;i<k;i++) {
	    	int temp = arr[n-1];
	    	int j=arr.length-1;
	    	for(;j>0;j--) {
	    		arr[j] = arr[j-1];
	    	}
	    	arr[j] = temp;
	    }
	    for(int i=0;i<n;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    
	}

}
