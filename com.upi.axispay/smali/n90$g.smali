.class public Ln90$g;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln90;->h(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ln90;


# direct methods
.method public constructor <init>(Ln90;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln90$g;->b:Ln90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ln90$g;->b:Ln90;

    iget-object p1, p1, Ln90;->d:Lng0;

    const v0, 0x7f0a0071

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
