package streamexample;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Person {
    int age;
    int id;
    String name;
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class StreamExample {

    public static void main(String[] args) {
        List<String> guestList = new ArrayList<>();
        guestList.add("Dhanshree");
        guestList.add("Prashant");
        guestList.add("Rani");
        guestList.add("Bhagyashree");
        guestList.add("Arti");
        guestList.add("Dipali");

        //Stream is sequence of elements -> elements can be anything like Integers, String , Student etc.

        //Streams are used to replace for and while loops.

        Stream<String> stringStream1 = guestList.stream();

//        Stream<String> stringStream2 = stringStream1.filter(s1 -> {
//            System.out.println("s1 is in filter : " + s1);
//            return s1.length() >= 5;
//        });
//
//        Stream<String> stringStream3 = stringStream2.map(s2 -> {
//            System.out.println("s2 is in map : " + s2);
//            return s2.toLowerCase();
//        });
//
//        stringStream3.forEach(s3 -> System.out.println("s3 in the stream - " + s3));

        stringStream1.filter(s1 -> {
                    System.out.println("s1 is in filter : " + s1);
                    return s1.length() >= 5;
                })
                .map(s2 -> {
                    String lower =  s2.toUpperCase();
                    System.out.println("s2 is in map : " + lower);
                    return lower;
                })
                .forEach(s3 -> System.out.println("s3 in the stream - " + s3));

        //if stream contains 5 elements then, for each element entire stream pipeline
        //gets executed.

        String[] friendList = new String[]{"Vikram", "Vivek", "Karan", "Moin"};
        //create stream using Arrays.stream() method.
        System.out.println("##########################################################");
        Stream<String> stringStream = Arrays.stream(friendList);
        stringStream.forEach(System.out::println);


        //or create stream using Stream.of() method.
        System.out.println("##########################################################");
        stringStream = Stream.of("Bhagyashree", "Rutuja", "Dipali");
        stringStream.forEach(System.out::println);



        System.out.println("##########################################################");
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Bhagyashree", 22));
        studentList.add(new Student("Rutuja", 26));
        studentList.add(new Student("Dipali", 28));

        Stream<Student> studentStream = studentList.stream();
        for (String name : studentStream.filter(s -> s.getAge() > 25).map(s -> s.getName()).collect(Collectors.toList())) {
            System.out.println(name);
        }


    }
}