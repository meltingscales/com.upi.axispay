.class public final synthetic Lcom/google/firebase/iid/zzaf;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private final zzcj:Lcom/google/firebase/iid/zzac;


# direct methods
.method public constructor <init>(Lcom/google/firebase/iid/zzac;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzaf;->zzcj:Lcom/google/firebase/iid/zzac;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/iid/zzaf;->zzcj:Lcom/google/firebase/iid/zzac;

    invoke-virtual {v0, p1}, Lcom/google/firebase/iid/zzac;->zza(Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
