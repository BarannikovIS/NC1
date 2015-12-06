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
    
    Rectangle r;
    
    @Before
    public void init(){ 
        r= spy(new Rectangle(1,2,15,20));
    }
    @Test
    public void areaTest(){
        stub(r.getWidth()).toReturn(10);
        r.setWidth(20);
        System.out.println("test area "+r.calculateTheArea());
        //assertEquals(r.calculateTheArea(),200);
    }
    @Test
    public void moveTest(){
        r.move(2, 2);
        assertEquals(r.getX(),3);
        assertEquals(r.getY(),4);
    }
    @Test
    public void perimetrTest(){
        when(r.calculateThePerimetr()).thenReturn(70);
        assertEquals(r.calculateThePerimetr(),70);
    }
}
