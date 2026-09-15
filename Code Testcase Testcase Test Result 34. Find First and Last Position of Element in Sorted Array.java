
import java.util.Arrays;

public class Q34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(find(arr, 7)));
    }
    static int[] find(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            if (arr[s]==target && arr[e]==target) {
                return new int[]{s,e};
            }
            if (arr[s]!= target) {
                s++;
            }
            if (arr[e]!= target) {
                e--;
            }
        }
        return new int[] {-1,-1};
    }
}

// Approcah 2
static int findBSfromStart(int [] arr, int target){
        int ans = -1;
        int s = 0; 
        int e = arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if (arr[m] == target) {
                ans = m;
                e=m-1;
            }
            else if(arr[m]>target){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return ans;
    }
    static int findBSfromEnd(int [] arr, int target){
        int ans = -1;
        int s = 0; 
        int e = arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if (arr[m] == target) {
                ans = m;
                s=m+1;
            }
            else if(arr[m]>target){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return ans;
    }
