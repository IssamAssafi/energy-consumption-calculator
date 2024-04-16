package com.ekwateur.utils;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import com.ekwateur.utils.ClientValidator;

public class ClientValidatorTest {

    @Test
    public void testValidClientReference() {
        assertTrue(ClientValidator.isValidClientReference("EKW123456789"));
        assertTrue(ClientValidator.isValidClientReference("EKW987654321"));
    }

    @Test
    public void testInvalidClientReference() {
        assertFalse(ClientValidator.isValidClientReference("EKW12345678")); // Too short
        assertFalse(ClientValidator.isValidClientReference("EKW1234567890")); // Too long
        assertFalse(ClientValidator.isValidClientReference("EKC123456789")); // Invalid prefix
        assertFalse(ClientValidator.isValidClientReference("ABC123456789")); // Invalid prefix and format
        assertFalse(ClientValidator.isValidClientReference("EKWabcdefghi")); // Non-numeric characters
        assertFalse(ClientValidator.isValidClientReference("")); // Empty string
        assertFalse(ClientValidator.isValidClientReference(null)); // Null input
    }
}
