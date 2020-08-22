package bot;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SimpleBot {

    private String name;
    private int birthYear;
    BufferedReader reader;
    Scanner scn;

    public SimpleBot() {
        reader =new BufferedReader(new InputStreamReader(System.in));
        scn = new Scanner(System.in);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void meetAndGreet() throws IOException {

        System.out.printf("Hello! My name is %s.", name);
        System.out.printf("\nI was created in %d.", birthYear);
        System.out.print("\nPlease, remind me your name.");

        System.out.printf("\nWhat a great name you have, %s%n", reader.readLine());

    }

    public void calculateAge() {
        System.out.print("Let me guess your age.\n");
        System.out.print("Enter remainders of dividing your age by 3, 5 and 7.");
        int age = (scn.nextInt() * 70 + scn.nextInt() * 21 + scn.nextInt() * 15) % 105;
        System.out.printf("\nYour age is %d; that's a good time to start programming!", age );


    }




    public static void main(String[] args) {
        // write your code here
        SimpleBot bot = new SimpleBot();
        bot.setName("Aid");
        bot.setBirthYear(2020);
        try {
            bot.meetAndGreet();
        } catch (IOException e) {
            e.printStackTrace();
        }

        bot.calculateAge();
    }

}

/*import java.util.Scanner;
public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders

        System.out.println("Your age is {yourAge}; that's a good time to start programming!");
    }
}*/
