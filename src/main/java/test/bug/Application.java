package test.bug;

import io.micronaut.context.ApplicationContext;
import io.micronaut.inject.qualifiers.Qualifiers;
import io.micronaut.runtime.Micronaut;

public class Application
{

    public static void main(String[] args)
    {
        final ApplicationContext run = Micronaut.run();
        final String testString = run.getBean(String.class, Qualifiers.byName("testString"));
        System.out.println(testString);
        final TestEnum bean = run.getBean(TestEnum.class);
        System.out.println(bean);
    }
}