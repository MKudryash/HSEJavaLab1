package MethodsCommodity;

import Models.Commodity;

import java.util.ArrayList;

public class MethodsCommodity {
    public static void sortByName(ArrayList<Commodity> list) {
        list.sort((o1, o2)
                -> o1.getName().compareTo(
                o2.getName()));
    }
    public static void sortByRetailPrice(ArrayList<Commodity> list) {
        list.sort((o1, o2)
                -> o1.getRetailPrice());
    }

}
