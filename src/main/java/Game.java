import java.util.Scanner;
public class Game {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        printTitle();
        waitForEnter();

        printDramatic("Okay… deep breath. I'm standing in a room at my first Paramore show. ");
        printDramatic("The lights are flickering, someone’s guitar is still ringing, ");
        printDramatic("and I’m just trying not to pass out before the first dance number since my situationship is front row.");
        newline();

        // DIALOGUE WITH HAYLEY + TAYLOR
        Dialogue.conversationWithHayley();
        waitForEnter();

        // MONSTER APPEARS
        int difficulty = generateMonster();
        waitForEnter();

        // COUNTDOWN + D20 ROLL (like prepping yourself mentally)
        printDramatic("I steady myself… time to roll.");
        int roll = rollD20();
        Ascii.drawD20(roll);

        newline();


        // COMBAT STARTS
        Player player = new Player();
        Combat.startBattle(player, difficulty);

        newline();
        printDramatic("The night isn’t over… but at least I survived that.");
    }


    // -------------------------------------------------------
    // TITLE SCREEN
    // -------------------------------------------------------
    private static void printTitle() {
        System.out.println("==========================================");
        System.out.println("    THE TRAVESTYS OF A SECRET LOVER CONCERT ");
        System.out.println("==========================================");
    }

    // -------------------------------------------------------
    // MONSTER GENERATION
    // -------------------------------------------------------
    public static int generateMonster() {
        int r = (int)(Math.random() * 6) + 1;
        newline();

        if (r <= 3) {
            System.out.println("++++++ 👻 BACKSTAGE SHADOW MANAGER 👻 ++++++");
            System.out.println("It crawls out from behind the amps...");
            System.out.println("Roll Required: 10");
            return 10;
        }

        if (r <= 5) {
            System.out.println("++++++ 😎 MIMIC STAGE DANCER 😎 ++++++");
            System.out.println("The other dancer  suddenly grows TEETH. Nope.");
            System.out.println("Roll Required: 14");
            return 14;
        }

        System.out.println("++++++ 👀 ALL-SEEING SPOTLIGHT 👀 ++++++");
        System.out.println("It turns toward me. It KNOWS.");
        System.out.println("Roll Required: 18");
        return 18;
    }

    // -------------------------------------------------------
    // ROLL A D20 WITH COUNTDOWN
    // -------------------------------------------------------
    public static int rollD20() {
        printDramatic("Rolling in...");
        countdown(3);

        int roll = (int)(Math.random() * 20) + 1;
        System.out.println("\nYou rolled: " + roll);
        return roll;
    }

    // -------------------------------------------------------
    public static void countdown(int seconds) {
        for (int i = seconds; i > 0; i--) {
            System.out.print(i + " ");
            sleep(650);
        }
        System.out.println("ROLL!");
    }

    // -------------------------------------------------------
    // DRAMATIC TEXT
    // -------------------------------------------------------
    public static void printDramatic(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            sleep(35);
        }
    }

    // -------------------------------------------------------
    public static void waitForEnter() {
        System.out.print("\n(Press Enter to continue…) ");
        scanner.nextLine();
    }

    public static void newline() {
        System.out.println("\n");
    }

    public static void sleep(int ms) {
        try { Thread.sleep(ms); } catch (Exception ignored) {}
    }
}

