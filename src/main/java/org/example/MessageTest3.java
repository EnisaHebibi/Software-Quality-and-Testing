package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MessageTest3 {
    Message message=new Message("test message");

    @Test
    public void testGoodbyeMessage(){
       assertEquals(message.goodbyeMessage(),"Goodbye");
    }
}
