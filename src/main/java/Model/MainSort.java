package Model;


import Controller.SortManager;
import View.DisplayManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static Model.MergeFactory.logger;

public class MainSort {
    private static Logger logger = LogManager.getLogger("MainSort");
    public static void main(String[] args) {
        logger.info("Main method called");
        DisplayManager view = new DisplayManager();
        String desiredType = view.getDesiredType();
        int length = view.getArrayLength();
        SortManager controller = new SortManager();
        int[] result = controller.sortArray(desiredType, length);
        view.displayResults(result);

        desiredType = view.getDesiredType();
        controller = new SortManager();
        length = view.getArrayLength();
        result = controller.sortArray(desiredType, length);
        view.displayResults(result);

        desiredType = view.getDesiredType();
        controller = new SortManager();
        length = view.getArrayLength();
        result = controller.sortArray(desiredType, length);
        view.displayResults(result);
    }


}
