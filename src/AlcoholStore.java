public class AlcoholStore {
    private int size; //реальное количество книг в магазине
    private int capacity; // максимальное количество книг в магазине
    private Drink[] drinks;


    public AlcoholStore(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        drinks = new Drink[capacity];
    }

    public void addDrink(Drink drink) {
        if (size == capacity) {
            throw new IllegalArgumentException("Магазин заполнен");
        }
        drinks[size++] = drink;
    }

    public void printDrinks() {
        for (int i = 0; i < size; i++) {
            System.out.println(drinks[i]);
        }
        System.out.println();
    }

    public void printDrinks(String nameDrink) {
        for (int i = 0; i < size; i++) {
            if (drinks[i].getKindDrink().equals(nameDrink) || drinks[i].getBrandDrink().equals(nameDrink)) {
                System.out.println(drinks[i]);
            }
        }
        System.out.println();
    }

    public Drink getDrink(String nameDrink) {
        for (int i = 0; i < size; i++) {
            if (drinks[i].getKindDrink().equals(nameDrink)) {
                return drinks[i];
            }
        }
        return null;
    }

    public int getDrinkIndex(String nameDrink) {
        for (int i = 0; i < size; i++) {
            if (drinks[i].getKindDrink().equals(nameDrink) || drinks[i].getBrandDrink().equals(nameDrink)) {
                return i;
            }
        }
        return -1;
    }

    public void buyDrink(int index, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Продажа алкоголя несовершеннолетним запрещена");
        } else {
            if (index >= 0) {
                for (int i = index; i < size - 1; i++) {
                    drinks[i] = drinks[i + 1];
                }
                size--;
            } else {
                throw new IllegalArgumentException("Нет такого товара");
            }
        }
    }

}
