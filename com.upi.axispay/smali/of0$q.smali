.class public Lof0$q;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lof0;->C(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/app/Dialog;

.field public final synthetic c:Landroid/widget/RadioGroup;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lof0;


# direct methods
.method public constructor <init>(Lof0;Landroid/app/Dialog;Landroid/widget/RadioGroup;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lof0$q;->f:Lof0;

    iput-object p2, p0, Lof0$q;->b:Landroid/app/Dialog;

    iput-object p3, p0, Lof0$q;->c:Landroid/widget/RadioGroup;

    iput-object p4, p0, Lof0$q;->d:Ljava/lang/String;

    iput-object p5, p0, Lof0$q;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lof0$q;->b:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 3
    iget-object p1, p0, Lof0$q;->f:Lof0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object v0, p0, Lof0$q;->f:Lof0;

    const v1, 0x7f120137

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lof0$q$a;

    invoke-direct {v1, p0}, Lof0$q$a;-><init>(Lof0$q;)V

    invoke-static {p1, v0, v1}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method
