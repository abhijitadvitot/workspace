package Overrridong;

public class MainOverride {
        public static void main(String[ ] args)
    {    OverridePrivate2 op2 = new OverridePrivate2();
        op2.f(); op2.g();  OverridePrivate1 op = op2; WithFinals wf = op2;
    }
    }

