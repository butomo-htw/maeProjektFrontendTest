package htw.mae.frontendtest;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

/**
 * 
 * @author Budi Utomo <s0525949@htw-berlin.de>
 *
 */
@RunWith(Cucumber.class)
@Cucumber.Options(
		format={"pretty", "html:target/cucumber"},
		features="src/test/resources")
public class CukesRunnerTest {

}
