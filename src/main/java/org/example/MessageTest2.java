package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MessageTest2 {
    String actualMessage="Robert";
    Message message=new Message(actualMessage);

    @Test
    public void testSalutationMessage(){
        System.out.println("Inside the testSalutationMessage()");
        actualMessage="Hi"+"Robert";
        assertEquals(actualMessage,message.salutationMessage());
    }
}
