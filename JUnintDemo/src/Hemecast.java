import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.DescribedAs.describedAs;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsAnything.anything;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringStartsWith.startsWith;

public class Hemecast {
    @Test
    public void testEmailID() {  // JUnit Test case
        String email = "abhijit@gmail.com";
        Assert.assertTrue(email.contains("@"));

    }

    @Test
    public void testEmailIDHamcrest() {  // Hamcrest Test case
        String email = "abhijit@gmail.com";
        Assert.assertThat(email, StringContains.containsString("gmail.com"));
    }
      @Test
     public void testAllMethod() {
//          assertThat("Hello", is(anything()));
//          assertThat(13, describedAs("13 is not equal to 12", is(equalTo((12)))));
//          assertThat("World", is(equalTo("World")));
          assertThat("myValue", allOf(startsWith("my"),containsString("Val")));
          assertThat("myValue", anyOf(startsWith("foo"),containsString("Val")));
          assertThat("World", is(not(equalTo("Word"))));

      }



}