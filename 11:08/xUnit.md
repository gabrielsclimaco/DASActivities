Para responder às questões abaixo, considere o framework de testes JUnit4.

### Exercício 1:
Defina os seguintes termos que são muito utilizados em testes e apresente como eles são definidos em JUnit.

* Asserções
* Teste
* Caso de teste
* Suite de testes

### Resposta:

* Asserções

  O JUnit4 fornece uma série de funções de asserção para todo tipo de objetos e arrays. Os métodos de asserção necessita dois parâmetros: o primeiro é o valor esperado e o segundo é o valor real. De forma alternativa, o primeiro valor pode ser uma mensagem emitida após uma falha. Há também uma asserção ligeiramente diferente: o ```assertThat```. Os parâmetros, além de invertido em relação às asserções normais, pode receber também um objeto ```Matcher```.

  Ex.:
  ```Java
    assertTrue(2 == 2);
  ```

* Teste

  O teste consistem em um método com a notação ```@Test``` que se utiliza de asserções para garantir unitariamente que um pedaço do software que é executado está funcionando.

  Ex.:
  ```Java
  @Test
  public void evaluatesExpression() {
      Calculator calculator = new Calculator();
      int sum = calculator.evaluate("1+2+3");
      assertEquals(6, sum);
  }
  ```

* Caso de teste

  Classe de teste para uma funcionalidade específica.

  Ex.:
  ```Java
  import static org.junit.Assert.assertEquals;
  import org.junit.Test;

  public class CalculatorTest {
      @Test
      public void evaluatesExpression() {
            Calculator calculator = new Calculator();
            int sum = calculator.evaluate("1+2+3");
            assertEquals(6, sum);
      }
  }
  ```

* Suite de testes

  Se você tiver várias classes de teste, você pode combiná-las em um conjunto de testes(suite de testes). A execução de um conjunto de teste executa todas as classes de teste nesse conjunto na ordem especificada. Um conjunto de teste também pode conter outros conjuntos de teste.

  Ex.:
  ```Java
  import org.junit.runner.RunWith;
  import org.junit.runners.Suite;

  @RunWith(Suite.class)
  @Suite.SuiteClasses({
      TestFeatureLogin.class,
      TestFeatureLogout.class,
      TestFeatureNavigate.class,
      TestFeatureUpdate.class
  })

  public class FeatureTestSuite {
      // the class remains empty,
      // used only as a holder for the above annotations
  }
  ```

### Exercício 2:
Apresente o projeto estrutural do framework.

### Exercício 3:
O que é independência de testes e como ela é garantida pelo JUnit?

### Resposta:

  Independência de testes é quando o método de teste é independente de outro.

  O JUnit garante a independência garantindo que mêtodos assinados com ```@Before``` e ```@After``` sejam executados antes e depois dos testes, respectivamente. Dessa forma, você garante que um informações compartilhadas entre os testes não estejam presentes nos testes em si. Caso haja muita informação compartilhada entre os testes, o correto é criar uma nova classe de teste.

### Exercício 4:

O que é o um TestRunner do JUnit? E quais os runners existentes?

### Resposta:

  É a ferramenta que roda os testes escritos.

  Os runners conistem nos runners gráficos embutidos em IDE's, nos baseados em console e outros runners excepcionais como os suites.
