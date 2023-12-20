
import java.security.SecureRandom;

public class CaptchaGenerator {
    private static final String CHARACTERS_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String CHARACTERS_CHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CHARACTERS_INT = "0123456789";

    private CaptchaType captchaType;

    public CaptchaGenerator(CaptchaType captchaType) {
        this.captchaType = captchaType;
    }

    public Captcha generateCaptcha(int length) {
        String characters = getCharacters();
        SecureRandom random = new SecureRandom();
        StringBuilder captchaValue = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            captchaValue.append(characters.charAt(index));
        }
        return new Captcha(captchaValue.toString());
    }

    private String getCharacters() {
        switch (captchaType) {
            case TYPE_STRING:
                return CHARACTERS_STRING;
            case TYPE_CHAR:
                return CHARACTERS_CHAR;
            case TYPE_INT:
                return CHARACTERS_INT;
            case TYPE_ALL:
                return CHARACTERS_STRING + CHARACTERS_CHAR + CHARACTERS_INT;
            default:
                throw new IllegalArgumentException("Geçersiz CaptchaType: " + captchaType);
        }
    }
}
