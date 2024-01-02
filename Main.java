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
        BotleWater botleWater = new BotleWater("test", 123, 1.5);
        BotleWater botleWater1 = new BotleWater("test1", 456, 0.5);
        BotleWater botleWater2 = new BotleWater("test2", 789, 2.5);
        BotleWater botleWater3 = new BotleWater("test3", 678, 5);
//        System.out.println(botleWater);
        List<Product> productList = new ArrayList<>();
        productList.add(botleWater);
        productList.add(botleWater1);
        productList.add(botleWater2);
        productList.add(botleWater3);
        BotleWaterVendingMachine vendingMachine = new BotleWaterVendingMachine();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("test"));
    }
}