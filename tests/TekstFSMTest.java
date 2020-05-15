import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TekstFSMTest {

    @Test
    void run() {
        TekstFSM Test = CreateTekstFSM.createTekstFSM();
        String input = "ABBA";
        System.out.println(Test.run(input));
    }
}