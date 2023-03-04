import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(); 
         int[] arr=new int[n];
           for (int i = 0; i < n; i++) 
            arr[i]=scn.nextInt();
            sortColors(arr); 
           for (int i = 0; i < arr.length; i++){
              System.out.print(arr[i]+" ");
           }
    }
    public static void sortColors(int[] nums) {
		Arrays.sort(nums);
    }
}
