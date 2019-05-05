package topics;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TopicTest {

    /* ---- Properties ---- */
    private Topic topic = null;
    private Topic topic2 = null;


    /* ---- Init ---- */
    @Before
    public void __init___() {
        topic = new Topic();
        topic2 = new Topic("001", "Yepale", "A very cool topic");
    }


    /* ---- Tests ---- */
    @Test
    public void constructorTest() {
        assertNotNull(topic);
        assertNotNull(topic2);
    }


    @Test
    public void gettersAndSettersTest() {
        assertEquals("001", topic2.getId());
        assertEquals("Yepale", topic2.getName());
        assertEquals("A very cool topic", topic2.getDescription());

        topic.setId("123");
        topic.setName("None");
        topic.setDescription("Hallelujah");

        assertEquals("123", topic.getId());
        assertEquals("None", topic.getName());
        assertEquals("Hallelujah", topic.getDescription());
    }
}
