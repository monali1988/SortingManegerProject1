package com.sparta.sort;

import com.sparta.sort.Model.SortFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleFactory extends SortFactory {

    private static Logger logger = LogManager.getLogger("Bubble Factory");
    @Override
    public Sort getInstance() {
        logger.info("Bubble Sort - getInstance");
        return new BubbleSort();

    }

}
