package dz1;
// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
//перегруженный метод getProduct(int name, int volume, int temperature),
//выдающий продукт соответствующий имени, объёму и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
//воспроизвести логику, заложенную в программе
// Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HotDrink hotDrink = new HotDrink("black tea", 123, 0.4, 80);
        HotDrink hotDrink1 = new HotDrink("black coffe", 456, 0.3, 80);
        HotDrink hotDrink2 = new HotDrink("green tea", 789, 0.4, 85);
        HotDrink hotDrink3 = new HotDrink("latte", 678, 0.3, 75);
//        System.out.println(hotDrink);
        List<Product> productList = new ArrayList<>();
        productList.add(hotDrink);
        productList.add(hotDrink1);
        productList.add(hotDrink2);
        productList.add(hotDrink3);
        HotDrinkVendingMachine vendingHotMachine = new HotDrinkVendingMachine();
        vendingHotMachine.initProduct(productList);
        System.out.println(vendingHotMachine.getProduct("black tea"));
    }
}