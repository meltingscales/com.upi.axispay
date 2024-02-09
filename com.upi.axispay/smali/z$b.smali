.class public Lz$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Le;


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
    iput-object p1, p0, Lz$b;->a:Lz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lz$b;->a:Lz;

    invoke-virtual {p1}, Lz;->L()Lb0;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Lb0;->o()V

    .line 3
    iget-object v0, p0, Lz$b;->a:Lz;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()Landroidx/savedstate/SavedStateRegistry;

    move-result-object v0

    const v1, 0x559

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Lb0;->r(Landroid/os/Bundle;)V

    return-void
.end method
