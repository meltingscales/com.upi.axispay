.class public Landroidx/lifecycle/SingleGeneratedAdapterObserver;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcf;


# instance fields
.field public final a:Laf;


# direct methods
.method public constructor <init>(Laf;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/lifecycle/SingleGeneratedAdapterObserver;->a:Laf;

    return-void
.end method


# virtual methods
.method public d(Lef;Lbf$b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/SingleGeneratedAdapterObserver;->a:Laf;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, p1, p2, v1, v2}, Laf;->a(Lef;Lbf$b;ZLif;)V

    .line 2
    iget-object v0, p0, Landroidx/lifecycle/SingleGeneratedAdapterObserver;->a:Laf;

    const/4 v1, 0x1

    invoke-interface {v0, p1, p2, v1, v2}, Laf;->a(Lef;Lbf$b;ZLif;)V

    return-void
.end method
