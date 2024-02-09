package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: uc  reason: default package */
/* loaded from: classes.dex */
public final class uc {
    public static Field a;
    public static boolean b;

    public static Drawable a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        boolean z = b;
        String a2 = C0059ao.a(3778);
        if (!z) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField(C0059ao.a(3779));
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(a2, C0059ao.a(3780), e);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i(a2, C0059ao.a(3781), e2);
                a = null;
            }
        }
        return null;
    }

    public static ColorStateList b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof cd) {
            return ((cd) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof cd) {
            ((cd) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof cd) {
            ((cd) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
