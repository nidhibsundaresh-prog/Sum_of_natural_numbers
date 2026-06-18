import java.util.Scanner;
public class sumofnaturalnum {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        int summ=0;
        for(int i=1;i<=num;i++){
            summ=summ+i;
        }
        System.out.println("the sum is="+summ);   
     }
}
