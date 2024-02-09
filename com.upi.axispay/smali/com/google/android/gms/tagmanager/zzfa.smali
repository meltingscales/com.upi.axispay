.class public final Lcom/google/android/gms/tagmanager/zzfa;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/tagmanager/zzff;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tagmanager/zzff;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzfa;->zza:Lcom/google/android/gms/tagmanager/zzff;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfa;->zza:Lcom/google/android/gms/tagmanager/zzff;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzff;->zze(Lcom/google/android/gms/tagmanager/zzff;)Lcom/google/android/gms/tagmanager/zzcd;

    move-result-object v0

    .line 1
    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/zzcd;->zza()V

    return-void
.end method
