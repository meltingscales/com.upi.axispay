package defpackage;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: ip  reason: default package */
/* loaded from: classes.dex */
public final class ip implements Configurator {
    public static final Configurator a = new ip();

    /* compiled from: AxisPay */
    /* renamed from: ip$a */
    /* loaded from: classes.dex */
    public static final class a implements ObjectEncoder<hp> {
        public static final a a = new a();
        public static final FieldDescriptor b = FieldDescriptor.of(C0059ao.a(10149));
        public static final FieldDescriptor c = FieldDescriptor.of(C0059ao.a(10150));
        public static final FieldDescriptor d = FieldDescriptor.of(C0059ao.a(10151));
        public static final FieldDescriptor e = FieldDescriptor.of(C0059ao.a(10152));
        public static final FieldDescriptor f = FieldDescriptor.of(C0059ao.a(10153));
        public static final FieldDescriptor g = FieldDescriptor.of(C0059ao.a(10154));
        public static final FieldDescriptor h = FieldDescriptor.of(C0059ao.a(10155));
        public static final FieldDescriptor i = FieldDescriptor.of(C0059ao.a(10156));
        public static final FieldDescriptor j = FieldDescriptor.of(C0059ao.a(10157));
        public static final FieldDescriptor k = FieldDescriptor.of(C0059ao.a(10158));
        public static final FieldDescriptor l = FieldDescriptor.of(C0059ao.a(10159));
        public static final FieldDescriptor m = FieldDescriptor.of(C0059ao.a(10160));

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a */
        public void encode(hp hpVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, hpVar.m());
            objectEncoderContext.add(c, hpVar.j());
            objectEncoderContext.add(d, hpVar.f());
            objectEncoderContext.add(e, hpVar.d());
            objectEncoderContext.add(f, hpVar.l());
            objectEncoderContext.add(g, hpVar.k());
            objectEncoderContext.add(h, hpVar.h());
            objectEncoderContext.add(i, hpVar.e());
            objectEncoderContext.add(j, hpVar.g());
            objectEncoderContext.add(k, hpVar.c());
            objectEncoderContext.add(l, hpVar.i());
            objectEncoderContext.add(m, hpVar.b());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ip$b */
    /* loaded from: classes.dex */
    public static final class b implements ObjectEncoder<qp> {
        public static final b a = new b();
        public static final FieldDescriptor b = FieldDescriptor.of(C0059ao.a(10088));

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a */
        public void encode(qp qpVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, qpVar.c());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ip$c */
    /* loaded from: classes.dex */
    public static final class c implements ObjectEncoder<rp> {
        public static final c a = new c();
        public static final FieldDescriptor b = FieldDescriptor.of(C0059ao.a(14163));
        public static final FieldDescriptor c = FieldDescriptor.of(C0059ao.a(14164));

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a */
        public void encode(rp rpVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, rpVar.c());
            objectEncoderContext.add(c, rpVar.b());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ip$d */
    /* loaded from: classes.dex */
    public static final class d implements ObjectEncoder<sp> {
        public static final d a = new d();
        public static final FieldDescriptor b = FieldDescriptor.of(C0059ao.a(14154));
        public static final FieldDescriptor c = FieldDescriptor.of(C0059ao.a(14155));
        public static final FieldDescriptor d = FieldDescriptor.of(C0059ao.a(14156));
        public static final FieldDescriptor e = FieldDescriptor.of(C0059ao.a(14157));
        public static final FieldDescriptor f = FieldDescriptor.of(C0059ao.a(14158));
        public static final FieldDescriptor g = FieldDescriptor.of(C0059ao.a(14159));
        public static final FieldDescriptor h = FieldDescriptor.of(C0059ao.a(14160));

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a */
        public void encode(sp spVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, spVar.c());
            objectEncoderContext.add(c, spVar.b());
            objectEncoderContext.add(d, spVar.d());
            objectEncoderContext.add(e, spVar.f());
            objectEncoderContext.add(f, spVar.g());
            objectEncoderContext.add(g, spVar.h());
            objectEncoderContext.add(h, spVar.e());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ip$e */
    /* loaded from: classes.dex */
    public static final class e implements ObjectEncoder<tp> {
        public static final e a = new e();
        public static final FieldDescriptor b = FieldDescriptor.of(C0059ao.a(14201));
        public static final FieldDescriptor c = FieldDescriptor.of(C0059ao.a(14202));
        public static final FieldDescriptor d = FieldDescriptor.of(C0059ao.a(14203));
        public static final FieldDescriptor e = FieldDescriptor.of(C0059ao.a(14204));
        public static final FieldDescriptor f = FieldDescriptor.of(C0059ao.a(14205));
        public static final FieldDescriptor g = FieldDescriptor.of(C0059ao.a(14206));
        public static final FieldDescriptor h = FieldDescriptor.of(C0059ao.a(14207));

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a */
        public void encode(tp tpVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, tpVar.g());
            objectEncoderContext.add(c, tpVar.h());
            objectEncoderContext.add(d, tpVar.b());
            objectEncoderContext.add(e, tpVar.d());
            objectEncoderContext.add(f, tpVar.e());
            objectEncoderContext.add(g, tpVar.c());
            objectEncoderContext.add(h, tpVar.f());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: ip$f */
    /* loaded from: classes.dex */
    public static final class f implements ObjectEncoder<vp> {
        public static final f a = new f();
        public static final FieldDescriptor b = FieldDescriptor.of(C0059ao.a(14172));
        public static final FieldDescriptor c = FieldDescriptor.of(C0059ao.a(14173));

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a */
        public void encode(vp vpVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, vpVar.c());
            objectEncoderContext.add(c, vpVar.b());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        b bVar = b.a;
        encoderConfig.registerEncoder(qp.class, bVar);
        encoderConfig.registerEncoder(kp.class, bVar);
        e eVar = e.a;
        encoderConfig.registerEncoder(tp.class, eVar);
        encoderConfig.registerEncoder(np.class, eVar);
        c cVar = c.a;
        encoderConfig.registerEncoder(rp.class, cVar);
        encoderConfig.registerEncoder(lp.class, cVar);
        a aVar = a.a;
        encoderConfig.registerEncoder(hp.class, aVar);
        encoderConfig.registerEncoder(jp.class, aVar);
        d dVar = d.a;
        encoderConfig.registerEncoder(sp.class, dVar);
        encoderConfig.registerEncoder(mp.class, dVar);
        f fVar = f.a;
        encoderConfig.registerEncoder(vp.class, fVar);
        encoderConfig.registerEncoder(pp.class, fVar);
    }
}
