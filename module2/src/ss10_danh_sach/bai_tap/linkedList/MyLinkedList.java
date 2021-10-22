package ss10_danh_sach.bai_tap.linkedList;

import java.util.Objects;

public class MyLinkedList<E> {

    private class Node{
        private Node next;
        private  Objects data;


        public Node(Objects data) {
            this.data = data;
        }

        public Objects getData(){
            return this.data;
        }
    }

//    phần tử đầu tiên của danh sách liên kết
    private Node head;
//    số lượng phần tử trong danh sách
    private int numNode =0;

    public MyLinkedList(){
    }

    public void addFirst(E element){
//        khai báo 1 biến là temp trỏ đến giá trị
        Node temp =head;
//        biến head nhận giá trị 1 node ms
        head =new Node((Objects) element);
        head.next=temp;
        numNode++;
    }

    public void addLast(E element){
        Node temp=head;
        while (temp.next !=null){
            temp =temp.next;
        }
        temp.next =new Node((Objects) element);
        numNode++;
    }

    public void add(int index ,E element){

    }


















}
