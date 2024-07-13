public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weight1 = 98;
        double height1 = 1.87;
        int bmi1 = service.calculate(weight1, height1);
        System.out.println("Weight: " + weight1 + " kg, Height: " + height1 + " m -> BMI: " + bmi1);

        double weight2 = 70;
        double height2 = 1.75;
        int bmi2 = service.calculate(weight2, height2);
        System.out.println("Weight: " + weight2 + " kg, Height: " + height2 + " m -> BMI: " + bmi2);

        double weight3 = 85;
        double height3 = 1.83;
        int bmi3 = service.calculate(weight3, height3);
        System.out.println("Weight: " + weight3 + " kg, Height: " + height3 + " m -> BMI: " + bmi3);
    }
}