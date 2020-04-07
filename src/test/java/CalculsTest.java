import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 

/**
 * 
 */

 

/**
 * @author flori
 *
 */
class CalculsTest {

 

    private Calculs c = null;
    
    /**
     * Initialise les valeurs avant chaque test 
     */
    @BeforeEach
    void setUp() throws Exception 
    {
        c = new Calculs(2 , 1);
    }

 

    
    /**
     * Test method for {@link Calculs#Calculs(int, int)}.
     */
    @Test
    void testCalculs() {

 

        fail("Not yet implemented");
    }

 

    /**
     * Test method for {@link Calculs#multiplier()}.
     */
    @Test
    void testMultiplier() 
    {
    
        
        
        if (c.multiplier() != 2)
        {
            fail("La methode multiplier ne fonctionne pas, 2*1 n'est pas égal à 2");
        }
    }

 

    /**
     * Test method for {@link Calculs#additionner()}.
     */
    @Test
    void testAdditionner() {
    	if (c.additionner()!= 3)
        {
            fail("La methode additionner ne fonctionne pas, 2+1 n'est pas égal à 3");
        }    }

 

    /**
     * Test method for {@link Calculs#diviser()}.
     */
    @Test
    void testDiviser() {
    	if (c.diviser() != 2)
        {
            fail("La methode diviser ne fonctionne pas, 2/1 n'est pas égal à 2");
        }
    }

 

    /**
     * Test method for {@link Calculs#soustraire()}.
     */
    @Test
    void testSoustraire() {
    	if (c.soustraire() != -1)
        {
            fail("La methode soustraire ne fonctionne pas, 2-1 n'est pas égal à 1");
        }    }

 

}