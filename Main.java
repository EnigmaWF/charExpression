import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception { //для проверки
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(charExpression(a));



    }
    public static char charExpression(int a) {
        int s = '\\' + a;
        return (char) s;
    }
}
