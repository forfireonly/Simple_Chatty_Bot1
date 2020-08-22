package bot;

/*import java.io.BufferedReader;
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

        System.out.println("Hello! My name is " + name + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");

        System.out.println("What a great name you have, " + reader.readLine());


    }

    public void calculateAge() {
        System.out.println("Let me guess your age.");
        System.out.print("Enter remainders of dividing your age by 3, 5 and 7.");
        int age = (scn.nextInt() * 70 + scn.nextInt() * 21 + scn.nextInt() * 15) % 105;
        System.out.println("Your age is " + age + " that's a good time to start programming!");


    }

    public void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scn.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i  + "!");
            //System.out.printf("\n%d!", i  + 1);
        }
        System.out.println("Completed, have a nice day!");
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
        bot.count();
    }

}*/
import java.util.Scanner;

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

        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();

        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        // read a number and count to it here
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }

        System.out.println("Completed, have a nice day!");
    }
}
