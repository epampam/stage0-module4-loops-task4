package school.mjc.stage0.loops.task4;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class  FixMeTest extends BaseIOTest {

    @Test
    void mainPrintsAsExpected() {
        FixMe.main(null);

        assertOutEquals("0\n" +
                "2\n" +
                "4\n" +
                "6\n" +
                "last\n" +
                "will I be printed?\n");
    }

    @Test
    public void containsInitialConfigAndBreak() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/loops/task4/FixMe.java");
        List<String> strings = Files.readAllLines(path);

        List<String> result = strings.stream()
                .filter(line -> line.contains("break") || line.contains("int i = 0; i < 100; i++"))
                .collect(Collectors.toList());

        assertEquals(2, result.size());
    }

}