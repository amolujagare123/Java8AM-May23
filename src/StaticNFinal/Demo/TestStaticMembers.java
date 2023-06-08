package StaticNFinal.Demo;

import StaticNFinal.Student2;

/*import static StaticNFinal.Student2.college;
import static StaticNFinal.Student2.staticMethod1;
import static StaticNFinal.Student2.staticMethod2;*/


import static StaticNFinal.Student2.*;

public class TestStaticMembers {

    public static void main(String[] args) {
        Student2 ob = new Student2();

        ob.college = "";
        ob.staticMethod1();
        ob.staticMethod2();

        Student2.college = "";
        Student2.staticMethod1();
        Student2.staticMethod2();

        college = "";
        staticMethod1();
        staticMethod2();
    }
}
