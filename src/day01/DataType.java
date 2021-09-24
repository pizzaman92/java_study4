package day01;

public class DataType {

    public static void main(String[] args) {

        byte a = 128  -  1;
        short b = 32768  -  1;
        int c = 2147483647;
        long d = 20000000000L;

        System.out.println("d = " + d);

        //실수 타입
        float f1 = 1.234567F; //4byte
        double d1 = 1.234567; //8byte

        float f2 = 1.234567891234F;
        double d2 = 1.234567891234F;
        System.out.println("f2 = " + f2);
        System.out.println("d2 = " + d2);

        //문자 타입
        char c1 = 'A';
        char c2 = 30003;
        System.out.println("c2 = " + c2);

        String s1 = "hey!";
        String s2 = "my name in Cho~~~~";
        System.out.println(s1 + s2);

    }
}

