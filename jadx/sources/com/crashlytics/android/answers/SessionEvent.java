package com.crashlytics.android.answers;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class SessionEvent {
    public static final String ACTIVITY_KEY = null;
    public static final String EXCEPTION_NAME_KEY = null;
    public static final String INSTALLED_AT_KEY = null;
    public static final String SESSION_ID_KEY = null;
    public final Map<String, Object> customAttributes;
    public final String customType;
    public final Map<String, String> details;
    public final Map<String, Object> predefinedAttributes;
    public final String predefinedType;
    public final SessionEventMetadata sessionEventMetadata;
    private String stringRepresentation;
    public final long timestamp;
    public final Type type;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class Builder {
        public final Type type;
        public final long timestamp = System.currentTimeMillis();
        public Map<String, String> details = null;
        public String customType = null;
        public Map<String, Object> customAttributes = null;
        public String predefinedType = null;
        public Map<String, Object> predefinedAttributes = null;

        public Builder(Type type) {
            this.type = type;
        }

        public SessionEvent build(SessionEventMetadata sessionEventMetadata) {
            return new SessionEvent(sessionEventMetadata, this.timestamp, this.type, this.details, this.customType, this.customAttributes, this.predefinedType, this.predefinedAttributes);
        }

        public Builder customAttributes(Map<String, Object> map) {
            this.customAttributes = map;
            return this;
        }

        public Builder customType(String str) {
            this.customType = str;
            return this;
        }

        public Builder details(Map<String, String> map) {
            this.details = map;
            return this;
        }

        public Builder predefinedAttributes(Map<String, Object> map) {
            this.predefinedAttributes = map;
            return this;
        }

        public Builder predefinedType(String str) {
            this.predefinedType = str;
            return this;
        }
    }

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public enum Type {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    static {
        C0059ao.a(SessionEvent.class, 199);
    }

    public static Builder crashEventBuilder(String str) {
        return new Builder(Type.CRASH).details(Collections.singletonMap(C0059ao.a(180), str));
    }

    public static Builder customEventBuilder(CustomEvent customEvent) {
        return new Builder(Type.CUSTOM).customType(customEvent.getCustomType()).customAttributes(customEvent.getCustomAttributes());
    }

    public static Builder installEventBuilder(long j) {
        return new Builder(Type.INSTALL).details(Collections.singletonMap(C0059ao.a(182), String.valueOf(j)));
    }

    public static Builder lifecycleEventBuilder(Type type, Activity activity) {
        return new Builder(type).details(Collections.singletonMap(C0059ao.a(183), activity.getClass().getName()));
    }

    public static Builder predefinedEventBuilder(PredefinedEvent<?> predefinedEvent) {
        return new Builder(Type.PREDEFINED).predefinedType(predefinedEvent.getPredefinedType()).predefinedAttributes(predefinedEvent.getPredefinedAttributes()).customAttributes(predefinedEvent.getCustomAttributes());
    }

    public String toString() {
        if (this.stringRepresentation == null) {
            this.stringRepresentation = C0059ao.a(184) + SessionEvent.class.getSimpleName() + C0059ao.a(185) + C0059ao.a(186) + this.timestamp + C0059ao.a(187) + this.type + C0059ao.a(188) + this.details + C0059ao.a(189) + this.customType + C0059ao.a(190) + this.customAttributes + C0059ao.a(191) + this.predefinedType + C0059ao.a(192) + this.predefinedAttributes + C0059ao.a(193) + this.sessionEventMetadata + C0059ao.a(194);
        }
        return this.stringRepresentation;
    }

    private SessionEvent(SessionEventMetadata sessionEventMetadata, long j, Type type, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.sessionEventMetadata = sessionEventMetadata;
        this.timestamp = j;
        this.type = type;
        this.details = map;
        this.customType = str;
        this.customAttributes = map2;
        this.predefinedType = str2;
        this.predefinedAttributes = map3;
    }

    public static Builder crashEventBuilder(String str, String str2) {
        return crashEventBuilder(str).customAttributes(Collections.singletonMap(C0059ao.a(181), str2));
    }
}
