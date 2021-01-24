package searchQuery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith({MockitoExtension.class})
class ConsoleTest {
    @Mock
    private Console consoleMock;

    @Test
    void getWorkingUrl() {
        when(consoleMock.getWorkingUrl()).thenReturn("https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=Java");

        String actual = consoleMock.getWorkingUrl();
        String expected = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=Java";
        Assertions.assertEquals(expected, actual);
    }
}