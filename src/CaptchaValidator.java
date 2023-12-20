
public class CaptchaValidator {
    public boolean validateCaptcha(String userInput, Captcha expectedCaptcha) {
        return userInput.equals(expectedCaptcha.getValue());
    }
}
