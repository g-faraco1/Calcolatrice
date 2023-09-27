import com.example.calcolatrice.calcolatrice;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class calcolatriceTest {

    calcolatrice calcolatrice;

    @Before
    public final void setUp(){
        calcolatrice = new calcolatrice();
    }


    @Test
    public void TestSomma(){
        Assertions.assertTrue(calcolatrice.somma(11, 1)==12, "somma corretta");
    }

    @Test
    public void TestMoltiplicazione(){
        Assertions.assertTrue(calcolatrice.moltiplicazione(10, 2)==20, "moltiplicazione corretta");
    }
    @Test
    public void TestSottrazione(){
        Assertions.assertTrue(calcolatrice.sottrazione(10, 5)==5, "sottrazione corretta");
    }
    @Test
    public void TestDivisione(){
        Assertions.assertTrue(calcolatrice.divisione(10, 5)==2, "divisione corretta");
    }
    @Test
    public void TestDivisionePerZero(){
        Assertions.assertTrue(calcolatrice.divisione(10, 0)==0, "divisione corretta");
    }





}
