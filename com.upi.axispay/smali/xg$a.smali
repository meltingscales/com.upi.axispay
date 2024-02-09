.class public Lxg$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroidx/mediarouter/app/OverlayListView$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxg;->h(Ljava/util/Map;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lyh$i;

.field public final synthetic b:Lxg;


# direct methods
.method public constructor <init>(Lxg;Lyh$i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxg$a;->b:Lxg;

    iput-object p2, p0, Lxg$a;->a:Lyh$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxg$a;->b:Lxg;

    iget-object v0, v0, Lxg;->J:Ljava/util/Set;

    iget-object v1, p0, Lxg$a;->a:Lyh$i;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Lxg$a;->b:Lxg;

    iget-object v0, v0, Lxg;->F:Lxg$r;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    return-void
.end method
