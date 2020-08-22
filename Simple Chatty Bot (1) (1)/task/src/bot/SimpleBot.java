package bot;

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
        System.out.printf("Hello! My name is %s", name);
        System.out.printf("\nI was created in %d", birthYear);
    }


    public static void main(String[] args) {
        // write your code here
        SimpleBot bot = new SimpleBot();
        bot.setName("Aid");
        bot.setBirthYear(2020);
        bot.meetAndGreet();
    }
}
