package ss12_Java_Collection_Framework.bai_tap.luyen_tap_arraylist_linkedlist;
import  java.util.*;


public class Product {
    //    thuoc tinh
    private int id;
    private String name;
    private double value;

//    phuong thuc

    public Product() {
    }

    public Product(int id, String name, double value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

}



