package bugs;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;

import static java.nio.file.Files.readAllLines;
import static org.junit.Assert.assertEquals;

public class RelativePathsJunitTest {

    @Test
    public void canReadRelativePah() throws IOException {

        assertEquals(readAllLines(Paths.get("some-folder/some-file.txt")).size(), 1);
    }
}
