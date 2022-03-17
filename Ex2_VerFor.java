public class Ex2_VerFor {
    public static void main(String[] args) {
        int num = 100;
        for(; ;){
            System.out.printf("%d", num);
            num--;
            if(num>0)
                continue;
            break;
        }
    }
}
