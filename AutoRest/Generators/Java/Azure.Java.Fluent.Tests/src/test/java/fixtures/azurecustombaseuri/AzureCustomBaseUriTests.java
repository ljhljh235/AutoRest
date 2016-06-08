package fixtures.azurecustombaseuri;

import com.microsoft.rest.credentials.TokenCredentials;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.UnknownHostException;
import java.util.UUID;

import fixtures.custombaseuri.implementation.api.AutoRestParameterizedHostTestClientImpl;

public class AzureCustomBaseUriTests {
    private static AutoRestParameterizedHostTestClientImpl client;

    @BeforeClass
    public static void setup() {
        client = new AutoRestParameterizedHostTestClientImpl(new TokenCredentials(null, UUID.randomUUID().toString()));
    }

    // Positive test case
    @Test
    public void getEmptyWithValidCustomUri() throws Exception {
        client.withHost("host:3000");
        Assert.assertTrue(client.paths().getEmpty("local").getResponse().isSuccessful());
    }

    @Test
    public void getEmptyWithInvalidCustomUriAccountName() throws Exception {
        try {
            client.paths().getEmpty("bad");
            Assert.assertTrue(false);
        }
        catch (UnknownHostException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void getEmptyWithInvalidCustomUriHostName() throws Exception {
        try {
            client.withHost("badhost");
            client.paths().getEmpty("local");
            Assert.assertTrue(false);
        }
        catch (UnknownHostException e) {
            Assert.assertTrue(true);
        }
        finally {
            client.withHost("host.:3000");
        }
    }

    @Test
    public void getEmptyWithEmptyCustomUriAccountName() throws Exception {
        try {
            client.paths().getEmpty(null);
            Assert.assertTrue(false);
        }
        catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        }
    }
}
