import java.util.*;
public class binarysearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int t=sc.nextInt();
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==t){
                System.out.println(mid+1);
                sc.close();
                return;
            }
            else if(arr[mid]>t)
                high=mid-1;
            else
                low=mid+1;
        }
        System.out.println(-1);
        sc.close();
    }
}
