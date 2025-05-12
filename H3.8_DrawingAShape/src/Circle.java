public class Circle implements Shape{

    private int radius;

    public Circle(int radius){
        this.radius= radius;
    }


    @Override
    public void draw(){

        double dist;
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                dist = Math.sqrt(Math.pow(i - radius, 2) + Math.pow(j - radius, 2));
                if (dist > radius - 0.5 && dist < radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}
