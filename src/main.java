import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        AlcoholStore store1 = new AlcoholStore(20);
        Drink beer1 = new Drink("Пиво", "Guinness", 4.5, 99);
        store1.addDrink(beer1);
        store1.addDrink(new Drink("Коньяк", "Кенингсберг", 40, 3600));
        Drink beer2 = new Drink("Пиво", "Spaten", 4.5, 150);
        store1.addDrink(beer2);
        store1.addDrink(new Drink("Коньяк", "Дагестан", 35, 2300));
        store1.addDrink(new Drink("Ликер", "Jagermeister", 35, 1300));


        store1.printDrinks();

        String command;

        do {
            int indexProduct = -1;
            String drink;
            System.out.println("Список команд:");
            System.out.println("Добавить товар: add \n" +
                    "Вывести список товаров: print \n" +
                    "Купить товар: buy \n" +
                    "Изменить цену: edit \n" +
                    "Остановить программу: stop / STOP");
            command = reader.nextLine();
            switch (command) {
                case "add":
                    try {
                        store1.addDrink(new Drink(reader.nextLine(), reader.nextLine(), reader.nextDouble(), reader.nextInt()));
                        System.out.println("Товар добавлен");
                    } catch (Exception e) {
                        System.out.println("Не получилось добавить товар " + e.getMessage());
                    }
                    break;
                case "print":
                    store1.printDrinks();
                    break;
                case "buy":
                    System.out.println("Введите ваш возраст: ");
                    int age = reader.nextInt();
                    System.out.println("Введите напиток: ");
                    reader.nextLine();
                    drink = reader.nextLine();
                    indexProduct = store1.getDrinkIndex(drink);
                    try {
                        store1.buyDrink(indexProduct, age);
                        System.out.println("Товар куплен");
                    } catch (Exception e) {
                        System.out.println("Не получилось купить. " + e.getMessage());
                    }
                    break;
                case "edit":
                    drink = reader.nextLine();
                    int editPrice = reader.nextInt();
                    try {
                        indexProduct = store1.getDrinkIndex(drink);
                        store1.editDrink(indexProduct, editPrice);
                        System.out.println("Цена изменена");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    reader.nextLine();
                    break;
            }
        } while (!command.equals("STOP") && !command.equals("stop"));


    }
}
