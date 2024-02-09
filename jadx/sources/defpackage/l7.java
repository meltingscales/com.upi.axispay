package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.support.v4.media.session.IMediaSession;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.m7;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import myunmn.C0059ao;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AxisPay */
/* renamed from: l7  reason: default package */
/* loaded from: classes.dex */
public class l7 {
    public static final int[] d = {0, 4, 8};
    public static SparseIntArray e = new SparseIntArray();
    public static SparseIntArray f = new SparseIntArray();
    public HashMap<String, i7> a = new HashMap<>();
    public boolean b = true;
    public HashMap<Integer, a> c = new HashMap<>();

    /* compiled from: AxisPay */
    /* renamed from: l7$a */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public String b;
        public final d c = new d();
        public final c d = new c();
        public final b e = new b();
        public final e f = new e();
        public HashMap<String, i7> g = new HashMap<>();
        public C0030a h;

        /* compiled from: AxisPay */
        /* renamed from: l7$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0030a {
            public int[] a = new int[10];
            public int[] b = new int[10];
            public int c = 0;
            public int[] d = new int[10];
            public float[] e = new float[10];
            public int f = 0;
            public int[] g = new int[5];
            public String[] h = new String[5];
            public int i = 0;
            public int[] j = new int[4];
            public boolean[] k = new boolean[4];
            public int l = 0;

            public void a(int i, float f) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            public void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.e;
            bVar.e = bVar2.i;
            bVar.f = bVar2.j;
            bVar.g = bVar2.k;
            bVar.h = bVar2.l;
            bVar.i = bVar2.m;
            bVar.j = bVar2.n;
            bVar.k = bVar2.o;
            bVar.l = bVar2.p;
            bVar.m = bVar2.q;
            bVar.n = bVar2.r;
            bVar.o = bVar2.s;
            bVar.s = bVar2.t;
            bVar.t = bVar2.u;
            bVar.u = bVar2.v;
            bVar.v = bVar2.w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.J;
            bVar.A = bVar2.S;
            bVar.B = bVar2.R;
            bVar.x = bVar2.O;
            bVar.z = bVar2.Q;
            bVar.E = bVar2.x;
            bVar.F = bVar2.y;
            b bVar3 = this.e;
            bVar.p = bVar3.A;
            bVar.q = bVar3.B;
            bVar.r = bVar3.C;
            bVar.G = bVar3.z;
            bVar.V = bVar3.D;
            bVar.W = bVar3.E;
            bVar.K = bVar3.U;
            bVar.J = bVar3.V;
            bVar.M = bVar3.X;
            bVar.L = bVar3.W;
            bVar.Y = bVar3.m0;
            bVar.Z = bVar3.n0;
            bVar.N = bVar3.Y;
            bVar.O = bVar3.Z;
            bVar.R = bVar3.a0;
            bVar.S = bVar3.b0;
            bVar.P = bVar3.c0;
            bVar.Q = bVar3.d0;
            bVar.T = bVar3.e0;
            bVar.U = bVar3.f0;
            bVar.X = bVar3.F;
            bVar.c = bVar3.g;
            bVar.a = bVar3.e;
            bVar.b = bVar3.f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar3.c;
            b bVar4 = this.e;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar4.d;
            String str = bVar4.l0;
            if (str != null) {
                bVar.a0 = str;
            }
            bVar.b0 = bVar4.p0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(bVar4.L);
                bVar.setMarginEnd(this.e.K);
            }
            bVar.a();
        }

        /* renamed from: e */
        public a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }

        public final void f(int i, ConstraintLayout.b bVar) {
            this.a = i;
            b bVar2 = this.e;
            bVar2.i = bVar.e;
            bVar2.j = bVar.f;
            bVar2.k = bVar.g;
            bVar2.l = bVar.h;
            bVar2.m = bVar.i;
            bVar2.n = bVar.j;
            bVar2.o = bVar.k;
            bVar2.p = bVar.l;
            bVar2.q = bVar.m;
            bVar2.r = bVar.n;
            bVar2.s = bVar.o;
            bVar2.t = bVar.s;
            bVar2.u = bVar.t;
            bVar2.v = bVar.u;
            bVar2.w = bVar.v;
            bVar2.x = bVar.E;
            bVar2.y = bVar.F;
            bVar2.z = bVar.G;
            bVar2.A = bVar.p;
            bVar2.B = bVar.q;
            bVar2.C = bVar.r;
            bVar2.D = bVar.V;
            bVar2.E = bVar.W;
            bVar2.F = bVar.X;
            bVar2.g = bVar.c;
            b bVar3 = this.e;
            bVar3.e = bVar.a;
            bVar3.f = bVar.b;
            bVar3.c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar3.d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar3.G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar3.H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar3.I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar3.J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar3.M = bVar.D;
            bVar3.U = bVar.K;
            bVar3.V = bVar.J;
            bVar3.X = bVar.M;
            bVar3.W = bVar.L;
            bVar3.m0 = bVar.Y;
            bVar3.n0 = bVar.Z;
            bVar3.Y = bVar.N;
            bVar3.Z = bVar.O;
            bVar3.a0 = bVar.R;
            bVar3.b0 = bVar.S;
            bVar3.c0 = bVar.P;
            bVar3.d0 = bVar.Q;
            bVar3.e0 = bVar.T;
            bVar3.f0 = bVar.U;
            bVar3.l0 = bVar.a0;
            bVar3.O = bVar.x;
            b bVar4 = this.e;
            bVar4.Q = bVar.z;
            bVar4.N = bVar.w;
            bVar4.P = bVar.y;
            bVar4.S = bVar.A;
            bVar4.R = bVar.B;
            bVar4.T = bVar.C;
            bVar4.p0 = bVar.b0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar4.K = bVar.getMarginEnd();
                this.e.L = bVar.getMarginStart();
            }
        }

        public final void g(int i, m7.a aVar) {
            f(i, aVar);
            this.c.d = aVar.v0;
            e eVar = this.f;
            eVar.b = aVar.y0;
            eVar.c = aVar.z0;
            eVar.d = aVar.A0;
            eVar.e = aVar.B0;
            eVar.f = aVar.C0;
            eVar.g = aVar.D0;
            eVar.h = aVar.E0;
            eVar.j = aVar.F0;
            eVar.k = aVar.G0;
            eVar.l = aVar.H0;
            eVar.n = aVar.x0;
            eVar.m = aVar.w0;
        }

        public final void h(j7 j7Var, int i, m7.a aVar) {
            g(i, aVar);
            if (j7Var instanceof Barrier) {
                b bVar = this.e;
                bVar.i0 = 1;
                Barrier barrier = (Barrier) j7Var;
                bVar.g0 = barrier.getType();
                this.e.j0 = barrier.getReferencedIds();
                this.e.h0 = barrier.getMargin();
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l7$b */
    /* loaded from: classes.dex */
    public static class b {
        public static SparseIntArray q0;
        public int c;
        public int d;
        public int[] j0;
        public String k0;
        public String l0;
        public boolean a = false;
        public boolean b = false;
        public int e = -1;
        public int f = -1;
        public float g = -1.0f;
        public boolean h = true;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public float x = 0.5f;
        public float y = 0.5f;
        public String z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = RecyclerView.UNDEFINED_DURATION;
        public int O = RecyclerView.UNDEFINED_DURATION;
        public int P = RecyclerView.UNDEFINED_DURATION;
        public int Q = RecyclerView.UNDEFINED_DURATION;
        public int R = RecyclerView.UNDEFINED_DURATION;
        public int S = RecyclerView.UNDEFINED_DURATION;
        public int T = RecyclerView.UNDEFINED_DURATION;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public float e0 = 1.0f;
        public float f0 = 1.0f;
        public int g0 = -1;
        public int h0 = 0;
        public int i0 = -1;
        public boolean m0 = false;
        public boolean n0 = false;
        public boolean o0 = true;
        public int p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            q0 = sparseIntArray;
            sparseIntArray.append(q7.Layout_layout_constraintLeft_toLeftOf, 24);
            q0.append(q7.Layout_layout_constraintLeft_toRightOf, 25);
            q0.append(q7.Layout_layout_constraintRight_toLeftOf, 28);
            q0.append(q7.Layout_layout_constraintRight_toRightOf, 29);
            q0.append(q7.Layout_layout_constraintTop_toTopOf, 35);
            q0.append(q7.Layout_layout_constraintTop_toBottomOf, 34);
            q0.append(q7.Layout_layout_constraintBottom_toTopOf, 4);
            q0.append(q7.Layout_layout_constraintBottom_toBottomOf, 3);
            q0.append(q7.Layout_layout_constraintBaseline_toBaselineOf, 1);
            q0.append(q7.Layout_layout_editor_absoluteX, 6);
            q0.append(q7.Layout_layout_editor_absoluteY, 7);
            q0.append(q7.Layout_layout_constraintGuide_begin, 17);
            q0.append(q7.Layout_layout_constraintGuide_end, 18);
            q0.append(q7.Layout_layout_constraintGuide_percent, 19);
            q0.append(q7.Layout_guidelineUseRtl, 90);
            q0.append(q7.Layout_android_orientation, 26);
            q0.append(q7.Layout_layout_constraintStart_toEndOf, 31);
            q0.append(q7.Layout_layout_constraintStart_toStartOf, 32);
            q0.append(q7.Layout_layout_constraintEnd_toStartOf, 10);
            q0.append(q7.Layout_layout_constraintEnd_toEndOf, 9);
            q0.append(q7.Layout_layout_goneMarginLeft, 13);
            q0.append(q7.Layout_layout_goneMarginTop, 16);
            q0.append(q7.Layout_layout_goneMarginRight, 14);
            q0.append(q7.Layout_layout_goneMarginBottom, 11);
            q0.append(q7.Layout_layout_goneMarginStart, 15);
            q0.append(q7.Layout_layout_goneMarginEnd, 12);
            q0.append(q7.Layout_layout_constraintVertical_weight, 38);
            q0.append(q7.Layout_layout_constraintHorizontal_weight, 37);
            q0.append(q7.Layout_layout_constraintHorizontal_chainStyle, 39);
            q0.append(q7.Layout_layout_constraintVertical_chainStyle, 40);
            q0.append(q7.Layout_layout_constraintHorizontal_bias, 20);
            q0.append(q7.Layout_layout_constraintVertical_bias, 36);
            q0.append(q7.Layout_layout_constraintDimensionRatio, 5);
            q0.append(q7.Layout_layout_constraintLeft_creator, 91);
            q0.append(q7.Layout_layout_constraintTop_creator, 91);
            q0.append(q7.Layout_layout_constraintRight_creator, 91);
            q0.append(q7.Layout_layout_constraintBottom_creator, 91);
            q0.append(q7.Layout_layout_constraintBaseline_creator, 91);
            q0.append(q7.Layout_android_layout_marginLeft, 23);
            q0.append(q7.Layout_android_layout_marginRight, 27);
            q0.append(q7.Layout_android_layout_marginStart, 30);
            q0.append(q7.Layout_android_layout_marginEnd, 8);
            q0.append(q7.Layout_android_layout_marginTop, 33);
            q0.append(q7.Layout_android_layout_marginBottom, 2);
            q0.append(q7.Layout_android_layout_width, 22);
            q0.append(q7.Layout_android_layout_height, 21);
            q0.append(q7.Layout_layout_constraintWidth, 41);
            q0.append(q7.Layout_layout_constraintHeight, 42);
            q0.append(q7.Layout_layout_constrainedWidth, 41);
            q0.append(q7.Layout_layout_constrainedHeight, 42);
            q0.append(q7.Layout_layout_wrapBehaviorInParent, 76);
            q0.append(q7.Layout_layout_constraintCircle, 61);
            q0.append(q7.Layout_layout_constraintCircleRadius, 62);
            q0.append(q7.Layout_layout_constraintCircleAngle, 63);
            q0.append(q7.Layout_layout_constraintWidth_percent, 69);
            q0.append(q7.Layout_layout_constraintHeight_percent, 70);
            q0.append(q7.Layout_chainUseRtl, 71);
            q0.append(q7.Layout_barrierDirection, 72);
            q0.append(q7.Layout_barrierMargin, 73);
            q0.append(q7.Layout_constraint_referenced_ids, 74);
            q0.append(q7.Layout_barrierAllowsGoneWidgets, 75);
        }

        public void a(b bVar) {
            this.a = bVar.a;
            this.c = bVar.c;
            this.b = bVar.b;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.l0 = bVar.l0;
            int[] iArr = bVar.j0;
            if (iArr != null && bVar.k0 == null) {
                this.j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.j0 = null;
            }
            this.k0 = bVar.k0;
            this.m0 = bVar.m0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q7.Layout);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = q0.get(index);
                switch (i2) {
                    case 1:
                        this.q = l7.o(obtainStyledAttributes, index, this.q);
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        this.p = l7.o(obtainStyledAttributes, index, this.p);
                        break;
                    case 4:
                        this.o = l7.o(obtainStyledAttributes, index, this.o);
                        break;
                    case 5:
                        this.z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        this.w = l7.o(obtainStyledAttributes, index, this.w);
                        break;
                    case 10:
                        this.v = l7.o(obtainStyledAttributes, index, this.v);
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    case 18:
                        this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 19:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 20:
                        this.x = obtainStyledAttributes.getFloat(index, this.x);
                        break;
                    case 21:
                        this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 22:
                        this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case 23:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        this.i = l7.o(obtainStyledAttributes, index, this.i);
                        break;
                    case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                        this.j = l7.o(obtainStyledAttributes, index, this.j);
                        break;
                    case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                        this.k = l7.o(obtainStyledAttributes, index, this.k);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                        this.l = l7.o(obtainStyledAttributes, index, this.l);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } else {
                            break;
                        }
                    case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                        this.t = l7.o(obtainStyledAttributes, index, this.t);
                        break;
                    case 32:
                        this.u = l7.o(obtainStyledAttributes, index, this.u);
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                        this.n = l7.o(obtainStyledAttributes, index, this.n);
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                        this.m = l7.o(obtainStyledAttributes, index, this.m);
                        break;
                    case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                        l7.p(this, obtainStyledAttributes, index, 0);
                        break;
                    case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                        l7.p(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.A = l7.o(obtainStyledAttributes, index, this.A);
                                continue;
                            case 62:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                continue;
                            case 63:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                continue;
                            default:
                                String a = C0059ao.a(2698);
                                String a2 = C0059ao.a(2699);
                                switch (i2) {
                                    case 69:
                                        this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e(a2, C0059ao.a(2702));
                                        continue;
                                    case 72:
                                        this.g0 = obtainStyledAttributes.getInt(index, this.g0);
                                        continue;
                                    case 73:
                                        this.h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                        continue;
                                    case 74:
                                        this.k0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                        continue;
                                    case 76:
                                        this.p0 = obtainStyledAttributes.getInt(index, this.p0);
                                        continue;
                                    case 77:
                                        this.r = l7.o(obtainStyledAttributes, index, this.r);
                                        continue;
                                    case 78:
                                        this.s = l7.o(obtainStyledAttributes, index, this.s);
                                        continue;
                                    case 79:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        continue;
                                    case 80:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        continue;
                                    case 81:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        continue;
                                    case 82:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 83:
                                        this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        continue;
                                    case 84:
                                        this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                        continue;
                                    case 85:
                                        this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        continue;
                                    case 86:
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        continue;
                                    case 87:
                                        this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                                        continue;
                                    case 88:
                                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                        continue;
                                    case 89:
                                        this.l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.h = obtainStyledAttributes.getBoolean(index, this.h);
                                        continue;
                                    case 91:
                                        Log.w(a2, C0059ao.a(2701) + Integer.toHexString(index) + a + q0.get(index));
                                        continue;
                                    default:
                                        Log.w(a2, C0059ao.a(2700) + Integer.toHexString(index) + a + q0.get(index));
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l7$c */
    /* loaded from: classes.dex */
    public static class c {
        public static SparseIntArray o;
        public boolean a = false;
        public int b = -1;
        public int c = 0;
        public String d = null;
        public int e = -1;
        public int f = 0;
        public float g = Float.NaN;
        public int h = -1;
        public float i = Float.NaN;
        public float j = Float.NaN;
        public int k = -1;
        public String l = null;
        public int m = -3;
        public int n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(q7.Motion_motionPathRotate, 1);
            o.append(q7.Motion_pathMotionArc, 2);
            o.append(q7.Motion_transitionEasing, 3);
            o.append(q7.Motion_drawPath, 4);
            o.append(q7.Motion_animateRelativeTo, 5);
            o.append(q7.Motion_animateCircleAngleTo, 6);
            o.append(q7.Motion_motionStagger, 7);
            o.append(q7.Motion_quantizeMotionSteps, 8);
            o.append(q7.Motion_quantizeMotionPhase, 9);
            o.append(q7.Motion_quantizeMotionInterpolator, 10);
        }

        public void a(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.i = cVar.i;
            this.g = cVar.g;
            this.h = cVar.h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q7.Motion);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.i = obtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 2:
                        this.e = obtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.d = h5.c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = l7.o(obtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = obtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.k = obtainStyledAttributes.getInteger(index, this.k);
                        break;
                    case 9:
                        this.j = obtainStyledAttributes.getFloat(index, this.j);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.n = resourceId;
                            if (resourceId != -1) {
                                this.m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.l = string;
                            if (string.indexOf(C0059ao.a(2668)) > 0) {
                                this.n = obtainStyledAttributes.getResourceId(index, -1);
                                this.m = -2;
                                break;
                            } else {
                                this.m = -1;
                                break;
                            }
                        } else {
                            this.m = obtainStyledAttributes.getInteger(index, this.n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l7$d */
    /* loaded from: classes.dex */
    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.c = dVar.c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q7.PropertySet);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == q7.PropertySet_android_alpha) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == q7.PropertySet_android_visibility) {
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    this.b = l7.d[this.b];
                } else if (index == q7.PropertySet_visibilityMode) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == q7.PropertySet_motionProgress) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: l7$e */
    /* loaded from: classes.dex */
    public static class e {
        public static SparseIntArray o;
        public boolean a = false;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public int i = -1;
        public float j = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(q7.Transform_android_rotation, 1);
            o.append(q7.Transform_android_rotationX, 2);
            o.append(q7.Transform_android_rotationY, 3);
            o.append(q7.Transform_android_scaleX, 4);
            o.append(q7.Transform_android_scaleY, 5);
            o.append(q7.Transform_android_transformPivotX, 6);
            o.append(q7.Transform_android_transformPivotY, 7);
            o.append(q7.Transform_android_translationX, 8);
            o.append(q7.Transform_android_translationY, 9);
            o.append(q7.Transform_android_translationZ, 10);
            o.append(q7.Transform_android_elevation, 11);
            o.append(q7.Transform_transformPivotTarget, 12);
        }

        public void a(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q7.Transform);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.l = obtainStyledAttributes.getDimension(index, this.l);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.m = true;
                            this.n = obtainStyledAttributes.getDimension(index, this.n);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        this.i = l7.o(obtainStyledAttributes, index, this.i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        e.append(q7.Constraint_layout_constraintLeft_toLeftOf, 25);
        e.append(q7.Constraint_layout_constraintLeft_toRightOf, 26);
        e.append(q7.Constraint_layout_constraintRight_toLeftOf, 29);
        e.append(q7.Constraint_layout_constraintRight_toRightOf, 30);
        e.append(q7.Constraint_layout_constraintTop_toTopOf, 36);
        e.append(q7.Constraint_layout_constraintTop_toBottomOf, 35);
        e.append(q7.Constraint_layout_constraintBottom_toTopOf, 4);
        e.append(q7.Constraint_layout_constraintBottom_toBottomOf, 3);
        e.append(q7.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        e.append(q7.Constraint_layout_constraintBaseline_toTopOf, 91);
        e.append(q7.Constraint_layout_constraintBaseline_toBottomOf, 92);
        e.append(q7.Constraint_layout_editor_absoluteX, 6);
        e.append(q7.Constraint_layout_editor_absoluteY, 7);
        e.append(q7.Constraint_layout_constraintGuide_begin, 17);
        e.append(q7.Constraint_layout_constraintGuide_end, 18);
        e.append(q7.Constraint_layout_constraintGuide_percent, 19);
        e.append(q7.Constraint_guidelineUseRtl, 99);
        e.append(q7.Constraint_android_orientation, 27);
        e.append(q7.Constraint_layout_constraintStart_toEndOf, 32);
        e.append(q7.Constraint_layout_constraintStart_toStartOf, 33);
        e.append(q7.Constraint_layout_constraintEnd_toStartOf, 10);
        e.append(q7.Constraint_layout_constraintEnd_toEndOf, 9);
        e.append(q7.Constraint_layout_goneMarginLeft, 13);
        e.append(q7.Constraint_layout_goneMarginTop, 16);
        e.append(q7.Constraint_layout_goneMarginRight, 14);
        e.append(q7.Constraint_layout_goneMarginBottom, 11);
        e.append(q7.Constraint_layout_goneMarginStart, 15);
        e.append(q7.Constraint_layout_goneMarginEnd, 12);
        e.append(q7.Constraint_layout_constraintVertical_weight, 40);
        e.append(q7.Constraint_layout_constraintHorizontal_weight, 39);
        e.append(q7.Constraint_layout_constraintHorizontal_chainStyle, 41);
        e.append(q7.Constraint_layout_constraintVertical_chainStyle, 42);
        e.append(q7.Constraint_layout_constraintHorizontal_bias, 20);
        e.append(q7.Constraint_layout_constraintVertical_bias, 37);
        e.append(q7.Constraint_layout_constraintDimensionRatio, 5);
        e.append(q7.Constraint_layout_constraintLeft_creator, 87);
        e.append(q7.Constraint_layout_constraintTop_creator, 87);
        e.append(q7.Constraint_layout_constraintRight_creator, 87);
        e.append(q7.Constraint_layout_constraintBottom_creator, 87);
        e.append(q7.Constraint_layout_constraintBaseline_creator, 87);
        e.append(q7.Constraint_android_layout_marginLeft, 24);
        e.append(q7.Constraint_android_layout_marginRight, 28);
        e.append(q7.Constraint_android_layout_marginStart, 31);
        e.append(q7.Constraint_android_layout_marginEnd, 8);
        e.append(q7.Constraint_android_layout_marginTop, 34);
        e.append(q7.Constraint_android_layout_marginBottom, 2);
        e.append(q7.Constraint_android_layout_width, 23);
        e.append(q7.Constraint_android_layout_height, 21);
        e.append(q7.Constraint_layout_constraintWidth, 95);
        e.append(q7.Constraint_layout_constraintHeight, 96);
        e.append(q7.Constraint_android_visibility, 22);
        e.append(q7.Constraint_android_alpha, 43);
        e.append(q7.Constraint_android_elevation, 44);
        e.append(q7.Constraint_android_rotationX, 45);
        e.append(q7.Constraint_android_rotationY, 46);
        e.append(q7.Constraint_android_rotation, 60);
        e.append(q7.Constraint_android_scaleX, 47);
        e.append(q7.Constraint_android_scaleY, 48);
        e.append(q7.Constraint_android_transformPivotX, 49);
        e.append(q7.Constraint_android_transformPivotY, 50);
        e.append(q7.Constraint_android_translationX, 51);
        e.append(q7.Constraint_android_translationY, 52);
        e.append(q7.Constraint_android_translationZ, 53);
        e.append(q7.Constraint_layout_constraintWidth_default, 54);
        e.append(q7.Constraint_layout_constraintHeight_default, 55);
        e.append(q7.Constraint_layout_constraintWidth_max, 56);
        e.append(q7.Constraint_layout_constraintHeight_max, 57);
        e.append(q7.Constraint_layout_constraintWidth_min, 58);
        e.append(q7.Constraint_layout_constraintHeight_min, 59);
        e.append(q7.Constraint_layout_constraintCircle, 61);
        e.append(q7.Constraint_layout_constraintCircleRadius, 62);
        e.append(q7.Constraint_layout_constraintCircleAngle, 63);
        e.append(q7.Constraint_animateRelativeTo, 64);
        e.append(q7.Constraint_transitionEasing, 65);
        e.append(q7.Constraint_drawPath, 66);
        e.append(q7.Constraint_transitionPathRotate, 67);
        e.append(q7.Constraint_motionStagger, 79);
        e.append(q7.Constraint_android_id, 38);
        e.append(q7.Constraint_motionProgress, 68);
        e.append(q7.Constraint_layout_constraintWidth_percent, 69);
        e.append(q7.Constraint_layout_constraintHeight_percent, 70);
        e.append(q7.Constraint_layout_wrapBehaviorInParent, 97);
        e.append(q7.Constraint_chainUseRtl, 71);
        e.append(q7.Constraint_barrierDirection, 72);
        e.append(q7.Constraint_barrierMargin, 73);
        e.append(q7.Constraint_constraint_referenced_ids, 74);
        e.append(q7.Constraint_barrierAllowsGoneWidgets, 75);
        e.append(q7.Constraint_pathMotionArc, 76);
        e.append(q7.Constraint_layout_constraintTag, 77);
        e.append(q7.Constraint_visibilityMode, 78);
        e.append(q7.Constraint_layout_constrainedWidth, 80);
        e.append(q7.Constraint_layout_constrainedHeight, 81);
        e.append(q7.Constraint_polarRelativeTo, 82);
        e.append(q7.Constraint_transformPivotTarget, 83);
        e.append(q7.Constraint_quantizeMotionSteps, 84);
        e.append(q7.Constraint_quantizeMotionPhase, 85);
        e.append(q7.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = f;
        int i = q7.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i, 6);
        f.append(i, 7);
        f.append(q7.ConstraintOverride_android_orientation, 27);
        f.append(q7.ConstraintOverride_layout_goneMarginLeft, 13);
        f.append(q7.ConstraintOverride_layout_goneMarginTop, 16);
        f.append(q7.ConstraintOverride_layout_goneMarginRight, 14);
        f.append(q7.ConstraintOverride_layout_goneMarginBottom, 11);
        f.append(q7.ConstraintOverride_layout_goneMarginStart, 15);
        f.append(q7.ConstraintOverride_layout_goneMarginEnd, 12);
        f.append(q7.ConstraintOverride_layout_constraintVertical_weight, 40);
        f.append(q7.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f.append(q7.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f.append(q7.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f.append(q7.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f.append(q7.ConstraintOverride_layout_constraintVertical_bias, 37);
        f.append(q7.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f.append(q7.ConstraintOverride_layout_constraintLeft_creator, 87);
        f.append(q7.ConstraintOverride_layout_constraintTop_creator, 87);
        f.append(q7.ConstraintOverride_layout_constraintRight_creator, 87);
        f.append(q7.ConstraintOverride_layout_constraintBottom_creator, 87);
        f.append(q7.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f.append(q7.ConstraintOverride_android_layout_marginLeft, 24);
        f.append(q7.ConstraintOverride_android_layout_marginRight, 28);
        f.append(q7.ConstraintOverride_android_layout_marginStart, 31);
        f.append(q7.ConstraintOverride_android_layout_marginEnd, 8);
        f.append(q7.ConstraintOverride_android_layout_marginTop, 34);
        f.append(q7.ConstraintOverride_android_layout_marginBottom, 2);
        f.append(q7.ConstraintOverride_android_layout_width, 23);
        f.append(q7.ConstraintOverride_android_layout_height, 21);
        f.append(q7.ConstraintOverride_layout_constraintWidth, 95);
        f.append(q7.ConstraintOverride_layout_constraintHeight, 96);
        f.append(q7.ConstraintOverride_android_visibility, 22);
        f.append(q7.ConstraintOverride_android_alpha, 43);
        f.append(q7.ConstraintOverride_android_elevation, 44);
        f.append(q7.ConstraintOverride_android_rotationX, 45);
        f.append(q7.ConstraintOverride_android_rotationY, 46);
        f.append(q7.ConstraintOverride_android_rotation, 60);
        f.append(q7.ConstraintOverride_android_scaleX, 47);
        f.append(q7.ConstraintOverride_android_scaleY, 48);
        f.append(q7.ConstraintOverride_android_transformPivotX, 49);
        f.append(q7.ConstraintOverride_android_transformPivotY, 50);
        f.append(q7.ConstraintOverride_android_translationX, 51);
        f.append(q7.ConstraintOverride_android_translationY, 52);
        f.append(q7.ConstraintOverride_android_translationZ, 53);
        f.append(q7.ConstraintOverride_layout_constraintWidth_default, 54);
        f.append(q7.ConstraintOverride_layout_constraintHeight_default, 55);
        f.append(q7.ConstraintOverride_layout_constraintWidth_max, 56);
        f.append(q7.ConstraintOverride_layout_constraintHeight_max, 57);
        f.append(q7.ConstraintOverride_layout_constraintWidth_min, 58);
        f.append(q7.ConstraintOverride_layout_constraintHeight_min, 59);
        f.append(q7.ConstraintOverride_layout_constraintCircleRadius, 62);
        f.append(q7.ConstraintOverride_layout_constraintCircleAngle, 63);
        f.append(q7.ConstraintOverride_animateRelativeTo, 64);
        f.append(q7.ConstraintOverride_transitionEasing, 65);
        f.append(q7.ConstraintOverride_drawPath, 66);
        f.append(q7.ConstraintOverride_transitionPathRotate, 67);
        f.append(q7.ConstraintOverride_motionStagger, 79);
        f.append(q7.ConstraintOverride_android_id, 38);
        f.append(q7.ConstraintOverride_motionTarget, 98);
        f.append(q7.ConstraintOverride_motionProgress, 68);
        f.append(q7.ConstraintOverride_layout_constraintWidth_percent, 69);
        f.append(q7.ConstraintOverride_layout_constraintHeight_percent, 70);
        f.append(q7.ConstraintOverride_chainUseRtl, 71);
        f.append(q7.ConstraintOverride_barrierDirection, 72);
        f.append(q7.ConstraintOverride_barrierMargin, 73);
        f.append(q7.ConstraintOverride_constraint_referenced_ids, 74);
        f.append(q7.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f.append(q7.ConstraintOverride_pathMotionArc, 76);
        f.append(q7.ConstraintOverride_layout_constraintTag, 77);
        f.append(q7.ConstraintOverride_visibilityMode, 78);
        f.append(q7.ConstraintOverride_layout_constrainedWidth, 80);
        f.append(q7.ConstraintOverride_layout_constrainedHeight, 81);
        f.append(q7.ConstraintOverride_polarRelativeTo, 82);
        f.append(q7.ConstraintOverride_transformPivotTarget, 83);
        f.append(q7.ConstraintOverride_quantizeMotionSteps, 84);
        f.append(q7.ConstraintOverride_quantizeMotionPhase, 85);
        f.append(q7.ConstraintOverride_quantizeMotionInterpolator, 86);
        f.append(q7.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static int o(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public static void p(Object obj, TypedArray typedArray, int i, int i2) {
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        if (i3 != 3) {
            int i4 = -2;
            boolean z = false;
            if (i3 != 5) {
                int i5 = typedArray.getInt(i, 0);
                if (i5 != -4) {
                    i4 = (i5 == -3 || !(i5 == -2 || i5 == -1)) ? 0 : i5;
                } else {
                    z = true;
                }
            } else {
                i4 = typedArray.getDimensionPixelSize(i, 0);
            }
            if (obj instanceof ConstraintLayout.b) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar).width = i4;
                    bVar.Y = z;
                    return;
                }
                ((ViewGroup.MarginLayoutParams) bVar).height = i4;
                bVar.Z = z;
                return;
            } else if (obj instanceof b) {
                b bVar2 = (b) obj;
                if (i2 == 0) {
                    bVar2.c = i4;
                    bVar2.m0 = z;
                    return;
                }
                bVar2.d = i4;
                bVar2.n0 = z;
                return;
            } else if (obj instanceof a.C0030a) {
                a.C0030a c0030a = (a.C0030a) obj;
                if (i2 == 0) {
                    c0030a.b(23, i4);
                    c0030a.d(80, z);
                    return;
                }
                c0030a.b(21, i4);
                c0030a.d(81, z);
                return;
            } else {
                return;
            }
        }
        q(obj, typedArray.getString(i), i2);
    }

    public static void q(Object obj, String str, int i) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if (C0059ao.a(10567).equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    r(bVar, trim2);
                    return;
                } else if (obj instanceof b) {
                    ((b) obj).z = trim2;
                    return;
                } else if (obj instanceof a.C0030a) {
                    ((a.C0030a) obj).c(5, trim2);
                    return;
                } else {
                    return;
                }
            }
            try {
                if (C0059ao.a(10568).equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.J = parseFloat;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.K = parseFloat;
                        }
                    } else if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i == 0) {
                            bVar3.c = 0;
                            bVar3.V = parseFloat;
                        } else {
                            bVar3.d = 0;
                            bVar3.U = parseFloat;
                        }
                    } else if (obj instanceof a.C0030a) {
                        a.C0030a c0030a = (a.C0030a) obj;
                        if (i == 0) {
                            c0030a.b(23, 0);
                            c0030a.a(39, parseFloat);
                        } else {
                            c0030a.b(21, 0);
                            c0030a.a(40, parseFloat);
                        }
                    }
                } else if (!C0059ao.a(10569).equalsIgnoreCase(trim)) {
                } else {
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.T = max;
                            bVar4.N = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.U = max;
                            bVar4.O = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i == 0) {
                            bVar5.c = 0;
                            bVar5.e0 = max;
                            bVar5.Y = 2;
                        } else {
                            bVar5.d = 0;
                            bVar5.f0 = max;
                            bVar5.Z = 2;
                        }
                    } else if (obj instanceof a.C0030a) {
                        a.C0030a c0030a2 = (a.C0030a) obj;
                        if (i == 0) {
                            c0030a2.b(23, 0);
                            c0030a2.b(54, 2);
                        } else {
                            c0030a2.b(21, 0);
                            c0030a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void r(ConstraintLayout.b bVar, String str) {
        float f2 = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase(C0059ao.a(10570))) {
                    i = 0;
                } else if (substring.equalsIgnoreCase(C0059ao.a(10571))) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i2, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                f2 = Math.abs(parseFloat2 / parseFloat);
                            } else {
                                f2 = Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = str.substring(i2);
                    if (substring4.length() > 0) {
                        f2 = Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.G = str;
        bVar.H = f2;
        bVar.I = i;
    }

    public static void t(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0030a c0030a = new a.C0030a();
        aVar.h = c0030a;
        aVar.d.a = false;
        aVar.e.b = false;
        aVar.c.a = false;
        aVar.f.a = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f.get(index);
            String a2 = C0059ao.a(10572);
            String a3 = C0059ao.a(10573);
            switch (i2) {
                case 2:
                    c0030a.b(2, typedArray.getDimensionPixelSize(index, aVar.e.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                case 32:
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w(a3, C0059ao.a(10574) + Integer.toHexString(index) + a2 + e.get(index));
                    break;
                case 5:
                    c0030a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0030a.b(6, typedArray.getDimensionPixelOffset(index, aVar.e.D));
                    break;
                case 7:
                    c0030a.b(7, typedArray.getDimensionPixelOffset(index, aVar.e.E));
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        c0030a.b(8, typedArray.getDimensionPixelSize(index, aVar.e.K));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    c0030a.b(11, typedArray.getDimensionPixelSize(index, aVar.e.Q));
                    break;
                case 12:
                    c0030a.b(12, typedArray.getDimensionPixelSize(index, aVar.e.R));
                    break;
                case 13:
                    c0030a.b(13, typedArray.getDimensionPixelSize(index, aVar.e.N));
                    break;
                case 14:
                    c0030a.b(14, typedArray.getDimensionPixelSize(index, aVar.e.P));
                    break;
                case 15:
                    c0030a.b(15, typedArray.getDimensionPixelSize(index, aVar.e.S));
                    break;
                case 16:
                    c0030a.b(16, typedArray.getDimensionPixelSize(index, aVar.e.O));
                    break;
                case 17:
                    c0030a.b(17, typedArray.getDimensionPixelOffset(index, aVar.e.e));
                    break;
                case 18:
                    c0030a.b(18, typedArray.getDimensionPixelOffset(index, aVar.e.f));
                    break;
                case 19:
                    c0030a.a(19, typedArray.getFloat(index, aVar.e.g));
                    break;
                case 20:
                    c0030a.a(20, typedArray.getFloat(index, aVar.e.x));
                    break;
                case 21:
                    c0030a.b(21, typedArray.getLayoutDimension(index, aVar.e.d));
                    break;
                case 22:
                    c0030a.b(22, d[typedArray.getInt(index, aVar.c.b)]);
                    break;
                case 23:
                    c0030a.b(23, typedArray.getLayoutDimension(index, aVar.e.c));
                    break;
                case 24:
                    c0030a.b(24, typedArray.getDimensionPixelSize(index, aVar.e.G));
                    break;
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    c0030a.b(27, typedArray.getInt(index, aVar.e.F));
                    break;
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    c0030a.b(28, typedArray.getDimensionPixelSize(index, aVar.e.H));
                    break;
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    if (Build.VERSION.SDK_INT >= 17) {
                        c0030a.b(31, typedArray.getDimensionPixelSize(index, aVar.e.L));
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    c0030a.b(34, typedArray.getDimensionPixelSize(index, aVar.e.I));
                    break;
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    c0030a.a(37, typedArray.getFloat(index, aVar.e.y));
                    break;
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    c0030a.b(38, resourceId);
                    break;
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    c0030a.a(39, typedArray.getFloat(index, aVar.e.V));
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    c0030a.a(40, typedArray.getFloat(index, aVar.e.U));
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    c0030a.b(41, typedArray.getInt(index, aVar.e.W));
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    c0030a.b(42, typedArray.getInt(index, aVar.e.X));
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    c0030a.a(43, typedArray.getFloat(index, aVar.c.d));
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    if (Build.VERSION.SDK_INT >= 21) {
                        c0030a.d(44, true);
                        c0030a.a(44, typedArray.getDimension(index, aVar.f.n));
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    c0030a.a(45, typedArray.getFloat(index, aVar.f.c));
                    break;
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    c0030a.a(46, typedArray.getFloat(index, aVar.f.d));
                    break;
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    c0030a.a(47, typedArray.getFloat(index, aVar.f.e));
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    c0030a.a(48, typedArray.getFloat(index, aVar.f.f));
                    break;
                case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                    c0030a.a(49, typedArray.getDimension(index, aVar.f.g));
                    break;
                case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                    c0030a.a(50, typedArray.getDimension(index, aVar.f.h));
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    c0030a.a(51, typedArray.getDimension(index, aVar.f.j));
                    break;
                case 52:
                    c0030a.a(52, typedArray.getDimension(index, aVar.f.k));
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        c0030a.a(53, typedArray.getDimension(index, aVar.f.l));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    c0030a.b(54, typedArray.getInt(index, aVar.e.Y));
                    break;
                case 55:
                    c0030a.b(55, typedArray.getInt(index, aVar.e.Z));
                    break;
                case 56:
                    c0030a.b(56, typedArray.getDimensionPixelSize(index, aVar.e.a0));
                    break;
                case 57:
                    c0030a.b(57, typedArray.getDimensionPixelSize(index, aVar.e.b0));
                    break;
                case 58:
                    c0030a.b(58, typedArray.getDimensionPixelSize(index, aVar.e.c0));
                    break;
                case 59:
                    c0030a.b(59, typedArray.getDimensionPixelSize(index, aVar.e.d0));
                    break;
                case 60:
                    c0030a.a(60, typedArray.getFloat(index, aVar.f.b));
                    break;
                case 62:
                    c0030a.b(62, typedArray.getDimensionPixelSize(index, aVar.e.B));
                    break;
                case 63:
                    c0030a.a(63, typedArray.getFloat(index, aVar.e.C));
                    break;
                case 64:
                    c0030a.b(64, o(typedArray, index, aVar.d.b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0030a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0030a.c(65, h5.c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0030a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0030a.a(67, typedArray.getFloat(index, aVar.d.i));
                    break;
                case 68:
                    c0030a.a(68, typedArray.getFloat(index, aVar.c.e));
                    break;
                case 69:
                    c0030a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0030a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e(a3, C0059ao.a(10577));
                    break;
                case 72:
                    c0030a.b(72, typedArray.getInt(index, aVar.e.g0));
                    break;
                case 73:
                    c0030a.b(73, typedArray.getDimensionPixelSize(index, aVar.e.h0));
                    break;
                case 74:
                    c0030a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0030a.d(75, typedArray.getBoolean(index, aVar.e.o0));
                    break;
                case 76:
                    c0030a.b(76, typedArray.getInt(index, aVar.d.e));
                    break;
                case 77:
                    c0030a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0030a.b(78, typedArray.getInt(index, aVar.c.c));
                    break;
                case 79:
                    c0030a.a(79, typedArray.getFloat(index, aVar.d.g));
                    break;
                case 80:
                    c0030a.d(80, typedArray.getBoolean(index, aVar.e.m0));
                    break;
                case 81:
                    c0030a.d(81, typedArray.getBoolean(index, aVar.e.n0));
                    break;
                case 82:
                    c0030a.b(82, typedArray.getInteger(index, aVar.d.c));
                    break;
                case 83:
                    c0030a.b(83, o(typedArray, index, aVar.f.i));
                    break;
                case 84:
                    c0030a.b(84, typedArray.getInteger(index, aVar.d.k));
                    break;
                case 85:
                    c0030a.a(85, typedArray.getFloat(index, aVar.d.j));
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        c0030a.b(89, aVar.d.n);
                        c cVar = aVar.d;
                        if (cVar.n != -1) {
                            cVar.m = -2;
                            c0030a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i3 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        c0030a.c(90, aVar.d.l);
                        if (aVar.d.l.indexOf(C0059ao.a(10576)) > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            c0030a.b(89, aVar.d.n);
                            aVar.d.m = -2;
                            c0030a.b(88, -2);
                            break;
                        } else {
                            aVar.d.m = -1;
                            c0030a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.d;
                        cVar2.m = typedArray.getInteger(index, cVar2.n);
                        c0030a.b(88, aVar.d.m);
                        break;
                    }
                case 87:
                    Log.w(a3, C0059ao.a(10575) + Integer.toHexString(index) + a2 + e.get(index));
                    break;
                case 93:
                    c0030a.b(93, typedArray.getDimensionPixelSize(index, aVar.e.M));
                    break;
                case 94:
                    c0030a.b(94, typedArray.getDimensionPixelSize(index, aVar.e.T));
                    break;
                case 95:
                    p(c0030a, typedArray, index, 0);
                    break;
                case 96:
                    p(c0030a, typedArray, index, 1);
                    break;
                case 97:
                    c0030a.b(97, typedArray.getInt(index, aVar.e.p0));
                    break;
                case 98:
                    if (d7.B0) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.a);
                        aVar.a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                        break;
                    }
                case 99:
                    c0030a.d(99, typedArray.getBoolean(index, aVar.e.h));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean z) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.c.containsKey(Integer.valueOf(id))) {
                Log.w(C0059ao.a(10579), C0059ao.a(10578) + u6.b(childAt));
            } else if (this.b && id == -1) {
                throw new RuntimeException(C0059ao.a(10580));
            } else {
                if (id != -1) {
                    if (this.c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.c.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.e.i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(aVar.e.g0);
                                barrier.setMargin(aVar.e.h0);
                                barrier.setAllowsGoneWidget(aVar.e.o0);
                                b bVar = aVar.e;
                                int[] iArr = bVar.j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.k0;
                                    if (str != null) {
                                        bVar.j0 = j(barrier, str);
                                        barrier.setReferencedIds(aVar.e.j0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.d(bVar2);
                            if (z) {
                                i7.e(childAt, aVar.g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.c;
                            if (dVar.c == 0) {
                                childAt.setVisibility(dVar.b);
                            }
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 17) {
                                childAt.setAlpha(aVar.c.d);
                                childAt.setRotation(aVar.f.b);
                                childAt.setRotationX(aVar.f.c);
                                childAt.setRotationY(aVar.f.d);
                                childAt.setScaleX(aVar.f.e);
                                childAt.setScaleY(aVar.f.f);
                                e eVar = aVar.f;
                                if (eVar.i != -1) {
                                    if (((View) childAt.getParent()).findViewById(aVar.f.i) != null) {
                                        float top = (findViewById.getTop() + findViewById.getBottom()) / 2.0f;
                                        float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
                                        if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                            childAt.setPivotX(left - childAt.getLeft());
                                            childAt.setPivotY(top - childAt.getTop());
                                        }
                                    }
                                } else {
                                    if (!Float.isNaN(eVar.g)) {
                                        childAt.setPivotX(aVar.f.g);
                                    }
                                    if (!Float.isNaN(aVar.f.h)) {
                                        childAt.setPivotY(aVar.f.h);
                                    }
                                }
                                childAt.setTranslationX(aVar.f.j);
                                childAt.setTranslationY(aVar.f.k);
                                if (i2 >= 21) {
                                    childAt.setTranslationZ(aVar.f.l);
                                    e eVar2 = aVar.f;
                                    if (eVar2.m) {
                                        childAt.setElevation(eVar2.n);
                                    }
                                }
                            }
                        }
                    } else {
                        String str2 = C0059ao.a(10581) + id;
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.c.get(num);
            if (aVar2 != null) {
                if (aVar2.e.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.e;
                    int[] iArr2 = bVar3.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = bVar3.k0;
                        if (str3 != null) {
                            bVar3.j0 = j(barrier2, str3);
                            barrier2.setReferencedIds(aVar2.e.j0);
                        }
                    }
                    barrier2.setType(aVar2.e.g0);
                    barrier2.setMargin(aVar2.e.h0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.s();
                    aVar2.d(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.e.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.d(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof j7) {
                ((j7) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(int i, int i2) {
        a aVar;
        if (!this.c.containsKey(Integer.valueOf(i)) || (aVar = this.c.get(Integer.valueOf(i))) == null) {
            return;
        }
        switch (i2) {
            case 1:
                b bVar = aVar.e;
                bVar.j = -1;
                bVar.i = -1;
                bVar.G = -1;
                bVar.N = RecyclerView.UNDEFINED_DURATION;
                return;
            case 2:
                b bVar2 = aVar.e;
                bVar2.l = -1;
                bVar2.k = -1;
                bVar2.H = -1;
                bVar2.P = RecyclerView.UNDEFINED_DURATION;
                return;
            case 3:
                b bVar3 = aVar.e;
                bVar3.n = -1;
                bVar3.m = -1;
                bVar3.I = 0;
                bVar3.O = RecyclerView.UNDEFINED_DURATION;
                return;
            case 4:
                b bVar4 = aVar.e;
                bVar4.o = -1;
                bVar4.p = -1;
                bVar4.J = 0;
                bVar4.Q = RecyclerView.UNDEFINED_DURATION;
                return;
            case 5:
                b bVar5 = aVar.e;
                bVar5.q = -1;
                bVar5.r = -1;
                bVar5.s = -1;
                bVar5.M = 0;
                bVar5.T = RecyclerView.UNDEFINED_DURATION;
                return;
            case 6:
                b bVar6 = aVar.e;
                bVar6.t = -1;
                bVar6.u = -1;
                bVar6.L = 0;
                bVar6.S = RecyclerView.UNDEFINED_DURATION;
                return;
            case 7:
                b bVar7 = aVar.e;
                bVar7.v = -1;
                bVar7.w = -1;
                bVar7.K = 0;
                bVar7.R = RecyclerView.UNDEFINED_DURATION;
                return;
            case 8:
                b bVar8 = aVar.e;
                bVar8.C = -1.0f;
                bVar8.B = -1;
                bVar8.A = -1;
                return;
            default:
                throw new IllegalArgumentException(C0059ao.a(10582));
        }
    }

    public void f(Context context, int i) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.b && id == -1) {
                throw new RuntimeException(C0059ao.a(10583));
            }
            if (!this.c.containsKey(Integer.valueOf(id))) {
                this.c.put(Integer.valueOf(id), new a());
            }
            a aVar = this.c.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.g = i7.a(this.a, childAt);
                aVar.f(id, bVar);
                aVar.c.b = childAt.getVisibility();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 17) {
                    aVar.c.d = childAt.getAlpha();
                    aVar.f.b = childAt.getRotation();
                    aVar.f.c = childAt.getRotationX();
                    aVar.f.d = childAt.getRotationY();
                    aVar.f.e = childAt.getScaleX();
                    aVar.f.f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar = aVar.f;
                        eVar.g = pivotX;
                        eVar.h = pivotY;
                    }
                    aVar.f.j = childAt.getTranslationX();
                    aVar.f.k = childAt.getTranslationY();
                    if (i2 >= 21) {
                        aVar.f.l = childAt.getTranslationZ();
                        e eVar2 = aVar.f;
                        if (eVar2.m) {
                            eVar2.n = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.e.o0 = barrier.getAllowsGoneWidget();
                    aVar.e.j0 = barrier.getReferencedIds();
                    aVar.e.g0 = barrier.getType();
                    aVar.e.h0 = barrier.getMargin();
                }
            }
        }
    }

    public void h(m7 m7Var) {
        int childCount = m7Var.getChildCount();
        this.c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = m7Var.getChildAt(i);
            m7.a aVar = (m7.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.b && id == -1) {
                throw new RuntimeException(C0059ao.a(10584));
            }
            if (!this.c.containsKey(Integer.valueOf(id))) {
                this.c.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.c.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof j7) {
                    aVar2.h((j7) childAt, id, aVar);
                }
                aVar2.g(id, aVar);
            }
        }
    }

    public void i(int i, int i2, int i3, float f2) {
        b bVar = l(i).e;
        bVar.A = i2;
        bVar.B = i3;
        bVar.C = f2;
    }

    public final int[] j(View view, String str) {
        int i;
        Object g;
        String[] split = str.split(C0059ao.a(10585));
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = p7.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, C0059ao.a(10586), context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (g = ((ConstraintLayout) view.getParent()).g(0, trim)) != null && (g instanceof Integer)) {
                i = ((Integer) g).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public final a k(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? q7.ConstraintOverride : q7.Constraint);
        s(context, aVar, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public final a l(int i) {
        if (!this.c.containsKey(Integer.valueOf(i))) {
            this.c.put(Integer.valueOf(i), new a());
        }
        return this.c.get(Integer.valueOf(i));
    }

    public void m(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a k = k(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase(C0059ao.a(10587))) {
                        k.e.a = true;
                    }
                    this.c.put(Integer.valueOf(k.a), k);
                    continue;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0217, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(android.content.Context r11, org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l7.n(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void s(Context context, a aVar, TypedArray typedArray, boolean z) {
        if (z) {
            t(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != q7.Constraint_android_id && q7.Constraint_android_layout_marginStart != index && q7.Constraint_android_layout_marginEnd != index) {
                aVar.d.a = true;
                aVar.e.b = true;
                aVar.c.a = true;
                aVar.f.a = true;
            }
            int i2 = e.get(index);
            String a2 = C0059ao.a(10603);
            String a3 = C0059ao.a(10604);
            switch (i2) {
                case 1:
                    b bVar = aVar.e;
                    bVar.q = o(typedArray, index, bVar.q);
                    break;
                case 2:
                    b bVar2 = aVar.e;
                    bVar2.J = typedArray.getDimensionPixelSize(index, bVar2.J);
                    break;
                case 3:
                    b bVar3 = aVar.e;
                    bVar3.p = o(typedArray, index, bVar3.p);
                    break;
                case 4:
                    b bVar4 = aVar.e;
                    bVar4.o = o(typedArray, index, bVar4.o);
                    break;
                case 5:
                    aVar.e.z = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.e;
                    bVar5.D = typedArray.getDimensionPixelOffset(index, bVar5.D);
                    break;
                case 7:
                    b bVar6 = aVar.e;
                    bVar6.E = typedArray.getDimensionPixelOffset(index, bVar6.E);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar7 = aVar.e;
                        bVar7.K = typedArray.getDimensionPixelSize(index, bVar7.K);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    b bVar8 = aVar.e;
                    bVar8.w = o(typedArray, index, bVar8.w);
                    break;
                case 10:
                    b bVar9 = aVar.e;
                    bVar9.v = o(typedArray, index, bVar9.v);
                    break;
                case 11:
                    b bVar10 = aVar.e;
                    bVar10.Q = typedArray.getDimensionPixelSize(index, bVar10.Q);
                    break;
                case 12:
                    b bVar11 = aVar.e;
                    bVar11.R = typedArray.getDimensionPixelSize(index, bVar11.R);
                    break;
                case 13:
                    b bVar12 = aVar.e;
                    bVar12.N = typedArray.getDimensionPixelSize(index, bVar12.N);
                    break;
                case 14:
                    b bVar13 = aVar.e;
                    bVar13.P = typedArray.getDimensionPixelSize(index, bVar13.P);
                    break;
                case 15:
                    b bVar14 = aVar.e;
                    bVar14.S = typedArray.getDimensionPixelSize(index, bVar14.S);
                    break;
                case 16:
                    b bVar15 = aVar.e;
                    bVar15.O = typedArray.getDimensionPixelSize(index, bVar15.O);
                    break;
                case 17:
                    b bVar16 = aVar.e;
                    bVar16.e = typedArray.getDimensionPixelOffset(index, bVar16.e);
                    break;
                case 18:
                    b bVar17 = aVar.e;
                    bVar17.f = typedArray.getDimensionPixelOffset(index, bVar17.f);
                    break;
                case 19:
                    b bVar18 = aVar.e;
                    bVar18.g = typedArray.getFloat(index, bVar18.g);
                    break;
                case 20:
                    b bVar19 = aVar.e;
                    bVar19.x = typedArray.getFloat(index, bVar19.x);
                    break;
                case 21:
                    b bVar20 = aVar.e;
                    bVar20.d = typedArray.getLayoutDimension(index, bVar20.d);
                    break;
                case 22:
                    d dVar = aVar.c;
                    dVar.b = typedArray.getInt(index, dVar.b);
                    d dVar2 = aVar.c;
                    dVar2.b = d[dVar2.b];
                    break;
                case 23:
                    b bVar21 = aVar.e;
                    bVar21.c = typedArray.getLayoutDimension(index, bVar21.c);
                    break;
                case 24:
                    b bVar22 = aVar.e;
                    bVar22.G = typedArray.getDimensionPixelSize(index, bVar22.G);
                    break;
                case IMediaSession.Stub.TRANSACTION_rate /* 25 */:
                    b bVar23 = aVar.e;
                    bVar23.i = o(typedArray, index, bVar23.i);
                    break;
                case IMediaSession.Stub.TRANSACTION_sendCustomAction /* 26 */:
                    b bVar24 = aVar.e;
                    bVar24.j = o(typedArray, index, bVar24.j);
                    break;
                case IMediaSession.Stub.TRANSACTION_getMetadata /* 27 */:
                    b bVar25 = aVar.e;
                    bVar25.F = typedArray.getInt(index, bVar25.F);
                    break;
                case IMediaSession.Stub.TRANSACTION_getPlaybackState /* 28 */:
                    b bVar26 = aVar.e;
                    bVar26.H = typedArray.getDimensionPixelSize(index, bVar26.H);
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueue /* 29 */:
                    b bVar27 = aVar.e;
                    bVar27.k = o(typedArray, index, bVar27.k);
                    break;
                case IMediaSession.Stub.TRANSACTION_getQueueTitle /* 30 */:
                    b bVar28 = aVar.e;
                    bVar28.l = o(typedArray, index, bVar28.l);
                    break;
                case IMediaSession.Stub.TRANSACTION_getExtras /* 31 */:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar29 = aVar.e;
                        bVar29.L = typedArray.getDimensionPixelSize(index, bVar29.L);
                        break;
                    } else {
                        break;
                    }
                case 32:
                    b bVar30 = aVar.e;
                    bVar30.t = o(typedArray, index, bVar30.t);
                    break;
                case IMediaSession.Stub.TRANSACTION_prepare /* 33 */:
                    b bVar31 = aVar.e;
                    bVar31.u = o(typedArray, index, bVar31.u);
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromMediaId /* 34 */:
                    b bVar32 = aVar.e;
                    bVar32.I = typedArray.getDimensionPixelSize(index, bVar32.I);
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromSearch /* 35 */:
                    b bVar33 = aVar.e;
                    bVar33.n = o(typedArray, index, bVar33.n);
                    break;
                case IMediaSession.Stub.TRANSACTION_prepareFromUri /* 36 */:
                    b bVar34 = aVar.e;
                    bVar34.m = o(typedArray, index, bVar34.m);
                    break;
                case IMediaSession.Stub.TRANSACTION_getRepeatMode /* 37 */:
                    b bVar35 = aVar.e;
                    bVar35.y = typedArray.getFloat(index, bVar35.y);
                    break;
                case IMediaSession.Stub.TRANSACTION_isShuffleModeEnabledRemoved /* 38 */:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    break;
                case IMediaSession.Stub.TRANSACTION_setRepeatMode /* 39 */:
                    b bVar36 = aVar.e;
                    bVar36.V = typedArray.getFloat(index, bVar36.V);
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleModeEnabledRemoved /* 40 */:
                    b bVar37 = aVar.e;
                    bVar37.U = typedArray.getFloat(index, bVar37.U);
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItem /* 41 */:
                    b bVar38 = aVar.e;
                    bVar38.W = typedArray.getInt(index, bVar38.W);
                    break;
                case IMediaSession.Stub.TRANSACTION_addQueueItemAt /* 42 */:
                    b bVar39 = aVar.e;
                    bVar39.X = typedArray.getInt(index, bVar39.X);
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItem /* 43 */:
                    d dVar3 = aVar.c;
                    dVar3.d = typedArray.getFloat(index, dVar3.d);
                    break;
                case IMediaSession.Stub.TRANSACTION_removeQueueItemAt /* 44 */:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar = aVar.f;
                        eVar.m = true;
                        eVar.n = typedArray.getDimension(index, eVar.n);
                        break;
                    } else {
                        break;
                    }
                case IMediaSession.Stub.TRANSACTION_isCaptioningEnabled /* 45 */:
                    e eVar2 = aVar.f;
                    eVar2.c = typedArray.getFloat(index, eVar2.c);
                    break;
                case IMediaSession.Stub.TRANSACTION_setCaptioningEnabled /* 46 */:
                    e eVar3 = aVar.f;
                    eVar3.d = typedArray.getFloat(index, eVar3.d);
                    break;
                case IMediaSession.Stub.TRANSACTION_getShuffleMode /* 47 */:
                    e eVar4 = aVar.f;
                    eVar4.e = typedArray.getFloat(index, eVar4.e);
                    break;
                case IMediaSession.Stub.TRANSACTION_setShuffleMode /* 48 */:
                    e eVar5 = aVar.f;
                    eVar5.f = typedArray.getFloat(index, eVar5.f);
                    break;
                case IMediaSession.Stub.TRANSACTION_setPlaybackSpeed /* 49 */:
                    e eVar6 = aVar.f;
                    eVar6.g = typedArray.getDimension(index, eVar6.g);
                    break;
                case IMediaSession.Stub.TRANSACTION_getSessionInfo /* 50 */:
                    e eVar7 = aVar.f;
                    eVar7.h = typedArray.getDimension(index, eVar7.h);
                    break;
                case IMediaSession.Stub.TRANSACTION_rateWithExtras /* 51 */:
                    e eVar8 = aVar.f;
                    eVar8.j = typedArray.getDimension(index, eVar8.j);
                    break;
                case 52:
                    e eVar9 = aVar.f;
                    eVar9.k = typedArray.getDimension(index, eVar9.k);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar10 = aVar.f;
                        eVar10.l = typedArray.getDimension(index, eVar10.l);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    b bVar40 = aVar.e;
                    bVar40.Y = typedArray.getInt(index, bVar40.Y);
                    break;
                case 55:
                    b bVar41 = aVar.e;
                    bVar41.Z = typedArray.getInt(index, bVar41.Z);
                    break;
                case 56:
                    b bVar42 = aVar.e;
                    bVar42.a0 = typedArray.getDimensionPixelSize(index, bVar42.a0);
                    break;
                case 57:
                    b bVar43 = aVar.e;
                    bVar43.b0 = typedArray.getDimensionPixelSize(index, bVar43.b0);
                    break;
                case 58:
                    b bVar44 = aVar.e;
                    bVar44.c0 = typedArray.getDimensionPixelSize(index, bVar44.c0);
                    break;
                case 59:
                    b bVar45 = aVar.e;
                    bVar45.d0 = typedArray.getDimensionPixelSize(index, bVar45.d0);
                    break;
                case 60:
                    e eVar11 = aVar.f;
                    eVar11.b = typedArray.getFloat(index, eVar11.b);
                    break;
                case 61:
                    b bVar46 = aVar.e;
                    bVar46.A = o(typedArray, index, bVar46.A);
                    break;
                case 62:
                    b bVar47 = aVar.e;
                    bVar47.B = typedArray.getDimensionPixelSize(index, bVar47.B);
                    break;
                case 63:
                    b bVar48 = aVar.e;
                    bVar48.C = typedArray.getFloat(index, bVar48.C);
                    break;
                case 64:
                    c cVar = aVar.d;
                    cVar.b = o(typedArray, index, cVar.b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.d.d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.d.d = h5.c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.d.f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.d;
                    cVar2.i = typedArray.getFloat(index, cVar2.i);
                    break;
                case 68:
                    d dVar4 = aVar.c;
                    dVar4.e = typedArray.getFloat(index, dVar4.e);
                    break;
                case 69:
                    aVar.e.e0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.e.f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e(a3, C0059ao.a(10608));
                    break;
                case 72:
                    b bVar49 = aVar.e;
                    bVar49.g0 = typedArray.getInt(index, bVar49.g0);
                    break;
                case 73:
                    b bVar50 = aVar.e;
                    bVar50.h0 = typedArray.getDimensionPixelSize(index, bVar50.h0);
                    break;
                case 74:
                    aVar.e.k0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.e;
                    bVar51.o0 = typedArray.getBoolean(index, bVar51.o0);
                    break;
                case 76:
                    c cVar3 = aVar.d;
                    cVar3.e = typedArray.getInt(index, cVar3.e);
                    break;
                case 77:
                    aVar.e.l0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.c;
                    dVar5.c = typedArray.getInt(index, dVar5.c);
                    break;
                case 79:
                    c cVar4 = aVar.d;
                    cVar4.g = typedArray.getFloat(index, cVar4.g);
                    break;
                case 80:
                    b bVar52 = aVar.e;
                    bVar52.m0 = typedArray.getBoolean(index, bVar52.m0);
                    break;
                case 81:
                    b bVar53 = aVar.e;
                    bVar53.n0 = typedArray.getBoolean(index, bVar53.n0);
                    break;
                case 82:
                    c cVar5 = aVar.d;
                    cVar5.c = typedArray.getInteger(index, cVar5.c);
                    break;
                case 83:
                    e eVar12 = aVar.f;
                    eVar12.i = o(typedArray, index, eVar12.i);
                    break;
                case 84:
                    c cVar6 = aVar.d;
                    cVar6.k = typedArray.getInteger(index, cVar6.k);
                    break;
                case 85:
                    c cVar7 = aVar.d;
                    cVar7.j = typedArray.getFloat(index, cVar7.j);
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.d;
                        if (cVar8.n != -1) {
                            cVar8.m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i3 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        if (aVar.d.l.indexOf(C0059ao.a(10607)) > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            aVar.d.m = -2;
                            break;
                        } else {
                            aVar.d.m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.d;
                        cVar9.m = typedArray.getInteger(index, cVar9.n);
                        break;
                    }
                case 87:
                    Log.w(a3, C0059ao.a(10606) + Integer.toHexString(index) + a2 + e.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w(a3, C0059ao.a(10605) + Integer.toHexString(index) + a2 + e.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.e;
                    bVar54.r = o(typedArray, index, bVar54.r);
                    break;
                case 92:
                    b bVar55 = aVar.e;
                    bVar55.s = o(typedArray, index, bVar55.s);
                    break;
                case 93:
                    b bVar56 = aVar.e;
                    bVar56.M = typedArray.getDimensionPixelSize(index, bVar56.M);
                    break;
                case 94:
                    b bVar57 = aVar.e;
                    bVar57.T = typedArray.getDimensionPixelSize(index, bVar57.T);
                    break;
                case 95:
                    p(aVar.e, typedArray, index, 0);
                    break;
                case 96:
                    p(aVar.e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.e;
                    bVar58.p0 = typedArray.getInt(index, bVar58.p0);
                    break;
            }
        }
        b bVar59 = aVar.e;
        if (bVar59.k0 != null) {
            bVar59.j0 = null;
        }
    }
}
