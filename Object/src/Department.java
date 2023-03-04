public class Department {
    String deptName;
    int deptCode;
    String faculty;

    public static void main(String[] args) {
        Department dept1 = new Department();
        dept1.deptName = "EEE";
        dept1.deptCode = 37;
        dept1.faculty = "FSIT";

        Department dept2 = new Department();
        dept2.deptName = "SWE";
        dept2.deptCode = 35;
        dept2.faculty = "FSIT";

        System.out.println("Department 1:");
        System.out.println("Name: " + dept1.deptName);
        System.out.println("Code: " + dept1.deptCode);
        System.out.println("Faculty: " + dept1.faculty);

        System.out.println("Department 2:");
        System.out.println("Name: " + dept2.deptName);
        System.out.println("Code: " + dept2.deptCode);
        System.out.println("Faculty: " + dept2.faculty);
    }
}