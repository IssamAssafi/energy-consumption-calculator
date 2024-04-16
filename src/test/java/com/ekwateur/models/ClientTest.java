package com.ekwateur.models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    @Test
    public void testValidClientCreation(){
        Client client = new Client("EKW123456789");
        assertEquals("EKW123456789", client.getRef());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidClientCreation() {
        new Client("InvalidRefFormat");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullClientCreation() {
        new Client(null);
    }
}
