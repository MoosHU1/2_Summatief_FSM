import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TekstFSMTest {

    @Test
    void run() {
        //Test 1
        TekstFSM Test1 = CreateTekstFSM.createTekstFSM();
        String input1 = "BAAB";

        ArrayList<String> output1 = new ArrayList<String>();
        output1.add("ts0");
        output1.add("ts1");
        output1.add("ts1");
        output1.add("ts1");
        output1.add("ts2");
        assertEquals(output1, Test1.run(input1));

        //Test 2
        TekstFSM Test2 = CreateTekstFSM.createTekstFSM();
        String input2 = "AAAA";

        ArrayList<String> output2 = new ArrayList<String>();
        output2.add("ts0");
        output2.add("ts2");

        assertEquals(output2, Test2.run(input2));


    }


}