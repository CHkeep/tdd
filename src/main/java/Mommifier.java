
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Mommifier {

    public String convert(String vowels) {

        if (vowels == null || vowels.isEmpty()) {
            return "Input is not null or empty";
        }

        if (vowelNum(vowels)) {
            System.out.println(vowelNum(vowels));
            return vowels;
        }
        return addMonney(vowels);

    }



    public boolean vowelNum(String vowels){
        Pattern p = Pattern.compile("[aeiouAEIOU]");
        Matcher m = p.matcher(vowels);
        int num = 0;
        while(m.find())
        {
            num++;
        }
        return  (float)num / vowels.length() < 0.3;
    }



    public String addMonney(String vowels){
        //两个
        Pattern p = Pattern.compile("[aeiouAEIOU]{2,}");
        Matcher m = p.matcher(vowels);
        StringBuffer sb = new StringBuffer();
        while (m.find())
        {
            String group = m.group();
            m.appendReplacement(sb,group+"mommy");

        }
        m.appendTail(sb);
        return sb.toString();
    }
}
