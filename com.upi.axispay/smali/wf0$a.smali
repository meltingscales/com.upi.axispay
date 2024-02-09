.class public Lwf0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwf0;->J(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lwf0;


# direct methods
.method public constructor <init>(Lwf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwf0$a;->b:Lwf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lwf0$a;->b:Lwf0;

    invoke-static {v0}, Lwf0;->x(Lwf0;)I

    move-result v1

    invoke-virtual {v0, v1}, Lwf0;->L(I)V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lwf0$a;->b:Lwf0;

    invoke-static {v0}, Lwf0;->y(Lwf0;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lwf0$a;->b:Lwf0;

    const v2, 0x7f120187

    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x1e

    if-le v0, v1, :cond_1

    .line 5
    iget-object v0, p0, Lwf0$a;->b:Lwf0;

    invoke-virtual {v0}, Lxc0;->k()Lz;

    move-result-object v0

    iget-object v1, p0, Lwf0$a;->b:Lwf0;

    const v2, 0x7f120321

    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lwf0$a;->b:Lwf0;

    invoke-static {v0}, Lwf0;->y(Lwf0;)Landroid/widget/EditText;

    move-result-object v0

    const v1, 0xdf5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 7
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x1

    if-ge v0, v1, :cond_2

    .line 8
    iget-object p1, p0, Lwf0$a;->b:Lwf0;

    invoke-static {p1, v2}, Lwf0;->z(Lwf0;I)V

    goto/16 :goto_3

    .line 9
    :cond_2
    iget-object v0, p0, Lwf0$a;->b:Lwf0;

    invoke-static {v0}, Lwf0;->A(Lwf0;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x2

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lwf0$a;->b:Lwf0;

    invoke-static {v4}, Lwf0;->A(Lwf0;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 10
    iget-object p1, p0, Lwf0$a;->b:Lwf0;

    invoke-static {p1, v3}, Lwf0;->z(Lwf0;I)V

    goto :goto_3

    .line 11
    :cond_3
    iget-object v0, p0, Lwf0$a;->b:Lwf0;

    invoke-static {v0}, Lwf0;->B(Lwf0;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lwf0$a;->b:Lwf0;

    invoke-static {v0}, Lwf0;->B(Lwf0;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_5

    move v0, v4

    .line 12
    :goto_1
    iget-object v5, p0, Lwf0$a;->b:Lwf0;

    invoke-static {v5}, Lwf0;->B(Lwf0;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v0, v5, :cond_5

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lwf0$a;->b:Lwf0;

    invoke-static {v6}, Lwf0;->B(Lwf0;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const v7, 0xdf6

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    aget-object v6, v6, v4

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v4, v2

    goto :goto_2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    if-ne v4, v2, :cond_6

    .line 14
    iget-object p1, p0, Lwf0$a;->b:Lwf0;

    invoke-static {p1, v3}, Lwf0;->z(Lwf0;I)V

    .line 15
    iget-object p1, p0, Lwf0$a;->b:Lwf0;

    invoke-static {p1}, Lwf0;->C(Lwf0;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 16
    :cond_6
    iget-object p1, p0, Lwf0$a;->b:Lwf0;

    invoke-static {p1, v2}, Lwf0;->z(Lwf0;I)V

    :goto_3
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
