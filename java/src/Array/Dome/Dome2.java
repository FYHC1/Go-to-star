package Array.Dome;

public class Dome2 {
    public static void main(String[] args) {
        String regex1="\\w{4,16}";
        System.out.println("FYHC1_2".matches(regex1));
        String regex2="\\d{17}(X|x)";
        System.out.println("11111111111111111x".matches(regex2));
        String regex3="[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[12])(0[1-9]|1[0-9]|2[0-9]|3[12])\\d{3}[\\dXx]";
        System.out.println("362536200405130032".matches(regex3));
    }
}
