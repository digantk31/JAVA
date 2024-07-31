import java.lang.*;

class MyFirst{
    public static void main(String args[])
    {
        System.out.println("Hello World");
    }
}

// Hello World



/* Note-1
But when we write "public" before class MyFirst, then it is mandatory to 
FILE NAME = CLASS NAME
EX. MyFirst.java = class MyFirst
*/
// Example:
import java.lang.*;

public class MyFirst{
    public static void main(String args[])
    {
        System.out.println("Hello World");
    }
}



//Note-2
import java.lang.*;

class MyFirst{
    public static void main(String args[])
    {
        System.out.println("Hello World");
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}

/* at command line, 
1> javac MyFirst.java <----- Convert into bytecode
2> java MyFirst    <--- because for output(bytecode to machinecode) we can write 'MyFirst' insted of 'MyFirst.class' directly.

but it will give you error for above code because of args[0] and args[1] like this.
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at MyFirst.main(MyFirst.java:7)

so write like this: "java MyFirst Digant Kathiriya"

//Output:
Hello World
Digant
kathiriya
*/
