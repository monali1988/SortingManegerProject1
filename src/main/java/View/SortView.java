package View;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public  class SortView  {
    private static Logger logger = LogManager.getLogger("Viewer Logger");

    public String getDesiredType() {
        logger.info("Desired sorted method input call");
        Scanner scanner = new Scanner(System.in);
        String desiredSortType = "";

        while (!Arrays.asList(new String[]{"b", "m"}).contains(desiredSortType)) {
            System.out.print("Please enter your desired sort (b) for Bubble and (m) for Merge: ");
            desiredSortType = scanner.next().toLowerCase();
        }
        return desiredSortType;
    }

    public void displayResults(int[] result) {
        logger.info("Display Results");
        System.out.print("Result: ");
        System.out.println(Arrays.toString(result));
    }
    }



