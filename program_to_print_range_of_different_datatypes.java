public class DataTypes {
    public static void main(String[] args) {
        System.out.println("S.No.\tData Type\tSize\tMinimum Value\tMaximum Value");
        System.out.println("1.\tbyte\t\t8\t" + Byte.MIN_VALUE + "\t\t" + Byte.MAX_VALUE);
        System.out.println("2.\tshort\t\t16\t" + Short.MIN_VALUE + "\t\t" + Short.MAX_VALUE);
        System.out.println("3.\tint\t\t32\t" + Integer.MIN_VALUE + "\t" + Integer.MAX_VALUE);
        System.out.println("4.\tlong\t\t64\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        System.out.println("5.\tfloat\t\t32\t" + Float.MIN_VALUE + "\t" + Float.MAX_VALUE);
        System.out.println("6.\tdouble\t\t64\t" + Double.MIN_VALUE + "\t" + Double.MAX_VALUE);
        System.out.println("7.\tchar\t\t16\t" + (int) Character.MIN_VALUE + "\t\t" + (int) Character.MAX_VALUE);
        System.out.println("8.\tboolean\t1\t" + false + "\t\t" + true);
    }
}
