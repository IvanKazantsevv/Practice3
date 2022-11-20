package Ex5;

public class n5 {
    public static void main(String[] args) {
        //1
        Double x = Double.valueOf(5);
        //2
        String str = "100";
        double val = Double.parseDouble(str);
        //3
        Double obj = new Double("39.45");
        int intVal = obj.intValue();
        System.out.println(intVal);
        byte byteVal = obj.byteValue();
        System.out.println(byteVal);
        short shortVal = obj.shortValue();
        System.out.println(shortVal);
        float floatVal = obj.floatValue();
        System.out.println(floatVal);
        double doubleVal = obj.doubleValue();
        System.out.println(doubleVal);
        //4
        System.out.println(obj);
        //5
        String d = Double.toString(3.14);



    }
}
