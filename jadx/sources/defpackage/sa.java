package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import com.google.android.gms.vision.barcode.Barcode;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: sa  reason: default package */
/* loaded from: classes.dex */
public class sa implements Spannable {
    public final Spannable b;
    public final a c;
    public final PrecomputedText d;

    public a a() {
        return this.c;
    }

    public PrecomputedText b() {
        Spannable spannable = this.b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.d.getSpans(i, i2, cls);
        }
        return (T[]) this.b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.d.removeSpan(obj);
                return;
            } else {
                this.b.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException(C0059ao.a(1683));
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.d.setSpan(obj, i, i2, i3);
                return;
            } else {
                this.b.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException(C0059ao.a(1684));
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.b.toString();
    }

    /* compiled from: AxisPay */
    /* renamed from: sa$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final TextPaint a;
        public final TextDirectionHeuristic b;
        public final int c;
        public final int d;

        /* compiled from: AxisPay */
        /* renamed from: sa$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0037a {
            public final TextPaint a;
            public TextDirectionHeuristic b;
            public int c;
            public int d;

            public C0037a(TextPaint textPaint) {
                this.a = textPaint;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    this.c = 1;
                    this.d = 1;
                } else {
                    this.d = 0;
                    this.c = 0;
                }
                if (i >= 18) {
                    this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.b = null;
                }
            }

            public a a() {
                return new a(this.a, this.b, this.c, this.d);
            }

            public C0037a b(int i) {
                this.c = i;
                return this;
            }

            public C0037a c(int i) {
                this.d = i;
                return this;
            }

            public C0037a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        @SuppressLint({"NewApi"})
        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i;
            this.d = i2;
        }

        public boolean a(a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i < 23 || (this.c == aVar.b() && this.d == aVar.c())) && this.a.getTextSize() == aVar.e().getTextSize() && this.a.getTextScaleX() == aVar.e().getTextScaleX() && this.a.getTextSkewX() == aVar.e().getTextSkewX()) {
                if ((i < 21 || (this.a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) && this.a.getFlags() == aVar.e().getFlags()) {
                    if (i >= 24) {
                        if (!this.a.getTextLocales().equals(aVar.e().getTextLocales())) {
                            return false;
                        }
                    } else if (i >= 17 && !this.a.getTextLocale().equals(aVar.e().getTextLocale())) {
                        return false;
                    }
                    return this.a.getTypeface() == null ? aVar.e().getTypeface() == null : this.a.getTypeface().equals(aVar.e().getTypeface());
                }
                return false;
            }
            return false;
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (a(aVar)) {
                    return Build.VERSION.SDK_INT < 18 || this.b == aVar.d();
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return ya.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            }
            if (i >= 21) {
                return ya.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            }
            if (i >= 18) {
                return ya.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            }
            if (i >= 17) {
                return ya.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            }
            return ya.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(C0059ao.a(247));
            sb.append(C0059ao.a(248) + this.a.getTextSize());
            sb.append(C0059ao.a(249) + this.a.getTextScaleX());
            sb.append(C0059ao.a(250) + this.a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                sb.append(C0059ao.a(251) + this.a.getLetterSpacing());
                sb.append(C0059ao.a(252) + this.a.isElegantTextHeight());
            }
            String a = C0059ao.a(253);
            if (i >= 24) {
                sb.append(a + this.a.getTextLocales());
            } else if (i >= 17) {
                sb.append(a + this.a.getTextLocale());
            }
            sb.append(C0059ao.a(254) + this.a.getTypeface());
            if (i >= 26) {
                sb.append(C0059ao.a(255) + this.a.getFontVariationSettings());
            }
            sb.append(C0059ao.a(Barcode.QR_CODE) + this.b);
            sb.append(C0059ao.a(257) + this.c);
            sb.append(C0059ao.a(258) + this.d);
            sb.append(C0059ao.a(259));
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }
    }
}
