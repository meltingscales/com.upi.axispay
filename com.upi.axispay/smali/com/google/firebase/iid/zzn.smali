.class public final synthetic Lcom/google/firebase/iid/zzn;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/google/firebase/iid/zzat;


# instance fields
.field private final zzbb:Lcom/google/firebase/iid/FirebaseInstanceId;

.field private final zzbc:Ljava/lang/String;

.field private final zzbd:Ljava/lang/String;

.field private final zzbe:Ljava/lang/String;

.field private final zzbf:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzn;->zzbb:Lcom/google/firebase/iid/FirebaseInstanceId;

    iput-object p2, p0, Lcom/google/firebase/iid/zzn;->zzbc:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/iid/zzn;->zzbd:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/firebase/iid/zzn;->zzbe:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/firebase/iid/zzn;->zzbf:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zzs()Lcom/google/android/gms/tasks/Task;
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/iid/zzn;->zzbb:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-object v1, p0, Lcom/google/firebase/iid/zzn;->zzbc:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/iid/zzn;->zzbd:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/iid/zzn;->zzbe:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/firebase/iid/zzn;->zzbf:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/firebase/iid/FirebaseInstanceId;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
