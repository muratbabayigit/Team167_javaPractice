package day01;

public class P02_dataTypes {
    public static void main(String[] args) {
        // primitive  -  non-Primitive
        // byte < short < integer < long < float < double       char    boolean
        byte bytMax = Byte.MAX_VALUE;
        byte bytMin = Byte.MIN_VALUE;
        System.out.println("bytMax = " + bytMax);
        System.out.println("bytMin = " + bytMin);
        int IntMax = Integer.MAX_VALUE;
        int IntMin = Integer.MIN_VALUE;
        System.out.println("IntMin = " + IntMin);
        System.out.println("IntMax = " + IntMax);
        System.out.println("--------------------------------------------------");
        char A = 76;
        char a = 'a';
        System.out.println(A);
        System.out.println(a);
        boolean dogruMu = (3 == 4);
        System.out.println(dogruMu);
    }
}

