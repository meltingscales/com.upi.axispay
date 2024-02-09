package io.togoto.imagezoomcrop.cropoverlay.edge;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public enum Edge {
    LEFT,
    TOP,
    RIGHT,
    BOTTOM;
    
    private float mCoordinate;

    public static float getHeight() {
        return BOTTOM.getCoordinate() - TOP.getCoordinate();
    }

    public static float getWidth() {
        return RIGHT.getCoordinate() - LEFT.getCoordinate();
    }

    public float getCoordinate() {
        return this.mCoordinate;
    }

    public void setCoordinate(float f) {
        this.mCoordinate = f;
    }
}
