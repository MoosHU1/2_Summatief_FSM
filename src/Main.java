import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {


    public static void main(String[] args){


        //Tekst
        TekstFSM TekstFSM1 = CreateTekstFSM.createTekstFSM();
        String input = "BAAB";
        System.out.println(TekstFSM1.run(input));

        //Dobbel
        System.out.println((CreateDobbelFSM.RunDobbel()));



    }




}
