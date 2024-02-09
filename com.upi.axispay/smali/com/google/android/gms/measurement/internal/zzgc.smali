.class public final Lcom/google/android/gms/measurement/internal/zzgc;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final name:Ljava/lang/String;

.field public final origin:Ljava/lang/String;

.field public final value:Ljava/lang/Object;

.field public final zzcf:Ljava/lang/String;

.field public final zzsx:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    invoke-static {p3}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    invoke-static {p6}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzgc;->zzcf:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzgc;->origin:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzgc;->name:Ljava/lang/String;

    .line 8
    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/zzgc;->zzsx:J

    .line 9
    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/zzgc;->value:Ljava/lang/Object;

    return-void
.end method
