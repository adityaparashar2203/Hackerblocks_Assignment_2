import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(); 
         int[] arr=new int[n];
           for (int i = 0; i < n; i++) 
            arr[i]=scn.nextInt();
            System.out.print(missingNumber(arr)); 
    }
    public static int missingNumber(int[] nums) {
        // Write your code here
		int n=nums.length;
		int i=0;
		while(i<n){
			int x=nums[i];
			if(x>=1 && x<=n){
				if(nums[x-1]!=x){
					nums[i]=nums[x-1];
					nums[x-1]=x;
				}
				else{
					 i++;
				}
			}
			else{
				i++;
			}
		}
		for(int j=0;j<n;j++){
			if(nums[j]!=j+1){
				return j+1;
			};
		}
		return n+1;
    }
}
