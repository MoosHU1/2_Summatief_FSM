import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DobbelFSMTest {

    @Test
    void run() {
        ArrayList<String> output = CreateDobbelFSM.RunDobbel();
        if (output.get(output.size() - 1).equals("dobbel1")) {
            //Als dobbel 1 wordt gegooid moet de één na laatste staat 3 zijn
            assertEquals("s3", output.get(output.size() - 2));
        }

        if (output.get(output.size() - 1).equals("dobbel2") || output.get(output.size() - 1).equals("dobbel3") ) {
            //Als dobbel 2 of 3 wordt gegooid moet de één na laatste staat 4 zijn
            assertEquals("s4", output.get(output.size() - 2));
        }

        if (output.get(output.size() - 1).equals("dobbel4") || output.get(output.size() - 1).equals("dobbel5") ) {
            //Als dobbel 4 of 5 wordt gegooid moet de één na laatste staat 6 zijn
            assertEquals("s5", output.get(output.size() - 2));
        }

        if (output.get(output.size() - 1).equals("dobbel6")) {
            //Als dobbel 6 wordt gegooid moet de één na laatste staat 6 zijn
            assertEquals("s6", output.get(output.size() - 2));
        }


        }
    }
