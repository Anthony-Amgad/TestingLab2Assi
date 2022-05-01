import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ques1iTest {

    Ques1i mainObj = new Ques1i();

    @Nested
    class Positive{

        @Test
        public void ZERO(){
            assertEquals(mainObj.isEven(0),true);
        }

        @Test
        public void ONE(){
            assertEquals(mainObj.isEven(1),false);
        }

        @Test
        public void FOUR(){
            assertEquals(mainObj.isEven(4),true);
        }

        @Test
        public void THIRTYONE(){
            assertEquals(mainObj.isEven(31),false);
        }

        @Test
            public void FOURFOURTYFOUR(){
            assertEquals(mainObj.isEven(444),true);
        }
    }

    @Nested
    class Negative{

        @Test
        public void ZERO(){
            assertEquals(mainObj.isEven(0),true);
        }

        @Test
        public void ONE(){
            assertEquals(mainObj.isEven(-1),false);
        }

        @Test
        public void FOUR(){
            assertEquals(mainObj.isEven(-4),true);
        }

        @Test
        public void THIRTYONE(){
            assertEquals(mainObj.isEven(-31),false);
        }

        @Test
        public void FOURFOURTYFOUR(){
            assertEquals(mainObj.isEven(-444),true);
        }
    }

}