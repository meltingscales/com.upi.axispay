package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.graphics.BitmapFactory;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class IconRequest {
    public final String hash;
    public final int height;
    public final int iconResourceId;
    public final int width;

    public IconRequest(String str, int i, int i2, int i3) {
        this.hash = str;
        this.iconResourceId = i;
        this.width = i2;
        this.height = i3;
    }

    public static IconRequest build(Context context, String str) {
        String a = C0059ao.a(8567);
        if (str != null) {
            try {
                int appIconResourceId = CommonUtils.getAppIconResourceId(context);
                Logger logger = Fabric.getLogger();
                logger.d(a, C0059ao.a(8568) + appIconResourceId);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), appIconResourceId, options);
                return new IconRequest(str, appIconResourceId, options.outWidth, options.outHeight);
            } catch (Exception e) {
                Fabric.getLogger().e(a, C0059ao.a(8569), e);
            }
        }
        return null;
    }
}
