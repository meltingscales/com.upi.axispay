.class public abstract Lorg/npci/upi/security/pinactivitycomponent/m;
.super Landroidx/fragment/app/Fragment;
.source "AxisPay"

# interfaces
.implements Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;


# instance fields
.field public b:Lorg/json/JSONObject;

.field public c:Lorg/json/JSONObject;

.field public d:Lorg/json/JSONArray;

.field public e:Ljava/util/Timer;

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lorg/npci/upi/security/pinactivitycomponent/widget/a;",
            ">;"
        }
    .end annotation
.end field

.field public g:I

.field public h:Landroid/widget/PopupWindow;

.field public i:Ljava/util/Timer;

.field public j:Ljava/util/Timer;

.field public k:Landroid/os/Handler;

.field public l:Ljava/lang/Runnable;

.field public m:Lorg/json/JSONObject;

.field public n:Lorg/json/JSONArray;

.field public o:J

.field public p:Landroid/content/Context;

.field public q:Ljava/lang/String;

.field public r:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->b:Lorg/json/JSONObject;

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->c:Lorg/json/JSONObject;

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->e:Ljava/util/Timer;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    const/4 v1, -0x1

    iput v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->i:Ljava/util/Timer;

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->m:Lorg/json/JSONObject;

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->n:Lorg/json/JSONArray;

    const-wide/16 v0, 0xbb8

    iput-wide v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->o:J

    const v0, 0xa40

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->q:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->r:Z

    return-void
.end method

.method private w()V
    .locals 11

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v2

    move-object v5, v4

    move-object v6, v5

    move v7, v3

    move-object v3, v6

    :goto_0
    iget-object v8, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-ge v7, v8, :cond_5

    :try_start_0
    iget-object v8, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v8, v7}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/json/JSONObject;

    const v0, 0xa41

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const v0, 0xa42

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const v0, 0xa43

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    iget-object v9, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v9, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    :cond_0
    const v0, 0xa44

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    iget-object v9, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v9, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    :cond_1
    const v0, 0xa45

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    iget-object v9, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v9, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    :cond_2
    const v0, 0xa46

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    iget-object v9, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v9, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    :cond_3
    const v0, 0xa47

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    iget-object v8, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v8, v7}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v8

    const v0, 0xa48

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v8}, Lorg/npci/upi/security/pinactivitycomponent/l;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    :cond_5
    iget-object v7, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v7

    const/4 v8, 0x3

    if-ne v7, v8, :cond_6

    if-eqz v2, :cond_6

    if-eqz v3, :cond_6

    if-eqz v4, :cond_6

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ne v2, v8, :cond_7

    if-eqz v5, :cond_7

    if-eqz v3, :cond_7

    if-eqz v4, :cond_7

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v2

    const/4 v5, 0x2

    if-ne v2, v5, :cond_8

    if-eqz v3, :cond_8

    if-eqz v4, :cond_8

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ne v2, v5, :cond_9

    if-eqz v4, :cond_9

    if-eqz v6, :cond_9

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_a

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, v1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    :cond_a
    return-void
.end method


# virtual methods
.method public j(F)I
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    div-int/lit16 v0, v0, 0xa0

    int-to-float v0, v0

    mul-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public k(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;
    .locals 8

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    new-instance v1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v3

    iget-object v4, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->p:Landroid/content/Context;

    invoke-direct {v1, v3, v4}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;-><init>(Landroid/content/Context;Landroid/content/Context;)V

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->setActionBarPositionTop(Z)V

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getFormInputView()Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->setCharSize(F)V

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getFormInputView()Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    move-result-object v2

    const/high16 v4, 0x41700000    # 15.0f

    invoke-virtual {p0, v4}, Lorg/npci/upi/security/pinactivitycomponent/m;->j(F)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2, v4}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->setSpace(F)V

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getFormInputView()Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    move-result-object v2

    const/high16 v4, 0x41c00000    # 24.0f

    invoke-virtual {p0, v4}, Lorg/npci/upi/security/pinactivitycomponent/m;->j(F)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2, v4}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->setFontSize(F)V

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getFormInputView()Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    move-result-object v2

    const/4 v4, 0x4

    new-array v4, v4, [I

    const/4 v5, 0x0

    const/16 v6, 0x50

    aput v6, v4, v5

    const/high16 v7, 0x41c80000    # 25.0f

    invoke-virtual {p0, v7}, Lorg/npci/upi/security/pinactivitycomponent/m;->j(F)I

    move-result v7

    aput v7, v4, v3

    const/4 v7, 0x2

    aput v6, v4, v7

    const/4 v6, 0x3

    aput v5, v4, v6

    invoke-virtual {v2, v4}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->setMargin([I)V

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getFormInputView()Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    move-result-object v2

    invoke-virtual {v2, v3}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->setLineStrokeCentered(Z)V

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getFormInputView()Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    move-result-object v2

    const/high16 v3, 0x40000000    # 2.0f

    invoke-virtual {p0, v3}, Lorg/npci/upi/security/pinactivitycomponent/m;->j(F)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->setLineStrokeSelected(F)V

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->getFormInputView()Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v3

    sget v4, Lorg/npci/upi/security/pinactivitycomponent/R$color;->form_item_input_colors_transparent:I

    invoke-static {v3, v4}, Lt8;->e(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->setColorStates(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1, p3}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->setInputLength(I)V

    invoke-virtual {v1, p0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->setFormItemListener(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;)V

    invoke-virtual {v1, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->setFormItemTag(I)V

    invoke-virtual {v1, p4}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->setEducationalText(Ljava/lang/String;)V

    invoke-virtual {v1, p5}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->setSubtype(Ljava/lang/String;)V

    return-object v1
.end method

.method public abstract l()V
.end method

.method public m(I)V
    .locals 8

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    instance-of v0, v0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-virtual {v0, p1}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->x0(I)V

    :cond_0
    new-instance v0, Lorg/npci/upi/security/pinactivitycomponent/o;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/npci/upi/security/pinactivitycomponent/o;-><init>(Landroid/content/Context;)V

    new-instance v2, Ljava/util/Timer;

    invoke-direct {v2}, Ljava/util/Timer;-><init>()V

    iput-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->e:Ljava/util/Timer;

    new-instance v3, Lorg/npci/upi/security/pinactivitycomponent/m$1;

    invoke-direct {v3, p0, v0, p1}, Lorg/npci/upi/security/pinactivitycomponent/m$1;-><init>(Lorg/npci/upi/security/pinactivitycomponent/m;Lorg/npci/upi/security/pinactivitycomponent/o;I)V

    const-wide/16 v4, 0x64

    const-wide/16 v6, 0x7d0

    invoke-virtual/range {v2 .. v7}, Ljava/util/Timer;->scheduleAtFixedRate(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public n(Landroid/view/View;Ljava/lang/String;)V
    .locals 3

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->h:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$id;->popupView:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$anim;->npci_slide_in_top:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$id;->popup_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget p2, Lorg/npci/upi/security/pinactivitycomponent/R$id;->popup_button:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    new-instance v0, Lorg/npci/upi/security/pinactivitycomponent/m$2;

    invoke-direct {v0, p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/m$2;-><init>(Lorg/npci/upi/security/pinactivitycomponent/m;Landroid/view/View;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p2, Ljava/util/Timer;

    invoke-direct {p2}, Ljava/util/Timer;-><init>()V

    iput-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->j:Ljava/util/Timer;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->k:Landroid/os/Handler;

    new-instance v0, Lorg/npci/upi/security/pinactivitycomponent/m$3;

    invoke-direct {v0, p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/m$3;-><init>(Lorg/npci/upi/security/pinactivitycomponent/m;Landroid/view/View;)V

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->l:Ljava/lang/Runnable;

    iget-wide v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->o:J

    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public o(Ljava/lang/Boolean;)V
    .locals 1

    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->r:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    new-instance v0, Lorg/npci/upi/security/pinactivitycomponent/m$4;

    invoke-direct {v0, p0}, Lorg/npci/upi/security/pinactivitycomponent/m$4;-><init>(Lorg/npci/upi/security/pinactivitycomponent/m;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->p:Landroid/content/Context;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->e:Ljava/util/Timer;

    invoke-virtual {p0, v0}, Lorg/npci/upi/security/pinactivitycomponent/m;->p(Ljava/util/Timer;)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->i:Ljava/util/Timer;

    invoke-virtual {p0, v0}, Lorg/npci/upi/security/pinactivitycomponent/m;->p(Ljava/util/Timer;)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->j:Ljava/util/Timer;

    invoke-virtual {p0, v0}, Lorg/npci/upi/security/pinactivitycomponent/m;->p(Ljava/util/Timer;)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->k:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->l:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->h:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    instance-of p1, p1, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    check-cast p1, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-virtual {p1, p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->w0(Lorg/npci/upi/security/pinactivitycomponent/m;)V

    :cond_0
    return-void
.end method

.method public p(Ljava/util/Timer;)V
    .locals 2

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const v0, 0xa49

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lorg/npci/upi/security/pinactivitycomponent/l;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public q(Lorg/npci/upi/security/pinactivitycomponent/n;)V
    .locals 2

    :try_start_0
    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->g:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->r:Z

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/widget/a;

    invoke-virtual {p1}, Lorg/npci/upi/security/pinactivitycomponent/n;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/a;->setText(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public r(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)V
    .locals 7

    const v1, 0xa4a

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v6}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;IZZ)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->j(Landroid/graphics/drawable/Drawable;Z)V

    sget v2, Lorg/npci/upi/security/pinactivitycomponent/R$string;->waiting_for_otp:I

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v0, v3, v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k(Ljava/lang/String;Landroid/view/View$OnClickListener;ZZ)V

    invoke-virtual {p1, v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->l(Z)V

    return-void
.end method

.method public abstract t()V
.end method

.method public u(Lorg/npci/upi/security/pinactivitycomponent/n;)V
    .locals 0

    invoke-virtual {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/m;->q(Lorg/npci/upi/security/pinactivitycomponent/n;)V

    return-void
.end method

.method public v()V
    .locals 7

    const v0, 0xa4b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0xa4c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0xa4d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_6

    :try_start_0
    const v0, 0xa4e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v6, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->b:Lorg/json/JSONObject;

    :cond_0
    iget-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->b:Lorg/json/JSONObject;

    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->b:Lorg/json/JSONObject;

    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    :cond_1
    const v0, 0xa4f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->m:Lorg/json/JSONObject;

    const v0, 0xa50

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    iput-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->d:Lorg/json/JSONArray;

    invoke-direct {p0}, Lorg/npci/upi/security/pinactivitycomponent/m;->w()V

    :cond_2
    const v0, 0xa51

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->c:Lorg/json/JSONObject;

    :cond_3
    const v0, 0xa52

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    iput-object v4, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->n:Lorg/json/JSONArray;

    :cond_4
    const/4 v2, 0x0

    :goto_0
    iget-object v4, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->n:Lorg/json/JSONArray;

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-ge v2, v4, :cond_6

    :try_start_1
    iget-object v4, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->n:Lorg/json/JSONArray;

    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/json/JSONObject;

    const v0, 0xa53

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const v0, 0xa54

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->n:Lorg/json/JSONArray;

    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/json/JSONObject;

    const v0, 0xa55

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->q:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x4

    iget-object v6, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->q:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->q:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0xa56

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->q:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lorg/npci/upi/security/pinactivitycomponent/m;->q:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    :try_start_2
    invoke-static {v3, v4}, Lorg/npci/upi/security/pinactivitycomponent/l;->a(Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_1
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0xa57

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_1
    return-void
.end method
