.class public Lcom/google/android/gms/vision/Frame$Metadata;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/Frame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Metadata"
.end annotation


# instance fields
.field private zza:I

.field private zzb:I

.field private zzc:I

.field private zzd:J

.field private zze:I

.field private zzf:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzf:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/vision/Frame$Metadata;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/vision/Frame$Metadata;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzf:I

    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame$Metadata;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zza:I

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame$Metadata;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzb:I

    .line 7
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame$Metadata;->getId()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzc:I

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame$Metadata;->getTimestampMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzd:J

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame$Metadata;->getRotation()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zze:I

    .line 10
    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame$Metadata;->getFormat()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzf:I

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/vision/Frame$Metadata;I)I
    .locals 0

    .line 6
    iput p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zza:I

    return p1
.end method

.method public static synthetic zza(Lcom/google/android/gms/vision/Frame$Metadata;J)J
    .locals 0

    .line 7
    iput-wide p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzd:J

    return-wide p1
.end method

.method public static synthetic zzb(Lcom/google/android/gms/vision/Frame$Metadata;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzb:I

    return p1
.end method

.method public static synthetic zzc(Lcom/google/android/gms/vision/Frame$Metadata;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzf:I

    return p1
.end method

.method public static synthetic zzd(Lcom/google/android/gms/vision/Frame$Metadata;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzc:I

    return p1
.end method

.method public static synthetic zze(Lcom/google/android/gms/vision/Frame$Metadata;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zze:I

    return p1
.end method


# virtual methods
.method public getFormat()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzf:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzb:I

    return v0
.end method

.method public getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzc:I

    return v0
.end method

.method public getRotation()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zze:I

    return v0
.end method

.method public getTimestampMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzd:J

    return-wide v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zza:I

    return v0
.end method

.method public final zza()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zze:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zza:I

    .line 3
    iget v1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzb:I

    iput v1, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zza:I

    .line 4
    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zzb:I

    :cond_0
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/android/gms/vision/Frame$Metadata;->zze:I

    return-void
.end method
