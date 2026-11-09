package Jsoning;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class CustomJsonEncodingTest {

    @Test
    public void testThatI_canSerializeToJson()  throws JsonSerializationException{
        Product product = new Product();
        product.setName("Iphone 20");
        product.setDescription("Sleek Iphone 20");
        product.setPrice(new BigDecimal(2_000_000));
        product.setQuantity(1000);
        String json = JsonEncoder.serializeToJson(product);
        String expected = "{\"name\":\"Iphone 20\",\"description\":\"Sleek Iphone 20\",\"price\":2000000,\"quantity\":1000}";
        assertEquals(json, expected);
    }

    @Test
    public void testThatI_canDeserialize() throws JsonSerializationException{
        String json = "{\"name\":\"Musa\", \"description\":\"Sleek Iphone 20\", \"price\":2000000,\"quantity\":1000}";
        Product product = JsonEncoder.deserialize(json);
        System.out.println(product);
        assertNotNull(product);
        assertEquals("Musa", product.getName());
        assertEquals(2000000, product.getPrice());
    }

}
