import java.lang.*;
import java.util.*;

public class ReadKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter int: ");
        int a = sc.nextInt();
        System.out.println(a);
        
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter float: ");
        float b = sc.nextFloat();
        System.out.println(b);
        
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter string: ");
        String c = sc.next();
        System.out.println(c);

        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter line: ");
        String d = sc.nextLine();
        System.out.println(d);

       
        sc.useRadix(2);
        System.out.print("Enter Binary: ");
        int x = sc.nextInt();
        System.out.println(x);

    }
}
