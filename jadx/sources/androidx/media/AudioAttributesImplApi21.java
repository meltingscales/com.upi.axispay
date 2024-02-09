package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public static class a implements AudioAttributesImpl.a {
        public final AudioAttributes.Builder a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl a() {
            return new AudioAttributesImplApi21(this.a.build());
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public /* bridge */ /* synthetic */ AudioAttributesImpl.a b(int i) {
            c(i);
            return this;
        }

        public a c(int i) {
            this.a.setLegacyStreamType(i);
            return this;
        }
    }

    public AudioAttributesImplApi21() {
        this.b = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i = this.b;
        return i != -1 ? i : AudioAttributesCompat.b(false, b(), c());
    }

    public int b() {
        return this.a.getFlags();
    }

    public int c() {
        return this.a.getUsage();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.a.equals(((AudioAttributesImplApi21) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.b = -1;
        this.a = audioAttributes;
        this.b = i;
    }
}
