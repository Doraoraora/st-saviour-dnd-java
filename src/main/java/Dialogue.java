import java.util.Scanner;

public class Dialogue {

    private static Scanner scanner = new Scanner(System.in);

    public static void conversationWithHayley() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("   HAYLEY APPEARS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        slow("Hayley brushes a strand of orange hair back. “You good? You look possessed GIRL💜.”");

        System.out.println("\nChoose your response:");
        System.out.println("1. \"I’m fine. Definitely not freaking out.\"");
        System.out.println("2. \"Hayley, the stage case had teeth.\"");
        System.out.println("3. \"This place is haunted and I’m scared.\"");

        int choice = getChoice(1, 3);
        System.out.println();

        switch (choice) {
            case 1: slow("“Mhm. Sure.” Hayley side-eyes me.");
            case 2: slow("“Again? That keeps happening on tour.” She nods like it’s normal.");
            case 3: slow("“Honestly? Same.” She pats my shoulder.");
        }

        slow("\nTaylor walks over with his guitar.");
        slow("“We starting the show or fighting demons?”");

        System.out.println("\nChoose your response:");
        System.out.println("1. \"Both. This is a multitasking night.\"");
        System.out.println("2. \"The monsters started it.\"");
        System.out.println("3. \"Get ready—initiative time.”");

        int choice2 = getChoice(1, 3);

        switch (choice2) {
            case 1: slow("Taylor laughs. “Fair enough.”");
            case 2: slow("“Every tour…” He sighs dramatically.");
            case 3: slow("“Say less.” He tightens his guitar strap.");
        }

        slow("\nWe step deeper backstage… and the lights flicker again.");
        slow("Something is waiting. He will not be pleased");
    }

    // -------------------------------------------------------
    // HELPERS
    // -------------------------------------------------------
    private static void slow(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try { Thread.sleep(30); } catch (Exception ignored) {}
        }
        System.out.println();
    }

    private static int getChoice(int min, int max) {
        while (true) {
            System.out.print("> ");
            try {
                int c = Integer.parseInt(scanner.nextLine());
                if (c >= min && c <= max) return c;
            } catch (Exception ignored) {}
            System.out.println("Choose " + min + " to " + max + ".");
        }
    }
}
