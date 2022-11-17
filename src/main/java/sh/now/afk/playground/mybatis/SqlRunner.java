package sh.now.afk.playground.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sh.now.afk.playground.mybatis.mapper.TestMapper;

@Component
public class SqlRunner implements CommandLineRunner {
    @Autowired
    TestMapper mapper;

    @Override
    public void run(String... args) {
        for (int n = 0; n < 10000; n++) {
            Integer echo = mapper.echo2(n);
            if (echo == n) System.out.println(echo);
        }
    }
}