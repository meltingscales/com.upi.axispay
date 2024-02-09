.class public Lqd$g;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqd;->x(Ljava/util/List;Ljava/util/List;ZLpe$e;Lpe$e;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lpe$e;

.field public final synthetic c:Lpe$e;

.field public final synthetic d:Z

.field public final synthetic e:Lo4;


# direct methods
.method public constructor <init>(Lqd;Lpe$e;Lpe$e;ZLo4;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lqd$g;->b:Lpe$e;

    iput-object p3, p0, Lqd$g;->c:Lpe$e;

    iput-boolean p4, p0, Lqd$g;->d:Z

    iput-object p5, p0, Lqd$g;->e:Lo4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lqd$g;->b:Lpe$e;

    .line 2
    invoke-virtual {v0}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v1, p0, Lqd$g;->c:Lpe$e;

    invoke-virtual {v1}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v1

    iget-boolean v2, p0, Lqd$g;->d:Z

    iget-object v3, p0, Lqd$g;->e:Lo4;

    const/4 v4, 0x0

    .line 3
    invoke-static {v0, v1, v2, v3, v4}, Lke;->f(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLo4;Z)V

    return-void
.end method
