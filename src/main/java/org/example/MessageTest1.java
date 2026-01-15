package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MessageTest1 {
    String actualMessage ="Hello world";
    Message message=new Message(actualMessage);

   @Test
    public void testPrintMessage(){
       assertEquals(actualMessage,message.printMessage());
   }

   @Test
    public void testPrintMessage2(){
       actualMessage ="New Word";
       assertEquals(actualMessage,message.printMessage());

   }
}
