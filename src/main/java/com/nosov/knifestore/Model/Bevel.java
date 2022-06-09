package org.nosov;

import java.awt.*;

public class Bevel {
    private BevelType bevelType;
    private Dimension bevelDimension;

    public Bevel(BevelType bevelType, Dimension bevelDimension) {
        this.bevelType = bevelType;
        this.bevelDimension = bevelDimension;
    }

    public Dimension getBevelDimension() {
        return bevelDimension;
    }

    public BevelType getBevelType() {
        return bevelType;
    }
}
