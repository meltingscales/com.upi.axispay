.class public Lee0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lee0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lee0;


# direct methods
.method public constructor <init>(Lee0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lee0$c;->b:Lee0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lee0$c;->b:Lee0;

    const/16 v0, 0x247

    invoke-static {p1, v0}, Lee0;->x(Lee0;I)V

    return-void
.end method
