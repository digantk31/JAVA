//Code -  1
import java.lang.*;
import java.util.*; //for using scanner

public class keybRead {
    public static void main(String[] args) {
        // create object
        Scanner s = new Scanner(System.in);
    //Scanner(class_name) s(reference) = new Scanner(Constructor) (System.in)(built-in object (is associated with a keyboard))
        
        int a,b,c;
        System.out.println("Enter 2 Num");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;

        System.out.println("Sum is " + c);
    }
}

/*
Enter 2 Num
15
3
Sum is 18
*/



//Code - 2
import java.lang.*;
import java.util.*; //for using scanner

public class keybRead {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String name;
        
        System.out.println("May I know your name");

        name = s.nextLine();

        System.out.println("Welcome Mr " + name);
    }
}

/* 
May I know your name
Digant
Welcome Mr Digant
*/
