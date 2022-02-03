package com.sparta.sort;

import Controller.SortController;
import View.SortView;

public class SortManager {
    public static void main(String[] args) {
        SortView view = new SortView();
        String desiredType = view.getDesiredType();
        SortController controller = new SortController();
        int[] result = controller.sortArray(desiredType);
        view.displayResults(result);

        desiredType = view.getDesiredType();
        controller = new SortController();
        result = controller.sortArray(desiredType);
        view.displayResults(result);
    }
}
