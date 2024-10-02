public class Cars {

    String name;
    String company;
    String colour;
    int speed = 100;


    public void blowHorn(){
        System.out.println("Horn is blowing");
    }

    public int accelerate(int s){
        speed = speed + s;
        return speed;
    }

    public int brake(int s){
        speed = speed - s;
        return speed;
    }

}
