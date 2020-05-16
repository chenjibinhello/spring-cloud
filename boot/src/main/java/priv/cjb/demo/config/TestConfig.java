package priv.cjb.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

@Configuration
public class TestConfig {

    @Value("${self.test.name}")
    public String name;

    public void test() {

    }

}
