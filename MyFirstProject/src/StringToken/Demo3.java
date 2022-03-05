package StringToken;

import java.util.StringTokenizer;

public class Demo3 {

        public static void main(String [ ] args)
        {
            String Demo = "This is a string that we want to tokenize";
            StringTokenizer Tok = new StringTokenizer(Demo);
            int n=0;
            while (Tok.hasMoreElements())
                System.out.println("" + ++n +": "+Tok.nextElement());
        }
    }

