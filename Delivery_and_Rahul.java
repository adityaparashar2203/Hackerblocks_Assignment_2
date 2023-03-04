import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(); 
         int[] arr=new int[n];
         for (int i = 0; i < n; i++) 
             arr[i]=scn.nextInt();
         int[] arr1=new int[n];
         for (int i = 0; i < n; i++) 
            arr1[i]=scn.nextInt();
         System.out.print(canCompleteCircuit(arr, arr1)); 
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        // Write your code here
        int n=gas.length;
        int[] netAmount=new int[n];
        for(int i=0;i<n;i++){
            netAmount[i]=gas[i]-cost[i];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=netAmount[i];

        }
        if(sum<0){
            return -1;
        }
        int startCity = 0;
        int currAmount = 0;
        for (int i = 0; i < n; i++) {
            currAmount += netAmount[i];
            if (currAmount < 0) {
                startCity = i + 1;
                currAmount = 0;
                }
            }
        return startCity;
    }
}
