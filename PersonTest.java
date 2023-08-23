package person;

import org.example.person.Person;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {


    @Test
    public void createPersonTest() {
        //given
        String name = "Andrei";
        String email = "andrei@yahoo.com";
        String cnp = "2870418125899";

        //when
        Person person = new Person(name, email, cnp);

        //then
        assertAll(
                () -> assertEquals("Mr Andrei", person.getName()),
                () -> assertEquals("andrei@yahoo.com", person.getEmail()),
                () -> assertEquals("2870418125899", person.getCNP())
        );

    }

    @Test
    public void createPersoanaTest() {
        //given
        String name = "Andrei", email = "dodu_andrei97@yahoo.com", cnp = "1971005270999";
        //when
        Person person = new Person(name, email, cnp);
        //then
        assertAll(
                () -> assertEquals("Mr " + name, person.getName()),
                () -> assertEquals(email, person.getEmail()),
                () -> assertEquals(cnp, person.getCNP())
        );
    }

    @Test
    public void emailInvalidTest() {
        //given
        String email = "dodu_andrei97yahoocom";
        //when
        boolean isValid = Person.isEmailValid(email);
        //then
        assertFalse(isValid);
    }

    @Test
    public void emailIsValidTest() {
        //given
        String email = "dodu_andrei97@yahoo.com";
        //when
        boolean isValid = Person.isEmailValid(email);
        //then
        assertTrue(isValid);
    }

    @Test
    void verficaCnpInvalidTest() {
        //given
        String cnp = "19710052999";
        //when
        boolean isValid = Person.isCnpValid(cnp);
        //then
        assertFalse(isValid);
    }

    @Test
    void eBarbatTest() {
        //given
        String name = "Andrei";
        //when
        String result = Person.createNameWithPrefix(name);
        //then
        assertEquals("Mr " + name, result);
    }
}