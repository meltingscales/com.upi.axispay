.class public Lz$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroidx/savedstate/SavedStateRegistry$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz;->N()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lz;


# direct methods
.method public constructor <init>(Lz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz$a;->a:Lz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    iget-object v1, p0, Lz$a;->a:Lz;

    invoke-virtual {v1}, Lz;->L()Lb0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lb0;->v(Landroid/os/Bundle;)V

    return-object v0
.end method
