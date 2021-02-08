package me.xueyao;

import me.xueyao.entity.User;
import me.xueyao.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimonFastBlogApiApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Test
    void testCreate() {
        User user = new User().setNickname("xueyao")
                .setUsername("xueyao").setPassword("simon123");
        user.setCreator("admin");
        userRepository.save(user);
    }

}
