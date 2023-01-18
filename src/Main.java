import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i ;
        int total = 0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Sayıları Giriniz : ");
            i = sc.nextInt();
            if(i % 2 == 0 && i % 4 ==0){

                 total += i;
            }
        }while(i%2 == 0);

        System.out.print("Toplam : " + total);

    }
}
