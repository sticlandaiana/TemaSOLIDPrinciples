import java.util.ArrayList;
import java.util.List;

public class GeometricTrousse {

    private List<Shape> pencilCase;

    public GeometricTrousse(){
        pencilCase=new ArrayList<>();
    }

    public void addShape(Shape s){
        pencilCase.add(s);
    }

    public void letsDrawThemAll(){
        for(Shape s: pencilCase){
            s.draw();
        }
    }
}
