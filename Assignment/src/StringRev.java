public class StringRev {


    public void reverse() {
        String str = "Abhijit", rev = " ";
        char ch;

        System.out.println("Entered Strign " + str);

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev = ch + rev;
        }
        System.out.println("Reversed word: " + rev);
    }

}
