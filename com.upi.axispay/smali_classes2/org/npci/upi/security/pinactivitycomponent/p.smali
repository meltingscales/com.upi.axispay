.class public Lorg/npci/upi/security/pinactivitycomponent/p;
.super Lorg/npci/upi/security/pinactivitycomponent/m;
.source "AxisPay"

# interfaces
.implements Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;


# static fields
.field public static final J:Ljava/lang/String;


# instance fields
.field public A:Lin/org/npci/commonlibrary/Message;

.field public B:Ljava/lang/Boolean;

.field public C:Ljava/lang/String;

.field public D:I

.field public E:I

.field public F:I

.field public G:Z

.field public H:Ljava/lang/Boolean;

.field public I:Ljava/lang/String;

.field public s:I

.field public t:Ljava/lang/Boolean;

.field public u:Ljava/util/Timer;

.field public v:Ljava/lang/Boolean;

.field public w:Landroid/widget/ViewFlipper;

.field public x:Landroid/webkit/WebView;

.field public y:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/npci/upi/security/pinactivitycomponent/m;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/npci/upi/security/pinactivitycomponent/p;->J:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lorg/npci/upi/security/pinactivitycomponent/m;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->t:Ljava/lang/Boolean;

    const/4 v2, 0x0

    iput-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->u:Ljava/util/Timer;

    iput-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->v:Ljava/lang/Boolean;

    iput-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->w:Landroid/widget/ViewFlipper;

    iput-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->x:Landroid/webkit/WebView;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->y:Ljava/util/HashMap;

    iput-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->z:Z

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->B:Ljava/lang/Boolean;

    const v2, 0x9bb

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->C:Ljava/lang/String;

    iput-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->G:Z

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->H:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final A(I)V
    .locals 12

    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    iget v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {p0, v0}, Lorg/npci/upi/security/pinactivitycomponent/m;->r(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)V

    invoke-virtual {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->u()V

    :cond_0
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    if-ge p1, v0, :cond_2

    iget v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    if-eq p1, v1, :cond_1

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v2

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$drawable;->ic_visibility_on:I

    invoke-static {v2, v3}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v2

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$drawable;->ic_visibility_blue_24px:I

    invoke-static {v2, v3}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v2

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$drawable;->ic_visibility_off:I

    invoke-static {v2, v3}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    sget v2, Lorg/npci/upi/security/pinactivitycomponent/R$string;->action_hide:I

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    sget v2, Lorg/npci/upi/security/pinactivitycomponent/R$string;->action_show:I

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Lorg/npci/upi/security/pinactivitycomponent/p$1;

    move-object v2, v11

    move-object v3, p0

    move-object v4, v1

    move-object v6, v10

    invoke-direct/range {v2 .. v8}, Lorg/npci/upi/security/pinactivitycomponent/p$1;-><init>(Lorg/npci/upi/security/pinactivitycomponent/p;Lorg/npci/upi/security/pinactivitycomponent/widget/a;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v2, v1

    move-object v3, v10

    move-object v4, v9

    move-object v5, v11

    invoke-interface/range {v2 .. v8}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;IZZ)V

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final B()V
    .locals 10

    iget v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    iget v2, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getInputValue()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getInputLength()I

    move-result v3

    if-eq v2, v3, :cond_1

    :cond_0
    sget v2, Lorg/npci/upi/security/pinactivitycomponent/R$string;->invalid_otp:I

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lorg/npci/upi/security/pinactivitycomponent/m;->n(Landroid/view/View;Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ge v2, v3, :cond_3

    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v3}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getInputValue()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v3}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getInputLength()I

    move-result v6

    if-eq v5, v6, :cond_2

    sget v2, Lorg/npci/upi/security/pinactivitycomponent/R$string;->error_message_mpin:I

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->D:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-virtual {p0, v2, v4}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v3, v1}, Lorg/npci/upi/security/pinactivitycomponent/m;->n(Landroid/view/View;Ljava/lang/String;)V

    return-void

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    iget-boolean v2, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->z:Z

    if-nez v2, :cond_6

    iput-boolean v4, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->z:Z

    move v2, v1

    :goto_1
    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    :try_start_0
    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-interface {v3}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->getFormDataTag()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/json/JSONObject;

    const v0, 0x9bc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const v0, 0x9bd

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v6, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->c:Lorg/json/JSONObject;

    const v0, 0x9be

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-interface {v8}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->getInputValue()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v6, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->c:Lorg/json/JSONObject;

    new-instance v7, Lorg/json/JSONArray;

    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    const v0, 0x9bf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->I:Ljava/lang/String;

    invoke-virtual {v6, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v8, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->p:Landroid/content/Context;

    check-cast v8, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-virtual {v8}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->l0()Lorg/npci/upi/security/pinactivitycomponent/a;

    move-result-object v8

    invoke-virtual {v8}, Lorg/npci/upi/security/pinactivitycomponent/a;->b()Lorg/npci/upi/security/pinactivitycomponent/q;

    move-result-object v8

    invoke-virtual {v8, v6}, Lorg/npci/upi/security/pinactivitycomponent/q;->b(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    iget-object v8, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->p:Landroid/content/Context;

    check-cast v8, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-virtual {v8}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->l0()Lorg/npci/upi/security/pinactivitycomponent/a;

    move-result-object v8

    invoke-virtual {v8}, Lorg/npci/upi/security/pinactivitycomponent/a;->d()Lorg/npci/upi/security/pinactivitycomponent/f;

    move-result-object v8

    invoke-virtual {v7, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7, v5, v3, v6}, Lorg/npci/upi/security/pinactivitycomponent/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lin/org/npci/commonlibrary/Message;

    move-result-object v5

    iput-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->A:Lin/org/npci/commonlibrary/Message;

    if-eqz v5, :cond_4

    iget-object v6, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->y:Ljava/util/HashMap;

    invoke-static {v5}, Lorg/npci/upi/security/pinactivitycomponent/j;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v3

    sget-object v5, Lorg/npci/upi/security/pinactivitycomponent/p;->J:Ljava/lang/String;

    invoke-static {v5, v3}, Lorg/npci/upi/security/pinactivitycomponent/l;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    :cond_5
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->y:Ljava/util/HashMap;

    const v0, 0x9c0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->p:Landroid/content/Context;

    check-cast v2, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-virtual {v2}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->l0()Lorg/npci/upi/security/pinactivitycomponent/a;

    move-result-object v2

    invoke-virtual {v2}, Lorg/npci/upi/security/pinactivitycomponent/a;->f()Landroid/os/ResultReceiver;

    move-result-object v2

    invoke-virtual {v2, v4, v1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->p:Landroid/content/Context;

    check-cast v1, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->l0()Lorg/npci/upi/security/pinactivitycomponent/a;

    move-result-object v1

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/a;->e()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    :cond_6
    return-void
.end method

.method public final C()Z
    .locals 5

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->v:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    return v1

    :cond_0
    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    if-eqz v1, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_2

    :try_start_0
    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    const v0, 0x9c1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    sget-object v4, Lorg/npci/upi/security/pinactivitycomponent/p;->J:Ljava/lang/String;

    invoke-static {v4, v3}, Lorg/npci/upi/security/pinactivitycomponent/l;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const v0, 0x9c2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const v0, 0x9c3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const v0, 0x9c4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const v0, 0x9c5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const v0, 0x9c6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const v0, 0x9c7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_2
    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->v:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    return v1

    :cond_4
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_2
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemPager;

    if-nez v0, :cond_0

    iput p1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    :cond_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 2

    iget p2, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->u:Ljava/util/Timer;

    invoke-virtual {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/m;->p(Ljava/util/Timer;)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    iget p2, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->l(Z)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    const/4 v0, 0x0

    const v1, 0x9c8

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0, p2, p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k(Ljava/lang/String;Landroid/view/View$OnClickListener;ZZ)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    iget p2, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p2

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$drawable;->ic_tick_ok:I

    invoke-static {p2, v0}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->j(Landroid/graphics/drawable/Drawable;Z)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->B:Ljava/lang/Boolean;

    :cond_0
    return-void
.end method

.method public f(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/npci/upi/security/pinactivitycomponent/m;->n(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method public l()V
    .locals 5

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/p;->B()V

    return-void

    :cond_0
    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    const/4 v2, 0x0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/p;->C()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getInputLength()I

    move-result v0

    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-interface {v3}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->getInputValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v0, v3, :cond_2

    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->E:I

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$string;->error_message_otp:I

    new-array v1, v1, [Ljava/lang/Object;

    iget v4, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->E:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-virtual {p0, v3, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$string;->error_message_mpin:I

    new-array v1, v1, [Ljava/lang/Object;

    iget v4, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->D:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-virtual {p0, v3, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Lorg/npci/upi/security/pinactivitycomponent/m;->n(Landroid/view/View;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->w:Landroid/widget/ViewFlipper;

    iget v2, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    add-int/2addr v0, v1

    iput v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    return-void

    :cond_3
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getInputLength()I

    move-result v0

    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-interface {v3}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->getInputValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v0, v3, :cond_4

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$string;->error_message_mpin:I

    new-array v1, v1, [Ljava/lang/Object;

    iget v4, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->D:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-virtual {p0, v3, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/npci/upi/security/pinactivitycomponent/m;->n(Landroid/view/View;Ljava/lang/String;)V

    return-void

    :cond_4
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->w:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showNext()V

    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    add-int/2addr v0, v1

    iput v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    return-void

    :cond_5
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->t:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v3, 0x2

    if-eqz v0, :cond_9

    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getInputLength()I

    move-result v0

    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-interface {v3}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->getInputValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v0, v3, :cond_6

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$string;->error_message_atm_pin:I

    new-array v1, v1, [Ljava/lang/Object;

    iget v4, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->F:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-virtual {p0, v3, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/npci/upi/security/pinactivitycomponent/m;->n(Landroid/view/View;Ljava/lang/String;)V

    return-void

    :cond_6
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->w:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showNext()V

    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    add-int/2addr v0, v1

    iput v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    return-void

    :cond_7
    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-interface {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->e()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    iget v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$string;->componentMessage:I

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/npci/upi/security/pinactivitycomponent/m;->n(Landroid/view/View;Ljava/lang/String;)V

    :cond_8
    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    if-ne v0, v3, :cond_e

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-interface {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->b()Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_1

    :cond_9
    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    if-nez v0, :cond_a

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->w:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showNext()V

    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    add-int/2addr v0, v1

    iput v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    return-void

    :cond_a
    if-ne v0, v1, :cond_d

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-interface {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->e()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    iget v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$string;->componentMessage:I

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lorg/npci/upi/security/pinactivitycomponent/m;->n(Landroid/view/View;Ljava/lang/String;)V

    return-void

    :cond_b
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    iget v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-interface {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->b()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/p;->B()V

    :cond_c
    return-void

    :cond_d
    if-ne v0, v3, :cond_e

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-interface {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->b()Z

    move-result v0

    if-eqz v0, :cond_e

    :goto_1
    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/p;->B()V

    :cond_e
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    sget p3, Lorg/npci/upi/security/pinactivitycomponent/R$layout;->fragment_pin:I

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1, p2}, Lorg/npci/upi/security/pinactivitycomponent/m;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    sget p2, Lorg/npci/upi/security/pinactivitycomponent/R$id;->main_inner_layout:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    sget p2, Lorg/npci/upi/security/pinactivitycomponent/R$id;->main_layout:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    sget p2, Lorg/npci/upi/security/pinactivitycomponent/R$id;->progressbar_layout:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    sget p2, Lorg/npci/upi/security/pinactivitycomponent/R$id;->progressbar_otp:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/m;->v()V

    invoke-virtual {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/p;->x(Landroid/view/View;)V

    :try_start_0
    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->c:Lorg/json/JSONObject;

    const v0, 0x9c9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->I:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public t()V
    .locals 3

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->B:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->B:Ljava/lang/Boolean;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lorg/npci/upi/security/pinactivitycomponent/m;->o(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    iget v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v1

    sget v2, Lorg/npci/upi/security/pinactivitycomponent/R$drawable;->ic_tick_ok:I

    invoke-static {v1, v2}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->j(Landroid/graphics/drawable/Drawable;Z)V

    :cond_0
    return-void
.end method

.method public w()V
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->x:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    :cond_0
    return-void
.end method

.method public final x(Landroid/view/View;)V
    .locals 6

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->view_switcher:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ViewFlipper;

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->w:Landroid/widget/ViewFlipper;

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/p;->C()Z

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v1, :cond_1

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    move v4, v2

    :goto_0
    :try_start_0
    iget-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v4, v5, :cond_0

    iget-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {p0, p1, v3}, Lorg/npci/upi/security/pinactivitycomponent/p;->z(Landroid/view/View;Ljava/lang/Integer;)V

    invoke-virtual {p0, v2}, Lorg/npci/upi/security/pinactivitycomponent/p;->A(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    sget-object v3, Lorg/npci/upi/security/pinactivitycomponent/p;->J:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x9ca

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1, v3}, Lorg/npci/upi/security/pinactivitycomponent/p;->z(Landroid/view/View;Ljava/lang/Integer;)V

    invoke-virtual {p0, v2}, Lorg/npci/upi/security/pinactivitycomponent/p;->A(I)V

    :goto_1
    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Landroid/view/View;->getFocusables(I)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void
.end method

.method public final y(Landroid/view/View;II)V
    .locals 2

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {p1, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt p1, v1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$drawable;->fragment_transparent_divider:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    const/16 p1, 0x10

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p1, v1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v0, p2}, Landroid/widget/LinearLayout;->setId(I)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/p;->w:Landroid/widget/ViewFlipper;

    invoke-virtual {p1, v0, p3}, Landroid/widget/ViewFlipper;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final z(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 20

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    const v19, 0x9cb

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const v19, 0x9cc

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    const v19, 0x9cd

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    const v19, 0x9ce

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    iget-object v0, v7, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    if-eqz v0, :cond_10

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v13, v0

    :goto_0
    iget-object v0, v7, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v14, 0x1

    if-ge v13, v0, :cond_f

    :try_start_0
    iget-object v0, v7, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v0, v13}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x6

    :goto_1
    move v6, v1

    goto :goto_2

    :cond_0
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    goto :goto_1

    :goto_2
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->t:Ljava/lang/Boolean;

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$string;->npci_atm_title:I

    new-array v2, v14, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {v7, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$string;->educational_info_atm:I

    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v1, p0

    move v3, v13

    move v4, v6

    move v14, v6

    move-object v6, v15

    invoke-virtual/range {v1 .. v6}, Lorg/npci/upi/security/pinactivitycomponent/m;->k(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->setFormDataTag(Ljava/lang/Object;)V

    iget-object v0, v7, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$id;->switcherLayout3:I

    invoke-virtual {v7, v8, v0, v13}, Lorg/npci/upi/security/pinactivitycomponent/p;->y(Landroid/view/View;II)V

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iput v14, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->F:I

    move-object/from16 v16, v9

    :cond_1
    move-object v9, v8

    goto/16 :goto_f

    :cond_2
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    const v19, 0x9cf

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v19, 0x9d0

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v19, 0x9d1

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v19, 0x9d2

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v19, 0x9d3

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v16, v9

    const v19, 0x9d4

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    if-nez v1, :cond_3

    :try_start_1
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_3
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual/range {p0 .. p0}, Lorg/npci/upi/security/pinactivitycomponent/p;->C()Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_b

    :cond_4
    iget-object v1, v7, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    const v19, 0x9d5

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v17, v0

    const/4 v0, 0x1

    if-le v1, v0, :cond_5

    :try_start_2
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, v7, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    add-int/lit8 v1, v13, 0x1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    iput-boolean v0, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->G:Z

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$string;->npci_old_mpin_title:I

    new-array v9, v0, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v18, 0x0

    aput-object v0, v9, v18

    invoke-virtual {v7, v1, v9}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$string;->educational_info_upi:I

    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->C:Ljava/lang/String;

    iput v6, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->D:I

    goto :goto_3

    :cond_5
    move-object v0, v8

    :goto_3
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$string;->npci_mpin_title:I

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-virtual {v7, v0, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iget-object v2, v7, Lorg/npci/upi/security/pinactivitycomponent/m;->c:Lorg/json/JSONObject;

    const v19, 0x9d6

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    if-eqz v2, :cond_8

    const v19, 0x9d7

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_8

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_8

    const/4 v2, 0x0

    :goto_4
    iget-object v3, v7, Lorg/npci/upi/security/pinactivitycomponent/m;->n:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_7

    iget-object v3, v7, Lorg/npci/upi/security/pinactivitycomponent/m;->n:Lorg/json/JSONArray;

    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/json/JSONObject;

    const v19, 0x9d8

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const v19, 0x9d9

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v1, v7, Lorg/npci/upi/security/pinactivitycomponent/m;->n:Lorg/json/JSONArray;

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    const v19, 0x9da

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_7
    :goto_5
    sget v2, Lorg/npci/upi/security/pinactivitycomponent/R$string;->educational_info_upi_debitnew:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-virtual {v7, v2, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_6
    iput-object v1, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->C:Ljava/lang/String;

    goto :goto_7

    :cond_8
    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$string;->educational_info_upi:I

    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :goto_7
    iput v6, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->D:I

    goto/16 :goto_9

    :cond_9
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$string;->npci_atm_title:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_b
    :goto_8
    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$string;->npci_otp_title:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$string;->educational_info_otp:I

    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->C:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v19, 0x9db

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$string;->otp_info_2:I

    invoke-virtual {v7, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->C:Ljava/lang/String;

    iput v13, v7, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    iput v6, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->E:I

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v1

    instance-of v1, v1, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    if-eqz v1, :cond_c

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v1

    check-cast v1, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->j0()Z

    move-result v1

    if-eqz v1, :cond_c

    iget v1, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->E:I

    invoke-virtual {v7, v1}, Lorg/npci/upi/security/pinactivitycomponent/m;->m(I)V

    :cond_c
    :goto_9
    move-object v2, v0

    iget-object v5, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->C:Ljava/lang/String;

    move-object/from16 v1, p0

    move v3, v13

    move v4, v6

    move-object v6, v15

    invoke-virtual/range {v1 .. v6}, Lorg/npci/upi/security/pinactivitycomponent/m;->k(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    move-result-object v0

    move-object/from16 v8, v17

    invoke-virtual {v0, v8}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->setFormDataTag(Ljava/lang/Object;)V

    iget-object v1, v7, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->switcherLayout1:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object/from16 v9, p1

    :try_start_3
    invoke-virtual {v7, v9, v1, v13}, Lorg/npci/upi/security/pinactivitycomponent/p;->y(Landroid/view/View;II)V

    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    :goto_a
    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_f

    :catch_0
    move-exception v0

    move-object/from16 v9, p1

    goto/16 :goto_e

    :cond_d
    :goto_b
    move-object v9, v8

    move-object v8, v0

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$string;->educational_info_upi:I

    invoke-virtual {v7, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->C:Ljava/lang/String;

    iget-boolean v0, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->G:Z

    if-eqz v0, :cond_e

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$string;->npci_new_mpin_title:I

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v5, 0x0

    aput-object v1, v2, v5

    invoke-virtual {v7, v0, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->C:Ljava/lang/String;

    move-object/from16 v1, p0

    move v3, v13

    move v4, v6

    move v14, v5

    move-object v5, v0

    move v0, v6

    move-object v6, v15

    invoke-virtual/range {v1 .. v6}, Lorg/npci/upi/security/pinactivitycomponent/m;->k(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    move-result-object v17

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$string;->npci_confirm_new_mpin_title:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v14

    invoke-virtual {v7, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v5, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->C:Ljava/lang/String;

    move-object/from16 v1, p0

    move v3, v13

    move v4, v0

    move-object v6, v15

    invoke-virtual/range {v1 .. v6}, Lorg/npci/upi/security/pinactivitycomponent/m;->k(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    move-result-object v0

    iput-boolean v14, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->G:Z

    goto :goto_c

    :cond_e
    move v0, v6

    const/4 v14, 0x0

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$string;->npci_set_mpin_title:I

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v3, v14

    invoke-virtual {v7, v1, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v5, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->C:Ljava/lang/String;

    move-object/from16 v1, p0

    move v3, v13

    move v4, v0

    move-object v6, v15

    invoke-virtual/range {v1 .. v6}, Lorg/npci/upi/security/pinactivitycomponent/m;->k(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    move-result-object v17

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$string;->npci_confirm_mpin_title:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v14

    invoke-virtual {v7, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v5, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->C:Ljava/lang/String;

    move-object/from16 v1, p0

    move v3, v13

    move v4, v0

    move-object v6, v15

    invoke-virtual/range {v1 .. v6}, Lorg/npci/upi/security/pinactivitycomponent/m;->k(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    move-result-object v0

    :goto_c
    move-object/from16 v1, v17

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemPager;

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemPager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2, v7}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemPager;->g(Ljava/util/ArrayList;Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;)V

    invoke-virtual {v0, v8}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemPager;->setFormDataTag(Ljava/lang/Object;)V

    iget-object v1, v7, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->switcherLayout2:I

    invoke-virtual {v7, v9, v1, v13}, Lorg/npci/upi/security/pinactivitycomponent/p;->y(Landroid/view/View;II)V

    invoke-virtual {v9, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_a

    :catch_1
    move-exception v0

    goto :goto_e

    :catch_2
    move-exception v0

    goto :goto_d

    :catch_3
    move-exception v0

    move-object/from16 v16, v9

    :goto_d
    move-object v9, v8

    :goto_e
    sget-object v1, Lorg/npci/upi/security/pinactivitycomponent/p;->J:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v19, 0x9dc

    invoke-static/range {v19 .. v19}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_f
    add-int/lit8 v13, v13, 0x1

    move-object v8, v9

    move-object/from16 v9, v16

    goto/16 :goto_0

    :cond_f
    iget-object v0, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->H:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_10

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->H:Ljava/lang/Boolean;

    iget-object v0, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->w:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->showNext()V

    iget v0, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, v7, Lorg/npci/upi/security/pinactivitycomponent/p;->s:I

    :cond_10
    return-void
.end method
