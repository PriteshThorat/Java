// Write programs using Wrapper Class to convert primitive into object and to convert object into primitive.

public class Q8 {
    public static void main(String[] args) {
        int primitiveInt = 100;
        Integer objectInt = Integer.valueOf(primitiveInt);
        Integer autoBoxedInt = primitiveInt;              

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Boxed Integer (using valueOf): " + objectInt);
        System.out.println("Auto-boxed Integer: " + autoBoxedInt);

        Integer wrapperInt = new Integer(200);            
        int unboxedInt = wrapperInt.intValue();         
        int autoUnboxedInt = wrapperInt;               
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Unboxed int (using intValue): " + unboxedInt);
        System.out.println("Auto-unboxed int: " + autoUnboxedInt);

        double primitiveDouble = 99.99;
        Double objectDouble = primitiveDouble;           
        double unboxedDouble = objectDouble;              
        System.out.println("\nPrimitive double: " + primitiveDouble);
        System.out.println("Boxed Double: " + objectDouble);
        System.out.println("Unboxed double: " + unboxedDouble);
    }
};