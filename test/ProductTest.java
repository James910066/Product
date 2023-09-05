import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product prod1, prod2, prod3, prod4, prod5;

    @BeforeEach
    void setUp()
    {
        prod1 = new Product("000001","Pipeweed","Long Bottom Leaf",600.00);
        prod2 = new Product("000002","Lembas","Elven Wayfare Bread",200.00);
        prod3 = new Product("000003","Wine","Woodland Elf Wine",400.00);
        prod4 = new Product("000004","Mushrooms","Farmer Took's Finest",125.00);
        prod5 = new Product("000005","Mithril","Enchanted Dwarven Armor",3000.00);
    }
    @Test
    void getName() {
        assertEquals("Pipeweed", prod1.getName());
    }
    @Test
    void setName() {
        prod1.setName("Pipeweed");
        assertEquals("Pipeweed", prod1.getName());
    }
    @Test
    void getDescription() {
        prod1.getDescription();
        assertEquals("Long Bottom Leaf", prod1.getDescription());
    }
    @Test
    void setDescription() {
        prod1.setDescription("Long Bottom Leaf");
        assertEquals("Long Bottom Leaf", prod1.getDescription());
    }
    @Test
    void getID() {
        assertEquals("000001", prod1.getID());
    }
    @Test
    void getCost() {
        assertEquals(600.00, prod1.getCost());
    }
    @Test
    void setCost() {
        prod1.setCost(600.00);
        assertEquals(600.00, prod1.getCost());
    }
    @Test
    void testToString() {
    }
}