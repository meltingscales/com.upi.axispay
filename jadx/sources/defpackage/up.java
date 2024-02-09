package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@AutoValue
/* renamed from: up  reason: default package */
/* loaded from: classes.dex */
public abstract class up {
    public static up a(long j) {
        return new op(j);
    }

    public static up b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals(C0059ao.a(4065))) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return a(Long.parseLong(jsonReader.nextString()));
                    }
                    return a(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException(C0059ao.a(4066));
        } finally {
            jsonReader.close();
        }
    }

    public abstract long c();
}
