.class public Lsd$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Le;


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
    iput-object p1, p0, Lsd$b;->a:Lsd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lsd$b;->a:Lsd;

    iget-object p1, p1, Lsd;->j:Lwd;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lwd;->a(Landroidx/fragment/app/Fragment;)V

    .line 2
    iget-object p1, p0, Lsd$b;->a:Lsd;

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->getSavedStateRegistry()Landroidx/savedstate/SavedStateRegistry;

    move-result-object p1

    const v0, 0x3050

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lsd$b;->a:Lsd;

    iget-object v0, v0, Lsd;->j:Lwd;

    invoke-virtual {v0, p1}, Lwd;->w(Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method
