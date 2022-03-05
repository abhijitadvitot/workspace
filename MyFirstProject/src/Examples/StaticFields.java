//Class and Object initialization use of static fields and static methods

package Examples;

public class StaticFields {

        int length = 10;
        int breadth = 10;
        int height = 10;
        public static int numOfCubes = 0; // static variable
        public static int getNoOfCubes()
        {     //static method
            return numOfCubes;
        }
        public StaticFields()
        {    numOfCubes++; //
        }
    }


