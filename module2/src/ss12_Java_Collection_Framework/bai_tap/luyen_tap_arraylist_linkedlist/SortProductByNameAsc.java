package ss12_Java_Collection_Framework.bai_tap.luyen_tap_arraylist_linkedlist;

import java.util.Comparator;

public class SortProductByNameAsc implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if (p1.getName().equals(p2.getName())) {
            return (int) (p1.getValue() - p2.getValue());
        }
        return p1.getName().compareTo(p2.getName());
    }

}
