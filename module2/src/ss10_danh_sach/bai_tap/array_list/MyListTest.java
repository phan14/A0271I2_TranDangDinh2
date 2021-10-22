package ss10_danh_sach.bai_tap.array_list;

public class MyListTest {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
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


        public static void main(String[] args) {
            Student a=new Student(1,"Huy");
            Student b=new Student(2,"Tuấn");
            Student c=new Student(3,"Anh");
            Student d=new Student(4,"Dũng");
            Student e=new Student(5,"Hùng");
            Student f=new Student(6,"Hùng2");


            MyList<Student> studentMyList =new MyList<>();
            MyList<Student> newMyList =new MyList<>();


            studentMyList.add(a);
            studentMyList.add(b);
            studentMyList.add(c);
            studentMyList.add(d);
            studentMyList.add(e);
//            studentMyList.add(f,2);
            studentMyList.size();

//            System.out.println("kích thước phần tử\t"+studentMyList.size()+"\n");
//
//            System.out.println(studentMyList.get(2).getName());

//            System.out.println(studentMyList.indexOf(c));
//            System.out.println(studentMyList.contains(c));
//            System.out.println(studentMyList.contains(f));

            newMyList = studentMyList.clone();
            Student student = newMyList.remove(0);
            System.out.println(student.getName());
//            for (int i =0; i<newMyList.size();i++){
//                System.out.println(newMyList.get(i).getName());
//            }




//            for (int i = 0; i<studentMyList.size();i++){
//                Student student =(Student) studentMyList.elements[i];
//                System.out.println(student.getId());
//                System.out.println(student.getName());
//
//            }

        }
    }
}
