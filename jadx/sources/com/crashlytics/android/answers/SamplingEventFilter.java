package com.crashlytics.android.answers;

import com.crashlytics.android.answers.SessionEvent;
import java.util.HashSet;
import java.util.Set;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class SamplingEventFilter implements EventFilter {
    public static final Set<SessionEvent.Type> EVENTS_TYPE_TO_SAMPLE = new HashSet<SessionEvent.Type>() { // from class: com.crashlytics.android.answers.SamplingEventFilter.1
        {
            add(SessionEvent.Type.START);
            add(SessionEvent.Type.RESUME);
            add(SessionEvent.Type.PAUSE);
            add(SessionEvent.Type.STOP);
        }
    };
    public final int samplingRate;

    public SamplingEventFilter(int i) {
        this.samplingRate = i;
    }

    @Override // com.crashlytics.android.answers.EventFilter
    public boolean skipEvent(SessionEvent sessionEvent) {
        return (EVENTS_TYPE_TO_SAMPLE.contains(sessionEvent.type) && sessionEvent.sessionEventMetadata.betaDeviceToken == null) && (Math.abs(sessionEvent.sessionEventMetadata.installationId.hashCode() % this.samplingRate) != 0);
    }
}
