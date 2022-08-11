import java.util.Scanner;

public class partice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        while(z!=0){
            int k=z%10;
            z=z/10;
            System.out.println(k);

        }
    }
}
