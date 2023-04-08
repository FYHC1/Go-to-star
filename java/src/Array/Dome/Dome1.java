package Array.Dome;


public class Dome1 {
    public static void main(String[] args) {
        String regix1="1[3-9]\\d{9}";
        System.out.println("13712345667".matches(regix1));
        String regix2="0\\d{2,3}-\\d&&[^0]\\d{5,10}";
        System.out.println("020-2324242".matches(regix2));
        String regix3="\\w&&[^_]{6,11}@\\w{2,6}\\.[a-zA-Z]{2,6}";
        System.out.println("3232323@qq.com".matches(regix3));
    }
}
