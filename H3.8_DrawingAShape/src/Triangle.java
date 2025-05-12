public class Triangle implements Shape {

    private int height;

    public Triangle(int height){
        this.height=height;
    }
    @Override
    public void draw(){
        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }
}
