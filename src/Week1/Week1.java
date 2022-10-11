package Week1;
import helpers.*;

public class Week1 
{
    public static void main(String[] args)
    {
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        String name = InputReader.getString("Enter your name > ");
        System.out.println("Hello " + name);
        System.out.println("Nice to see your lovely face");
        System.out.println ("Hope you are feeling well");

        int L = InputReader.getInt("rectangle length > ");
        int H = InputReader.getInt( "rectangle with > ");

        System.out.println("rectangle perimeter");
        System.out.println(L+H);

        System.out.println("rectangle area");
        System.out.println(L*H);

    
        

        

    } 

    

    

}
