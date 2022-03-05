import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Sample {
    @Test
    public void listingObjects(){
        List mocklist=mock(List.class);
        when(mocklist.size()).thenReturn(1);
        Assert.assertEquals(1,mocklist.size());
        System.out.println(mocklist.size());
        System.out.println(mocklist);
    }
}

