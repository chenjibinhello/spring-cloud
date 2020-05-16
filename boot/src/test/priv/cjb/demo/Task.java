package priv.cjb.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import priv.cjb.demo.config.TestConfig;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Task {

    @Autowired
    private TestConfig config;

    @Test
    public void test1() {
        System.out.println(config.name + "-----------------------");
    }

}
