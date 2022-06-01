package Array;
import java.util.*;
public class second_smallest {
	public static int secondsmallest(int arr[], int n) {
		Arrays.sort(arr);
		return arr[1];
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(secondsmallest(arr, arr.length));

	}

}
