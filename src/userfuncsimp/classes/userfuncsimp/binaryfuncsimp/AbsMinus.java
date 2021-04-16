package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;

public class AbsMinus implements BinaryFunc {

    @Override
    public String getName() {
        return "AbsMinus";
    }

    @Override
    public int func(int a, int b) {
        return Math.abs(a) - Math.abs(b);
    }

}
