class Employee{
    String name;
    int id;
    int age;

    public Employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}

public class Driver {

    public static void main(String[] args) {

        Student student1 = new Student("Bhagyashree", 100 , 23);

        Student student2 = new Student("Bhagyashree" , 100 , 23);

        Student student3 = new Student("Bhagyashree" , 100 , 22);

        Student student4 = student1;

        Employee employee = new Employee("Bhagyashree" , 100 , 22);

        System.out.println(student1.equals(student2));// true

        System.out.println(student1.equals(student3)); // false

        System.out.println(student1.equals(employee));// false

        System.out.println(student1.equals(student4));//true

        //System.out.println("HashCode for student1 is : " + student1.hashCode());
        // s[0]*31^(n-1) + s[1]*31^(n-2) +......s[n-1]
        System.out.println("Bhagyashree  hashcode is : " + "B".hashCode());//66*31^0
        System.out.println("Bhagyashree hashcode is : " + "Bh".hashCode());// 66*31^1 + 104*31^0
        System.out.println("Bhagyashree hashcode is : " + "Bha".hashCode());// 66*31^2 66*31^1 + 104*31^0







    }

}
