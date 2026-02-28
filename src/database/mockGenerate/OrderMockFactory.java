package database.mockGenerate;
import models.*;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class OrderMockFactory {

    public static List<Order> generateOrders(
            List<User> users,
            List<Product> products,
            int quantity
    ) {

        List<Order> orders = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {

            User randomUser = users.get(
                    ThreadLocalRandom.current().nextInt(users.size())
            );

            int productCount = ThreadLocalRandom.current().nextInt(1, 6);

            List<Product> randomProducts = new ArrayList<>();

            for (int j = 0; j < productCount; j++) {
                Product randomProduct = products.get(
                        ThreadLocalRandom.current().nextInt(products.size())
                );
                randomProducts.add(randomProduct);
            }

            LocalDateTime randomDate = LocalDateTime.now()
                    .minusDays(ThreadLocalRandom.current().nextInt(0, 30));

            orders.add(new Order(
                    UUID.randomUUID().toString(),
                    randomUser,
                    randomProducts,
                    randomDate
            ));
        }

        return orders;
    }
}