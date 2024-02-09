.class public Ldn$a$a;
.super Lcn;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldn$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lo4;

.field public final synthetic b:Ldn$a;


# direct methods
.method public constructor <init>(Ldn$a;Lo4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldn$a$a;->b:Ldn$a;

    iput-object p2, p0, Ldn$a$a;->a:Lo4;

    invoke-direct {p0}, Lcn;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lbn;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldn$a$a;->a:Lo4;

    iget-object v1, p0, Ldn$a$a;->b:Ldn$a;

    iget-object v1, v1, Ldn$a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lu4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 2
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 3
    invoke-virtual {p1, p0}, Lbn;->O(Lbn$f;)Lbn;

    return-void
.end method
