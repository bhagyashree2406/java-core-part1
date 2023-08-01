public class Driver {
    public static void main(String[] args) {


        Student student1 = new Student("Vikram", 100, 28);

        Student student2 = new Student("Vikram",100, 28);

        Student student3 = new Student("Vikram",100, 27);

        Student student4 = student1;

        Employee employee = new Employee("Vikram",100, 27);




        System.out.println(student1.equals(student2));//true

        System.out.println(student1.equals(student3));//false

        System.out.println(student1.equals(employee));//false

        System.out.println(student1.equals(student4));

        System.out.println("HashCode for student1 is : "+ student1.hashCode());
        System.out.println("Vikram hascode is : "+"V".hashCode());//86*31^0
        System.out.println("Vikram hascode is : "+"Vi".hashCode());//86*31^1 + 105*31^0
        System.out.println("Vikram hascode is : "+"Vik".hashCode());//86*31^2 + 105*31^1 + 107*31^0

    }

}
