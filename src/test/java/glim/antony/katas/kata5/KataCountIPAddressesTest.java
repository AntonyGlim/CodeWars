package glim.antony.katas.kata5;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataCountIPAddressesTest {

    @Test
    public void ipsBetween() {
        assertEquals( 50, KataCountIPAddresses.ipsBetween( "10.0.0.0", "10.0.0.50" ) );
        assertEquals( 246,KataCountIPAddresses.ipsBetween( "20.0.0.10", "20.0.1.0" ) );
    }

    @Test
    public void ipv4ToDecInt() {
        assertTrue( 167772160L == KataCountIPAddresses.ipv4ToDecNum("10.0.0.0") );
    }
}