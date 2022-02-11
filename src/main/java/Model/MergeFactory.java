package Model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MergeFactory extends SortFactory{

    public static Logger logger = LogManager.getLogger("Merge Factory");

    public MergeFactory() {
    }

    public Sort getInstance() {
        logger.info("Merge Sort - getInstance");
        return new MergeSort();
    }


}
