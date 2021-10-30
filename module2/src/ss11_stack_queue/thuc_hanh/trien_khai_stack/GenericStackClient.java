package ss11_stack_queue.thuc_hanh.trien_khai_stack;

import static ss11_stack_queue.thuc_hanh.trien_khai_stack.MyGenericStack.stackOfIStrings;
import static ss11_stack_queue.thuc_hanh.trien_khai_stack.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}