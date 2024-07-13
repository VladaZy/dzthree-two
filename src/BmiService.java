public class BmiService {
    public int calculate(double weightKg, double heightMeters) {
        // Формула расчета BMI: вес (в кг) / (рост (в метрах) ^ 2)
        double bmi = weightKg / (heightMeters * heightMeters);
        return (int) bmi; // Приведение к целому числу
    }
}
