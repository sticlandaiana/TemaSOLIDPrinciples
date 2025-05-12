public class Square implements Shape{

    private int l;

    public Square(int l){
        this.l=l;
    }

    @Override
    public void draw(){
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
