// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKilos =90;
        double heightInMetres =1.74;
        int bmi = service.calculate(weightInKilos,heightInMetres);
        System.out.println(bmi);
    }
}