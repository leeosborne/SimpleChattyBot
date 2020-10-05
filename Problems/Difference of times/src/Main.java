import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstHour = scanner.nextInt();
        int firstMin = scanner.nextInt();
        int firstSec = scanner.nextInt();
        int secondHour = scanner.nextInt();
        int secondMin = scanner.nextInt();
        int secondSec = scanner.nextInt();
        
        int firstHourConv = firstHour * 3600;
        int firstMinConv = firstMin * 60;
        int secondHourConv = secondHour * 3600;
        int secondMinConv = secondMin * 60;
        
        int momentOne = firstHourConv + firstMinConv + firstSec;
        int momentTwo = secondHourConv + secondMinConv + secondSec;
        
        System.out.println(momentTwo - momentOne);
    }
}
