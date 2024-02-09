.class public Lxg$k;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxg;->g(Ljava/util/Map;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lxg;


# direct methods
.method public constructor <init>(Lxg;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxg$k;->d:Lxg;

    iput-object p2, p0, Lxg$k;->b:Ljava/util/Map;

    iput-object p3, p0, Lxg$k;->c:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .line 1
    iget-object v0, p0, Lxg$k;->d:Lxg;

    iget-object v0, v0, Lxg;->E:Landroidx/mediarouter/app/OverlayListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 2
    iget-object v0, p0, Lxg$k;->d:Lxg;

    iget-object v1, p0, Lxg$k;->b:Ljava/util/Map;

    iget-object v2, p0, Lxg$k;->c:Ljava/util/Map;

    invoke-virtual {v0, v1, v2}, Lxg;->h(Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method
