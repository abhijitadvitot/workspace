import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Smple {
    @Test
public void listingObjects(){
    List mocklist=mock(List.class);
    when(mocklist.size()).thenReturn(1).thenReturn(2).thenReturn(3);
    Assert.assertEquals(1,mocklist.size());
    Assert.assertEquals(2,mocklist.size());
    Assert.assertEquals(3,mocklist.size());
     //   Assert.assertEquals(4,mocklist.size());
    System.out.println(mocklist.size());
    System.out.println(mocklist);
}
    @Test
    public void listingObjects1(){
        List mocklist1=mock(List.class);
        when(mocklist1.size()).thenReturn(1);
        // Assert.assertEquals(1,mocklist1.size());
        System.out.println(mocklist1.size());
        System.out.println(mocklist1);
    }
}
