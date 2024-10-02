public class RectangleArea {

    private int length;
    private int breadth;

    RectangleArea(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(int length){
       this.length = length;
    }

    public int getLength(){
        return this.length;
    }

    public void setBreadth(int breadth){
        this.breadth = breadth;
    }

    public int getBreadth(){
        return this.breadth;
    }

    public int getArea(){
        return length * breadth;
    }
}


