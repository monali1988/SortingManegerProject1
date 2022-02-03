package com.sparta.sort.Model;

import com.sparta.sort.MergeSort;
import com.sparta.sort.Sort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MergeFactory extends SortFactory{

    private static Logger logger = LogManager.getLogger("Merge Factory");
    @Override
    public Sort getInstance() {
        logger.info("Merge Sort - getInstance");
        return new MergeSort();
    }


}
