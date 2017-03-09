package testit;

import com.obernardovieira.sonarqube.jenkins.build.sample.NewClass;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NewClassIntegrationTest {

        @Test
        public void sumOfZeroIntegersShouldReturnZero() {
                NewClass tester = new NewClass(); // MyClass is tested

                // assert statements
                assertEquals("10 + 0 must be 0", 10, tester.sum(10, 0));
                assertEquals("0 + 10 must be 0", 10, tester.sum(0, 10));
                assertEquals("0 + 0 must be 0", 0, tester.sum(0, 0));
        }
}
