package ss10_danh_sach.bai_tap.linkedList;

public class MyLinkedListTest {
    private static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Person> myLinkedList = new MyLinkedList<>();
        Person p1 = new Person("Trung",33);
        myLinkedList.addFirst(p1);
        Person p2 = new Person("Dung",20);
        myLinkedList.addFirst(p2);
        Person p3 = new Person("Tien",25);
        myLinkedList.addFirst(p3);
        Person p4 = new Person("Duc",40);
        myLinkedList.add(1,p4);
        Person p5 = new Person("Ha",24);
//        myLinkedList.addLast(p5);

        for (int i = 0; i < myLinkedList.size(); i++){
            Person p = (Person) myLinkedList.get(i);
            System.out.println(p.name);
        }
        int a1 = myLinkedList.indexOf(p1);
        int a2 = myLinkedList.indexOf(p2);
        int a3 = myLinkedList.indexOf(p3);
        int a4 = myLinkedList.indexOf(p4);
        int a5 = myLinkedList.indexOf(p5);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
    }
}
