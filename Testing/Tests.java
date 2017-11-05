import BR.BReader;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

public class Tests {
    @Test

    public void read() {
        BReader testBReader = new BReader();
        File filet1 = new File("C:\\Users\\Alex\\IdeaProjects\\Bwriter\\Files\\t1.txt");
        File filet2 = new File("C:\\Users\\Alex\\IdeaProjects\\Bwriter\\Files\\t2.txt");
        File filet3 = new File("C:\\Users\\Alex\\IdeaProjects\\Bwriter\\Files\\t3.txt");
        File filet4 = new File("C:\\Users\\Alex\\IdeaProjects\\Bwriter\\Files\\t4.txt");
        String message = "Успешно";
        try {
            testBReader.read(filet1,filet4, 10);
        } catch (IOException e) {
            e.printStackTrace();
            message = "Ошибка";
        }
            assertEquals("Ошибка",message);
    }

}
