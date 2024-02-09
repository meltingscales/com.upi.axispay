.class public Lre0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;
.implements Log0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lre0$t;
    }
.end annotation


# instance fields
.field public A:Ljava/lang/String;

.field public B:Ljava/lang/String;

.field public C:Ljava/lang/String;

.field public D:I

.field public E:Lcom/google/android/material/tabs/TabLayout;

.field public F:Landroidx/viewpager/widget/ViewPager;

.field public G:Landroid/widget/ImageView;

.field public H:Landroid/widget/ImageView;

.field public I:Ljava/util/Date;

.field public J:Ljava/util/Calendar;

.field public K:Ljava/util/Calendar;

.field public L:Ljava/util/Calendar;

.field public l:Lre0$t;

.field public m:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public n:Luc0;

.field public o:Laf0;

.field public p:Lcom/olive/upi/transport/model/TransactionData;

.field public q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;"
        }
    .end annotation
.end field

.field public r:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;"
        }
    .end annotation
.end field

.field public s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;"
        }
    .end annotation
.end field

.field public t:Landroid/widget/TextView;

.field public u:Landroid/widget/TextView;

.field public v:Ljava/lang/String;

.field public w:Ljava/lang/String;

.field public x:I

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lre0;->m:Ljava/util/HashSet;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lre0;->q:Ljava/util/ArrayList;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lre0;->s:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lre0;->x:I

    return-void
.end method

.method private synthetic D(Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 16

    move-object/from16 v7, p0

    .line 1
    invoke-virtual/range {p1 .. p1}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-virtual/range {p2 .. p2}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual/range {p2 .. p2}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v0, 0x93d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v4, v0

    .line 4
    invoke-virtual/range {p3 .. p3}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v5

    .line 5
    invoke-virtual/range {p4 .. p4}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1204a6

    .line 6
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const v0, 0x93e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object v6, v0

    goto :goto_2

    :cond_1
    const v1, 0x7f1204a2

    .line 7
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const v0, 0x93f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    const v1, 0x7f12049b

    .line 8
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const v0, 0x940

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    const v1, 0x7f120492

    .line 9
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const v0, 0x941

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    const v1, 0x7f120495

    .line 10
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    const v0, 0x942

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    const v1, 0x7f12048f

    .line 11
    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const v0, 0x943

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_6
    const v0, 0x944

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 12
    :goto_2
    iget-object v0, v7, Lre0;->t:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x945

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljg0;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 13
    iget-object v2, v7, Lre0;->u:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ljg0;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    if-eqz v0, :cond_a

    if-nez v2, :cond_7

    goto/16 :goto_3

    .line 14
    :cond_7
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    sub-long/2addr v8, v10

    const-wide/32 v10, 0x5265c00

    div-long/2addr v8, v10

    const-wide/16 v10, 0x1e

    cmp-long v2, v8, v10

    if-lez v2, :cond_8

    .line 15
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x7f120501

    invoke-virtual {v7, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 16
    :cond_8
    iget-object v2, v7, Lre0;->I:Ljava/util/Date;

    invoke-virtual {v0, v2}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 17
    invoke-static {v0, v1}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const v8, 0x946

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v9, 0x947

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v8, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v11

    .line 18
    iget-object v2, v7, Lre0;->u:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ljg0;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    .line 19
    invoke-static {v2, v1}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v8, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v12

    .line 20
    iput-object v0, v7, Lre0;->I:Ljava/util/Date;

    .line 21
    iget-object v0, v7, Lre0;->t:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lre0;->y:Ljava/lang/String;

    .line 22
    iget-object v0, v7, Lre0;->u:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lre0;->z:Ljava/lang/String;

    .line 23
    iput-object v3, v7, Lre0;->A:Ljava/lang/String;

    .line 24
    iput-object v4, v7, Lre0;->B:Ljava/lang/String;

    .line 25
    iput v5, v7, Lre0;->D:I

    .line 26
    iput-object v6, v7, Lre0;->C:Ljava/lang/String;

    .line 27
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 28
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v10

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x1

    invoke-virtual/range {v10 .. v15}, Lua0;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 29
    invoke-virtual/range {p5 .. p5}, Landroid/app/AlertDialog;->dismiss()V

    goto :goto_3

    .line 30
    :cond_9
    iput-object v0, v7, Lre0;->I:Ljava/util/Date;

    .line 31
    iget-object v0, v7, Lre0;->t:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v0, v7, Lre0;->u:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lre0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 32
    invoke-virtual/range {p5 .. p5}, Landroid/app/AlertDialog;->dismiss()V

    :cond_a
    :goto_3
    return-void
.end method

.method public static F()Lre0;
    .locals 1

    .line 1
    new-instance v0, Lre0;

    invoke-direct {v0}, Lre0;-><init>()V

    return-object v0
.end method

.method public static synthetic x(Lre0;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lre0;->E:Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method

.method public static synthetic y(Lre0;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lre0;->G(I)V

    return-void
.end method

.method public static synthetic z(Lre0;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lre0;->I(I)V

    return-void
.end method


# virtual methods
.method public A(Landroid/view/View;)V
    .locals 7

    .line 1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-lt v1, v2, :cond_0

    .line 2
    new-instance v1, Landroid/widget/PopupMenu;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    const/16 v3, 0x30

    invoke-direct {v1, v2, p1, v3}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 3
    invoke-virtual {v1}, Landroid/widget/PopupMenu;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object p1

    const v2, 0x7f0e0001

    invoke-virtual {v1}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 4
    :try_start_0
    const-class p1, Ld3;

    const v0, 0x948

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    const/4 v2, 0x1

    .line 5
    invoke-virtual {p1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    new-array v3, v2, [Ljava/lang/Class;

    .line 7
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const v0, 0x949

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/Object;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v4, v2, v5

    invoke-virtual {v3, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    :catch_0
    invoke-virtual {v1}, Landroid/widget/PopupMenu;->show()V

    .line 10
    new-instance p1, Lre0$a;

    invoke-direct {p1, p0}, Lre0$a;-><init>(Lre0;)V

    invoke-virtual {v1, p1}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    :cond_0
    return-void
.end method

.method public final B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, p5

    move-object/from16 v4, p6

    .line 1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v6, v0, Lre0;->r:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/olive/upi/transport/model/TranHistory;

    .line 3
    invoke-virtual {v7}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v8

    .line 4
    invoke-virtual {v7}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v9

    .line 5
    invoke-virtual {v7}, Lcom/olive/upi/transport/model/TranHistory;->getType()Ljava/lang/String;

    move-result-object v10

    .line 6
    invoke-virtual {v7}, Lcom/olive/upi/transport/model/TranHistory;->getStatus()Ljava/lang/String;

    move-result-object v11

    .line 7
    invoke-virtual {v7}, Lcom/olive/upi/transport/model/TranHistory;->getDateTime()Ljava/lang/String;

    move-result-object v12

    const v13, 0x94a

    invoke-static {v13}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    .line 8
    invoke-virtual {v9, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_0

    const v13, 0x94b

    invoke-static {v13}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    goto :goto_1

    :cond_0
    const v13, 0x94c

    invoke-static {v13}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    .line 9
    :goto_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v14

    const v15, 0x94d

    invoke-static {v15}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    .line 10
    invoke-static {v12, v15}, Ljg0;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v12

    invoke-virtual {v14, v12}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/16 v12, 0xa

    const/4 v15, 0x0

    .line 11
    invoke-virtual {v14, v12, v15}, Ljava/util/Calendar;->set(II)V

    const/16 v12, 0xc

    .line 12
    invoke-virtual {v14, v12, v15}, Ljava/util/Calendar;->set(II)V

    const/16 v12, 0xd

    .line 13
    invoke-virtual {v14, v12, v15}, Ljava/util/Calendar;->set(II)V

    const/16 v12, 0x9

    .line 14
    invoke-virtual {v14, v12, v15}, Ljava/util/Calendar;->set(II)V

    .line 15
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v12

    const v15, 0x94e

    invoke-static {v15}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v17, v5

    move-object/from16 v16, v6

    move-object/from16 v6, p1

    .line 16
    invoke-static {v6, v15}, Ljg0;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v12, v5}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 17
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    move-object/from16 v6, p2

    .line 18
    invoke-static {v6, v15}, Ljg0;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v15

    invoke-virtual {v5, v15}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 19
    invoke-virtual {v14, v12}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    move-result v12

    const/4 v15, 0x1

    if-ltz v12, :cond_1

    invoke-virtual {v14, v5}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    move-result v5

    if-gtz v5, :cond_1

    move v5, v15

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    :goto_2
    const v12, 0x7f120062

    .line 20
    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_2

    move v13, v15

    goto :goto_3

    .line 21
    :cond_2
    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    .line 22
    :goto_3
    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_4

    :cond_3
    :goto_4
    move v12, v15

    goto :goto_5

    .line 23
    :cond_4
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_4

    :cond_5
    const/4 v12, 0x0

    :goto_5
    const v14, 0x94f

    invoke-static {v14}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    .line 24
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    if-nez v3, :cond_6

    :goto_6
    move v8, v15

    goto :goto_7

    :cond_6
    if-ne v3, v15, :cond_7

    .line 25
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v10

    invoke-virtual {v10, v8}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v8

    if-eqz v8, :cond_7

    goto :goto_6

    :cond_7
    const/4 v8, 0x2

    if-ne v3, v8, :cond_8

    .line 26
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v8

    invoke-virtual {v8, v9}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object v8

    if-eqz v8, :cond_8

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    :goto_7
    const v9, 0x950

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    .line 27
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    invoke-virtual {v11, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_9

    goto :goto_8

    :cond_9
    const/4 v15, 0x0

    :cond_a
    :goto_8
    if-eqz v5, :cond_b

    if-eqz v13, :cond_b

    if-eqz v12, :cond_b

    if-eqz v8, :cond_b

    if-eqz v15, :cond_b

    move-object/from16 v5, v17

    .line 28
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_b
    move-object/from16 v5, v17

    :goto_9
    move-object/from16 v6, v16

    goto/16 :goto_0

    .line 29
    :cond_c
    invoke-virtual {v0, v5}, Lre0;->K(Ljava/util/ArrayList;)V

    const/4 v1, 0x0

    .line 30
    iput-object v1, v0, Lre0;->y:Ljava/lang/String;

    .line 31
    iput-object v1, v0, Lre0;->z:Ljava/lang/String;

    return-void
.end method

.method public C(Lqa0$e;Ljava/util/HashSet;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqa0$e;",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3
    invoke-virtual {p2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 4
    sget-object v2, Lqa0$e;->d:Lqa0$e;

    const v3, 0x951

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-ne p1, v2, :cond_2

    .line 5
    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 6
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_2
    sget-object v2, Lqa0$e;->e:Lqa0$e;

    const v4, 0x952

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    if-ne p1, v2, :cond_3

    .line 8
    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_3
    sget-object v2, Lqa0$e;->c:Lqa0$e;

    if-ne p1, v2, :cond_4

    .line 11
    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 13
    :cond_4
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    const p2, 0x7f120062

    .line 14
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-object v0
.end method

.method public synthetic E(Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/app/AlertDialog;Landroid/view/View;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lre0;->D(Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/app/AlertDialog;Landroid/view/View;)V

    return-void
.end method

.method public final G(I)V
    .locals 9

    const/16 v0, 0x5a

    const/16 v1, 0x8

    if-eqz p1, :cond_1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lre0;->H:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Lre0;->G:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lre0;->G:Landroid/widget/ImageView;

    new-instance v1, Lre0$o;

    invoke-direct {v1, p0}, Lre0$o;-><init>(Lre0;)V

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f120348

    .line 4
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 5
    iget-object p1, p0, Lxc0;->b:Lmg0;

    new-instance v1, Ltg0;

    const v3, 0x7f12034a

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {p1, v0, v1}, Lmg0;->o(ILjava/lang/Object;)V

    .line 6
    invoke-virtual {p0, v2}, Lre0;->M(I)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lxc0;->b:Lmg0;

    new-instance v8, Ltg0;

    const v2, 0x7f1202de

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {p1, v0, v8}, Lmg0;->o(ILjava/lang/Object;)V

    .line 8
    iget-object p1, p0, Lre0;->G:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 9
    iget-object p1, p0, Lre0;->H:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 10
    iget-object p1, p0, Lre0;->H:Landroid/widget/ImageView;

    new-instance v1, Lre0$n;

    invoke-direct {v1, p0}, Lre0$n;-><init>(Lre0;)V

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    invoke-virtual {p0, v0}, Lre0;->M(I)V

    :goto_0
    return-void
.end method

.method public final H(Landroidx/viewpager/widget/ViewPager;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lre0;->l:Lre0$t;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lre0$t;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lre0$t;-><init>(Lre0;Landroidx/fragment/app/FragmentManager;)V

    iput-object v0, p0, Lre0;->l:Lre0$t;

    .line 3
    :cond_0
    iget-object v0, p0, Lre0;->G:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lre0;->H:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lre0;->H:Landroid/widget/ImageView;

    new-instance v1, Lre0$k;

    invoke-direct {v1, p0}, Lre0$k;-><init>(Lre0;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    iget-object v0, p0, Lre0;->n:Luc0;

    if-nez v0, :cond_1

    .line 7
    iget-object v0, p0, Lre0;->s:Ljava/util/ArrayList;

    invoke-static {v0}, Luc0;->x(Ljava/util/ArrayList;)Luc0;

    move-result-object v0

    iput-object v0, p0, Lre0;->n:Luc0;

    .line 8
    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 9
    iget-object v0, p0, Lre0;->l:Lre0$t;

    iget-object v1, p0, Lre0;->n:Luc0;

    const v2, 0x7f120064

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lre0$t;->u(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_1
    iget-object v1, p0, Lre0;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Luc0;->A(Ljava/util/ArrayList;)V

    .line 11
    :goto_0
    iget-object v0, p0, Lre0;->o:Laf0;

    if-nez v0, :cond_2

    .line 12
    iget-object v0, p0, Lre0;->q:Ljava/util/ArrayList;

    invoke-static {v0}, Laf0;->B(Ljava/util/ArrayList;)Laf0;

    move-result-object v0

    iput-object v0, p0, Lre0;->o:Laf0;

    .line 13
    invoke-virtual {p0, v0}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 14
    iget-object v0, p0, Lre0;->l:Lre0$t;

    iget-object v1, p0, Lre0;->o:Laf0;

    const v2, 0x7f12034a

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lre0$t;->u(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    goto :goto_1

    .line 15
    :cond_2
    iget-object v1, p0, Lre0;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Laf0;->H(Ljava/util/ArrayList;)V

    .line 16
    :goto_1
    iget-object v0, p0, Lre0;->n:Luc0;

    invoke-virtual {v0, p0}, Luc0;->y(Log0;)V

    .line 17
    iget-object v0, p0, Lre0;->o:Laf0;

    invoke-virtual {v0, p0}, Laf0;->E(Log0;)V

    .line 18
    iget-object v0, p0, Lre0;->o:Laf0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Laf0;->D(I)V

    .line 19
    iget-object v0, p0, Lre0;->l:Lre0$t;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Lno;)V

    .line 20
    iget-object v0, p0, Lre0;->E:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/tabs/TabLayout;->K(Landroidx/viewpager/widget/ViewPager;Z)V

    .line 21
    iget-object v0, p0, Lre0;->E:Lcom/google/android/material/tabs/TabLayout;

    new-instance v1, Lre0$l;

    invoke-direct {v1, p0}, Lre0$l;-><init>(Lre0;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->d(Lcom/google/android/material/tabs/TabLayout$d;)V

    .line 22
    new-instance v0, Lre0$m;

    invoke-direct {v0, p0}, Lre0$m;-><init>(Lre0;)V

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$j;)V

    .line 23
    iget p1, p0, Lre0;->x:I

    invoke-virtual {p0, p1}, Lre0;->G(I)V

    return-void
.end method

.method public final I(I)V
    .locals 9

    const/4 v0, 0x1

    const/4 v1, 0x5

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lre0;->t:Landroid/widget/TextView;

    .line 2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    const/4 v3, -0x1

    .line 3
    invoke-virtual {v2, v0, v3}, Ljava/util/Calendar;->add(II)V

    .line 4
    iput-object v2, p0, Lre0;->J:Ljava/util/Calendar;

    .line 5
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    iput-object v2, p0, Lre0;->K:Ljava/util/Calendar;

    .line 6
    iput-object v2, p0, Lre0;->L:Ljava/util/Calendar;

    goto :goto_1

    .line 7
    :cond_0
    iget-object p1, p0, Lre0;->t:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const v2, 0x953

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-static {p1, v2}, Ljg0;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    .line 9
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 10
    invoke-virtual {v2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 11
    iput-object v2, p0, Lre0;->J:Ljava/util/Calendar;

    .line 12
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 13
    invoke-virtual {v2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/16 p1, 0x1e

    .line 14
    invoke-virtual {v2, v1, p1}, Ljava/util/Calendar;->add(II)V

    .line 15
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    iput-object p1, p0, Lre0;->L:Ljava/util/Calendar;

    .line 16
    invoke-virtual {v2, p1}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    move-result p1

    if-lez p1, :cond_1

    .line 17
    iget-object p1, p0, Lre0;->L:Ljava/util/Calendar;

    iput-object p1, p0, Lre0;->K:Ljava/util/Calendar;

    goto :goto_0

    .line 18
    :cond_1
    iput-object v2, p0, Lre0;->K:Ljava/util/Calendar;

    .line 19
    :goto_0
    iget-object p1, p0, Lre0;->u:Landroid/widget/TextView;

    .line 20
    :goto_1
    new-instance v8, Landroid/app/DatePickerDialog;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v3

    new-instance v4, Lre0$j;

    invoke-direct {v4, p0, p1}, Lre0$j;-><init>(Lre0;Landroid/widget/TextView;)V

    iget-object p1, p0, Lre0;->L:Ljava/util/Calendar;

    .line 21
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    iget-object p1, p0, Lre0;->L:Ljava/util/Calendar;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    iget-object p1, p0, Lre0;->L:Ljava/util/Calendar;

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result v7

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;Landroid/app/DatePickerDialog$OnDateSetListener;III)V

    .line 22
    invoke-virtual {v8}, Landroid/app/DatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object p1

    iget-object v0, p0, Lre0;->J:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/widget/DatePicker;->setMinDate(J)V

    .line 23
    invoke-virtual {v8}, Landroid/app/DatePickerDialog;->getDatePicker()Landroid/widget/DatePicker;

    move-result-object p1

    iget-object v0, p0, Lre0;->K:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/widget/DatePicker;->setMaxDate(J)V

    .line 24
    invoke-virtual {v8}, Landroid/app/DatePickerDialog;->show()V

    return-void
.end method

.method public J()V
    .locals 12

    .line 1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0d0051

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    const v2, 0x7f0a01fb

    .line 3
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lre0;->t:Landroid/widget/TextView;

    const v2, 0x7f0a0504

    .line 4
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lre0;->u:Landroid/widget/TextView;

    .line 5
    iget-object v3, p0, Lre0;->K:Ljava/util/Calendar;

    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    const v4, 0x954

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v2, p0, Lre0;->t:Landroid/widget/TextView;

    iget-object v3, p0, Lre0;->I:Ljava/util/Date;

    invoke-static {v3, v4}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v2, p0, Lre0;->r:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/olive/upi/transport/model/TranHistory;

    .line 8
    iget-object v4, p0, Lre0;->m:Ljava/util/HashSet;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TranHistory;->getCreditVpa()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 9
    iget-object v4, p0, Lre0;->m:Ljava/util/HashSet;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TranHistory;->getDebitVpa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const v2, 0x7f0a00f4

    .line 10
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    const v3, 0x7f0a00d0

    .line 11
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    const v4, 0x7f0a01fd

    .line 12
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout;

    const v5, 0x7f0a0510

    .line 13
    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/LinearLayout;

    .line 14
    new-instance v6, Lre0$b;

    invoke-direct {v6, p0}, Lre0$b;-><init>(Lre0;)V

    invoke-virtual {v4, v6}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    new-instance v4, Lre0$c;

    invoke-direct {v4, p0}, Lre0$c;-><init>(Lre0;)V

    invoke-virtual {v5, v4}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f0a0423

    .line 16
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Landroid/widget/Spinner;

    const v4, 0x7f0a0560

    .line 17
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout;

    .line 18
    new-instance v5, Lre0$d;

    invoke-direct {v5, p0, v7}, Lre0$d;-><init>(Lre0;Landroid/widget/Spinner;)V

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f0a041f

    .line 19
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Landroid/widget/Spinner;

    const v4, 0x7f0a026d

    .line 20
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout;

    .line 21
    new-instance v5, Lre0$e;

    invoke-direct {v5, p0, v8}, Lre0$e;-><init>(Lre0;Landroid/widget/Spinner;)V

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f0a042b

    .line 22
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Landroid/widget/Spinner;

    const v4, 0x7f0a0293

    .line 23
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout;

    .line 24
    new-instance v5, Lre0$f;

    invoke-direct {v5, p0, v9}, Lre0$f;-><init>(Lre0;Landroid/widget/Spinner;)V

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    new-instance v4, Lre0$g;

    invoke-direct {v4, p0, v8, v9}, Lre0$g;-><init>(Lre0;Landroid/widget/Spinner;Landroid/widget/Spinner;)V

    invoke-virtual {v7, v4}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    const v4, 0x7f0a042a

    .line 26
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Landroid/widget/Spinner;

    const v4, 0x7f0a0290

    .line 27
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout;

    .line 28
    new-instance v5, Lre0$h;

    invoke-direct {v5, p0, v10}, Lre0$h;-><init>(Lre0;Landroid/widget/Spinner;)V

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 30
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 31
    new-instance v1, Ljc0;

    move-object v5, v1

    move-object v6, p0

    move-object v11, v0

    invoke-direct/range {v5 .. v11}, Ljc0;-><init>(Lre0;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/app/AlertDialog;)V

    invoke-virtual {v3, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    new-instance v1, Lre0$i;

    invoke-direct {v1, p0, v0}, Lre0$i;-><init>(Lre0;Landroid/app/AlertDialog;)V

    invoke-virtual {v2, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 34
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public K(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/TranHistory;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lre0;->s:Ljava/util/ArrayList;

    .line 2
    iget-object v0, p0, Lre0;->n:Luc0;

    invoke-virtual {v0, p1}, Luc0;->A(Ljava/util/ArrayList;)V

    return-void
.end method

.method public L(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/PendingReqVo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lre0;->q:Ljava/util/ArrayList;

    .line 2
    iget-object v0, p0, Lre0;->o:Laf0;

    invoke-virtual {v0, p1}, Laf0;->H(Ljava/util/ArrayList;)V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object v0, p0, Lre0;->q:Ljava/util/ArrayList;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lqa0;->q0(Ljava/util/ArrayList;Landroid/content/Context;)V

    .line 4
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0xa

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->o(ILjava/lang/Object;)V

    return-void
.end method

.method public final M(I)V
    .locals 9

    const/4 v0, 0x1

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lre0;->H:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Lre0;->n:Luc0;

    invoke-virtual {p1, v0}, Luc0;->z(Z)V

    .line 3
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    iget-object v2, p0, Lre0;->v:Ljava/lang/String;

    iget-object v3, p0, Lre0;->w:Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Lua0;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x5a

    new-instance v8, Ltg0;

    const v2, 0x7f1202de

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {p1, v1, v8}, Lmg0;->o(ILjava/lang/Object;)V

    .line 5
    iget-object p1, p0, Lre0;->H:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lre0;->o:Laf0;

    invoke-virtual {p1, v0}, Laf0;->G(Z)V

    .line 7
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x2c

    const/16 v2, 0x1b

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public i(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lre0;->M(I)V

    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 3

    const/16 v0, 0x18

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x2c

    invoke-direct {v1, v2, v0, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lxc0;->onCreate(Landroid/os/Bundle;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lre0;->r:Ljava/util/ArrayList;

    .line 3
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 4
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x5

    const/16 v2, -0x1e

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 6
    iput-object v0, p0, Lre0;->J:Ljava/util/Calendar;

    .line 7
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    iput-object v1, p0, Lre0;->I:Ljava/util/Date;

    .line 8
    iput-object p1, p0, Lre0;->K:Ljava/util/Calendar;

    .line 9
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const v1, 0x955

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v2, 0x956

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x957

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lre0;->v:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-static {p1, v1}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lre0;->w:Ljava/lang/String;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d0093

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0a0558

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/viewpager/widget/ViewPager;

    iput-object p2, p0, Lre0;->F:Landroidx/viewpager/widget/ViewPager;

    const p2, 0x7f0a0454

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/tabs/TabLayout;

    iput-object p2, p0, Lre0;->E:Lcom/google/android/material/tabs/TabLayout;

    const p2, 0x7f0a0238

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lre0;->H:Landroid/widget/ImageView;

    const p2, 0x7f0a0236

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lre0;->G:Landroid/widget/ImageView;

    .line 6
    iget-object p2, p0, Lre0;->H:Landroid/widget/ImageView;

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    iget-object p2, p0, Lre0;->G:Landroid/widget/ImageView;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    invoke-virtual {p2, p0}, Lua0;->u(Lua0$e;)V

    .line 9
    iget-object p2, p0, Lre0;->F:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0, p2}, Lre0;->H(Landroidx/viewpager/widget/ViewPager;)V

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 13

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    const/16 v1, 0x1b

    if-nez v0, :cond_d

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v0, 0x958

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v2

    const/4 v3, 0x0

    const/16 v4, 0x12d

    const/16 v5, 0x18

    const/16 v6, 0xa

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_4

    const/16 p1, 0x34

    if-eq v2, p1, :cond_3

    const/16 p1, 0x1a

    if-eq v2, p1, :cond_2

    if-eq v2, v1, :cond_1

    .line 4
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_4

    .line 5
    :cond_1
    invoke-static {}, Leg0;->B()V

    .line 6
    iget-object p1, p0, Lre0;->o:Laf0;

    invoke-virtual {p1}, Laf0;->F()V

    .line 7
    iget-object p1, p0, Lre0;->o:Laf0;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Laf0;->G(Z)V

    goto/16 :goto_4

    .line 8
    :cond_2
    invoke-static {}, Leg0;->B()V

    .line 9
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->K()Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->K()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_e

    .line 10
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->K()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lre0;->K(Ljava/util/ArrayList;)V

    goto/16 :goto_4

    .line 11
    :cond_3
    invoke-static {}, Leg0;->B()V

    .line 12
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v4, v3}, Lmg0;->o(ILjava/lang/Object;)V

    goto/16 :goto_4

    .line 13
    :cond_4
    iget-object v1, p0, Lxc0;->b:Lmg0;

    invoke-interface {v1, v4, v3}, Lmg0;->o(ILjava/lang/Object;)V

    .line 14
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v1

    iput-object v1, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    .line 15
    invoke-static {}, Leg0;->B()V

    .line 16
    iget-object v1, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 17
    iget-object v1, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v1

    .line 18
    iget-object v2, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    :cond_5
    const v1, 0x959

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const v2, 0x7f12031e

    const v3, 0x7f12005c

    if-eqz v1, :cond_7

    .line 20
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const p2, 0x7f12049a

    if-ne p1, v6, :cond_6

    .line 21
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lre0$q;

    invoke-direct {v2, p0}, Lre0$q;-><init>(Lre0;)V

    invoke-static {p1, v0, p2, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 22
    :cond_6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_7
    const v1, 0x95a

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 24
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f120499

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lre0$r;

    invoke-direct {v2, p0}, Lre0$r;-><init>(Lre0;)V

    invoke-static {p1, p2, v0, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    :cond_8
    const v1, 0x95b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 26
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    if-ne p1, v6, :cond_9

    .line 27
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v7

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Lre0$s;

    invoke-direct {v11, p0}, Lre0$s;-><init>(Lre0;)V

    const/4 v12, 0x1

    invoke-static/range {v7 .. v12}, Leg0;->q(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    goto :goto_2

    .line 28
    :cond_9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_2
    return-void

    .line 29
    :cond_a
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object p1

    .line 30
    iget-object v1, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 32
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 33
    iget-object v2, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 34
    iget-object p1, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    goto :goto_3

    .line 35
    :cond_b
    iget-object v1, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 36
    :goto_3
    iget-object p1, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 37
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 38
    iget-object v0, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const v1, 0x95c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 39
    iget-object p1, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 40
    iget-object p1, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setDescription(Ljava/lang/String;)V

    .line 41
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 42
    iget-object p1, p0, Lxc0;->b:Lmg0;

    if-nez p1, :cond_c

    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/activity/MainActivity;

    iput-object p1, p0, Lxc0;->b:Lmg0;

    .line 44
    :cond_c
    iget-object p1, p0, Lxc0;->b:Lmg0;

    iget-object p2, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-interface {p1, v5, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_4

    .line 45
    :cond_d
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    if-ne p1, v1, :cond_e

    .line 46
    iget-object p1, p0, Lre0;->o:Laf0;

    invoke-virtual {p1}, Laf0;->F()V

    .line 47
    :cond_e
    :goto_4
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 2

    const v0, 0x7f1202de

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, -0x64

    if-eq v0, v1, :cond_d

    const v1, 0x95d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xa

    const/4 v3, 0x0

    const/16 v4, 0x2c

    const/16 v5, 0x1b

    const/16 v6, 0x18

    const/4 v7, 0x1

    const/16 v8, 0x12d

    const/4 v9, 0x0

    if-eq v0, v2, :cond_6

    if-eq v0, v6, :cond_6

    const/16 v2, 0x1d

    if-eq v0, v2, :cond_5

    const/16 v2, 0x272

    if-eq v0, v2, :cond_4

    const/16 v2, 0x1a

    if-eq v0, v2, :cond_3

    if-eq v0, v5, :cond_2

    const/16 v2, 0x34

    const/16 v3, 0x35

    if-eq v0, v2, :cond_1

    if-eq v0, v3, :cond_0

    .line 2
    iget p2, p0, Lxc0;->g:I

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    if-ne p2, p1, :cond_e

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_2

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v8, v9}, Lmg0;->o(ILjava/lang/Object;)V

    .line 6
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 7
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p2, p1}, Lqa0;->X(Ljava/util/ArrayList;)V

    goto/16 :goto_2

    .line 8
    :cond_1
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v8, v9}, Lmg0;->o(ILjava/lang/Object;)V

    .line 9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f120137

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lre0$p;

    invoke-direct {v0, p0}, Lre0$p;-><init>(Lre0;)V

    invoke-static {p1, p2, v0}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    .line 10
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p2, v4, v5, v9}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 11
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance p2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {p2, v4, v3, v9, v7}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;Z)V

    invoke-virtual {p1, v7, p2}, Lua0;->a(ZLcom/olive/upi/transport/OliveRequest;)V

    .line 12
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    if-eqz p1, :cond_e

    .line 13
    invoke-virtual {p1}, Landroid/app/NotificationManager;->cancelAll()V

    goto/16 :goto_2

    .line 14
    :cond_2
    invoke-static {}, Leg0;->B()V

    .line 15
    iget-object p1, p0, Lre0;->o:Laf0;

    invoke-virtual {p1, v3}, Laf0;->G(Z)V

    .line 16
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 17
    invoke-virtual {p0, p1}, Lre0;->L(Ljava/util/ArrayList;)V

    goto/16 :goto_2

    .line 18
    :cond_3
    invoke-static {}, Leg0;->B()V

    .line 19
    iget-object p1, p0, Lre0;->n:Luc0;

    invoke-virtual {p1, v3}, Luc0;->z(Z)V

    .line 20
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, Lre0;->r:Ljava/util/ArrayList;

    .line 21
    invoke-virtual {p0, p1}, Lre0;->K(Ljava/util/ArrayList;)V

    goto/16 :goto_2

    .line 22
    :cond_4
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, Lre0;->r:Ljava/util/ArrayList;

    .line 23
    iget-object v1, p0, Lre0;->y:Ljava/lang/String;

    iget-object v2, p0, Lre0;->z:Ljava/lang/String;

    iget-object v3, p0, Lre0;->A:Ljava/lang/String;

    iget-object v4, p0, Lre0;->B:Ljava/lang/String;

    iget v5, p0, Lre0;->D:I

    iget-object v6, p0, Lre0;->C:Ljava/lang/String;

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lre0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 24
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_2

    .line 25
    :cond_5
    invoke-static {}, Leg0;->B()V

    .line 26
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v8, v9}, Lmg0;->o(ILjava/lang/Object;)V

    .line 27
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x7f12030d

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 29
    invoke-virtual {p0, p1}, Lre0;->L(Ljava/util/ArrayList;)V

    goto/16 :goto_2

    .line 30
    :cond_6
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v10, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v10, v4, v5, v9}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v10}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 31
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v0

    iput-object v0, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    .line 32
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object v0

    .line 33
    iget-object v4, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/TransactionData;->setApprovalRefNo(Ljava/lang/String;)V

    .line 34
    iget-object v4, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/olive/upi/transport/model/TransactionData;->setResponseCode(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 36
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 37
    iget-object v5, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v5, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, v4}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    goto :goto_0

    .line 39
    :cond_7
    iget-object v4, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 40
    :goto_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 41
    iget-object v4, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    const v5, 0x95e

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionDate(Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 43
    iget-object v0, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/olive/upi/transport/model/TransactionData;->setDescription(Ljava/lang/String;)V

    .line 44
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    iget-object v0, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2, v0}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 45
    sget-object p2, Ln70;->f:Ln70$a;

    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v5, 0x95f

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v5, v2}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object p2

    const v0, 0x960

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, v3}, Ln70;->A(Ljava/lang/String;Z)V

    .line 47
    invoke-static {}, Leg0;->B()V

    .line 48
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const v0, 0x7f120348

    .line 49
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v2, 0x961

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    iget-object v0, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Ljg0;->l(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_8
    const v0, 0x962

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    const v2, 0x963

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    iget-object v0, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 52
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const v3, 0x964

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    :cond_9
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    const v3, 0x965

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, p2, v7}, Lah0;->d(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Z)V

    .line 54
    new-instance v2, Lcom/google/android/gms/analytics/ecommerce/Product;

    invoke-direct {v2}, Lcom/google/android/gms/analytics/ecommerce/Product;-><init>()V

    .line 55
    invoke-virtual {v2, v3}, Lcom/google/android/gms/analytics/ecommerce/Product;->setName(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 56
    iget-object v4, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/analytics/ecommerce/Product;->setPrice(D)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 57
    iget-object v4, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getRefid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/android/gms/analytics/ecommerce/Product;->setId(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    if-eqz v0, :cond_a

    .line 58
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/analytics/ecommerce/Product;->setBrand(Ljava/lang/String;)Lcom/google/android/gms/analytics/ecommerce/Product;

    .line 59
    :cond_a
    iget-object v0, p0, Lxc0;->b:Lmg0;

    invoke-interface {v0, v8, v9}, Lmg0;->o(ILjava/lang/Object;)V

    .line 60
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0, v3, v2, p2}, Lah0;->e(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/analytics/ecommerce/Product;Ljava/util/Map;)V

    .line 61
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    if-ne p1, v6, :cond_b

    .line 62
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    if-eqz p1, :cond_b

    .line 63
    invoke-virtual {p1}, Landroid/app/NotificationManager;->cancelAll()V

    .line 64
    :cond_b
    iget-object p1, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_c

    .line 65
    iget-object p1, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object p1

    .line 66
    iget-object p2, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getRemitterVpa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/Account;->setVpa(Ljava/lang/String;)V

    .line 67
    :cond_c
    iget-object p1, p0, Lxc0;->b:Lmg0;

    iget-object p2, p0, Lre0;->p:Lcom/olive/upi/transport/model/TransactionData;

    invoke-interface {p1, v6, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_2

    .line 68
    :cond_d
    invoke-static {}, Leg0;->B()V

    .line 69
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    check-cast p1, Lcom/upi/axispay/activity/MainActivity;

    invoke-virtual {p1}, Lcom/upi/axispay/activity/MainActivity;->q0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_e

    .line 70
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const/4 p2, 0x3

    const v0, 0x966

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ln70;->v(Ljava/lang/String;I)V

    :cond_e
    :goto_2
    return-void
.end method
