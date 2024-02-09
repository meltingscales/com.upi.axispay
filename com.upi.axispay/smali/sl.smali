.class public final Lsl;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final a:Ltl;

.field public final b:Landroidx/savedstate/SavedStateRegistry;


# direct methods
.method public constructor <init>(Ltl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lsl;->a:Ltl;

    .line 3
    new-instance p1, Landroidx/savedstate/SavedStateRegistry;

    invoke-direct {p1}, Landroidx/savedstate/SavedStateRegistry;-><init>()V

    iput-object p1, p0, Lsl;->b:Landroidx/savedstate/SavedStateRegistry;

    return-void
.end method

.method public static a(Ltl;)Lsl;
    .locals 1

    .line 1
    new-instance v0, Lsl;

    invoke-direct {v0, p0}, Lsl;-><init>(Ltl;)V

    return-object v0
.end method


# virtual methods
.method public b()Landroidx/savedstate/SavedStateRegistry;
    .locals 1

    .line 1
    iget-object v0, p0, Lsl;->b:Landroidx/savedstate/SavedStateRegistry;

    return-object v0
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lsl;->a:Ltl;

    invoke-interface {v0}, Lef;->getLifecycle()Lbf;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lbf;->b()Lbf$c;

    move-result-object v1

    sget-object v2, Lbf$c;->c:Lbf$c;

    if-ne v1, v2, :cond_0

    .line 3
    new-instance v1, Landroidx/savedstate/Recreator;

    iget-object v2, p0, Lsl;->a:Ltl;

    invoke-direct {v1, v2}, Landroidx/savedstate/Recreator;-><init>(Ltl;)V

    invoke-virtual {v0, v1}, Lbf;->a(Ldf;)V

    .line 4
    iget-object v1, p0, Lsl;->b:Landroidx/savedstate/SavedStateRegistry;

    invoke-virtual {v1, v0, p1}, Landroidx/savedstate/SavedStateRegistry;->b(Lbf;Landroid/os/Bundle;)V

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const v0, 0x83d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsl;->b:Landroidx/savedstate/SavedStateRegistry;

    invoke-virtual {v0, p1}, Landroidx/savedstate/SavedStateRegistry;->c(Landroid/os/Bundle;)V

    return-void
.end method
