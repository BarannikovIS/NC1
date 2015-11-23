import com.mycompany.project1abstractclassandinterface.Figure;
import com.mycompany.project1abstractclassandinterface.Rectangle;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 *
 * @author Иван
 */
public class TestClass {
    
    Figure r;
    
    @Before
    public void init(){ 
        r= spy(new Rectangle(1,2,15,20));
    }
    @Test
    public void moveTest(){
        r.move(2, 2);
        
        when(r.getX()).thenReturn(3);
        when(r.getY()).thenReturn(4);
        
        assertEquals(r.getX(),3);
        assertEquals(r.getY(),4);
    }
    @Test
    public void perimetrTest(){
        when(r.calculateThePerimetr()).thenReturn(70);
        assertEquals(r.calculateThePerimetr(),70);
    }
    @Test
    public void areaTest(){
        when(r.calculateTheArea()).thenReturn(300);
        assertEquals(r.calculateTheArea(),300);
    }
}
