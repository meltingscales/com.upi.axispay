.class public abstract Lje;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lje$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lje$a;",
            ">;"
        }
    .end annotation
.end field

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public h:Z

.field public i:Ljava/lang/String;

.field public j:I

.field public k:Ljava/lang/CharSequence;

.field public l:I

.field public m:Ljava/lang/CharSequence;

.field public n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public p:Z

.field public q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxd;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lje;->a:Ljava/util/ArrayList;

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lje;->h:Z

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lje;->p:Z

    return-void
.end method


# virtual methods
.method public c(ILandroidx/fragment/app/Fragment;)Lje;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-virtual {p0, p1, p2, v0, v1}, Lje;->p(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    return-object p0
.end method

.method public d(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Lje;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, p2, p3, v0}, Lje;->p(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    return-object p0
.end method

.method public e(Landroid/view/ViewGroup;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lje;
    .locals 0

    .line 1
    iput-object p1, p2, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    .line 2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result p1

    invoke-virtual {p0, p1, p2, p3}, Lje;->d(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Lje;

    return-object p0
.end method

.method public f(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lje;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-virtual {p0, v0, p1, p2, v1}, Lje;->p(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    return-object p0
.end method

.method public g(Lje$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lje;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    iget v0, p0, Lje;->b:I

    iput v0, p1, Lje$a;->c:I

    .line 3
    iget v0, p0, Lje;->c:I

    iput v0, p1, Lje$a;->d:I

    .line 4
    iget v0, p0, Lje;->d:I

    iput v0, p1, Lje$a;->e:I

    .line 5
    iget v0, p0, Lje;->e:I

    iput v0, p1, Lje$a;->f:I

    return-void
.end method

.method public h(Ljava/lang/String;)Lje;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lje;->h:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lje;->g:Z

    .line 3
    iput-object p1, p0, Lje;->i:Ljava/lang/String;

    return-object p0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const v0, 0x2626

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i(Landroidx/fragment/app/Fragment;)Lje;
    .locals 2

    .line 1
    new-instance v0, Lje$a;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p1}, Lje$a;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, v0}, Lje;->g(Lje$a;)V

    return-object p0
.end method

.method public abstract j()I
.end method

.method public abstract k()I
.end method

.method public abstract l()V
.end method

.method public abstract m()V
.end method

.method public n(Landroidx/fragment/app/Fragment;)Lje;
    .locals 2

    .line 1
    new-instance v0, Lje$a;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p1}, Lje$a;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, v0}, Lje;->g(Lje$a;)V

    return-object p0
.end method

.method public o()Lje;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lje;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lje;->h:Z

    return-object p0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const v1, 0x2627

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public p(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 4
    invoke-virtual {v0}, Ljava/lang/Class;->isMemberClass()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_0
    const v0, 0x2628

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x2629

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-eqz p3, :cond_3

    .line 5
    iget-object v2, p2, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x262a

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_2
    :goto_0
    iput-object p3, p2, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    :cond_3
    if-eqz p1, :cond_7

    const/4 v2, -0x1

    if-eq p1, v2, :cond_6

    .line 8
    iget p3, p2, Landroidx/fragment/app/Fragment;->mFragmentId:I

    if-eqz p3, :cond_5

    if-ne p3, p1, :cond_4

    goto :goto_1

    .line 9
    :cond_4
    new-instance p3, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x262b

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p2, Landroidx/fragment/app/Fragment;->mFragmentId:I

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3

    .line 10
    :cond_5
    :goto_1
    iput p1, p2, Landroidx/fragment/app/Fragment;->mFragmentId:I

    iput p1, p2, Landroidx/fragment/app/Fragment;->mContainerId:I

    goto :goto_2

    .line 11
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x262c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const p2, 0x262d

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p2, 0x262e

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_7
    :goto_2
    new-instance p1, Lje$a;

    invoke-direct {p1, p4, p2}, Lje$a;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, p1}, Lje;->g(Lje$a;)V

    return-void

    .line 13
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const p3, 0x262f

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p3, 0x2630

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public q(Landroidx/fragment/app/Fragment;)Lje;
    .locals 2

    .line 1
    new-instance v0, Lje$a;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1}, Lje$a;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, v0}, Lje;->g(Lje$a;)V

    return-object p0
.end method

.method public r(ILandroidx/fragment/app/Fragment;)Lje;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lje;->s(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Lje;

    return-object p0
.end method

.method public s(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Lje;
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, p1, p2, p3, v0}, Lje;->p(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    return-object p0

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const p2, 0x2631

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t(Landroidx/fragment/app/Fragment;Lbf$c;)Lje;
    .locals 2

    .line 1
    new-instance v0, Lje$a;

    const/16 v1, 0xa

    invoke-direct {v0, v1, p1, p2}, Lje$a;-><init>(ILandroidx/fragment/app/Fragment;Lbf$c;)V

    invoke-virtual {p0, v0}, Lje;->g(Lje$a;)V

    return-object p0
.end method

.method public u(Z)Lje;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lje;->p:Z

    return-object p0
.end method
