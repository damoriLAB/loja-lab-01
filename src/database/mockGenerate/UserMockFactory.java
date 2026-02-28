package database.mockGenerate;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import models.*;

public class UserMockFactory {

    private static final String[] FIRST_NAMES = {
            "Lucas", "Mateus", "Gabriel", "Pedro", "Rafael",
            "Mariana", "Juliana", "Camila", "Beatriz", "Fernanda",
            "Carlos", "Bruno", "Thiago", "André", "Felipe",
            "Larissa", "Amanda", "Patricia", "Renata", "Isabela"
    };

    private static final String[] LAST_NAMES = {
            "Silva", "Souza", "Oliveira", "Santos", "Lima",
            "Costa", "Pereira", "Almeida", "Ferreira", "Rodrigues",
            "Martins", "Rocha", "Carvalho", "Gomes", "Ribeiro"
    };

    public static List<User> generateUsers(int quantity) {

        List<User> users = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {

            String id = UUID.randomUUID().toString();

            String name = FIRST_NAMES[
                    ThreadLocalRandom.current().nextInt(FIRST_NAMES.length)
            ];

            String lastName = LAST_NAMES[
                    ThreadLocalRandom.current().nextInt(LAST_NAMES.length)
            ];

            users.add(new User(id, name, lastName));
        }

        return users;
    }
}