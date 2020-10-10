import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MommifierTest {

    @Test
    void should_throw_when_string_is_null(){
        Mommifier mommifier =new Mommifier();
        String result = mommifier.convert(null);
        assertEquals("Input is not null or empty", result);


    }

    @Test
    void should_throw_when_string_is_empty(){
        Mommifier mommifier =new Mommifier();
        String result = mommifier.convert("");
        assertEquals("Input is not null or empty", result);

    }

    @Test
    void should_return_string_when_convert_given_vowels_are_not_more_than_30(){
        Mommifier mommifier =new Mommifier();
        String result = mommifier.convert("abbbbbbbb");
        assertEquals("abbbbbbbb", result);

    }

    @Test
    void should_return_string_be_add_mommy_when_convert_given_vowels_are_more_than_30(){
        Mommifier mommifier =new Mommifier();
        String result = mommifier.convert("aebcioba");
        assertEquals("aemommybciomommyba", result);

    }

}