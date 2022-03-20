import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = 
            new Scanner(System.in);

        int num, numVer, primo = 1;

        System.out.println("Declare um numero: ");
        num = leitor.nextInt();
        numVer = 2;

        for(;numVer<num;){
            if(num % numVer == 0){
                primo = 0;
                break;
            }
            numVer = num + 1;
            num++;
        }

        if(primo == 0){
            System.out.println("nao primo");
        }
        else{
            System.out.println("primo");
        }

        leitor.close();
    }
}
