.class public final synthetic Lnb0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Ljd0;


# direct methods
.method public synthetic constructor <init>(Ljd0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb0;->b:Ljd0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lnb0;->b:Ljd0;

    invoke-virtual {v0, p1}, Ljd0;->z(Landroid/view/View;)V

    return-void
.end method
