import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Days days = Days.valueOf(sc.next());
        switch (days) {
            case DUYSHOMBI, SHEYSHEMBI,SHARSHEMBI,BEYSHEMBI,JUMA,ISHEMBI,JEKSHEMBI->
                System.out.println(days);
        }
    }
}