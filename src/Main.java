public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        int weight = 50;// вес в кг
        double height = 1.70;// рост в метрах
        double bodyMassIndex = service.calculate(weight,height); //считаем имт
        System.out.println("Ваш вес: " + weight + " кг.");
        System.out.println("Ваш рост: " + height*100 + " см.");
        System.out.println("Ваш индекс массы тела: " + bodyMassIndex);
    }
}
