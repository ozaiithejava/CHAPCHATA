# CHAPCHATA
chapchata manager in java


## USAGE:
```java
// CaptchaManager.java
public class CaptchaManager {
    public static void main(String[] args) {
        CaptchaGenerator captchaGenerator = new CaptchaGenerator(CaptchaType.TYPE_ALL);
        CaptchaValidator captchaValidator = new CaptchaValidator();

        // CAPTCHA oluştur
        Captcha captcha = captchaGenerator.generateCaptcha(6);
        System.out.println("Oluşturulan CAPTCHA: " + captcha.getValue());

        // Kullanıcıdan alınan değeri doğrula
        String userInput = "abc123"; // Kullanıcının girdiği değer

        // CAPTCHA doğrulama
        boolean isValid = captchaValidator.validateCaptcha(userInput, captcha);

        // Sonucu yazdır
        if (isValid) {
            System.out.println("CAPTCHA doğrulandı.");
        } else {
            System.out.println("CAPTCHA doğrulanamadı.");
        }
    }
}
```
