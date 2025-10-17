package demoapp.azuredemokv.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith({MockitoExtension.class})
class TestServiceTest {
    @InjectMocks
    private TestService testService;

    @Test
    void testMultiply() {
        long a = 2;
        long b = 2;
        long sumMultiply = 4;
        long result = testService.multiply(a, b);
        assertEquals(sumMultiply, result);
    }
}