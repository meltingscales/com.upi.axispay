.class public final synthetic Leb0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Ltc0;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Ltc0;Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb0;->b:Ltc0;

    iput-object p2, p0, Leb0;->c:Ljava/lang/Object;

    iput p3, p0, Leb0;->d:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Leb0;->b:Ltc0;

    iget-object v1, p0, Leb0;->c:Ljava/lang/Object;

    iget v2, p0, Leb0;->d:I

    invoke-virtual {v0, v1, v2, p1}, Ltc0;->A(Ljava/lang/Object;ILandroid/view/View;)V

    return-void
.end method
