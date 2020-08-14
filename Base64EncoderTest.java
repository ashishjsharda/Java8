import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Base 64 Encode
 * @author ashish
 */

public class Base64EncoderTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String base64String=Base64.getEncoder().encodeToString("This is a test".getBytes("utf-8"));
        System.out.println(base64String);
    }
}
