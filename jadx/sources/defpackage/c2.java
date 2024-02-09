package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import defpackage.e3;

/* compiled from: AxisPay */
/* renamed from: c2  reason: default package */
/* loaded from: classes.dex */
public final class c2 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static c2 c;
    public e3 a;

    /* compiled from: AxisPay */
    /* renamed from: c2$a */
    /* loaded from: classes.dex */
    public class a implements e3.f {
        public final int[] a = {p.abc_textfield_search_default_mtrl_alpha, p.abc_textfield_default_mtrl_alpha, p.abc_ab_share_pack_mtrl_alpha};
        public final int[] b = {p.abc_ic_commit_search_api_mtrl_alpha, p.abc_seekbar_tick_mark_material, p.abc_ic_menu_share_mtrl_alpha, p.abc_ic_menu_copy_mtrl_am_alpha, p.abc_ic_menu_cut_mtrl_alpha, p.abc_ic_menu_selectall_mtrl_alpha, p.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {p.abc_textfield_activated_mtrl_alpha, p.abc_textfield_search_activated_mtrl_alpha, p.abc_cab_background_top_mtrl_alpha, p.abc_text_cursor_material, p.abc_text_select_handle_left_mtrl, p.abc_text_select_handle_middle_mtrl, p.abc_text_select_handle_right_mtrl};
        public final int[] d = {p.abc_popup_background_mtrl_mult, p.abc_cab_background_internal_bg, p.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {p.abc_tab_indicator_material, p.abc_textfield_search_material};
        public final int[] f = {p.abc_btn_check_material, p.abc_btn_radio_material, p.abc_btn_check_material_anim, p.abc_btn_radio_material_anim};

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // defpackage.e3.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = defpackage.c2.a()
                int[] r1 = r6.a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = defpackage.l.colorControlNormal
            L14:
                r8 = r3
            L15:
                r1 = r5
                goto L44
            L17:
                int[] r1 = r6.c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = defpackage.l.colorControlActivated
                goto L14
            L22:
                int[] r1 = r6.d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = defpackage.p.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = defpackage.p.abc_dialog_material_background
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = r3
                r1 = r4
                r2 = r1
            L44:
                if (r1 == 0) goto L61
                boolean r1 = defpackage.v2.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = defpackage.j3.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = defpackage.c2.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.c2.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // defpackage.e3.f
        public PorterDuff.Mode b(int i) {
            if (i == p.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // defpackage.e3.f
        public Drawable c(e3 e3Var, Context context, int i) {
            if (i == p.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{e3Var.j(context, p.abc_cab_background_internal_bg), e3Var.j(context, p.abc_cab_background_top_mtrl_alpha)});
            }
            if (i == p.abc_ratingbar_material) {
                return l(e3Var, context, o.abc_star_big);
            }
            if (i == p.abc_ratingbar_indicator_material) {
                return l(e3Var, context, o.abc_star_medium);
            }
            if (i == p.abc_ratingbar_small_material) {
                return l(e3Var, context, o.abc_star_small);
            }
            return null;
        }

        @Override // defpackage.e3.f
        public ColorStateList d(Context context, int i) {
            if (i == p.abc_edit_text_material) {
                return k0.c(context, n.abc_tint_edittext);
            }
            if (i == p.abc_switch_track_mtrl_alpha) {
                return k0.c(context, n.abc_tint_switch_track);
            }
            if (i == p.abc_switch_thumb_material) {
                return k(context);
            }
            if (i == p.abc_btn_default_mtrl_shape) {
                return j(context);
            }
            if (i == p.abc_btn_borderless_material) {
                return g(context);
            }
            if (i == p.abc_btn_colored_material) {
                return i(context);
            }
            if (i != p.abc_spinner_mtrl_am_alpha && i != p.abc_spinner_textfield_background_material) {
                if (f(this.b, i)) {
                    return j3.e(context, l.colorControlNormal);
                }
                if (f(this.e, i)) {
                    return k0.c(context, n.abc_tint_default);
                }
                if (f(this.f, i)) {
                    return k0.c(context, n.abc_tint_btn_checkable);
                }
                if (i == p.abc_seekbar_thumb_material) {
                    return k0.c(context, n.abc_tint_seek_thumb);
                }
                return null;
            }
            return k0.c(context, n.abc_tint_spinner);
        }

        @Override // defpackage.e3.f
        public boolean e(Context context, int i, Drawable drawable) {
            if (i == p.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = l.colorControlNormal;
                m(findDrawableByLayerId, j3.c(context, i2), c2.b);
                m(layerDrawable.findDrawableByLayerId(16908303), j3.c(context, i2), c2.b);
                m(layerDrawable.findDrawableByLayerId(16908301), j3.c(context, l.colorControlActivated), c2.b);
                return true;
            } else if (i == p.abc_ratingbar_material || i == p.abc_ratingbar_indicator_material || i == p.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), j3.b(context, l.colorControlNormal), c2.b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = l.colorControlActivated;
                m(findDrawableByLayerId2, j3.c(context, i3), c2.b);
                m(layerDrawable2.findDrawableByLayerId(16908301), j3.c(context, i3), c2.b);
                return true;
            } else {
                return false;
            }
        }

        public final boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i) {
            int c = j3.c(context, l.colorControlHighlight);
            return new ColorStateList(new int[][]{j3.b, j3.d, j3.c, j3.f}, new int[]{j3.b(context, l.colorButtonNormal), d9.i(c, i), d9.i(c, i), i});
        }

        public final ColorStateList i(Context context) {
            return h(context, j3.c(context, l.colorAccent));
        }

        public final ColorStateList j(Context context) {
            return h(context, j3.c(context, l.colorButtonNormal));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i = l.colorSwitchThumbNormal;
            ColorStateList e = j3.e(context, i);
            if (e != null && e.isStateful()) {
                iArr[0] = j3.b;
                iArr2[0] = e.getColorForState(iArr[0], 0);
                iArr[1] = j3.e;
                iArr2[1] = j3.c(context, l.colorControlActivated);
                iArr[2] = j3.f;
                iArr2[2] = e.getDefaultColor();
            } else {
                iArr[0] = j3.b;
                iArr2[0] = j3.b(context, i);
                iArr[1] = j3.e;
                iArr2[1] = j3.c(context, l.colorControlActivated);
                iArr[2] = j3.f;
                iArr2[2] = j3.c(context, i);
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(e3 e3Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = e3Var.j(context, p.abc_star_black_48dp);
            Drawable j2 = e3Var.j(context, p.abc_star_half_black_48dp);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (v2.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = c2.b;
            }
            drawable.setColorFilter(c2.e(i, mode));
        }
    }

    public static synchronized c2 b() {
        c2 c2Var;
        synchronized (c2.class) {
            if (c == null) {
                h();
            }
            c2Var = c;
        }
        return c2Var;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (c2.class) {
            l = e3.l(i, mode);
        }
        return l;
    }

    public static synchronized void h() {
        synchronized (c2.class) {
            if (c == null) {
                c2 c2Var = new c2();
                c = c2Var;
                c2Var.a = e3.h();
                c.a.u(new a());
            }
        }
    }

    public static void i(Drawable drawable, m3 m3Var, int[] iArr) {
        e3.w(drawable, m3Var, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.a.j(context, i);
    }

    public synchronized Drawable d(Context context, int i, boolean z) {
        return this.a.k(context, i, z);
    }

    public synchronized ColorStateList f(Context context, int i) {
        return this.a.m(context, i);
    }

    public synchronized void g(Context context) {
        this.a.s(context);
    }
}
