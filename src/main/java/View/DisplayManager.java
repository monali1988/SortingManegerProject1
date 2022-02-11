package View;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public  class DisplayManager {
    private static Logger logger = LogManager.getLogger("Viewer Logger");

    public String getDesiredType() {
        logger.info("Desired sorted method input call");
        Scanner scanner = new Scanner(System.in);
        String desiredSortType = "";

        while (!Arrays.asList(new String[]{"b", "m", "t"}).contains(desiredSortType)) {
            System.out.print("Please enter your desired sort (b) for Bubble, (m) for Merge and (t) for Binary Search Tree. Type 'exit' to stop the program: ");
            desiredSortType = scanner.next().toLowerCase();
            if (desiredSortType.equals("exit")) {
                System.exit(0);
            }
        }
        return desiredSortType;
    }

    public int getArrayLength() {
        logger.info("Array length method input call");
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int length = 0;
        while (input instanceof String) {
            System.out.print("Please, choose the length of your array (0 - 1000000): ");
            input = scanner.next();
            try {
                length = Integer.parseInt(input);
                if (length >= 0 && length <= 1000000) {
                    break;
                }
            }  catch (NumberFormatException e){
                logger.warn(e);
            }
        }
        return length;
    }

    public void displayResults(int[] result) {
        logger.info("Display Results");
        System.out.print("Result: ");
        System.out.println(Arrays.toString(result));
    }
    }



