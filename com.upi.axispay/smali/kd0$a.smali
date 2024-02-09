.class public Lkd0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lkd0;


# direct methods
.method public constructor <init>(Lkd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkd0$a;->b:Lkd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lkd0$a;->b:Lkd0;

    iput p3, p1, Lkd0;->m:I

    if-eqz p3, :cond_1

    const/4 p2, 0x1

    if-eq p3, p2, :cond_0

    goto :goto_0

    :cond_0
    const p2, 0x447

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-virtual {p1, p2}, Lkd0;->z(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lkd0$a;->b:Lkd0;

    invoke-virtual {p1}, Lkd0;->x()V

    goto :goto_0

    :cond_1
    const p2, 0x448

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Lkd0;->z(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lkd0$a;->b:Lkd0;

    invoke-virtual {p1}, Lkd0;->x()V

    :goto_0
    return-void
.end method
