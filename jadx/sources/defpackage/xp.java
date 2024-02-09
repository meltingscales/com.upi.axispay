package defpackage;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.io.IOException;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: xp  reason: default package */
/* loaded from: classes.dex */
public final class xp implements Configurator {
    public static final Configurator a = new xp();

    /* compiled from: AxisPay */
    /* renamed from: xp$a */
    /* loaded from: classes.dex */
    public static final class a implements ObjectEncoder<kr> {
        public static final a a = new a();
        public static final FieldDescriptor b = FieldDescriptor.builder(C0059ao.a(5861)).withProperty(AtProtobuf.builder().tag(1).build()).build();
        public static final FieldDescriptor c = FieldDescriptor.builder(C0059ao.a(5862)).withProperty(AtProtobuf.builder().tag(2).build()).build();
        public static final FieldDescriptor d = FieldDescriptor.builder(C0059ao.a(5863)).withProperty(AtProtobuf.builder().tag(3).build()).build();
        public static final FieldDescriptor e = FieldDescriptor.builder(C0059ao.a(5864)).withProperty(AtProtobuf.builder().tag(4).build()).build();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a */
        public void encode(kr krVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, krVar.d());
            objectEncoderContext.add(c, krVar.c());
            objectEncoderContext.add(d, krVar.b());
            objectEncoderContext.add(e, krVar.a());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xp$b */
    /* loaded from: classes.dex */
    public static final class b implements ObjectEncoder<lr> {
        public static final b a = new b();
        public static final FieldDescriptor b = FieldDescriptor.builder(C0059ao.a(5831)).withProperty(AtProtobuf.builder().tag(1).build()).build();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a */
        public void encode(lr lrVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, lrVar.a());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xp$c */
    /* loaded from: classes.dex */
    public static final class c implements ObjectEncoder<mr> {
        public static final c a = new c();
        public static final FieldDescriptor b = FieldDescriptor.builder(C0059ao.a(6134)).withProperty(AtProtobuf.builder().tag(1).build()).build();
        public static final FieldDescriptor c = FieldDescriptor.builder(C0059ao.a(6135)).withProperty(AtProtobuf.builder().tag(3).build()).build();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a */
        public void encode(mr mrVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, mrVar.a());
            objectEncoderContext.add(c, mrVar.b());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xp$d */
    /* loaded from: classes.dex */
    public static final class d implements ObjectEncoder<nr> {
        public static final d a = new d();
        public static final FieldDescriptor b = FieldDescriptor.builder(C0059ao.a(6077)).withProperty(AtProtobuf.builder().tag(1).build()).build();
        public static final FieldDescriptor c = FieldDescriptor.builder(C0059ao.a(6078)).withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a */
        public void encode(nr nrVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, nrVar.b());
            objectEncoderContext.add(c, nrVar.a());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xp$e */
    /* loaded from: classes.dex */
    public static final class e implements ObjectEncoder<iq> {
        public static final e a = new e();
        public static final FieldDescriptor b = FieldDescriptor.of(C0059ao.a(5999));

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a */
        public void encode(iq iqVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, iqVar.b());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xp$f */
    /* loaded from: classes.dex */
    public static final class f implements ObjectEncoder<or> {
        public static final f a = new f();
        public static final FieldDescriptor b = FieldDescriptor.builder(C0059ao.a(5983)).withProperty(AtProtobuf.builder().tag(1).build()).build();
        public static final FieldDescriptor c = FieldDescriptor.builder(C0059ao.a(5984)).withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a */
        public void encode(or orVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, orVar.a());
            objectEncoderContext.add(c, orVar.b());
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: xp$g */
    /* loaded from: classes.dex */
    public static final class g implements ObjectEncoder<pr> {
        public static final g a = new g();
        public static final FieldDescriptor b = FieldDescriptor.builder(C0059ao.a(6211)).withProperty(AtProtobuf.builder().tag(1).build()).build();
        public static final FieldDescriptor c = FieldDescriptor.builder(C0059ao.a(6212)).withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a */
        public void encode(pr prVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, prVar.b());
            objectEncoderContext.add(c, prVar.a());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(iq.class, e.a);
        encoderConfig.registerEncoder(kr.class, a.a);
        encoderConfig.registerEncoder(pr.class, g.a);
        encoderConfig.registerEncoder(nr.class, d.a);
        encoderConfig.registerEncoder(mr.class, c.a);
        encoderConfig.registerEncoder(lr.class, b.a);
        encoderConfig.registerEncoder(or.class, f.a);
    }
}
