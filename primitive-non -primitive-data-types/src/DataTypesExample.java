public class DataTypesExample {

    public static void main(String[] args) {


        byte byteData = (byte)132;
        System.out.println("byte  : " +byteData);
        System.out.println("byte min : " +Byte.MIN_VALUE);
        System.out.println("byte max :" +Byte.MAX_VALUE);


        short shortData =(short)32768;
        System.out.println(shortData);
        System.out.println("short :" +Short.MIN_VALUE);
        System.out.println("short  :" +Short.MAX_VALUE);

        int intData = 200000;
        System.out.println(intData);
        System.out.println("int  :" +Integer.MIN_VALUE);
        System.out.println("int  :" +Integer.MAX_VALUE );

        long longData = 2000000000;
        System.out.println(longData);
        System.out.println("long  :" + Long.MIN_VALUE);
        System.out.println("long  :" +Long.MAX_VALUE);

        char charData =  'A';
        System.out.println(charData);
        System.out.println("char  :" +Character.MIN_VALUE);
        System.out.println("char :" +Character.MAX_VALUE);



        float floatData = 10.12121212125f;
        System.out.println(floatData);
        System.out.println("float  :" +Float.MIN_VALUE);
        System.out.println("float :" + Float.MAX_VALUE);

        double doubleData = 10.121212121212121212125d;
        System.out.println(doubleData);
        System.out.println("doble :" +Double.MIN_VALUE);
        System.out.println("double :" + Double.MAX_VALUE);

        boolean booleanData = true;
        System.out.println(booleanData);




    }
}


