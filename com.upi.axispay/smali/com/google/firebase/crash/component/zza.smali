.class public final synthetic Lcom/google/firebase/crash/component/zza;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/google/firebase/components/ComponentFactory;


# static fields
.field public static final zzaj:Lcom/google/firebase/components/ComponentFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/crash/component/zza;

    invoke-direct {v0}, Lcom/google/firebase/crash/component/zza;-><init>()V

    sput-object v0, Lcom/google/firebase/crash/component/zza;->zzaj:Lcom/google/firebase/components/ComponentFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/google/firebase/components/ComponentContainer;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/firebase/crash/FirebaseCrash;

    const-class v1, Lcom/google/firebase/FirebaseApp;

    .line 2
    invoke-interface {p1, v1}, Lcom/google/firebase/components/ComponentContainer;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/FirebaseApp;

    const-class v2, Lcom/google/firebase/events/Subscriber;

    invoke-interface {p1, v2}, Lcom/google/firebase/components/ComponentContainer;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/events/Subscriber;

    invoke-direct {v0, v1, p1}, Lcom/google/firebase/crash/FirebaseCrash;-><init>(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/events/Subscriber;)V

    return-object v0
.end method
