public class Ascii {

    public static void drawD20(int roll) {
        System.out.println("      _______");
        System.out.println("    /\\       \\");
        System.out.println("   /  \\  " + format(roll) + "  \\");
        System.out.println("  /    \\       \\");
        System.out.println("  \\    /_______/");
        System.out.println("   \\  /");
        System.out.println("    \\/");
    }

    private static String format(int roll) {
        return (roll < 10) ? " " + roll : Integer.toString(roll);
    }
}
