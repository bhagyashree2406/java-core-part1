public class DataTypeExample {
    public static void main(String[] args) {
        byte byteData =(byte)132;

        short shortData =(short) 32768;
        int intData = 200000;
        long longData = 200000l;


        float floatData = 10.12121212F;
        double doubleData = 10.1212121212d;

        char charData =  'A';

        boolean bool = true;

        System.out.println("byte  Min : " + Byte.MIN_VALUE);
        System.out.println( "byte : "+byteData);
        System.out.println("byte Max : " +Byte.MAX_VALUE);

        System.out.println("short Min : " + Short.MAX_VALUE);
        System.out.println("short  : "+shortData);
        System.out.println("short Max : " + Short.MIN_VALUE);

        System.out.println("int Min :" + Integer.MAX_VALUE);
        System.out.println("int  : " +intData );
        System.out.println("int Max :" +Integer.MIN_VALUE);


        System.out.println("long Min :" + Long.MAX_VALUE);
        System.out.println("long : " +longData);
        System.out.println("long Max :" + Long.MIN_VALUE);


        System.out.println("float Min :" + Float.MAX_VALUE);
        System.out.println("float : " +floatData);
        System.out.println("float Max :" + Float.MIN_VALUE);

        System.out.println("double Min  :"  + Double.MAX_VALUE);
        System.out.println("double : " +doubleData);
        System.out.println("double  Max :" + Double.MIN_VALUE);

        System.out.println("char Min : " + Character.MAX_VALUE);
        System.out.println("char :" + charData);
        System.out.println("char Min :" + Character.MIN_VALUE);

        System.out.println(bool);


        System.out.println(Double.MAX_VALUE );
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
    }
}
