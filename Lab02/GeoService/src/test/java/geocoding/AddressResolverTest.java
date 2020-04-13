package geocoding;

import connection.ISimpleHttpClient;
import connection.TqsBasicHttpClient;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
class AddressResolverTest {

    @Mock
    AddressResolver addressResolver;

    @InjectMocks
    Address address;

    @Test
    void whenGoodAlboiGps_returnAddress() throws ParseException, IOException, URISyntaxException {
        addressResolver = new AddressResolver(new TqsBasicHttpClient());
        address = addressResolver.findAddressForLocation(40.640661, -8.656688);
        assertEquals( address, new Address( "Cais do Alboi", "Glória e Vera Cruz", "Centro", "3800-246", null) );
    }

    @Test
    public void whenBadCoordidates_throwBadArrayindex() throws IOException, URISyntaxException, ParseException {
        addressResolver = new AddressResolver(new TqsBasicHttpClient());
        address = addressResolver.findAddressForLocation(40.640661, -8.7567);
        assertNotEquals( address, new Address( "Cais do Alboi", "Glória e Vera Cruz", "Centro", "3800-246", null) );
    }
}