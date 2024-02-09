package com.crashlytics.android.core;

import com.crashlytics.android.core.Report;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class CompositeCreateReportSpiCall implements CreateReportSpiCall {
    private final DefaultCreateReportSpiCall javaReportSpiCall;
    private final NativeCreateReportSpiCall nativeReportSpiCall;

    /* compiled from: AxisPay */
    /* renamed from: com.crashlytics.android.core.CompositeCreateReportSpiCall$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$crashlytics$android$core$Report$Type;

        static {
            int[] iArr = new int[Report.Type.values().length];
            $SwitchMap$com$crashlytics$android$core$Report$Type = iArr;
            try {
                iArr[Report.Type.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crashlytics$android$core$Report$Type[Report.Type.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CompositeCreateReportSpiCall(DefaultCreateReportSpiCall defaultCreateReportSpiCall, NativeCreateReportSpiCall nativeCreateReportSpiCall) {
        this.javaReportSpiCall = defaultCreateReportSpiCall;
        this.nativeReportSpiCall = nativeCreateReportSpiCall;
    }

    @Override // com.crashlytics.android.core.CreateReportSpiCall
    public boolean invoke(CreateReportRequest createReportRequest) {
        int i = AnonymousClass1.$SwitchMap$com$crashlytics$android$core$Report$Type[createReportRequest.report.getType().ordinal()];
        if (i == 1) {
            this.javaReportSpiCall.invoke(createReportRequest);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.nativeReportSpiCall.invoke(createReportRequest);
            return true;
        }
    }
}
