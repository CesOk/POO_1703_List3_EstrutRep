public class Ex1_VerFor{
    public static void main(String[] args){
        int n = 0;
        for(; ;){
            System.out.printf("%d ", n); 
            n++;
            if(n<=100)
                continue;
            break;
        }
    }
}