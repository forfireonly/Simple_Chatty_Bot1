package bot;

import java.util.Scanner;

public class SimpleBot {

    private String name;
    private int birthYear;

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

    public void meetAndGreet() {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Hello! My name is %s.", name);
        System.out.printf("\nI was created in %d.", birthYear);
        System.out.print("\nPlease, remind me your name.");

        System.out.printf("\nWhat a great name you have, %s", scn.nextLine());

    }


    public static void main(String[] args) {
        // write your code here
        SimpleBot bot = new SimpleBot();
        bot.setName("Aid");
        bot.setBirthYear(2020);
        bot.meetAndGreet();
    }
}


/*import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        // reading a name

        System.out.println("What a great name you have, {yourName}!");
    }
}*/
