package com.example.backend;

import com.example.backend.data.entity.*;
import com.example.backend.repository.InvitationRepository;
import com.example.backend.repository.KeywordRepository;
import com.example.backend.repository.UserRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class BackendApplication {
    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

/*    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        UserRepository userRepository = context.getBean(UserRepository.class);
        InvitationRepository invitationRepository = context.getBean(InvitationRepository.class);
        KeywordRepository keywordRepository = context.getBean(KeywordRepository.class);



        // Ініціалізуємо генератор випадкових даних
        Faker faker = new Faker();

        // Створюємо користувачів
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUsername(faker.name().username());
            user.setPassword(faker.internet().password());

            OpenInfo openInfo = new OpenInfo();
            openInfo.setFirstName(faker.name().firstName());
            openInfo.setLastName(faker.name().lastName());
            openInfo.setLocation(faker.address().city());
            openInfo.setDescription(faker.lorem().sentence());
            user.setOpenInfo(openInfo);

            SecretInfo secretInfo = new SecretInfo();
            secretInfo.setEmail(faker.internet().emailAddress());
            secretInfo.setPhone(faker.phoneNumber().phoneNumber());
            user.setSecretInfo(secretInfo);

            users.add(user);
        }

        // Створюємо ключові слова
        List<Keyword> keywords = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Keyword keyword = new Keyword();
            keyword.setValue(faker.lorem().word());
            keywords.add(keyword);
        }

        // Додаємо ключові слова користувачам
        for (User user : users) {
            Set<Keyword> userKeywords = new HashSet<>();
            for (int i = 0; i < 5; i++) {
                userKeywords.add(keywords.get(faker.random().nextInt(keywords.size())));
            }
            user.setKeywords(userKeywords);
        }

        // Створюємо запрошення
        List<Invitation> invitations = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Invitation invitation = new Invitation();
            invitation.setSender(users.get(faker.random().nextInt(users.size())));
            invitation.setReceiver(users.get(faker.random().nextInt(users.size())));
            invitation.setMessage(faker.lorem().sentence());
            invitation.setSentDateTime(LocalDateTime.now().minusDays(faker.number().numberBetween(1, 30)));
            invitations.add(invitation);
        }

        // Зберігаємо користувачів, ключові слова та запрошення
        userRepository.saveAll(users);
        keywordRepository.saveAll(keywords);
        invitationRepository.saveAll(invitations);

        System.out.println("SUCCSESS STARTUP APPLICATION READY EVENT LISTENER");
    }*/
}

