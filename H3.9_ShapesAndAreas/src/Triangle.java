public class Triangle implements Shape{
    private int base;
    private int height;
    public Triangle(int base, int height)
    {
        this.base=base;
        this.height=height;
    }

    @Override
    public double getArea(){
        return base*height*0.5;
    }
}
