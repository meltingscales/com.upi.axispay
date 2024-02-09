.class public final Lcom/google/android/gms/internal/measurement/zzdm;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public zzabs:I

.field public zzabt:J

.field public zzabu:Ljava/lang/Object;

.field public final zzabv:Lcom/google/android/gms/internal/measurement/zzem;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzem;->zzls()Lcom/google/android/gms/internal/measurement/zzem;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdm;->zzabv:Lcom/google/android/gms/internal/measurement/zzem;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzem;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdm;->zzabv:Lcom/google/android/gms/internal/measurement/zzem;

    return-void
.end method
