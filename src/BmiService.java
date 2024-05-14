public class BmiService {
    public int calculate(int weightInKilos, double heightInMetres) {
        double bmi = weightInKilos / Math.pow(heightInMetres, 2);
        return (int) bmi;
    }
}
