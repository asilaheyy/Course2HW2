import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза обыкновенная","Голландия",35.59f, 5);
        Flower peony = new Flower("Хризантема", "Россия", 15f, 5);
        Flower gypsophila = new Flower("Пион", "Англия", 69.9f, 1);
        Flower chrysanthemum = new Flower("Гипсофила", "Турция", 19.5f, 10);

        Bouquet bouquet1 = new Bouquet(rose,rose,rose,peony,peony,peony);

        System.out.println(rose);
        System.out.println(peony);
        System.out.println(gypsophila);
        System.out.println(chrysanthemum);
        System.out.println("Bouquet cost: "+ bouquet1.getCost()+" rub.");
        System.out.println("Bouquet lifespan: "+bouquet1.getLifespan()+" days.");

    }
}