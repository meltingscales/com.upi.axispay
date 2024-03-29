package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.InputStream;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public interface NativeSessionFile {
    CrashlyticsReport.FilesPayload.File asFilePayload();

    String getReportsEndpointFilename();

    InputStream getStream();
}
