public class Calculator {

    public int Sum(int number1, int number2) {
        return number1 + number2;
    }

    public int Div(int number1, int number2) throws Exception {
        try {
            return number1 / number2;
        } catch (Exception e) {
            throw new Exception("Division error");
        }
    }
}
