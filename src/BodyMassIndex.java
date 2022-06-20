public class BodyMassIndex {
    public double calculate(int weight, double height) {
        double bodyMassIndex = weight / (height * height); // считаем ИМТ
        return bodyMassIndex; // возвращаем рассчитанный индекс массы тела
    }
}