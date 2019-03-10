package lt.vtvpmc.ems.akademijait.simmika;

public class javaDataTypesPrimitive {
    public static void main(String[] args) {


        //char

        char myChar = 'o';
        System.out.println(myChar);

char specialSymbol = '\\';
        System.out.println(specialSymbol);

        char defaultChar = '\u0000';
        System.out.println(defaultChar);

//boolean

        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool3 = !bool2; //neigimas !
        boolean bool4 = bool1 & bool2; // &&    pasidomet  ||
        boolean bool5 = bool1 | bool2; // or
        boolean bool6 = bool1 ^ bool2;
        System.out.println(bool6);


//byte

        byte myByte1 = -23;
        byte myByte2 = -128;
        byte myByte3 = 127;
        byte highByte = Byte.MAX_VALUE;
        byte loqByte = Byte.MIN_VALUE;
        System.out.println(highByte);

        byte defaultByte = 0;
        byte ageOne = 0;
        byte changeAge = 10;
        byte result = (byte)(ageOne / changeAge); //kastinimas (byte)
        byte resultZero = (byte)(ageOne + changeAge); //kastinimas (byte)
        System.out.println(result); // diapozono perpildymas
        System.out.println(resultZero);

        // dalyba is 0 negalima
        // nuli dalinti is desimt = 0





//short

        short highShortValue = Short.MAX_VALUE;
        short lowShortValue = Short.MIN_VALUE;
        System.out.println(highShortValue);
        System.out.println(lowShortValue);

        short myshort1 = 123;
        short myShort2 = 12345;
        short myShort3 = (short) (myshort1 + myShort2);
        short defaultValue = 0;

        // int tos pacios reiksmes kaip ir short arba byte

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println(min);
        Integer myInteger = 10; // objektas siuo atveju

        // long 8 byte
        // look int type
        long lg1 = 10L;



// float
        // is flot ir double dalyba is 0 galima ir lygu infinity

        float fl1 = 0.1f;
        float fl2 = 0.0f;
        float fl3 = (float) (fl1 / fl2);
        float fl4 = (float) (fl1 + fl1 + fl1 + fl1 + fl1 + fl1 + fl1 + fl1 + fl1 + fl1);
        System.out.println(fl4);

        // 0 dalyba 0  = NaN

        //double
        // ziureti i float

        double db1 = 0.1;
        double db2 = (db1+db1+db1+db1+db1+db1+db1+db1+db1+db1);
        System.out.println(db2);















    }
}
