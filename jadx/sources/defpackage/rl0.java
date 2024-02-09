package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* compiled from: AxisPay */
/* renamed from: rl0  reason: default package */
/* loaded from: classes.dex */
public abstract class rl0 implements vm0, Serializable {
    public static final Object NO_RECEIVER = a.b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private transient vm0 reflected;
    private final String signature;

    /* compiled from: AxisPay */
    /* renamed from: rl0$a */
    /* loaded from: classes.dex */
    public static class a implements Serializable {
        public static final a b = new a();
    }

    public rl0() {
        this(NO_RECEIVER);
    }

    @Override // defpackage.vm0
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.vm0
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public vm0 compute() {
        vm0 vm0Var = this.reflected;
        if (vm0Var == null) {
            vm0 computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return vm0Var;
    }

    public abstract vm0 computeReflected();

    @Override // defpackage.um0
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public xm0 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? km0.b(cls) : km0.a(cls);
    }

    @Override // defpackage.vm0
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public vm0 getReflected() {
        vm0 compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new rk0();
    }

    @Override // defpackage.vm0
    public dn0 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.vm0
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.vm0
    public en0 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.vm0
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.vm0
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.vm0
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.vm0
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public rl0(Object obj) {
        this(obj, null, null, null, false);
    }

    public rl0(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
