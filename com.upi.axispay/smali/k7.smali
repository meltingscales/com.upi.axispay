.class public Lk7;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk7$b;,
        Lk7$a;
    }
.end annotation


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public b:Ll7;

.field public c:I

.field public d:I

.field public e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lk7$a;",
            ">;"
        }
    .end annotation
.end field

.field public f:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ll7;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ln7;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/constraintlayout/widget/ConstraintLayout;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lk7;->c:I

    .line 3
    iput v0, p0, Lk7;->d:I

    .line 4
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lk7;->e:Landroid/util/SparseArray;

    .line 5
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lk7;->f:Landroid/util/SparseArray;

    .line 6
    iput-object p2, p0, Lk7;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    invoke-virtual {p0, p1, p3}, Lk7;->a(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;I)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 2
    invoke-virtual {v1, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p2

    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    :goto_0
    const/4 v3, 0x1

    if-eq v2, v3, :cond_7

    if-eqz v2, :cond_5

    const/4 v4, 0x2

    if-eq v2, v4, :cond_0

    goto/16 :goto_3

    .line 4
    :cond_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v5, -0x1

    .line 5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v7, 0x4

    const/4 v8, 0x3

    sparse-switch v6, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const v0, 0x24ff

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v3, v8

    goto :goto_2

    :sswitch_1
    const v0, 0x2500

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x0

    goto :goto_2

    :sswitch_2
    const v0, 0x2501

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_2

    :sswitch_3
    const v0, 0x2502

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v3, v4

    goto :goto_2

    :sswitch_4
    const v0, 0x2503

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v3, v7

    goto :goto_2

    :cond_1
    :goto_1
    move v3, v5

    :goto_2
    if-eq v3, v4, :cond_4

    if-eq v3, v8, :cond_3

    if-eq v3, v7, :cond_2

    goto :goto_3

    .line 6
    :cond_2
    invoke-virtual {p0, p1, p2}, Lk7;->b(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_3

    .line 7
    :cond_3
    new-instance v2, Lk7$b;

    invoke-direct {v2, p1, p2}, Lk7$b;-><init>(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V

    if-eqz v1, :cond_6

    .line 8
    invoke-virtual {v1, v2}, Lk7$a;->a(Lk7$b;)V

    goto :goto_3

    .line 9
    :cond_4
    new-instance v1, Lk7$a;

    invoke-direct {v1, p1, p2}, Lk7$a;-><init>(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V

    .line 10
    iget-object v2, p0, Lk7;->e:Landroid/util/SparseArray;

    iget v3, v1, Lk7$a;->a:I

    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_3

    .line 11
    :cond_5
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 12
    :cond_6
    :goto_3
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_4

    :catch_1
    move-exception p1

    .line 14
    invoke-virtual {p1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    :cond_7
    :goto_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x50764adb -> :sswitch_4
        0x4c7d471 -> :sswitch_3
        0x526c4e31 -> :sswitch_2
        0x62ce7272 -> :sswitch_1
        0x7155a865 -> :sswitch_0
    .end sparse-switch
.end method

.method public final b(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 8

    .line 1
    new-instance v0, Ll7;

    invoke-direct {v0}, Ll7;-><init>()V

    .line 2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_5

    .line 3
    invoke-interface {p2, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-interface {p2, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v3, :cond_4

    if-nez v4, :cond_0

    goto :goto_3

    :cond_0
    const v5, 0x2504

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 5
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const v1, 0x2505

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {v4, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    const/16 v1, 0x2f

    .line 7
    invoke-virtual {v4, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    add-int/2addr v1, v3

    invoke-virtual {v4, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v1, v5, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    if-ne v1, v2, :cond_3

    .line 9
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v3, :cond_2

    .line 10
    invoke-virtual {v4, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    goto :goto_2

    :cond_2
    const v2, 0x2506

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x2507

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 11
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    :cond_3
    :goto_2
    invoke-virtual {v0, p1, p2}, Ll7;->n(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V

    .line 13
    iget-object p1, p0, Lk7;->f:Landroid/util/SparseArray;

    invoke-virtual {p1, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_4

    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    :goto_4
    return-void
.end method

.method public c(Ln7;)V
    .locals 0

    return-void
.end method

.method public d(IFF)V
    .locals 4

    .line 1
    iget v0, p0, Lk7;->c:I

    const/4 v1, -0x1

    if-ne v0, p1, :cond_7

    if-ne p1, v1, :cond_0

    .line 2
    iget-object p1, p0, Lk7;->e:Landroid/util/SparseArray;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk7$a;

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lk7;->e:Landroid/util/SparseArray;

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk7$a;

    .line 4
    :goto_0
    iget v0, p0, Lk7;->d:I

    if-eq v0, v1, :cond_1

    .line 5
    iget-object v2, p1, Lk7$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk7$b;

    invoke-virtual {v0, p2, p3}, Lk7$b;->a(FF)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 6
    :cond_1
    invoke-virtual {p1, p2, p3}, Lk7$a;->b(FF)I

    move-result p2

    .line 7
    iget p3, p0, Lk7;->d:I

    if-ne p3, p2, :cond_2

    return-void

    :cond_2
    if-ne p2, v1, :cond_3

    .line 8
    iget-object p3, p0, Lk7;->b:Ll7;

    goto :goto_1

    .line 9
    :cond_3
    iget-object p3, p1, Lk7$a;->b:Ljava/util/ArrayList;

    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lk7$b;

    iget-object p3, p3, Lk7$b;->f:Ll7;

    :goto_1
    if-ne p2, v1, :cond_4

    .line 10
    iget p1, p1, Lk7$a;->c:I

    goto :goto_2

    .line 11
    :cond_4
    iget-object p1, p1, Lk7$a;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk7$b;

    iget p1, p1, Lk7$b;->e:I

    :goto_2
    if-nez p3, :cond_5

    return-void

    .line 12
    :cond_5
    iput p2, p0, Lk7;->d:I

    .line 13
    iget-object p2, p0, Lk7;->g:Ln7;

    if-eqz p2, :cond_6

    .line 14
    invoke-virtual {p2, v1, p1}, Ln7;->b(II)V

    .line 15
    :cond_6
    iget-object p2, p0, Lk7;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p3, p2}, Ll7;->c(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 16
    iget-object p2, p0, Lk7;->g:Ln7;

    if-eqz p2, :cond_c

    .line 17
    invoke-virtual {p2, v1, p1}, Ln7;->a(II)V

    goto :goto_5

    .line 18
    :cond_7
    iput p1, p0, Lk7;->c:I

    .line 19
    iget-object v0, p0, Lk7;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk7$a;

    .line 20
    invoke-virtual {v0, p2, p3}, Lk7$a;->b(FF)I

    move-result v2

    if-ne v2, v1, :cond_8

    .line 21
    iget-object v3, v0, Lk7$a;->d:Ll7;

    goto :goto_3

    .line 22
    :cond_8
    iget-object v3, v0, Lk7$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk7$b;

    iget-object v3, v3, Lk7$b;->f:Ll7;

    :goto_3
    if-ne v2, v1, :cond_9

    .line 23
    iget v0, v0, Lk7$a;->c:I

    goto :goto_4

    .line 24
    :cond_9
    iget-object v0, v0, Lk7$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk7$b;

    iget v0, v0, Lk7$b;->e:I

    :goto_4
    if-nez v3, :cond_a

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x2508

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const p1, 0x2509

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const p1, 0x250a

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    return-void

    .line 26
    :cond_a
    iput v2, p0, Lk7;->d:I

    .line 27
    iget-object p2, p0, Lk7;->g:Ln7;

    if-eqz p2, :cond_b

    .line 28
    invoke-virtual {p2, p1, v0}, Ln7;->b(II)V

    .line 29
    :cond_b
    iget-object p2, p0, Lk7;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3, p2}, Ll7;->c(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 30
    iget-object p2, p0, Lk7;->g:Ln7;

    if-eqz p2, :cond_c

    .line 31
    invoke-virtual {p2, p1, v0}, Ln7;->a(II)V

    :cond_c
    :goto_5
    return-void
.end method
