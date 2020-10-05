import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int nextNum = 0;

        do {
            nextNum = scanner.nextInt();
            sum = nextNum + sum;
        } while (nextNum != 0);
        System.out.print(sum);
    }
}
