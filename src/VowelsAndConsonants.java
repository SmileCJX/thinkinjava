/**
 * Created by Administrator on 2017/7/9/009.
 */

/**
 * 判断它们是元音还是辅音字母
 */
public class VowelsAndConsonants {
    public static void main(String[] args){
        for (int i = 0; i < 100; i++){
            char c = (char)(Math.random() * 26 + 'a');
            System.out.println(c + ": ");
            switch (c){
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                    System.out.println("vowel");
                    break;
                case 'y' :
                case 'w' :
                    System.out.println("Sometimes a vowel");
                    break;
                default:
                    System.out.println("consonant");
            }
        }
    }
}
