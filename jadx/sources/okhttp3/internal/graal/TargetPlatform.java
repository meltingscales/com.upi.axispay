package okhttp3.internal.graal;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;
import okhttp3.internal.platform.Jdk9Platform;
import okhttp3.internal.platform.Platform;

/* compiled from: AxisPay */
@TargetClass(Platform.Companion.class)
/* loaded from: classes.dex */
public final class TargetPlatform {
    @Substitute
    public final Platform findPlatform() {
        Jdk9Platform buildIfSupported = Jdk9Platform.Companion.buildIfSupported();
        yl0.c(buildIfSupported);
        return buildIfSupported;
    }
}
