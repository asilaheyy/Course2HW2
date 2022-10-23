import java.text.DecimalFormat;

public class Flower {
    private String flower;
    private String country;
    private float cost;
    private int lifeSpan;

    Flower(String flower, String country, float cost, int lifeSpan) {
        setFlower(flower);
        setCountry(country);
        setLifeSpan(lifeSpan);
        setCost(cost);
    }

    public String toString() {
        return flower + ",страна проихождения - " + country +
                ",срок стояния - " + lifeSpan +
                " дней.Стоимость одной штуки - "+ cost + " рублей.";
    }

    public void setFlower(String flower) {
        this.flower =Validation.validOrDeafult(flower, "Роза");
    }

    public void setCountry(String country) {
        this.country = Validation.validOrDeafult(country,"Россия");
    }

    public void setCost(float cost) {
        this.cost = Math.max(cost,1);
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = Math.max(lifeSpan,3);
    }

    public String getFlower() {
        return flower;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }


    public String getCountry() {
        return country;
    }
}

