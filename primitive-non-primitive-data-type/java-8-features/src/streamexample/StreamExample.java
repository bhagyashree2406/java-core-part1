package streamexample;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Student student)) return false;

        return age == student.age
                && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
public class StreamExample {

    public static void main(String[] args) {
        List<String> guestList = new ArrayList<>();
        guestList.add("Vikram");
        guestList.add("Vivek");
        guestList.add("Karan");
        guestList.add("Bhagyashree");
        guestList.add("Arti");
        guestList.add("Moin");

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
        //gets executed one after the other.

        String[] friendList = new String[]{"Vikram", "Vivek", "Karan", "Moin"};
        //create stream using Arrays.stream() method.
        System.out.println("##########################################################");
        Stream<String> stringStream = Arrays.stream(friendList);
        stringStream.forEach(System.out::println);


        //or create stream using Stream.of() method.
        System.out.println("##########################################################");
        stringStream = Stream.of("Vikram", "Mike", "Bob");
        stringStream.forEach(System.out::println);



        System.out.println("##########################################################");
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Vikram", 26));
        studentList.add(new Student("Mike", 23));
        studentList.add(new Student("Bob", 27));
        studentList.add(new Student("Moin",23));
        studentList.add(new Student("Aarti", 24));
        studentList.add(new Student("Karan", 25));

        Stream<Student> studentStream = studentList.stream();

        //Lambda exp are nothing but they provide implementation for abstract method of func interface
        //and at the same time lambda returns an object of func interface.
        Predicate<Student> predicate = s -> s.getAge() > 24;//predicate does checking for given condition
        Function<Student, String> mapper = s1 -> s1.getName();//function applies the transformation and returns a result
        //filter -> filter out stream elements
        //map -> transforms one stream to another stream
//        System.out.println(studentStream
//                .distinct()
//                .count());//count() is terminal method
//        System.out.println(studentStream//stream of Students
//                .map(student -> student.getAge()) //Stream of Integers(ages)
//                .max(Comparator.comparingInt(age -> age)));//Max from Stream of Integers using Comparator

        for (String name : studentStream
                .filter(predicate)
                .map(mapper)
                .collect(Collectors.toList())) {
            System.out.println(name);
        }
        //if stream contains 5 elements then, for each element entire stream pipeline
        //gets executed one after the other.
        //This is because the Stream Pipeline is Executed Vertically.

    }
}