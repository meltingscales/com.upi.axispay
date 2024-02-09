.class public Lorg/npci/upi/security/pinactivitycomponent/GetCredential;
.super Lz;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;
    }
.end annotation


# static fields
.field public static final L:Ljava/lang/String;


# instance fields
.field public A:Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;

.field public B:Landroid/view/View;

.field public C:Landroid/view/View;

.field public D:Landroid/graphics/drawable/TransitionDrawable;

.field public E:Landroid/widget/ImageView;

.field public F:I

.field public G:Z

.field public H:I

.field public I:Landroidx/fragment/app/Fragment;

.field public J:Ljava/lang/Thread$UncaughtExceptionHandler;

.field public K:Ljava/lang/Boolean;

.field public final q:Landroid/content/Context;

.field public r:Lorg/json/JSONObject;

.field public s:Lorg/json/JSONObject;

.field public t:Lorg/json/JSONObject;

.field public u:Lorg/json/JSONArray;

.field public v:Lorg/json/JSONArray;

.field public w:Ljava/lang/String;

.field public x:Lorg/npci/upi/security/pinactivitycomponent/i;

.field public y:Lorg/npci/upi/security/pinactivitycomponent/a;

.field public z:Lorg/npci/upi/security/pinactivitycomponent/m;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->L:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lz;-><init>()V

    iput-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->q:Landroid/content/Context;

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->r:Lorg/json/JSONObject;

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->s:Lorg/json/JSONObject;

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->t:Lorg/json/JSONObject;

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->u:Lorg/json/JSONArray;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    const v1, 0x2f5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->w:Ljava/lang/String;

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->z:Lorg/npci/upi/security/pinactivitycomponent/m;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->G:Z

    iput v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->H:I

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->J:Ljava/lang/Thread$UncaughtExceptionHandler;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->K:Ljava/lang/Boolean;

    return-void
.end method

.method public static synthetic X(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)V
    .locals 0

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->m0()V

    return-void
.end method

.method public static synthetic Y(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->q:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic Z(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;Z)Z
    .locals 0

    iput-boolean p1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->G:Z

    return p1
.end method

.method public static synthetic a0(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)I
    .locals 0

    iget p0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->H:I

    return p0
.end method

.method public static synthetic b0(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)Lorg/npci/upi/security/pinactivitycomponent/m;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->z:Lorg/npci/upi/security/pinactivitycomponent/m;

    return-object p0
.end method

.method public static synthetic c0(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)Z
    .locals 0

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->n0()Z

    move-result p0

    return p0
.end method

.method public static synthetic d0(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->z0(Z)V

    return-void
.end method

.method public static synthetic e0(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)Landroid/graphics/drawable/TransitionDrawable;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->D:Landroid/graphics/drawable/TransitionDrawable;

    return-object p0
.end method

.method public static synthetic f0(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->B:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic g0(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->C:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic h0()Ljava/lang/String;
    .locals 1

    sget-object v0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->L:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final A0()V
    .locals 3

    :try_start_0
    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->A:Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->A:Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    sget-object v1, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->L:Ljava/lang/String;

    const v0, 0x2f6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public final i0()V
    .locals 5

    new-instance v1, Lorg/npci/upi/security/pinactivitycomponent/i;

    invoke-direct {v1}, Lorg/npci/upi/security/pinactivitycomponent/i;-><init>()V

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->x:Lorg/npci/upi/security/pinactivitycomponent/i;

    :try_start_0
    new-instance v1, Lorg/npci/upi/security/pinactivitycomponent/a;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->x:Lorg/npci/upi/security/pinactivitycomponent/i;

    invoke-direct {v1, v2, v3, p0}, Lorg/npci/upi/security/pinactivitycomponent/a;-><init>(Landroid/content/Context;Lorg/npci/upi/security/pinactivitycomponent/i;Landroid/app/Activity;)V

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->y:Lorg/npci/upi/security/pinactivitycomponent/a;

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->x:Lorg/npci/upi/security/pinactivitycomponent/i;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v2, p0}, Lorg/npci/upi/security/pinactivitycomponent/i;->c(Landroid/os/Bundle;Landroid/content/Context;)V
    :try_end_0
    .catch Lorg/npci/upi/security/pinactivitycomponent/b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    sget-object v2, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->L:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x2f7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :catch_1
    move-exception v1

    sget-object v2, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->L:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/b;->a()Ljava/lang/String;

    move-result-object v4

    :goto_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public j0()Z
    .locals 1

    const v0, 0x2f8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k0()Z
    .locals 1

    const v0, 0x2f9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l0()Lorg/npci/upi/security/pinactivitycomponent/a;
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->y:Lorg/npci/upi/security/pinactivitycomponent/a;

    return-object v0
.end method

.method public final m0()V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const v1, 0x2fa

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x2fb

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->l0()Lorg/npci/upi/security/pinactivitycomponent/a;

    move-result-object v1

    invoke-virtual {v1}, Lorg/npci/upi/security/pinactivitycomponent/a;->f()Landroid/os/ResultReceiver;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final n0()Z
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->B:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o0(Lorg/npci/upi/security/pinactivitycomponent/m;Landroid/os/Bundle;Z)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    :cond_0
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object p2

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->main_inner_layout:I

    invoke-virtual {p2, v1, p1}, Lje;->r(ILandroidx/fragment/app/Fragment;)Lje;

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lje;->h(Ljava/lang/String;)Lje;

    :cond_1
    invoke-virtual {p2}, Lje;->k()I

    invoke-virtual {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->w0(Lorg/npci/upi/security/pinactivitycomponent/m;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const v0, 0x2fc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x2fd

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 4

    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->G:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const v2, 0x2fe

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x2ff

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->l0()Lorg/npci/upi/security/pinactivitycomponent/a;

    move-result-object v2

    invoke-virtual {v2}, Lorg/npci/upi/security/pinactivitycomponent/a;->f()Landroid/os/ResultReceiver;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->I:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/p;

    invoke-virtual {v0}, Lorg/npci/upi/security/pinactivitycomponent/p;->w()V

    :cond_0
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->G:Z

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$string;->back_button_exit_message:I

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$2;

    invoke-direct {v1, p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$2;-><init>(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    invoke-super {p0, p1}, Lz;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x2000

    invoke-static {v0, v1, v1}, Lmyunmn/S;->a(Landroid/view/Window;II)V

    invoke-super {p0, p1}, Lsd;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object p1

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->J:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    new-instance v0, Lorg/npci/upi/security/pinactivitycomponent/g;

    invoke-direct {v0}, Lorg/npci/upi/security/pinactivitycomponent/g;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->q0()V

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->r0()V

    sget p1, Lorg/npci/upi/security/pinactivitycomponent/R$layout;->activity_pin_activity_component:I

    invoke-virtual {p0, p1}, Lz;->setContentView(I)V

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->t0()V

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->u0()V

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->y0()V

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->i0()V

    sget p1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->toolBar:I

    invoke-virtual {p0, p1}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    const/16 v1, 0xa

    invoke-virtual {p1, v0, v1, v0, v0}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    sget p1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->main_inner_layout:I

    invoke-virtual {p0, p1}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->transaction_info_root:I

    invoke-virtual {p0, v1}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->K:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_0

    const/16 p1, 0x8

    invoke-virtual {v1, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x32

    invoke-virtual {p1, v0, v1, v0, v0}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    :goto_0
    new-instance p1, Lorg/npci/upi/security/pinactivitycomponent/p;

    invoke-direct {p1}, Lorg/npci/upi/security/pinactivitycomponent/p;-><init>()V

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->I:Landroidx/fragment/app/Fragment;

    check-cast p1, Lorg/npci/upi/security/pinactivitycomponent/p;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->o0(Lorg/npci/upi/security/pinactivitycomponent/m;Landroid/os/Bundle;Z)V

    sget p1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->go_back:I

    invoke-virtual {p0, p1}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_1

    new-instance v0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$1;

    invoke-direct {v0, p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$1;-><init>(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lz;->onDestroy()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->J:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method

.method public onPause()V
    .locals 0

    invoke-super {p0}, Lsd;->onPause()V

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->A0()V

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Lsd;->onResume()V

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->k0()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;-><init>(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;Lorg/npci/upi/security/pinactivitycomponent/GetCredential$1;)V

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->A:Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->s0()V

    goto :goto_0

    :cond_0
    sget-object v0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->L:Ljava/lang/String;

    const v1, 0x300

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final p0(F)I
    .locals 1

    invoke-virtual {p0}, Lz;->getResources()Landroid/content/res/Resources;

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

.method public final q0()V
    .locals 5

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_5

    :try_start_0
    const v0, 0x301

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->r:Lorg/json/JSONObject;

    :cond_0
    const v0, 0x302

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->s:Lorg/json/JSONObject;

    if-eqz v3, :cond_1

    const v0, 0x303

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    iput-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->u:Lorg/json/JSONArray;

    :cond_1
    const v0, 0x304

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->t:Lorg/json/JSONObject;

    :cond_2
    const v0, 0x305

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    iput-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    :cond_3
    const v0, 0x306

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->w:Ljava/lang/String;

    const v0, 0x307

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/Locale;

    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->w:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    array-length v3, v1

    const/4 v4, 0x2

    if-ne v3, v4, :cond_4

    new-instance v2, Ljava/util/Locale;

    const/4 v3, 0x0

    aget-object v3, v1, v3

    const/4 v4, 0x1

    aget-object v1, v1, v4

    invoke-direct {v2, v3, v1}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    invoke-static {v2}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    new-instance v1, Landroid/content/res/Configuration;

    invoke-direct {v1}, Landroid/content/res/Configuration;-><init>()V

    iput-object v2, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {p0}, Landroid/app/Activity;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {p0}, Landroid/app/Activity;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v2, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->L:Ljava/lang/String;

    invoke-static {v2, v1}, Lorg/npci/upi/security/pinactivitycomponent/l;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public final r0()V
    .locals 5

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->u:Lorg/json/JSONArray;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    :try_start_0
    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->u:Lorg/json/JSONArray;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    const v0, 0x308

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v0, 0x309

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->K:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v2, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->L:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x30a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public final s0()V
    .locals 3

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    :try_start_0
    const v0, 0x30b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const/16 v2, 0x3e7

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->setPriority(I)V

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->A:Lorg/npci/upi/security/pinactivitycomponent/GetCredential$a;

    invoke-virtual {p0, v2, v1}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    sget-object v1, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->L:Ljava/lang/String;

    const v0, 0x30c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public t0()V
    .locals 16

    move-object/from16 v15, p0

    const p0, 0x30d

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->r:Lorg/json/JSONObject;

    const p0, 0x30e

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_0

    const p0, 0x30f

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    iget-object v3, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->t:Lorg/json/JSONObject;

    if-nez v3, :cond_1

    new-instance v0, Lorg/npci/upi/security/pinactivitycomponent/b;

    const p0, 0x310

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const p0, 0x311

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v15, v1, v2}, Lorg/npci/upi/security/pinactivitycomponent/b;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const p0, 0x312

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    move-object v6, v2

    move v5, v4

    :goto_1
    iget-object v7, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v7

    const p0, 0x313

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const p0, 0x314

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const p0, 0x315

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    if-ge v5, v7, :cond_4

    :try_start_0
    iget-object v7, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v7, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/json/JSONObject;

    invoke-virtual {v7, v10, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v7, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v7, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/json/JSONObject;

    invoke-virtual {v7, v9, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, -0x4

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v11

    invoke-virtual {v6, v7, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const p0, 0x316

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_2
    iget-object v7, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v7, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/json/JSONObject;

    invoke-virtual {v7, v10, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const p0, 0x317

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v7, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v7, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/json/JSONObject;

    invoke-virtual {v7, v9, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v7

    sget-object v8, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->L:Ljava/lang/String;

    invoke-static {v8, v7}, Lorg/npci/upi/security/pinactivitycomponent/l;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_4
    :goto_2
    move v5, v4

    :goto_3
    iget-object v7, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v7

    if-ge v5, v7, :cond_8

    :try_start_1
    iget-object v7, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v7, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/json/JSONObject;

    invoke-virtual {v7, v10, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const p0, 0x318

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v7, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v7, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/json/JSONObject;

    :goto_4
    invoke-virtual {v7, v9, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_5
    iget-object v7, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v7, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/json/JSONObject;

    invoke-virtual {v7, v10, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    iget-object v7, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v7, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/json/JSONObject;

    goto :goto_4

    :cond_6
    iget-object v7, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v7, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/json/JSONObject;

    const p0, 0x319

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    iget-object v7, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v7, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/json/JSONObject;

    invoke-virtual {v7, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    move-exception v7

    sget-object v11, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->L:Ljava/lang/String;

    invoke-static {v11, v7}, Lorg/npci/upi/security/pinactivitycomponent/l;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_8
    move-object v0, v2

    :goto_5
    sget v5, Lorg/npci/upi/security/pinactivitycomponent/R$id;->transaction_bar_root:I

    invoke-virtual {v15, v5}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/LinearLayout;

    sget v7, Lorg/npci/upi/security/pinactivitycomponent/R$id;->tv_acc_or_payee:I

    invoke-virtual {v15, v7}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    sget v8, Lorg/npci/upi/security/pinactivitycomponent/R$id;->tv_acc_or_payee_name:I

    invoke-virtual {v15, v8}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    sget v11, Lorg/npci/upi/security/pinactivitycomponent/R$id;->transaction_bar_title:I

    invoke-virtual {v15, v11}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    sget v12, Lorg/npci/upi/security/pinactivitycomponent/R$id;->transaction_bar_info:I

    invoke-virtual {v15, v12}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/TextView;

    sget v13, Lorg/npci/upi/security/pinactivitycomponent/R$id;->transaction_bar_arrow:I

    invoke-virtual {v15, v13}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/ImageView;

    iput-object v13, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->E:Landroid/widget/ImageView;

    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_9
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v6, 0x1

    if-nez v1, :cond_a

    if-eqz v3, :cond_a

    const p0, 0x31a

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_a

    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    const-wide/16 v13, 0x0

    cmpl-double v1, v7, v13

    if-lez v1, :cond_a

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const p0, 0x31b

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const p0, 0x31c

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const p0, 0x31d

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_8

    :cond_a
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_6
    iget-object v1, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v4, v1, :cond_c

    :try_start_2
    iget-object v1, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    invoke-virtual {v1, v10, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const p0, 0x31e

    invoke-static/range {p0 .. p0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    invoke-virtual {v1, v9, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_7

    :catch_2
    move-exception v1

    sget-object v3, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->L:Ljava/lang/String;

    invoke-static {v3, v1}, Lorg/npci/upi/security/pinactivitycomponent/l;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_b
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_c
    :goto_7
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v0, 0x41600000    # 14.0f

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setTextSize(F)V

    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    invoke-virtual {v12, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    const/16 v0, 0x2bc

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setMaxWidth(I)V

    :goto_8
    invoke-virtual {v15}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xd

    if-lt v2, v3, :cond_d

    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    iget v0, v1, Landroid/graphics/Point;->y:I

    goto :goto_9

    :cond_d
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    :goto_9
    iput v0, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->F:I

    new-instance v0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$4;

    invoke-direct {v0, v15}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$4;-><init>(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)V

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$id;->transaction_details_scroller:I

    invoke-virtual {v15, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->B:Landroid/view/View;

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$id;->transaction_details_expanded_space:I

    invoke-virtual {v15, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->C:Landroid/view/View;

    iget-object v0, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->B:Landroid/view/View;

    new-instance v1, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$5;

    invoke-direct {v1, v15}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$5;-><init>(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->C:Landroid/view/View;

    if-eqz v0, :cond_e

    new-instance v1, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$6;

    invoke-direct {v1, v15}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$6;-><init>(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_e
    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$id;->transaction_info_root:I

    invoke-virtual {v15, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/TransitionDrawable;

    iput-object v0, v15, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->D:Landroid/graphics/drawable/TransitionDrawable;

    invoke-virtual {v0, v6}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    return-void
.end method

.method public u0()V
    .locals 12

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$id;->transaction_details_root:I

    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_7

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    sget v4, Lorg/npci/upi/security/pinactivitycomponent/R$layout;->layout_transaction_details_item:I

    invoke-virtual {v3, v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    sget v4, Lorg/npci/upi/security/pinactivitycomponent/R$id;->transaction_details_item_name:I

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    sget v5, Lorg/npci/upi/security/pinactivitycomponent/R$id;->transaction_details_item_value:I

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    sget v6, Lorg/npci/upi/security/pinactivitycomponent/R$id;->verified_merchant:I

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout;

    iget-object v6, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v:Lorg/json/JSONArray;

    invoke-virtual {v6, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    const v7, 0x31f

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x320

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const v10, 0x321

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    const v10, 0x322

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    if-eqz v9, :cond_0

    const v7, 0x323

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    :goto_1
    invoke-virtual {v7}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_4

    :cond_0
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const v11, 0x324

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const v11, 0x325

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const v11, 0x326

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const v7, 0x327

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_2
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const v11, 0x328

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    const v7, 0x329

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_3
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const v11, 0x32a

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const v7, 0x32b

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_4
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const v9, 0x32c

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const v7, 0x32d

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_1

    :cond_5
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_1

    :cond_6
    :goto_3
    const v7, 0x32e

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const v7, 0x32f

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_2

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_7
    new-instance v1, Landroid/view/View;

    invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v3, -0x1

    const/high16 v4, 0x40400000    # 3.0f

    invoke-virtual {p0, v4}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->p0(F)I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v2, -0x1000000

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    const v2, 0x3ea8f5c3    # 0.33f

    invoke-static {v1, v2}, Lac;->t0(Landroid/view/View;F)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method public v0(FFILandroid/view/View;)V
    .locals 8

    new-instance v7, Landroid/view/animation/RotateAnimation;

    const/4 v3, 0x1

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    move-object v0, v7

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    new-instance p1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {p1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v7, p1}, Landroid/view/animation/RotateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    int-to-long p1, p3

    invoke-virtual {v7, p1, p2}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    const/4 p1, 0x1

    invoke-virtual {v7, p1}, Landroid/view/animation/RotateAnimation;->setFillEnabled(Z)V

    invoke-virtual {v7, p1}, Landroid/view/animation/RotateAnimation;->setFillAfter(Z)V

    invoke-virtual {p4, v7}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public w0(Lorg/npci/upi/security/pinactivitycomponent/m;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->z:Lorg/npci/upi/security/pinactivitycomponent/m;

    return-void
.end method

.method public x0(I)V
    .locals 0

    iput p1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->H:I

    return-void
.end method

.method public final y0()V
    .locals 2

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$id;->fragmentTelKeyboard:I

    invoke-virtual {p0, v0}, Lz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lorg/npci/upi/security/pinactivitycomponent/Keypad;

    if-eqz v0, :cond_0

    new-instance v1, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$3;

    invoke-direct {v1, p0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$3;-><init>(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;)V

    invoke-virtual {v0, v1}, Lorg/npci/upi/security/pinactivitycomponent/Keypad;->setOnKeyPressCallback(Lorg/npci/upi/security/pinactivitycomponent/Keypad$a;)V

    :cond_0
    return-void
.end method

.method public final z0(Z)V
    .locals 5

    const/16 v0, 0x12c

    const/high16 v1, 0x43340000    # 180.0f

    const/4 v2, 0x0

    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->E:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    invoke-virtual {p0, v2, v1, v0, v3}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v0(FFILandroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1, v2, v0, v3}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->v0(FFILandroid/view/View;)V

    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-le v0, v1, :cond_4

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->B:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->F:I

    :cond_1
    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->B:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->B:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    if-eqz p1, :cond_2

    move v4, v2

    goto :goto_1

    :cond_2
    const/high16 v3, -0x40800000    # -1.0f

    int-to-float v4, v0

    mul-float/2addr v4, v3

    :goto_1
    invoke-virtual {v1, v4}, Landroid/view/ViewPropertyAnimator;->y(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    if-eqz p1, :cond_3

    const/high16 v2, 0x3f800000    # 1.0f

    :cond_3
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v2, 0x12c

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    new-instance v2, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$7;

    invoke-direct {v2, p0, p1, v0}, Lorg/npci/upi/security/pinactivitycomponent/GetCredential$7;-><init>(Lorg/npci/upi/security/pinactivitycomponent/GetCredential;ZI)V

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/GetCredential;->B:Landroid/view/View;

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    goto :goto_2

    :cond_5
    const/16 p1, 0x8

    :goto_2
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :goto_3
    return-void
.end method
