package Calculator;

public class Main {
    public static void main(String[] arr){
        Calculator cal = new Calculator();

        int sum = cal.add(10,20);
        System.out.println(sum);

        int subt = cal.sub(20 ,10);
        System.out.println(subt);

        int mult = cal.multiplication(2,3);
        System.out.println(mult);

        float div = cal.division(3 , 2);
        System.out.println(div);
    }
}
