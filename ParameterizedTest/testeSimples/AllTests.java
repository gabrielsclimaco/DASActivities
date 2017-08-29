package aula2.testeSimples;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testeSoma.class, testSubtracao.class })
public class AllTests {

}
