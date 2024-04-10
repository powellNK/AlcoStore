import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        AlcoholStore store1 = new AlcoholStore(20);
        Drink beer1 = new Drink("Пиво","Guinness" ,4.5, 99);
        store1.addDrink(beer1);
        store1.addDrink(new Drink("Коньяк", "Кенингсберг" , 40, 3600));
        Drink beer2 = new Drink("Пиво","Spaten" ,4.5, 150);
        store1.addDrink(beer2);
        store1.addDrink(new Drink("Коньяк", "Дагестан" ,35, 2300));
        store1.addDrink(new Drink("Ликер", "Jagermeister" ,35, 1300));

        try {
            store1.addDrink(new Drink("Абсент", "Tunel" ,70, 2999));
        } catch (Exception e) {
            System.out.println("Не получилось добавить товар " + e.getMessage());
        }
        store1.printDrinks();


        System.out.println("Введите ваш возраст: ");
        int age = reader.nextInt();
        System.out.println("Введите напиток: ");
        reader.nextLine();
        String drink = reader.nextLine();

        store1.printDrinks(drink);

        int index = store1.getDrinkIndex(drink);
        try {
            store1.buyDrink(index, age);
            System.out.println("Товар куплен");
        } catch (Exception e) {
            System.out.println("Не получилось купить. " + e.getMessage());
        }
        store1.printDrinks();

        try {
            beer2.setPrice(-50);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        try {
            beer2.setPrice(60);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        store1.printDrinks();






    }
}
