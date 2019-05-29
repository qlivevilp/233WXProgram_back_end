package cn.org.cerambycidae.testmybaits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("cn.org.cerambycidae.testmybaits.mapper")
public class TestmybaitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestmybaitsApplication.class, args);
    }

}
