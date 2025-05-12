public class Main {
    public static void main(String[] args) {
        Equation eq1 = new Equation(2, -4);   // determinată
        Equation eq2 = new Equation(0, 3);    // imposibilă
        Equation eq3 = new Equation(0, 0);    // nedeterminată

        eq1.saveToFile("equation1.json");
        eq2.saveToFile("equation2.json");
        eq3.saveToFile("equation3.json");
    }
}