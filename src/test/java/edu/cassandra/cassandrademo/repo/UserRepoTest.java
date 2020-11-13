package edu.cassandra.cassandrademo.repo;


import edu.cassandra.cassandrademo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.Charset;
import java.util.*;

@SpringBootTest
public class UserRepoTest {

    @Autowired
    UserRepo userRepo;

    @Test
    public void testSave() {
        List<User> users = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            User user = new User(100 + i, generateRandomString(), generateFavorites());
            users.add(user);
        }
        userRepo.saveAll(users);
    }


    private String generateRandomString() {
        char[] chars = {'A', 'B', 'C', 'D', 'E',};

        char ch1 = (char) (new Random().nextInt(25) + 'A');
        char ch2 = (char) (new Random().nextInt(25) + 'A');
        char ch3 = (char) (new Random().nextInt(25) + 'A');

        return "" + ch1 + ch2 + ch3;
    }

    private Map<String, String> generateFavorites() {
        Map<String, String> favoritesMap = new HashMap<>();

        String[] categories = {"Movie", "City", "Sport"};
        String[] movies = {"Avengers", "Mission Impossible", "Kung Fu Panda", "How to train your dragon","The Justice League"};
        String[] cities = {"New York", "Washington DC", "Dallas", "London", "Chicago"};
        String[] sports = {"Base Ball", "Cricket", "Golf", "Ping Pong", "Soccer"};

        favoritesMap.put(categories[0], movies[new Random().nextInt(movies.length)]);
        favoritesMap.put(categories[1], cities[new Random().nextInt(cities.length)]);
        favoritesMap.put(categories[2], sports[new Random().nextInt(sports.length)]);


        return favoritesMap;
    }
}