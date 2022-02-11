package Model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BSTFactory extends SortFactory {
    private static Logger logger = LogManager.getLogger("BST Factory");
    public Sort getInstance() {
        logger.info("BST Sort - getInstance");
        return (Sort) new BSTSort();
    }


}

