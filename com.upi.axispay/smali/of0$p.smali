.class public Lof0$p;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lof0;->M()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lof0;


# direct methods
.method public constructor <init>(Lof0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lof0$p;->b:Lof0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lof0$p;->b:Lof0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->o(ILjava/lang/Object;)V

    return-void
.end method