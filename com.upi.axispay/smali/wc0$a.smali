.class public Lwc0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwc0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lwc0;


# direct methods
.method public constructor <init>(Lwc0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwc0$a;->b:Lwc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lwc0$a;->b:Lwc0;

    invoke-static {v0}, Lwc0;->A(Lwc0;)Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    iget-object v1, p0, Lwc0$a;->b:Lwc0;

    invoke-static {v1}, Lwc0;->x(Lwc0;)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(IZ)V

    .line 2
    iget-object v0, p0, Lwc0$a;->b:Lwc0;

    invoke-static {v0}, Lwc0;->x(Lwc0;)I

    move-result v0

    iget-object v1, p0, Lwc0$a;->b:Lwc0;

    invoke-static {v1}, Lwc0;->B(Lwc0;)I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Lwc0$a;->b:Lwc0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lwc0;->y(Lwc0;I)I

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lwc0$a;->b:Lwc0;

    invoke-static {v0}, Lwc0;->z(Lwc0;)I

    .line 5
    :goto_0
    iget-object v0, p0, Lwc0$a;->b:Lwc0;

    iget-object v0, v0, Lxc0;->k:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x14f

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwc0$a;->b:Lwc0;

    invoke-static {v1}, Lwc0;->x(Lwc0;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v1, 0x150

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwc0$a;->b:Lwc0;

    iget-wide v1, v1, Lwc0;->t:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 6
    iget-object v0, p0, Lwc0$a;->b:Lwc0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lwc0;->t:J

    .line 7
    iget-object v0, p0, Lwc0$a;->b:Lwc0;

    iget-object v1, v0, Lwc0;->o:Landroid/os/Handler;

    iget-object v0, v0, Lwc0;->u:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1388

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
