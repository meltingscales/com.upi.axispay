.class public final Lcom/google/android/gms/internal/measurement/zzgr;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field private static final zzajr:Lcom/google/android/gms/internal/measurement/zzgp;

.field private static final zzajs:Lcom/google/android/gms/internal/measurement/zzgp;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzgr;->zzny()Lcom/google/android/gms/internal/measurement/zzgp;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzgr;->zzajr:Lcom/google/android/gms/internal/measurement/zzgp;

    .line 2
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzgq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzgq;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzgr;->zzajs:Lcom/google/android/gms/internal/measurement/zzgp;

    return-void
.end method

.method public static zznw()Lcom/google/android/gms/internal/measurement/zzgp;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzgr;->zzajr:Lcom/google/android/gms/internal/measurement/zzgp;

    return-object v0
.end method

.method public static zznx()Lcom/google/android/gms/internal/measurement/zzgp;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzgr;->zzajs:Lcom/google/android/gms/internal/measurement/zzgp;

    return-object v0
.end method

.method private static zzny()Lcom/google/android/gms/internal/measurement/zzgp;
    .locals 3

    :try_start_0
    const-string v0, "com.google.protobuf.NewInstanceSchemaFull"

    .line 1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    .line 2
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzgp;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
