.class public final synthetic Lcom/google/firebase/iid/zzp;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field private final zzbb:Lcom/google/firebase/iid/FirebaseInstanceId;

.field private final zzbc:Ljava/lang/String;

.field private final zzbd:Ljava/lang/String;

.field private final zzbe:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzp;->zzbb:Lcom/google/firebase/iid/FirebaseInstanceId;

    iput-object p2, p0, Lcom/google/firebase/iid/zzp;->zzbc:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/iid/zzp;->zzbd:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/iid/zzp;->zzbe:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/iid/zzp;->zzbb:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-object v1, p0, Lcom/google/firebase/iid/zzp;->zzbc:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/iid/zzp;->zzbd:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/iid/zzp;->zzbe:Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/firebase/iid/FirebaseInstanceId;->zzb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
