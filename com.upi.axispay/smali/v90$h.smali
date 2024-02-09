.class public Lv90$h;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv90;->w(Lv90$j;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/olive/upi/transport/model/MandatesVo;

.field public final synthetic d:Lv90$j;

.field public final synthetic e:Z

.field public final synthetic f:I

.field public final synthetic g:Lv90;


# direct methods
.method public constructor <init>(Lv90;Ljava/lang/String;Lcom/olive/upi/transport/model/MandatesVo;Lv90$j;ZI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv90$h;->g:Lv90;

    iput-object p2, p0, Lv90$h;->b:Ljava/lang/String;

    iput-object p3, p0, Lv90$h;->c:Lcom/olive/upi/transport/model/MandatesVo;

    iput-object p4, p0, Lv90$h;->d:Lv90$j;

    iput-boolean p5, p0, Lv90$h;->e:Z

    iput p6, p0, Lv90$h;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lv90$h;->b:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lv90$h;->b:Ljava/lang/String;

    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x11c7

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lv90$h;->c:Lcom/olive/upi/transport/model/MandatesVo;

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayerStatus()Ljava/lang/String;

    move-result-object p1

    const v0, 0x11c8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv90$h;->c:Lcom/olive/upi/transport/model/MandatesVo;

    .line 3
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeStatus()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lv90$h;->c:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandatesVo;->getPayeeStatus()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, Lv90$h;->c:Lcom/olive/upi/transport/model/MandatesVo;

    .line 4
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandatesVo;->getInitiatedBy()Ljava/lang/String;

    move-result-object p1

    const v0, 0x11c9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 5
    iget-object p1, p0, Lv90$h;->d:Lv90$j;

    iget-object p1, p1, Lv90$j;->w:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object p1, p0, Lv90$h;->g:Lv90;

    iget-boolean v0, p0, Lv90$h;->e:Z

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    goto :goto_0

    :cond_2
    iget v0, p0, Lv90$h;->f:I

    :goto_0
    iput v0, p1, Lv90;->h:I

    .line 7
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    .line 8
    iget-object p1, p0, Lv90$h;->d:Lv90$j;

    iget-object p1, p1, Lv90$j;->I:Landroid/widget/Button;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    return-void
.end method
