import com.mycompany.project1abstractclassandinterface.Figure;
import com.mycompany.project1abstractclassandinterface.Rectangle;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Иван
 */
public class TestClass {
    
    Figure r;
    
    @Before
    public void init(){    
        r= new Rectangle(1,2,15,20);  
    }
    @Test
    public void moveTest(){
        r.move(2, 2);
        assertEquals(r.getX(),3);
        assertEquals(r.getY(),4);
    }
    @Test
    public void perimetrTest(){
        assertEquals(r.calculateThePerimetr(),70);
    }
    @Test
    public void areaTest(){
        assertEquals(r.calculateTheArea(),300);
    }
}
