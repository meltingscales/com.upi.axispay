.class public Lorg/npci/upi/security/pinactivitycomponent/p$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/npci/upi/security/pinactivitycomponent/p;->A(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lorg/npci/upi/security/pinactivitycomponent/widget/a;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Landroid/graphics/drawable/Drawable;

.field public final synthetic f:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Lorg/npci/upi/security/pinactivitycomponent/p;Lorg/npci/upi/security/pinactivitycomponent/widget/a;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    iput-object p3, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->c:Ljava/lang/String;

    iput-object p4, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->d:Ljava/lang/String;

    iput-object p5, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->e:Landroid/graphics/drawable/Drawable;

    iput-object p6, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->f:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-interface {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->c()I

    move-result v0

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-interface {v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->d()Z

    move-result v1

    if-nez v0, :cond_2

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->d:Ljava/lang/String;

    :goto_0
    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->e:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->f:Landroid/graphics/drawable/Drawable;

    :goto_1
    move-object v3, v1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    goto :goto_4

    :cond_2
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    if-eqz v1, :cond_3

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->c:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->d:Ljava/lang/String;

    :goto_2
    if-eqz v1, :cond_4

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->e:Landroid/graphics/drawable/Drawable;

    goto :goto_3

    :cond_4
    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p$1;->f:Landroid/graphics/drawable/Drawable;

    :goto_3
    move-object v3, v1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x1

    :goto_4
    move-object v1, v2

    move-object v2, v3

    move-object v3, p0

    invoke-interface/range {v0 .. v6}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;IZZ)V

    return-void
.end method
