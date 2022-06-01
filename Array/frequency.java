package Array;
import java.util.*;
public class frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int visited=-1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int fre[] = new int[arr.length];
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                    fre[j] = visited;
                }
            }
            if(fre[i]!=visited){
                fre[i]=count;
            }
        }
        for(int i = 0; i < fre.length; i++){  
            if(fre[i] != visited)  
                System.out.println(arr[i] +" "+ fre[i]);  
        }  
    }

	}

