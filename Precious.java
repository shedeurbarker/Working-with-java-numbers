import java.lang.reflect.Array;

public class Precious {

    public static void main(String[] arg) {
        double height;
        int age = 20;
        String complexion = "Fair";
        String attitude = "Kind";
        String name = "Precious Barker";
        String[] hobbies = {"Singing", "Dancing", "Drumming", "Eating"};
        String faith;
        boolean married;

        System.out.println("My name is " + name + ", I am " + age + " years old. I am " + complexion + " in complexion" +
                ". My best hobby is " + hobbies[2]);
        int number = 4;
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("4");
        }

        int iterator = 0;
        while(iterator < 10) {
            iterator++;
            if(iterator == 3)
                continue;   // this returns the loop to the top and skip the rest below
            if(iterator == 7)
                break;  // this terminates the loop after printing 4
            System.out.println("Iterator: " + iterator);
        }
        iterator++;
        if(iterator > 7)
            return;


    }
/*
numbers:    integers, float, double,
Strings: Strings, characters, array
booleans: true/false
 */
}
