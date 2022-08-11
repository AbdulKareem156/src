import java.util.Scanner;

public class SagaofMis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int no=sc.nextInt();
        for(int i=1;i<n-1;i++){
            no=no^sc.nextInt();
        }
        System.out.println(no+" ");

    }
}
