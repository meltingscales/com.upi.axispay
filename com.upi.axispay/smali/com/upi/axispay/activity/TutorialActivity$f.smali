.class public Lcom/upi/axispay/activity/TutorialActivity$f;
.super Lee;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/upi/axispay/activity/TutorialActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public h:Lmg0;

.field public final synthetic i:Lcom/upi/axispay/activity/TutorialActivity;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/activity/TutorialActivity;Landroidx/fragment/app/FragmentManager;Lmg0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/activity/TutorialActivity$f;->i:Lcom/upi/axispay/activity/TutorialActivity;

    .line 2
    invoke-direct {p0, p2}, Lee;-><init>(Landroidx/fragment/app/FragmentManager;)V

    .line 3
    iput-object p3, p0, Lcom/upi/axispay/activity/TutorialActivity$f;->h:Lmg0;

    return-void
.end method


# virtual methods
.method public d()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public f(I)Ljava/lang/CharSequence;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const p1, 0xfbe

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const p1, 0xfbf

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public t(I)Landroidx/fragment/app/Fragment;
    .locals 1

    add-int/lit8 p1, p1, 0x1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity$f;->i:Lcom/upi/axispay/activity/TutorialActivity;

    iget v0, v0, Lcom/upi/axispay/activity/TutorialActivity;->u:I

    invoke-static {p1, v0}, Lzf0;->l(II)Lzf0;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/activity/TutorialActivity$f;->h:Lmg0;

    iput-object v0, p1, Lzf0;->b:Lmg0;

    return-object p1
.end method
