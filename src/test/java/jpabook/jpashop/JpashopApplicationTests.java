package jpabook.jpashop;


import org.junit.Test;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootTest
@EnableJpaRepositories(basePackages = {"jpabook.jpashop"})
@EntityScan(basePackages = {"jpabook.jpashop"})
class JpashopApplicationTests {

    @Test
    void contextLoads() {
    }

}
