.class public Lsd$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroidx/savedstate/SavedStateRegistry$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsd;->E()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lsd;


# direct methods
.method public constructor <init>(Lsd;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsd$a;->a:Lsd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    iget-object v1, p0, Lsd$a;->a:Lsd;

    invoke-virtual {v1}, Lsd;->F()V

    .line 3
    iget-object v1, p0, Lsd$a;->a:Lsd;

    iget-object v1, v1, Lsd;->k:Lff;

    sget-object v2, Lbf$b;->ON_STOP:Lbf$b;

    invoke-virtual {v1, v2}, Lff;->h(Lbf$b;)V

    .line 4
    iget-object v1, p0, Lsd$a;->a:Lsd;

    iget-object v1, v1, Lsd;->j:Lwd;

    invoke-virtual {v1}, Lwd;->x()Landroid/os/Parcelable;

    move-result-object v1

    if-eqz v1, :cond_0

    const v2, 0x2f6f

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-object v0
.end method
