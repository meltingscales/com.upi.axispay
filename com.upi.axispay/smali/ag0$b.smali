.class public Lag0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lag0;->B(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lag0;


# direct methods
.method public constructor <init>(Lag0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lag0$b;->b:Lag0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lag0$b;->b:Lag0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lag0$b;->b:Lag0;

    invoke-virtual {p1}, Lxc0;->r()V

    .line 2
    :cond_0
    iget-object p1, p0, Lag0$b;->b:Lag0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 3
    invoke-static {}, Leg0;->c()V

    return-void
.end method
