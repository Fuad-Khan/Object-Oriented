public class Student {
    String name;
    int id;
    double cgpa;
    public static void main(String[]args){
        Student obj1 = new Student();
        Student obj2 = new Student();
        obj1.name="Fuad";
        obj1.id=883;
        obj1.cgpa=3.64;
        obj2.name="Omar";
        obj2.id=846;
        obj2.cgpa=3.68;
        System.out.println(obj1.name+" "+obj1.id+" "+obj1.cgpa);
        System.out.println(obj2.name+" "+obj2.id+" "+obj2.cgpa);
    }
}
