import java.util.*;
public class armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println("true");
            sc.close();
            return;
        }    
        int t=n,c=0,temp=n;
        while(t!=0){
            c++;
            t/=10;
        }
        double arm=0;
        while(n>0){
            arm=arm + Math.pow(n%10,c);
            n/=10;
        }
        System.out.println(arm==temp);
        sc.close();
    }
}
