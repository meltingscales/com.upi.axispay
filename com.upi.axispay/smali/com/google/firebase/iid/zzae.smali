.class public final synthetic Lcom/google/firebase/iid/zzae;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzcj:Lcom/google/firebase/iid/zzac;


# direct methods
.method public constructor <init>(Lcom/google/firebase/iid/zzac;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzae;->zzcj:Lcom/google/firebase/iid/zzac;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/iid/zzae;->zzcj:Lcom/google/firebase/iid/zzac;

    invoke-virtual {v0}, Lcom/google/firebase/iid/zzac;->zzaa()V

    return-void
.end method
