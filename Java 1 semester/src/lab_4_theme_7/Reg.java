package lab_4_theme_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    
    public static boolean isCorrect(String str)
    {
   
        /*

        ^ - начало строки

        \\d - символы цифр
        \\s - пробел
        + - 1 или более раз
        [А-ЯЁ] - заглавная буква 
        [а-яё] - строчная буква
        \\. - точка

        $ - конец строки
        
        */

        // "^\\d{4}\\s\\d{6}    \\s   г\\.\\s[А-ЯЁ][а-яё]+,\\sул\\.\\s*[А-ЯЁ][а-яё]+,\\sд\\.\\s\\d+,\\sкв\\.\\s\\d+  \\s  \\d{11}$"

        Pattern pattern = Pattern.compile("^\\d{4}\\s\\d{6}\\sг\\.\\s[А-ЯЁ][а-яё]+,\\sул\\.\\s*[А-ЯЁ][а-яё]+,\\sд\\.\\s\\d+,\\sкв\\.\\s\\d+\\s\\d{11}$");
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();

    }

    public static void main(String[] args) {
        
        String[] yes = {
            "1234 567890 г. Москва, ул. Ленина, д. 10, кв. 5 19991234567",
            "4500 123456 г. Владивосток, ул. Невская, д. 1, кв. 100 12990001122"
        };
        
        String[] no = {
            "123 567890 г. Москва, ул. Ленина, д. 10, кв. 5 45991234567",  
            "1234 567890 г Москва, ул. Ленина, д. 10, кв. 5 67991234567", 
            "1234 567890 г. Москва, ул Ленина, д. 10, кв. 5 90991234567",  
            "1234 567890 г. Москва, ул. Ленина, д. 10, кв. 5 8999123456",  
            "1234 567890 г. Москва, ул. Ленина, д. 10, кв. 5",             
            "",
            "4500 123456 г.Владивосток, ул.Невская, д.1, кв.100 79990001122",
            "4500 123456 г. владивосток, ул. Невская, д. 1, кв. 100 12990001122"
                                
        };
        
        for (int i = 0; i < yes.length; i++) {
            String s = yes[i];
            System.out.println(isCorrect(s));
        }
        
        for (int i = 0; i < no.length; i++) {
            String s = no[i];
            System.out.println(isCorrect(s));
        }
    }

}
