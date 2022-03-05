package Hamcreestex;

import org.junit.Test;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;

import static org.junit.Assert.assertThat;

public class Demo {
    @Test
    public void testcontainsString(){  // litter slow
    assertThat("abhijit@gmail.com",containsString("@gmail.com"));
}
    @Test
    public void testendsWith(){ // fastest approach
        assertThat("abhijt@gmail.com",endsWith("@gmail.com"));
    }
    @Test
    public void testbeginsWith(){ // fastest approach
        assertThat("abhijit@gmail.com",startsWith("abhijit"));
    }
}

