import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);

        String line;
        Scanner in = new Scanner(System.in);

        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");

        line = in.nextLine();
        while (!line.contains("bye")) {
            System.out.println("_________________________________________");
            System.out.println(line);
            System.out.println("_________________________________________");
            line = in.nextLine();
                if (line.contains("bye")) {
                    System.out.println("_________________________________________");
                    System.out.println("Bye. Hope to see you again soon!");
                    System.out.println("_________________________________________");

                }
        }

    }
}
