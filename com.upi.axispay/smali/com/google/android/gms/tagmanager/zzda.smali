.class public final Lcom/google/android/gms/tagmanager/zzda;
.super Landroid/util/LruCache;
.source "AxisPay"


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/tagmanager/zzr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tagmanager/zzdb;ILcom/google/android/gms/tagmanager/zzr;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/zzda;->zza:Lcom/google/android/gms/tagmanager/zzr;

    const/high16 p1, 0x100000

    .line 1
    invoke-direct {p0, p1}, Landroid/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzda;->zza:Lcom/google/android/gms/tagmanager/zzr;

    .line 1
    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/tagmanager/zzr;->zza(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
