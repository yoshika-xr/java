class Student{
    String name;
    int mark;
}


public class arrayobject {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "satyarth";
        s1.mark = 80;

        Student s2 = new Student();
        s2.name = "maha";
        s2.mark = 90;

        Student s3 = new Student();
        s3.name = "nelson";
        s3.mark = 70;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for (int i = 0; i < students.length; i++) {
            System.out.println("name:" + students[i].name + ",mark:" + students[i].mark);
        }

    }
}
