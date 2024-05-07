package Module_4;

public class Stringobject {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        String str3=new String("hello");
        char c[]={'a','b','c','d'};
        byte b[]={65,66,67,68,69};
        String str4=new String(c);
        String str5=new String(b);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);


            System.out.println(str1==str2);
            System.out.println(str1==str3);
            System.out.println(str2==str3);

            System.out.println(str1.equals(str2));
            System.out.println(str1.equals(str3));
    }
}
