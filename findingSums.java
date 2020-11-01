public class findingSums{
    static int plusMethodInt(int x, int y){
        return x+y;
    }

    static double plusMethodDouble(double x, double y){
        return x+y;
    }

    public static void main(String[]args){
        int myNum1=plusMethodInt(4,5);
        double myNum2=plusMethodDouble(3.566,6.8);
        System.out.println("Integer sum is "+ myNum1);
        System.out.println("Double sum is "+ myNum2);
    }
}