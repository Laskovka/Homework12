package ua.com.alevel;

public class FourExceptions {

    public static void forExceptionClassCast(Object o) {
        Integer d = (Integer) o;
    }

    public static void main(String[] args) {
        try {
            //ClassCastException
            String a = "Hrrr";
            forExceptionClassCast(a);
        } catch (ClassCastException classCastException) {
            System.out.println("ClassCastException - " + classCastException.getMessage());
        }
        try {
            //NullPointerException
            String myString = null;
            if (myString.equals("Hello!")) {
                System.out.println("Hello!");
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println("NullPointerException - " + nullPointerException.getMessage());
        }
        try {
            //NumberFormatException
            String string = "65s";
            Integer integer = Integer.valueOf(string);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("NumberFormatException - " + numberFormatException.getMessage());
        }
        try {
            //ArrayIndexOutOfBoundsException
            int[] ints = new int[]{1, 2, 3};
            for (int i = 0; i < ints.length + 1; i++) {
                ints[i]++;
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("ArrayIndexOutOfBoundsException - " + arrayIndexOutOfBoundsException.getMessage());
        }
    }
}
