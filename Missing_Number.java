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
        Arrays.sort(nums);
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans=i+1;
            }
        }
        return ans;
    }
}
