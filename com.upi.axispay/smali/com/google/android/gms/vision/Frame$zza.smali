.class public final Lcom/google/android/gms/vision/Frame$zza;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/Frame;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zza"
.end annotation


# instance fields
.field private final zza:[Landroid/media/Image$Plane;


# direct methods
.method public constructor <init>([Landroid/media/Image$Plane;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/google/android/gms/vision/Frame$zza;->zza:[Landroid/media/Image$Plane;

    return-void
.end method


# virtual methods
.method public final zza()[Landroid/media/Image$Plane;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/vision/Frame$zza;->zza:[Landroid/media/Image$Plane;

    return-object v0
.end method
