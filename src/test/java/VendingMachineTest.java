import challenge_28.VendingMachine;
import challenge_28.VendingMachineProducts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineTest {
    private VendingMachine vendingMachine;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final InputStream originalInput = System.in;
    private final PrintStream originalOutput = System.out;

    @BeforeEach
    public void setUp() {
        List<VendingMachineProducts> products = List.of(
                new VendingMachineProducts(1, "Chips", 100),
                new VendingMachineProducts(2, "Candy", 75)
        );

        vendingMachine = new VendingMachine(products);
    }

    @AfterEach
    public void restoreStreams() {
        System.setIn(originalInput);
        System.setOut(originalOutput);
    }

    @Test
    public void testSelectProductWithValidProductId() {
        String input = "1\n"; // User selects product 1
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        vendingMachine.selectProductFromConsole();
        assertEquals(1, vendingMachine.getProductSelection());
    }

    @Test
    public void testSelectProductWithInvalidProductId() {
        String input = "999\n"; // User selects an invalid product
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        vendingMachine.selectProductFromConsole();
        assertEquals(-1, vendingMachine.getProductSelection());
    }
}
