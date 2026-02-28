package database.mockGenerate;
import models.Product;
import models.ProductCategory;
import util.PriceUtil;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ProductMockFactory {

    public static List<Product> generate100Products() {
        List<Product> products = new ArrayList<>();

        addSmartphones(products);
        addElectronics(products);
        addHomeAppliances(products);
        addClothing(products);
        addSports(products);

        return products;
    }

    private static void addSmartphones(List<Product> list) {
        String[] names = {
                "iPhone 15 Pro", "Samsung Galaxy S24", "Xiaomi 14 Ultra",
                "iPad Air", "Galaxy Tab S9", "Motorola Edge 50",
                "iPhone 14", "Galaxy A55", "Redmi Note 13",
                "Asus ROG Phone 8", "iPad Pro", "Galaxy Z Fold 5",
                "Galaxy Z Flip 5", "Poco X6 Pro", "iPhone 13",
                "Realme GT 5", "Moto G84", "iPhone SE",
                "Galaxy M54", "Xiaomi Pad 6"
        };

        for (String name : names) {
            list.add(new Product(
                    UUID.randomUUID().toString(),
                    name,
                    ProductCategory.SMARTPHONES,
                    randomPrice(1500, 8000)
            ));
        }
    }

    private static void addElectronics(List<Product> list) {
        String[] names = {
                "Samsung 55\" 4K TV", "LG OLED 65\"",
                "Sony Soundbar HT-S400", "JBL Flip 6",
                "Dell Inspiron 15", "MacBook Air M2",
                "Lenovo IdeaPad 3", "Logitech MX Master 3",
                "PlayStation 5", "Xbox Series X",
                "Nintendo Switch", "Kindle Paperwhite",
                "GoPro Hero 12", "Canon EOS R50",
                "HP Pavilion", "Acer Nitro 5",
                "Apple Watch Series 9", "Galaxy Watch 6",
                "Echo Dot 5", "Mi Smart Band 8"
        };

        for (String name : names) {
            list.add(new Product(
                    UUID.randomUUID().toString(),
                    name,
                    ProductCategory.ELECTRONICS,
                    randomPrice(800, 6000)
            ));
        }
    }

    private static void addHomeAppliances(List<Product> list) {
        String[] names = {
                "Brastemp Refrigerator", "Electrolux Washing Machine",
                "LG Smart Inverter Microwave", "Philips Airfryer",
                "Mondial Blender", "Arno Coffee Maker",
                "Consul Freezer", "Electrolux Dishwasher",
                "Samsung Vacuum Cleaner", "Britânia Oven",
                "Philco Heater", "Brastemp Cooktop",
                "Electrolux Dryer", "Oster Mixer",
                "Suggar Range Hood", "Tramontina Grill",
                "Fischer Electric Oven", "LG Refrigerator",
                "Panasonic Microwave", "Arno Iron"
        };

        for (String name : names) {
            list.add(new Product(
                    UUID.randomUUID().toString(),
                    name,
                    ProductCategory.HOME_APPLIANCES,
                    randomPrice(300, 5000)
            ));
        }
    }

    private static void addClothing(List<Product> list) {
        String[] names = {
                "Nike Running Shoes", "Adidas Ultraboost",
                "Puma Training Shirt", "Levi's 501 Jeans",
                "Zara Jacket", "Havaianas Flip Flops",
                "Under Armour Shorts", "Oakley Sunglasses",
                "Lacoste Polo Shirt", "Tommy Hilfiger Hoodie",
                "Colcci T-Shirt", "Calvin Klein Underwear",
                "New Balance 1080", "Vans Old Skool",
                "Reserva Casual Shirt", "Fila Sweatshirt",
                "Diesel Jacket", "Ray-Ban Aviator",
                "Ralph Lauren Shirt", "Guess Handbag"
        };

        for (String name : names) {
            list.add(new Product(
                    UUID.randomUUID().toString(),
                    name,
                    ProductCategory.CLOTHING,
                    randomPrice(40, 800)
            ));
        }
    }

    private static void addSports(List<Product> list) {
        String[] names = {
                "Speedo Swim Goggles", "Wilson Tennis Racket",
                "Adidas Soccer Ball", "Nike Basketball",
                "Kikos Treadmill", "Polimet Weight Bench",
                "Vollo Dumbbell Set", "Acte Yoga Mat",
                "Caloi Mountain Bike", "Oxelo Skateboard",
                "Mormaii Wetsuit", "Hammer Boxing Gloves",
                "Penalty Futsal Ball", "Spalding Basketball Hoop",
                "Everlast Punching Bag", "Speed Jump Rope",
                "Hydro Flask Bottle", "Camping Tent 4P",
                "Fishing Rod Shimano", "Garmin Forerunner 55"
        };

        for (String name : names) {
            list.add(new Product(
                    UUID.randomUUID().toString(),
                    name,
                    ProductCategory.SPORTS_EQUIPMENT,
                    randomPrice(100, 3000)
            ));
        }
    }

    private static float randomPrice(float min, float max) {
        float valor = (float) (ThreadLocalRandom.current().nextDouble(min, max));
        return PriceUtil.generate(valor);
    }
}