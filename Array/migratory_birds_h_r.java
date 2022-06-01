package Array;
import java.util.*;
public class migratory_birds_h_r {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int fre[] = new int[n];
		int max =0,id=0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			fre[arr[i]]++;
		}
		
		for(int i=0;i<n;i++) {
			if(fre[arr[i]]>max)
				max = fre[arr[i]];
			id = arr[i]+1;
			
		}
		System.out.println(id);
		
		// TODO Auto-generated method stub

	}

}
