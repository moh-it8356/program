import java.util.*;
public class sumofdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int dig=num%10;
            sum+=dig;
            num/=10;
        }
        System.out.println("Sum of digits:"+sum);
        sc.close();
    }
}
