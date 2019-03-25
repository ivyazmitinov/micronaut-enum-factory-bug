package test.bug;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.Factory;

import javax.inject.Named;

@Factory
public class Config
{
    @Bean
    @Context
    public TestEnum testEnum()
    {
        return TestEnum.ONE;
    }

    @Bean
    @Named("testString")
    @Context
    public String testString()
    {
        return "TestString";
    }
}
