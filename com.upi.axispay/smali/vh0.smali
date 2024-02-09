.class public final Lvh0;
.super Landroid/view/LayoutInflater;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvh0$d;,
        Lvh0$c;,
        Lvh0$i;,
        Lvh0$j;,
        Lvh0$g;,
        Lvh0$h;,
        Lvh0$e;,
        Lvh0$f;,
        Lvh0$b;
    }
.end annotation


# static fields
.field public static final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lci0;

.field public static final h:Lvh0$b;


# instance fields
.field public final a:Z

.field public final b:Lkh0;

.field public final c:Lkh0;

.field public d:Z

.field public e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvh0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvh0$b;-><init>(Lvl0;)V

    sput-object v0, Lvh0;->h:Lvh0$b;

    const v0, 0x307c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x307d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lsj0;->d([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lvh0;->f:Ljava/util/Set;

    .line 2
    sget-object v0, Lvh0$a;->b:Lvh0$a;

    invoke-static {v0}, Ldi0;->b(Lsk0;)Lci0;

    move-result-object v0

    sput-object v0, Lvh0;->g:Lci0;

    return-void
.end method

.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Z)V
    .locals 1

    const v0, 0x307e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x307f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/LayoutInflater;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;)V

    .line 2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1c

    if-gt p1, p2, :cond_1

    invoke-static {}, Lz9;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Lvh0;->a:Z

    .line 3
    new-instance p1, Lvh0$c;

    invoke-direct {p1, p0}, Lvh0$c;-><init>(Lvh0;)V

    iput-object p1, p0, Lvh0;->b:Lkh0;

    .line 4
    new-instance p1, Lvh0$d;

    invoke-direct {p1, p0}, Lvh0$d;-><init>(Lvh0;)V

    iput-object p1, p0, Lvh0;->c:Lkh0;

    .line 5
    sget-object p1, Lph0;->h:Lph0$c;

    invoke-virtual {p1}, Lph0$c;->b()Lph0;

    move-result-object p1

    invoke-virtual {p1}, Lph0;->h()Z

    move-result p1

    iput-boolean p1, p0, Lvh0;->e:Z

    .line 6
    invoke-virtual {p0, p3}, Lvh0;->h(Z)V

    return-void
.end method

.method public static final synthetic a(Lvh0;Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lvh0;->f(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Lvh0;->f:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic c()Lci0;
    .locals 1

    .line 1
    sget-object v0, Lvh0;->g:Lci0;

    return-object v0
.end method

.method public static final synthetic d(Lvh0;Landroid/view/View;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lvh0;->i(Landroid/view/View;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lvh0;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lvh0;->j(Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;
    .locals 2

    const v0, 0x3080

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lvh0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lvh0;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Z)V

    return-object v0
.end method

.method public final f(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 8

    .line 1
    sget-object v1, Lph0;->h:Lph0$c;

    invoke-virtual {v1}, Lph0$c;->b()Lph0;

    move-result-object v1

    invoke-virtual {v1}, Lph0;->f()Z

    move-result v1

    if-nez v1, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_3

    const/16 v3, 0x2e

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, p2

    .line 2
    invoke-static/range {v2 .. v7}, Lco0;->L(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-le v1, v2, :cond_3

    .line 3
    iget-boolean v1, p0, Lvh0;->a:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {p0, p3}, Lvh0;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-virtual {p1, p2, v2, p4}, Landroid/view/LayoutInflater;->createView(Ljava/lang/String;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    goto :goto_1

    .line 5
    :cond_1
    sget-object v1, Lvh0;->h:Lvh0$b;

    invoke-static {v1}, Lvh0$b;->a(Lvh0$b;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    check-cast v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    .line 6
    aget-object v5, v3, v4

    .line 7
    aput-object p3, v3, v4

    .line 8
    invoke-static {v1}, Lvh0$b;->a(Lvh0$b;)Ljava/lang/reflect/Field;

    move-result-object p3

    invoke-static {p3, p0, v3}, Lth0;->c(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    :try_start_0
    invoke-virtual {p0, p2, v2, p4}, Landroid/view/LayoutInflater;->createView(Ljava/lang/String;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    aput-object v5, v3, v4

    .line 11
    invoke-static {v1}, Lvh0$b;->a(Lvh0$b;)Ljava/lang/reflect/Field;

    move-result-object p2

    :goto_0
    invoke-static {p2, p0, v3}, Lth0;->c(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 12
    aput-object v5, v3, v4

    .line 13
    sget-object p2, Lvh0;->h:Lvh0$b;

    invoke-static {p2}, Lvh0$b;->a(Lvh0$b;)Ljava/lang/reflect/Field;

    move-result-object p2

    invoke-static {p2, p0, v3}, Lth0;->c(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)V

    throw p1

    .line 14
    :catch_0
    aput-object v5, v3, v4

    .line 15
    sget-object p2, Lvh0;->h:Lvh0$b;

    invoke-static {p2}, Lvh0$b;->a(Lvh0$b;)Ljava/lang/reflect/Field;

    move-result-object p2

    goto :goto_0

    .line 16
    :cond_2
    new-instance p1, Lmi0;

    const v0, 0x3081

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lmi0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    return-object p1
.end method

.method public final g()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lvh0;->d:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Lph0;->h:Lph0$c;

    invoke-virtual {v0}, Lph0$c;->b()Lph0;

    move-result-object v0

    invoke-virtual {v0}, Lph0;->g()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {p0}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Landroid/view/LayoutInflater$Factory2;

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 4
    iput-boolean v1, p0, Lvh0;->d:Z

    return-void

    .line 5
    :cond_2
    const-class v0, Landroid/view/LayoutInflater;

    const v2, 0x3082

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lth0;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 6
    new-instance v4, Lvh0$e;

    invoke-virtual {p0}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v5

    if-eqz v5, :cond_3

    check-cast v5, Landroid/view/LayoutInflater$Factory2;

    invoke-direct {v4, v5, p0}, Lvh0$e;-><init>(Landroid/view/LayoutInflater$Factory2;Lvh0;)V

    aput-object v4, v2, v3

    invoke-static {v0, p0, v2}, Lth0;->b(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 7
    iput-boolean v1, p0, Lvh0;->d:Z

    return-void

    .line 8
    :cond_3
    new-instance v0, Lmi0;

    const v1, 0x3083

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lmi0;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h(Z)V
    .locals 0

    if-eqz p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object p1

    instance-of p1, p1, Lvh0$g;

    if-nez p1, :cond_1

    .line 2
    invoke-virtual {p0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvh0;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 3
    :cond_1
    invoke-virtual {p0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object p1

    instance-of p1, p1, Lvh0$i;

    if-nez p1, :cond_2

    .line 4
    invoke-virtual {p0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvh0;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    :cond_2
    return-void
.end method

.method public final i(Landroid/view/View;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    .line 1
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/LayoutInflater;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 2
    iget-boolean p3, p0, Lvh0;->e:Z

    if-eqz p3, :cond_0

    .line 3
    sget p3, Loh0;->viewpump_layout_res:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-object p2
.end method

.method public inflate(Lorg/xmlpull/v1/XmlPullParser;Landroid/view/ViewGroup;Z)Landroid/view/View;
    .locals 1

    const v0, 0x3084

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0}, Lvh0;->g()V

    .line 5
    invoke-super {p0, p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(Lorg/xmlpull/v1/XmlPullParser;Landroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x3085

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lyl0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final j(Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    .line 1
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/view/LayoutInflater;->onCreateView(Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    const v0, 0x3086

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lph0;->h:Lph0$c;

    invoke-virtual {v0}, Lph0$c;->b()Lph0;

    move-result-object v0

    .line 2
    new-instance v7, Llh0;

    .line 3
    invoke-virtual {p0}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v3

    const v1, 0x3087

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lyl0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget-object v6, p0, Lvh0;->c:Lkh0;

    move-object v1, v7

    move-object v2, p2

    move-object v4, p3

    move-object v5, p1

    .line 5
    invoke-direct/range {v1 .. v6}, Llh0;-><init>(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Landroid/view/View;Lkh0;)V

    invoke-virtual {v0, v7}, Lph0;->d(Llh0;)Lmh0;

    move-result-object p1

    invoke-virtual {p1}, Lmh0;->e()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    const v0, 0x3088

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    sget-object v0, Lph0;->h:Lph0$c;

    invoke-virtual {v0}, Lph0$c;->b()Lph0;

    move-result-object v0

    .line 7
    new-instance v9, Llh0;

    .line 8
    invoke-virtual {p0}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v3

    const v1, 0x3089

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lyl0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object v6, p0, Lvh0;->b:Lkh0;

    const/4 v5, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object v1, v9

    move-object v2, p1

    move-object v4, p2

    .line 10
    invoke-direct/range {v1 .. v8}, Llh0;-><init>(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Landroid/view/View;Lkh0;ILvl0;)V

    invoke-virtual {v0, v9}, Lph0;->d(Llh0;)Lmh0;

    move-result-object p1

    invoke-virtual {p1}, Lmh0;->e()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public setFactory(Landroid/view/LayoutInflater$Factory;)V
    .locals 1

    const v0, 0x308a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of v0, p1, Lvh0$i;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lvh0$i;

    invoke-direct {v0, p1}, Lvh0$i;-><init>(Landroid/view/LayoutInflater$Factory;)V

    .line 3
    invoke-super {p0, v0}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-super {p0, p1}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    :goto_0
    return-void
.end method

.method public setFactory2(Landroid/view/LayoutInflater$Factory2;)V
    .locals 1

    const v0, 0x308b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of v0, p1, Lvh0$g;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lvh0$g;

    invoke-direct {v0, p1}, Lvh0$g;-><init>(Landroid/view/LayoutInflater$Factory2;)V

    .line 3
    invoke-super {p0, v0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-super {p0, p1}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    :goto_0
    return-void
.end method
