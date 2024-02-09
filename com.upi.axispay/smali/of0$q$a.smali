.class public Lof0$q$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lof0$q;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lof0$q;


# direct methods
.method public constructor <init>(Lof0$q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lof0$q$a;->b:Lof0$q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lof0$q$a;->b:Lof0$q;

    iget-object p1, p1, Lof0$q;->c:Landroid/widget/RadioGroup;

    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result p1

    .line 3
    iget-object v0, p0, Lof0$q$a;->b:Lof0$q;

    iget-object v0, v0, Lof0$q;->b:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RadioButton;

    .line 4
    invoke-virtual {p1}, Landroid/widget/RadioButton;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    new-instance v1, Lcom/olive/upi/transport/model/BeneVpaBlock;

    iget-object v2, p0, Lof0$q$a;->b:Lof0$q;

    iget-object v3, v2, Lof0$q;->d:Ljava/lang/String;

    iget-object v2, v2, Lof0$q;->e:Ljava/lang/String;

    const v4, 0x161f

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4, v2, p1}, Lcom/olive/upi/transport/model/BeneVpaBlock;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object p1, p0, Lof0$q$a;->b:Lof0$q;

    iget-object p1, p1, Lof0$q;->f:Lof0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x9

    const/16 v3, 0x34

    invoke-direct {v1, v2, v3, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method
