.class public Lcom/google/android/gms/vision/face/Face;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final UNCOMPUTED_PROBABILITY:F = -1.0f


# instance fields
.field private zza:I

.field private zzb:Landroid/graphics/PointF;

.field private zzc:F

.field private zzd:F

.field private zze:F

.field private zzf:F

.field private zzg:F

.field private zzh:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/vision/face/Landmark;",
            ">;"
        }
    .end annotation
.end field

.field private final zzi:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/vision/face/Contour;",
            ">;"
        }
    .end annotation
.end field

.field private zzj:F

.field private zzk:F

.field private zzl:F

.field private final zzm:F


# direct methods
.method public constructor <init>(ILandroid/graphics/PointF;FFFFF[Lcom/google/android/gms/vision/face/Landmark;[Lcom/google/android/gms/vision/face/Contour;FFFF)V
    .locals 0
    .param p2    # Landroid/graphics/PointF;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .param p8    # [Lcom/google/android/gms/vision/face/Landmark;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param
    .param p9    # [Lcom/google/android/gms/vision/face/Contour;
        .annotation build Landroidx/annotation/RecentlyNonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/google/android/gms/vision/face/Face;->zza:I

    .line 3
    iput-object p2, p0, Lcom/google/android/gms/vision/face/Face;->zzb:Landroid/graphics/PointF;

    .line 4
    iput p3, p0, Lcom/google/android/gms/vision/face/Face;->zzc:F

    .line 5
    iput p4, p0, Lcom/google/android/gms/vision/face/Face;->zzd:F

    .line 6
    iput p5, p0, Lcom/google/android/gms/vision/face/Face;->zze:F

    .line 7
    iput p6, p0, Lcom/google/android/gms/vision/face/Face;->zzf:F

    .line 8
    iput p7, p0, Lcom/google/android/gms/vision/face/Face;->zzg:F

    .line 9
    invoke-static {p8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/vision/face/Face;->zzh:Ljava/util/List;

    .line 10
    invoke-static {p9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/vision/face/Face;->zzi:Ljava/util/List;

    .line 11
    invoke-static {p10}, Lcom/google/android/gms/vision/face/Face;->zza(F)F

    move-result p1

    iput p1, p0, Lcom/google/android/gms/vision/face/Face;->zzj:F

    .line 12
    invoke-static {p11}, Lcom/google/android/gms/vision/face/Face;->zza(F)F

    move-result p1

    iput p1, p0, Lcom/google/android/gms/vision/face/Face;->zzk:F

    .line 13
    invoke-static {p12}, Lcom/google/android/gms/vision/face/Face;->zza(F)F

    move-result p1

    iput p1, p0, Lcom/google/android/gms/vision/face/Face;->zzl:F

    .line 14
    invoke-static {p13}, Lcom/google/android/gms/vision/face/Face;->zza(F)F

    move-result p1

    iput p1, p0, Lcom/google/android/gms/vision/face/Face;->zzm:F

    return-void
.end method

.method private static zza(F)F
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    return p0

    :cond_0
    const/high16 p0, -0x40800000    # -1.0f

    return p0
.end method


# virtual methods
.method public getContours()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/vision/face/Contour;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/vision/face/Face;->zzi:Ljava/util/List;

    return-object v0
.end method

.method public getEulerX()F
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zzg:F

    return v0
.end method

.method public getEulerY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zze:F

    return v0
.end method

.method public getEulerZ()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zzf:F

    return v0
.end method

.method public getHeight()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zzd:F

    return v0
.end method

.method public getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zza:I

    return v0
.end method

.method public getIsLeftEyeOpenProbability()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zzj:F

    return v0
.end method

.method public getIsRightEyeOpenProbability()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zzk:F

    return v0
.end method

.method public getIsSmilingProbability()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zzl:F

    return v0
.end method

.method public getLandmarks()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/vision/face/Landmark;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/vision/face/Face;->zzh:Ljava/util/List;

    return-object v0
.end method

.method public getPosition()Landroid/graphics/PointF;
    .locals 5
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/google/android/gms/vision/face/Face;->zzb:Landroid/graphics/PointF;

    iget v2, v1, Landroid/graphics/PointF;->x:F

    iget v3, p0, Lcom/google/android/gms/vision/face/Face;->zzc:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    sub-float/2addr v2, v3

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget v3, p0, Lcom/google/android/gms/vision/face/Face;->zzd:F

    div-float/2addr v3, v4

    sub-float/2addr v1, v3

    invoke-direct {v0, v2, v1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v0
.end method

.method public getWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/vision/face/Face;->zzc:F

    return v0
.end method
