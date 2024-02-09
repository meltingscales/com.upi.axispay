.class public final synthetic Ljb0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Ldd0;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ldd0;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb0;->b:Ldd0;

    iput-object p2, p0, Ljb0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Ljb0;->b:Ldd0;

    iget-object v1, p0, Ljb0;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Ldd0;->y(Ljava/lang/Object;Landroid/view/View;)V

    return-void
.end method
