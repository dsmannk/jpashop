package jpabook.jpashop;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"jpabook.jpashop"})
@EntityScan(basePackages = {"jpabook.jpashop"})
public class JpashopApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpashopApplication.class, args);
    }

    @Bean
    Hibernate5Module hibernate5Module() {
        Hibernate5Module hibernate5Module = new Hibernate5Module();
        /*
        LAZY 로 된 것을 강제로 가져오는 것
        사실 이 방법도 권장되지 않음

        Hibernate 모듈 자체는 쓸 수 있으나,
        Entity 를 그대로 노출하는 것은 비추천
        항상 지연 로딩을 기본으로 하고 성능 최적화가 필요한 경우에는 페치 조인(fetch join)을 사용해라!
         */
         hibernate5Module.configure(Hibernate5Module.Feature.FORCE_LAZY_LOADING, true);
        return hibernate5Module;
    }
}
