public class logicGates {
    public static void main(String[] args) {
        System.out.println("Gate    Input    Input    Output");
        // and gate
        System.out.println("and     1        1        " + and(true, true));
        System.out.println("and     1        0        " + and(true, false));
        System.out.println("and     0        1        " + and(false, true));
        System.out.println("and     0        0        " + and(false, false));
        System.out.println();
        // not gate
        System.out.println("not     1        1        " + not(true));
        System.out.println("not     0        0        " + not(false));
        System.out.println();
        // nand gate
        System.out.println("nand    1        1        " + nand(true, true));
        System.out.println("nand    1        0        " + nand(true, false));
        System.out.println("nand    0        1        " + nand(false, true));
        System.out.println("nand    0        0        " + nand(false, false));
        System.out.println();
        // or gate
        System.out.println("or      1        1        " + or(true, true));
        System.out.println("or      1        0        " + or(true, false));
        System.out.println("or      0        1        " + or(false, true));
        System.out.println("or      0        0        " + or(false, false));
        System.out.println();
        // nor gate
        System.out.println("nor     1        1        " + nor(true, true));
        System.out.println("nor     1        0        " + nor(true, false));
        System.out.println("nor     0        1        " + nor(false, true));
        System.out.println("nor     0        0        " + nor(false, false));
        System.out.println();
        // xor gate
        System.out.println("xor     1        1        " + xor(true, true));
        System.out.println("xor     1        0        " + xor(true, false));
        System.out.println("xor     0        1        " + xor(false, true));
        System.out.println("xor     0        0        " + xor(false, false));
        System.out.println();
        // nxor gate
        System.out.println("nxor    1        1        " + nxor(true, true));
        System.out.println("nxor    1        0        " + nxor(true, false));
        System.out.println("nxor    0        1        " + nxor(false, true));
        System.out.println("nxor    0        0        " + nxor(false, false));
        System.out.println();
    }

    // return true only if both input are true
    public static boolean and(boolean input1, boolean input2) {
        boolean output;
        if (input1 && input2) {
            output = true;
        } else {
            output = false;
        }
        return output;
    }

    // returns the inverted input
    public static boolean not(boolean input1) {
        boolean output;
        if (input1) {
            output = false;
        } else {
            output = true;
        }
        return output;

    }

    // returns true when atleast one input is false
    public static boolean nand(boolean input1, boolean input2) {
        boolean output;
        output = not(and(input1, input2));
        return output;

    }

    // return true if atleast one input is true
    public static boolean or(boolean input1, boolean input2) {
        boolean output;
        output = nand(not(input1), not(input2));
        return output;

    }

    // return true only if both inputs are false
    public static boolean nor(boolean input1, boolean input2) {
        boolean output;
        output = not(or(input1, input2));
        return output;

    }

    // return true if atmost one input is true
    public static boolean xor(boolean input1, boolean input2) {
        boolean output;
        output = and(or(input1, input2), nand(input1, input2));
        return output;

    }

    // return true if both inputs are equal
    public static boolean nxor(boolean input1, boolean input2) {
        boolean output;
        output = not(xor(input1, input2));
        return output;

    }
}
