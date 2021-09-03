import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hello, " + name + " it's nice to meet you!");
        System.out.println("What is your favorite food?");
        String food = scan.next();
        System.out.println(food + " is delicious!");
        System.out.println("What is your favorite sport?");
        String sport = scan.next();
        System.out.println(sport + " seems fun to play but I never have before :(");
        System.out.println("Where are you from?");
        String location = scan.next();
        System.out.println(location + " sounds like a cool place!");
        System.out.println("Who is your favorite artist? (Please keep it to one word)");
        String music = scan.next();
        System.out.println("I've never heard of " + music + " but ill take a listen");

        scan.close();
    }
}
