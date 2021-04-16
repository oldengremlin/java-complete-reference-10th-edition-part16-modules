package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinFuncProvider;
import userfuncs.binaryfuncs.BinaryFunc;

public class AbsMinusProvider implements BinFuncProvider {

    @Override
    public BinaryFunc get() {
        return new AbsMinus();
    }

}
