import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int answer = 0;

        if (x < 0){
            if (y < 0){
                answer = 3;
            }else {
                answer = 2;
            }
        }
        if (x > 0){

            if (y > 0){
                answer = 1;
            }else {
                answer = 4;
            }
        }
        System.out.println(answer);
    }
}