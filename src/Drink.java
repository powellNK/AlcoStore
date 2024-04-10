public class Drink {
    private String kindDrink; // вид напитка
    private String brandDrink;// Бренд
    private double strength; // крепость алкоголя
    private int price; // цена


    public Drink(String kindDrink, String brandDrink, double strength, int price) {
        this.kindDrink = kindDrink;
        this.brandDrink = brandDrink;
        this.strength = strength;
        this.price = price;
    }

    public String getKindDrink() {
        return kindDrink;
    }

    public void setKindDrink(String kindDrink) {
        this.kindDrink = kindDrink;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        if (strength < 0) {
            throw new IllegalArgumentException("Крепость не может быть ниже 0");
        } else {
            this.strength = strength;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Цена не может быть ниже 0");
        } else {
            this.price = price;
        }
    }

    public String getBrandDrink() {
        return brandDrink;
    }

    public void setBrandDrink(String brandDrink) {
        this.brandDrink = brandDrink;
    }

    @Override
    public String toString() {
        return "Напиток: " + kindDrink +
                " Бренд: " + brandDrink +
                ", Крепость: " + strength +
                " , Цена: " + price;
    }
}
