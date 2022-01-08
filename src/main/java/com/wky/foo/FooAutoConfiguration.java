package com.wky.foo;

import com.wky.entity.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: wangkunyang
 * @date 2022/01/08 09:42
 */
@Configuration
@EnableConfigurationProperties(FooProperties.class)
@ConditionalOnClass(Foo.class)
public class FooAutoConfiguration {

    @Autowired
    private FooProperties fooProperties;

    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        foo.setId(fooProperties.getId());
        foo.setName(fooProperties.getName());
        return foo;
    }

}
