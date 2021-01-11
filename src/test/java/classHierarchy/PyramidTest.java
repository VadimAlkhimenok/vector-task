package classHierarchy;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class PyramidTest {

    Pyramid pyramidMock = Mockito.mock(Pyramid.class);

    @Test
    void getVolume() {
        when(pyramidMock.getVolume()).thenReturn(133.33);
    }
}
