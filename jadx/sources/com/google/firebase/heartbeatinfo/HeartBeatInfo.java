package com.google.firebase.heartbeatinfo;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface HeartBeatInfo {

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        HeartBeat(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }
    }

    HeartBeat getHeartBeatCode(String str);
}
