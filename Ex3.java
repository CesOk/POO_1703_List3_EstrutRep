import java.util.Scanner;

public class Ex3{
    public static void main(String[] args) {
        Scanner leitor = 
            new Scanner(System.in);

        int num, fat;

        System.out.println("Declare um numero para o fatorial: ");
        num = leitor.nextInt();
        fat = num;

        do{
            fat = fat * (num-1);

            num = num-1;
        }while(num>1);

        System.out.printf("%d",fat);

        leitor.close();
    }
}