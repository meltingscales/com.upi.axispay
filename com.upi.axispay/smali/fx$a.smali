.class public Lfx$a;
.super Lix;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfx;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lix<",
        "TS;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lfx;


# direct methods
.method public constructor <init>(Lfx;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfx$a;->a:Lfx;

    invoke-direct {p0}, Lix;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lfx$a;->a:Lfx;

    iget-object v0, v0, Ljx;->b:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lix;

    .line 2
    invoke-virtual {v1}, Lix;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lfx$a;->a:Lfx;

    iget-object v0, v0, Ljx;->b:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lix;

    .line 2
    invoke-virtual {v1, p1}, Lix;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method
