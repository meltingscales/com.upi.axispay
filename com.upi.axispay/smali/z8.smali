.class public final Lz8;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz8$a;
    }
.end annotation


# direct methods
.method public static a(Lz8$a;IIZI)Lz8$a;
    .locals 0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    if-eqz p3, :cond_1

    .line 1
    new-instance p0, Lz8$a;

    invoke-direct {p0, p1, p4, p2}, Lz8$a;-><init>(III)V

    return-object p0

    .line 2
    :cond_1
    new-instance p0, Lz8$a;

    invoke-direct {p0, p1, p2}, Lz8$a;-><init>(II)V

    return-object p0
.end method

.method public static b(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/Shader;
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    move-object/from16 v0, p1

    .line 1
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    const v2, 0x1ac7

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 3
    sget-object v1, Lc8;->GradientColor:[I

    move-object/from16 v2, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-static {v2, v4, v3, v1}, Lc9;->k(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 4
    sget v5, Lc8;->GradientColor_android_startX:I

    const v6, 0x1ac8

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v1, v0, v6, v5, v7}, Lc9;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v9

    .line 5
    sget v5, Lc8;->GradientColor_android_startY:I

    const v6, 0x1ac9

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v0, v6, v5, v7}, Lc9;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v10

    .line 6
    sget v5, Lc8;->GradientColor_android_endX:I

    const v6, 0x1aca

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v0, v6, v5, v7}, Lc9;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v11

    .line 7
    sget v5, Lc8;->GradientColor_android_endY:I

    const v6, 0x1acb

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v0, v6, v5, v7}, Lc9;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v12

    .line 8
    sget v5, Lc8;->GradientColor_android_centerX:I

    const v6, 0x1acc

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v0, v6, v5, v7}, Lc9;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v14

    .line 9
    sget v5, Lc8;->GradientColor_android_centerY:I

    const v6, 0x1acd

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v0, v6, v5, v7}, Lc9;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v15

    .line 10
    sget v5, Lc8;->GradientColor_android_type:I

    const v6, 0x1ace

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static {v1, v0, v6, v5, v8}, Lc9;->g(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v5

    .line 11
    sget v6, Lc8;->GradientColor_android_startColor:I

    const v13, 0x1acf

    invoke-static {v13}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v1, v0, v13, v6, v8}, Lc9;->b(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v6

    const v13, 0x1ad0

    invoke-static {v13}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    .line 12
    invoke-static {v0, v13}, Lc9;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v7

    .line 13
    sget v2, Lc8;->GradientColor_android_centerColor:I

    invoke-static {v1, v0, v13, v2, v8}, Lc9;->b(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v2

    .line 14
    sget v13, Lc8;->GradientColor_android_endColor:I

    const v3, 0x1ad1

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v3, v13, v8}, Lc9;->b(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v3

    .line 15
    sget v13, Lc8;->GradientColor_android_tileMode:I

    const v4, 0x1ad2

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v0, v4, v13, v8}, Lc9;->g(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result v4

    .line 16
    sget v8, Lc8;->GradientColor_android_gradientRadius:I

    const v13, 0x1ad3

    invoke-static {v13}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    move/from16 v17, v14

    const/4 v14, 0x0

    invoke-static {v1, v0, v13, v8, v14}, Lc9;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v8

    .line 17
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 18
    invoke-static/range {p0 .. p3}, Lz8;->c(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lz8$a;

    move-result-object v0

    .line 19
    invoke-static {v0, v6, v3, v7, v2}, Lz8;->a(Lz8$a;IIZI)Lz8$a;

    move-result-object v0

    const/4 v1, 0x1

    if-eq v5, v1, :cond_1

    const/4 v1, 0x2

    if-eq v5, v1, :cond_0

    .line 20
    new-instance v1, Landroid/graphics/LinearGradient;

    iget-object v13, v0, Lz8$a;->a:[I

    iget-object v14, v0, Lz8$a;->b:[F

    .line 21
    invoke-static {v4}, Lz8;->d(I)Landroid/graphics/Shader$TileMode;

    move-result-object v15

    move-object v8, v1

    invoke-direct/range {v8 .. v15}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    return-object v1

    .line 22
    :cond_0
    new-instance v1, Landroid/graphics/SweepGradient;

    iget-object v2, v0, Lz8$a;->a:[I

    iget-object v0, v0, Lz8$a;->b:[F

    move/from16 v3, v17

    invoke-direct {v1, v3, v15, v2, v0}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    return-object v1

    :cond_1
    move/from16 v3, v17

    const/4 v1, 0x0

    cmpg-float v1, v8, v1

    if-lez v1, :cond_2

    .line 23
    new-instance v1, Landroid/graphics/RadialGradient;

    iget-object v2, v0, Lz8$a;->a:[I

    iget-object v0, v0, Lz8$a;->b:[F

    .line 24
    invoke-static {v4}, Lz8;->d(I)Landroid/graphics/Shader$TileMode;

    move-result-object v19

    move-object v13, v1

    move v14, v3

    move/from16 v16, v8

    move-object/from16 v17, v2

    move-object/from16 v18, v0

    invoke-direct/range {v13 .. v19}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    return-object v1

    .line 25
    :cond_2
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const v1, 0x1ad4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 26
    :cond_3
    new-instance v2, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x1ad5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static c(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lz8$a;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 2
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    if-eq v3, v1, :cond_5

    .line 5
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v5

    if-ge v5, v0, :cond_1

    const/4 v6, 0x3

    if-eq v3, v6, :cond_5

    :cond_1
    const/4 v6, 0x2

    if-eq v3, v6, :cond_2

    goto :goto_0

    :cond_2
    if-gt v5, v0, :cond_0

    .line 6
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    const v5, 0x1ad6

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    .line 7
    :cond_3
    sget-object v3, Lc8;->GradientColorItem:[I

    invoke-static {p0, p3, p2, v3}, Lc9;->k(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 8
    sget v5, Lc8;->GradientColorItem_android_color:I

    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    .line 9
    sget v7, Lc8;->GradientColorItem_android_offset:I

    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v8

    if-eqz v6, :cond_4

    if-eqz v8, :cond_4

    const/4 v6, 0x0

    .line 10
    invoke-virtual {v3, v5, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    const/4 v6, 0x0

    .line 11
    invoke-virtual {v3, v7, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v6

    .line 12
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 13
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 15
    :cond_4
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p1, 0x1ad7

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 17
    :cond_5
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result p0

    if-lez p0, :cond_6

    new-instance p0, Lz8$a;

    invoke-direct {p0, v4, v2}, Lz8$a;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p0

    :cond_6
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(I)Landroid/graphics/Shader$TileMode;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    .line 1
    sget-object p0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    return-object p0

    .line 2
    :cond_0
    sget-object p0, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    return-object p0

    .line 3
    :cond_1
    sget-object p0, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    return-object p0
.end method
