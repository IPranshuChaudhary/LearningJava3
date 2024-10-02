package Classes.Apr8;

public class Main {

    public static void main(String[] args) {

        Average average = new Average();

        average.setA(12);
        average.setB(20);
        average.setC(43);

        System.out.println(average.getAverage());
    }
}
