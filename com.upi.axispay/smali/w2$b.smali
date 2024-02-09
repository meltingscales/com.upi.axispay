.class public Lw2$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic b:Lw2;


# direct methods
.method public constructor <init>(Lw2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw2$b;->b:Lw2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw2$b;->b:Lw2;

    const/4 v1, 0x0

    iput-object v1, v0, Lw2;->o:Lw2$b;

    .line 2
    invoke-virtual {v0, p0}, Landroid/widget/ListView;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw2$b;->b:Lw2;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw2$b;->b:Lw2;

    const/4 v1, 0x0

    iput-object v1, v0, Lw2;->o:Lw2$b;

    .line 2
    invoke-virtual {v0}, Lw2;->drawableStateChanged()V

    return-void
.end method
