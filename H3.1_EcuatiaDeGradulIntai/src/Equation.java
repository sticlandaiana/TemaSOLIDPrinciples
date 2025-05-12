//ax+b=0 => x=-b/a
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class Equation {

    private Integer a;
    private Integer b;
    private String status;   // three cases: a=0 -> no solution, a=0 and b=0 -> infinite solutions, a!=0 => it has one solution
    private Double result;   // in case my equation is determined (the equation has one solution)

    public Equation(Integer a, Integer b) {
        this.a = a;
        this.b = b;
        solve();
    }

    private void solve() {
        if (a == 0 && b == 0) {
            status = "indeterminate";
            result = null;
        } else if (a == 0) {
            status = "impossible";
            result = null;
        } else {
            status = "determined";
            result = -1.0*b / a;
        }
    }

    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        //adding our pairs like "a": 2, "b": 3
        json.put("a",a);
        json.put("b",b);
        json.put("status",status);

        if(result!=null){
            json.put("solution", result);
        }else{
            json.put("solution",JSONObject.NULL);
            //null does not exist in java as a valid reference,
            //so the org.json library will delete the key solution if we use it
        }
        return json;
    }

    public void saveToFile(String filename) {
        FileWriter file = null;
        try{
            file = new FileWriter(filename);
            file.write(this.toJSON().toString(3)); // 3 spaces identare
            System.out.println("Saved JSON to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }finally{
            try{
                if(file!=null){ //we have to close the file (if we don't do that, our data won't be saved in the json files
                    file.close();
                }
            }catch(IOException e){
                System.out.println("Error closing file: "+e.getMessage());
            }
        }
    }
}