import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir basamak sayısı giriniz.");
        int size= scanner.nextInt();
        int n=size;
        for (int x=0;x<size;x++){
            for (int z=0;z<=x;z++){
                System.out.print(" ");
            }
            for (int y=(n*2)-1;y>0;y--){
                System.out.print("*");
            }
            System.out.println(" ");
            n--;
        }
    }
}