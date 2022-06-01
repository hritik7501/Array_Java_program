package Array;
import java.util.*;
import java.util.Scanner;

public class third_largest {
    public static int third_Largest(int arr[], int len) {
    	Arrays.sort(arr);
    	return arr[len-3];
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(third_Largest(arr,arr.length));
		System.out.println(Arrays.toString(arr));

	}

}
