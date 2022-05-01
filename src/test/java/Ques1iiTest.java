import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class Ques1iiTest {

    Ques1ii mainObj = new Ques1ii();
    ArrayList<Integer> arr = new ArrayList<Integer>();

    @Nested
    class Maximum{
        @AfterEach
        public void after(){
            arr.clear();
        }

        @Test
        public void EMPTY(){
            assertEquals(mainObj.max(arr), null);
        }

        @Test
        public void ONEELEM(){
            arr.add(-88);
            assertEquals(mainObj.max(arr),-88);
        }

        @Test
        public void MANYELEM1(){
            for(int i = 1; i < 10000; i*=4){
                arr.add(i);
            }
            assertEquals(mainObj.max(arr), Collections.max(arr));
        }

        @Test
        public void MANYELEM2(){
            for(int i = -999; i < 0; i+=3){
                arr.add(i);
            }
            assertEquals(mainObj.max(arr), Collections.max(arr));
        }

        @Test
        public void MANYELEM3(){
            for(int i = -999; i < 999; i+=3){
                arr.add(i);
            }
            assertEquals(mainObj.max(arr), Collections.max(arr));
        }

    }

    @Nested
    class Minimum{
        @AfterEach
        public void after(){
            arr.clear();
        }

        @Test
        public void EMPTY(){
            assertEquals(mainObj.min(arr), null);
        }

        @Test
        public void ONEELEM(){
            arr.add(-88);
            assertEquals(mainObj.min(arr),-88);
        }

        @Test
        public void MANYELEM1(){
            for(int i = 1; i < 10000; i*=4){
                arr.add(i);
            }
            assertEquals(mainObj.min(arr), Collections.min(arr));
        }

        @Test
        public void MANYELEM2(){
            for(int i = -999; i < 0; i+=3){
                arr.add(i);
            }
            assertEquals(mainObj.min(arr), Collections.min(arr));
        }

        @Test
        public void MANYELEM3(){
            for(int i = -999; i < 999; i+=3){
                arr.add(i);
            }
            assertEquals(mainObj.min(arr), Collections.min(arr));
        }

    }

}