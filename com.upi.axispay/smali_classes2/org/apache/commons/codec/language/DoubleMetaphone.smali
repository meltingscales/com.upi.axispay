.class public Lorg/apache/commons/codec/language/DoubleMetaphone;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lorg/apache/commons/codec/StringEncoder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;
    }
.end annotation


# static fields
.field private static final ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER:[Ljava/lang/String;

.field private static final L_R_N_M_B_H_F_V_W_SPACE:[Ljava/lang/String;

.field private static final L_T_K_S_N_M_B_Z:[Ljava/lang/String;

.field private static final SILENT_START:[Ljava/lang/String;

.field private static final VOWELS:Ljava/lang/String;


# instance fields
.field private maxCodeLen:I


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    const-class v0, Lorg/apache/commons/codec/language/DoubleMetaphone;

    const v1, 0x16e

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    const v0, 0x2836

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x2837

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x2838

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x2839

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x283a

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 1
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/codec/language/DoubleMetaphone;->SILENT_START:[Ljava/lang/String;

    const v1, 0x283b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x283c

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x283d

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x283e

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x283f

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x2840

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x2841

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x2842

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v9, 0x2843

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x2844

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 2
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/codec/language/DoubleMetaphone;->L_R_N_M_B_H_F_V_W_SPACE:[Ljava/lang/String;

    const v1, 0x2845

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x2846

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x2847

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x2848

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x2849

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x284a

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x284b

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x284c

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v9, 0x284d

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x284e

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x284f

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    .line 3
    filled-new-array/range {v1 .. v11}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/codec/language/DoubleMetaphone;->ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER:[Ljava/lang/String;

    const v1, 0x2850

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x2851

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x2852

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x2853

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x2854

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x2855

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x2856

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x2857

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 4
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/codec/language/DoubleMetaphone;->L_T_K_S_N_M_B_Z:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lorg/apache/commons/codec/language/DoubleMetaphone;->maxCodeLen:I

    return-void
.end method

.method private cleanInput(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 1
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    .line 3
    :cond_1
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private conditionC0(Ljava/lang/String;I)Z
    .locals 6

    const v0, 0x2858

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {p1, p2, v1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    if-gt p2, v1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v2, p2, -0x2

    .line 2
    invoke-virtual {p0, p1, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v3

    invoke-direct {p0, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->isVowel(C)Z

    move-result v3

    if-eqz v3, :cond_2

    return v0

    :cond_2
    add-int/lit8 v3, p2, -0x1

    const/4 v4, 0x3

    const v5, 0x2859

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 3
    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v3, v4, v5}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    return v0

    :cond_3
    add-int/lit8 p2, p2, 0x2

    .line 4
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result p2

    const/16 v3, 0x49

    if-eq p2, v3, :cond_4

    const/16 v3, 0x45

    if-ne p2, v3, :cond_6

    :cond_4
    const/4 p2, 0x6

    const v3, 0x285a

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x285b

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 5
    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-static {p1, v2, p2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    move v1, v0

    :cond_6
    :goto_0
    return v1
.end method

.method private conditionCH0(Ljava/lang/String;I)Z
    .locals 8

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    add-int/2addr p2, v1

    const v2, 0x285c

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x285d

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 1
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    invoke-static {p1, p2, v3, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x3

    const v4, 0x285e

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x285f

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x2860

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x2861

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v4, v5, v6, v7}, [Ljava/lang/String;

    move-result-object v4

    .line 2
    invoke-static {p1, p2, v2, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    return v0

    :cond_1
    const p2, 0x2862

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 3
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, v3, p2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v1
.end method

.method private conditionCH1(Ljava/lang/String;I)Z
    .locals 8

    const v0, 0x2863

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x2864

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {p1, v1, v2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    const/4 v0, 0x3

    const v3, 0x2865

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v1, v0, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    add-int/lit8 v0, p2, -0x2

    const/4 v3, 0x6

    const v4, 0x2866

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x2867

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x2868

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v4, v5, v6}, [Ljava/lang/String;

    move-result-object v4

    .line 2
    invoke-static {p1, v0, v3, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    add-int/lit8 v0, p2, 0x2

    const v3, 0x2869

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x286a

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-static {p1, v0, v2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    add-int/lit8 v3, p2, -0x1

    const v4, 0x286b

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x286c

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x286d

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x286e

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v4, v5, v6, v7}, [Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-static {p1, v3, v2, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    if-nez p2, :cond_2

    :cond_0
    sget-object v3, Lorg/apache/commons/codec/language/DoubleMetaphone;->L_R_N_M_B_H_F_V_W_SPACE:[Ljava/lang/String;

    .line 5
    invoke-static {p1, v0, v2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    add-int/2addr p2, v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr p1, v2

    if-ne p2, p1, :cond_2

    :cond_1
    move v1, v2

    :cond_2
    return v1
.end method

.method private conditionL0(Ljava/lang/String;I)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x3

    const v1, 0x286f

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    const/4 v3, 0x1

    if-ne p2, v0, :cond_0

    add-int/lit8 v0, p2, -0x1

    const v4, 0x2870

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x2871

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v4, v5, v1}, [Ljava/lang/String;

    move-result-object v4

    .line 2
    invoke-static {p1, v0, v2, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    .line 3
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v4, 0x2

    sub-int/2addr v0, v4

    const v5, 0x2872

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x2873

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v0, v4, v5}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    const v4, 0x2874

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x2875

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v0, v3, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    sub-int/2addr p2, v3

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {p1, p2, v2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v3

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private conditionM0(Ljava/lang/String;I)Z
    .locals 5

    add-int/lit8 v0, p2, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v1

    const/4 v2, 0x1

    const/16 v3, 0x4d

    if-ne v1, v3, :cond_0

    return v2

    :cond_0
    add-int/lit8 v1, p2, -0x1

    const/4 v3, 0x3

    const v4, 0x2876

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 2
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v1, v3, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v2

    if-eq v0, v1, :cond_2

    const/4 v0, 0x2

    add-int/2addr p2, v0

    const v1, 0x2877

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2, v0, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :cond_2
    :goto_0
    return v2
.end method

.method public static varargs contains(Ljava/lang/String;II[Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-ltz p1, :cond_1

    add-int/2addr p2, p1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-gt p2, v1, :cond_1

    .line 2
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 3
    array-length p1, p3

    move p2, v0

    :goto_0
    if-ge p2, p1, :cond_1

    aget-object v1, p3, p2

    .line 4
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v0
.end method

.method private handleAEIOUY(Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I
    .locals 1

    if-nez p2, :cond_0

    const/16 v0, 0x41

    .line 1
    invoke-virtual {p1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :cond_0
    add-int/lit8 p2, p2, 0x1

    return p2
.end method

.method private handleC(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I
    .locals 11

    .line 1
    invoke-direct {p0, p1, p3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->conditionC0(Ljava/lang/String;I)Z

    move-result v0

    const/16 v1, 0x4b

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_0
    add-int/2addr p3, v2

    goto/16 :goto_2

    :cond_0
    const/16 v0, 0x53

    if-nez p3, :cond_1

    const/4 v3, 0x6

    const v4, 0x2878

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 3
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, p3, v3, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 4
    invoke-virtual {p2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto :goto_0

    :cond_1
    const v3, 0x2879

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 5
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, p3, v2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleCH(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I

    move-result p3

    goto/16 :goto_2

    :cond_2
    const v3, 0x287a

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 7
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, p3, v2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v3

    const/16 v4, 0x58

    if-eqz v3, :cond_3

    add-int/lit8 v3, p3, -0x2

    const/4 v5, 0x4

    const v6, 0x287b

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    .line 8
    invoke-static {p1, v3, v5, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 9
    invoke-virtual {p2, v0, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    goto :goto_0

    :cond_3
    add-int/lit8 v3, p3, 0x1

    const v5, 0x287c

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 10
    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x3

    invoke-static {p1, v3, v7, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 11
    invoke-virtual {p2, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_1
    add-int/2addr p3, v7

    goto/16 :goto_2

    :cond_4
    const v6, 0x287d

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 12
    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {p1, p3, v2, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v6

    const/4 v8, 0x1

    if-eqz v6, :cond_6

    if-ne p3, v8, :cond_5

    const/4 v6, 0x0

    .line 13
    invoke-virtual {p0, p1, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v6

    const/16 v9, 0x4d

    if-eq v6, v9, :cond_6

    .line 14
    :cond_5
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleCC(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I

    move-result p1

    return p1

    :cond_6
    const v6, 0x287e

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v9, 0x287f

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x2880

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 15
    filled-new-array {v6, v9, v10}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {p1, p3, v2, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 16
    invoke-virtual {p2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto/16 :goto_0

    :cond_7
    const v6, 0x2881

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v9, 0x2882

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x2883

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 17
    filled-new-array {v6, v9, v10}, [Ljava/lang/String;

    move-result-object v10

    invoke-static {p1, p3, v2, v10}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_9

    const v1, 0x2884

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v3, 0x2885

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 18
    filled-new-array {v1, v3, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p3, v7, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 19
    invoke-virtual {p2, v0, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    goto/16 :goto_0

    .line 20
    :cond_8
    invoke-virtual {p2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto/16 :goto_0

    .line 21
    :cond_9
    invoke-virtual {p2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    const p2, 0x2886

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x2887

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x2888

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 22
    filled-new-array {p2, v0, v1}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v3, v2, p2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_a

    goto/16 :goto_1

    :cond_a
    const p2, 0x2889

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const v0, 0x288a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x288b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 23
    filled-new-array {p2, v0, v1}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v3, v8, p2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_b

    filled-new-array {v9, v6}, [Ljava/lang/String;

    move-result-object p2

    .line 24
    invoke-static {p1, v3, v2, p2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_0

    :cond_b
    move p3, v3

    :goto_2
    return p3
.end method

.method private handleCC(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I
    .locals 4

    add-int/lit8 v0, p3, 0x2

    const v1, 0x288c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x288d

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x288e

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 1
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {p1, v0, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const v1, 0x288f

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    .line 2
    invoke-static {p1, v0, v3, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    if-ne p3, v2, :cond_0

    add-int/lit8 v0, p3, -0x1

    .line 3
    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v0

    const/16 v1, 0x41

    if-eq v0, v1, :cond_1

    :cond_0
    add-int/lit8 v0, p3, -0x1

    const/4 v1, 0x5

    const v2, 0x2890

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x2891

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-static {p1, v0, v1, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const p1, 0x2892

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-virtual {p2, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/16 p1, 0x58

    .line 6
    invoke-virtual {p2, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_0
    add-int/lit8 v0, p3, 0x3

    goto :goto_1

    :cond_3
    const/16 p1, 0x4b

    .line 7
    invoke-virtual {p2, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_1
    return v0
.end method

.method private handleCH(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I
    .locals 5

    const/16 v0, 0x58

    const/4 v1, 0x2

    const/16 v2, 0x4b

    if-lez p3, :cond_0

    const/4 v3, 0x4

    const v4, 0x2893

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 1
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, p3, v3, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 2
    invoke-virtual {p2, v2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    :goto_0
    add-int/2addr p3, v1

    return p3

    .line 3
    :cond_0
    invoke-direct {p0, p1, p3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->conditionCH0(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 4
    invoke-virtual {p2, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->conditionCH1(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 6
    invoke-virtual {p2, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto :goto_0

    :cond_2
    if-lez p3, :cond_4

    const/4 v3, 0x0

    const v4, 0x2894

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 7
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v3, v1, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 8
    invoke-virtual {p2, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto :goto_1

    .line 9
    :cond_3
    invoke-virtual {p2, v0, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    goto :goto_1

    .line 10
    :cond_4
    invoke-virtual {p2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_1
    add-int/2addr p3, v1

    return p3
.end method

.method private handleD(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I
    .locals 5

    const v0, 0x2895

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {p1, p3, v1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    add-int/lit8 v0, p3, 0x2

    const v1, 0x2896

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v3, 0x2897

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x2898

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 2
    filled-new-array {v1, v3, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x4a

    .line 3
    invoke-virtual {p2, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/lit8 v0, p3, 0x3

    goto :goto_0

    :cond_0
    const p1, 0x2899

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {p2, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const v0, 0x289a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v3, 0x289b

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 5
    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p3, v1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    const/16 v0, 0x54

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/lit8 v0, p3, 0x2

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {p2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/lit8 v0, p3, 0x1

    :goto_0
    return v0
.end method

.method private handleG(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;IZ)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    add-int/lit8 v4, v3, 0x1

    .line 1
    invoke-virtual {v0, v1, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v5

    const/16 v6, 0x48

    if-ne v5, v6, :cond_0

    .line 2
    invoke-direct/range {p0 .. p3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleGH(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I

    move-result v4

    goto/16 :goto_4

    .line 3
    :cond_0
    invoke-virtual {v0, v1, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v5

    const/16 v6, 0x4e

    const/16 v7, 0x59

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x2

    if-ne v5, v6, :cond_3

    const v5, 0x289c

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x289d

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    if-ne v3, v9, :cond_1

    .line 4
    invoke-virtual {v0, v1, v8}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v8

    invoke-direct {v0, v8}, Lorg/apache/commons/codec/language/DoubleMetaphone;->isVowel(C)Z

    move-result v8

    if-eqz v8, :cond_1

    if-nez p4, :cond_1

    .line 5
    invoke-virtual {v2, v6, v5}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    add-int/lit8 v8, v3, 0x2

    const v9, 0x289e

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    .line 6
    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v8, v10, v9}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2

    .line 7
    invoke-virtual {v0, v1, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v1

    if-eq v1, v7, :cond_2

    if-nez p4, :cond_2

    .line 8
    invoke-virtual {v2, v5, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {v2, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const v5, 0x289f

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 10
    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v4, v10, v5}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    if-nez p4, :cond_4

    const v1, 0x28a0

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v4, 0x28a1

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 11
    invoke-virtual {v2, v1, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    add-int/lit8 v4, v3, 0x2

    goto/16 :goto_4

    :cond_4
    const/16 v5, 0x4a

    const/16 v6, 0x4b

    if-nez v3, :cond_6

    .line 12
    invoke-virtual {v0, v1, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v11

    if-eq v11, v7, :cond_5

    sget-object v11, Lorg/apache/commons/codec/language/DoubleMetaphone;->ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER:[Ljava/lang/String;

    .line 13
    invoke-static {v1, v4, v10, v11}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_6

    .line 14
    :cond_5
    invoke-virtual {v2, v6, v5}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    goto :goto_0

    :cond_6
    const v11, 0x28a2

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    .line 15
    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v11

    invoke-static {v1, v4, v10, v11}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v11

    const v12, 0x28a3

    invoke-static {v12}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    const v13, 0x28a4

    invoke-static {v13}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x3

    if-nez v11, :cond_7

    .line 16
    invoke-virtual {v0, v1, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v11

    if-ne v11, v7, :cond_8

    :cond_7
    const/4 v7, 0x6

    const v11, 0x28a5

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    const v15, 0x28a6

    invoke-static {v15}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    const v10, 0x28a7

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v11, v15, v10}, [Ljava/lang/String;

    move-result-object v10

    .line 17
    invoke-static {v1, v8, v7, v10}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_8

    add-int/lit8 v7, v3, -0x1

    filled-new-array {v13, v12}, [Ljava/lang/String;

    move-result-object v10

    .line 18
    invoke-static {v1, v7, v9, v10}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_8

    const v10, 0x28a8

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x28a9

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    filled-new-array {v10, v11}, [Ljava/lang/String;

    move-result-object v10

    .line 19
    invoke-static {v1, v7, v14, v10}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_8

    .line 20
    invoke-virtual {v2, v6, v5}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    :goto_1
    const/4 v1, 0x2

    add-int/lit8 v4, v3, 0x2

    goto/16 :goto_4

    :cond_8
    const v7, 0x28aa

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 21
    filled-new-array {v13, v12, v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v4, v9, v7}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v7

    const/4 v9, 0x4

    if-nez v7, :cond_b

    add-int/lit8 v7, v3, -0x1

    const v10, 0x28ab

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x28ac

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    filled-new-array {v10, v11}, [Ljava/lang/String;

    move-result-object v10

    .line 22
    invoke-static {v1, v7, v9, v10}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_2

    .line 23
    :cond_9
    invoke-virtual {v0, v1, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v1

    const/16 v5, 0x47

    if-ne v1, v5, :cond_a

    const/4 v1, 0x2

    add-int/lit8 v4, v3, 0x2

    .line 24
    invoke-virtual {v2, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto :goto_4

    .line 25
    :cond_a
    invoke-virtual {v2, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto :goto_4

    :cond_b
    :goto_2
    const v7, 0x28ad

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v10, 0x28ae

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 26
    filled-new-array {v7, v10}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v8, v9, v7}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_e

    const v7, 0x28af

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    .line 27
    invoke-static {v1, v8, v14, v7}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_e

    const v7, 0x28b0

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x2

    .line 28
    invoke-static {v1, v4, v8, v7}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_c

    goto :goto_3

    :cond_c
    const v7, 0x28b1

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 29
    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v4, v14, v7}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 30
    invoke-virtual {v2, v5}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto/16 :goto_1

    .line 31
    :cond_d
    invoke-virtual {v2, v5, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    goto/16 :goto_1

    .line 32
    :cond_e
    :goto_3
    invoke-virtual {v2, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto/16 :goto_1

    :goto_4
    return v4
.end method

.method private handleGH(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I
    .locals 10

    const/16 v0, 0x4b

    const/4 v1, 0x2

    if-lez p3, :cond_1

    add-int/lit8 v2, p3, -0x1

    .line 1
    invoke-virtual {p0, p1, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v2

    invoke-direct {p0, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->isVowel(C)Z

    move-result v2

    if-nez v2, :cond_1

    .line 2
    invoke-virtual {p2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :cond_0
    :goto_0
    add-int/2addr p3, v1

    goto/16 :goto_1

    :cond_1
    const/16 v2, 0x49

    if-nez p3, :cond_3

    add-int/2addr p3, v1

    .line 3
    invoke-virtual {p0, p1, p3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result p1

    if-ne p1, v2, :cond_2

    const/16 p1, 0x4a

    .line 4
    invoke-virtual {p2, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto/16 :goto_1

    .line 5
    :cond_2
    invoke-virtual {p2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto/16 :goto_1

    :cond_3
    const v3, 0x28b2

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x28b3

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x28b4

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    if-le p3, v6, :cond_4

    add-int/lit8 v7, p3, -0x2

    .line 6
    filled-new-array {v5, v4, v3}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {p1, v7, v6, v8}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_0

    :cond_4
    if-le p3, v1, :cond_5

    add-int/lit8 v7, p3, -0x3

    filled-new-array {v5, v4, v3}, [Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-static {p1, v7, v6, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    :cond_5
    const/4 v3, 0x3

    if-le p3, v3, :cond_6

    add-int/lit8 v3, p3, -0x4

    filled-new-array {v5, v4}, [Ljava/lang/String;

    move-result-object v4

    .line 8
    invoke-static {p1, v3, v6, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_0

    :cond_6
    if-le p3, v1, :cond_7

    add-int/lit8 v3, p3, -0x1

    .line 9
    invoke-virtual {p0, p1, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v3

    const/16 v4, 0x55

    if-ne v3, v4, :cond_7

    add-int/lit8 v3, p3, -0x3

    const v4, 0x28b5

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x28b6

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v7, 0x28b7

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x28b8

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v9, 0x28b9

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v4, v5, v7, v8, v9}, [Ljava/lang/String;

    move-result-object v4

    .line 10
    invoke-static {p1, v3, v6, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 p1, 0x46

    .line 11
    invoke-virtual {p2, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto/16 :goto_0

    :cond_7
    if-lez p3, :cond_0

    add-int/lit8 v3, p3, -0x1

    .line 12
    invoke-virtual {p0, p1, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result p1

    if-eq p1, v2, :cond_0

    .line 13
    invoke-virtual {p2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto/16 :goto_0

    :goto_1
    return p3
.end method

.method private handleH(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I
    .locals 1

    if-eqz p3, :cond_0

    add-int/lit8 v0, p3, -0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v0

    invoke-direct {p0, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->isVowel(C)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    add-int/lit8 v0, p3, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result p1

    invoke-direct {p0, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->isVowel(C)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p1, 0x48

    .line 3
    invoke-virtual {p2, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/lit8 p3, p3, 0x2

    goto :goto_0

    :cond_1
    add-int/lit8 p3, p3, 0x1

    :goto_0
    return p3
.end method

.method private handleJ(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;IZ)I
    .locals 9

    const v0, 0x28ba

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {p1, p3, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v1

    const/16 v3, 0x20

    const v4, 0x28bb

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x48

    const/16 v7, 0x4a

    const/4 v8, 0x1

    if-nez v1, :cond_6

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v5, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    const/16 v1, 0x41

    if-nez p3, :cond_1

    .line 2
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p3, v2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p2, v7, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    goto :goto_0

    :cond_1
    add-int/lit8 v0, p3, -0x1

    .line 4
    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v2

    invoke-direct {p0, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->isVowel(C)Z

    move-result v2

    if-eqz v2, :cond_3

    if-nez p4, :cond_3

    add-int/lit8 p4, p3, 0x1

    .line 5
    invoke-virtual {p0, p1, p4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v2

    if-eq v2, v1, :cond_2

    invoke-virtual {p0, p1, p4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result p4

    const/16 v1, 0x4f

    if-ne p4, v1, :cond_3

    .line 6
    :cond_2
    invoke-virtual {p2, v7, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    goto :goto_0

    .line 7
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p4

    sub-int/2addr p4, v8

    if-ne p3, p4, :cond_4

    .line 8
    invoke-virtual {p2, v7, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    goto :goto_0

    :cond_4
    add-int/lit8 p4, p3, 0x1

    .line 9
    sget-object v1, Lorg/apache/commons/codec/language/DoubleMetaphone;->L_T_K_S_N_M_B_Z:[Ljava/lang/String;

    invoke-static {p1, p4, v8, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_5

    const p4, 0x28bc

    invoke-static {p4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p4

    const v1, 0x28bd

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x28be

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {p4, v1, v2}, [Ljava/lang/String;

    move-result-object p4

    .line 10
    invoke-static {p1, v0, v8, p4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_5

    .line 11
    invoke-virtual {p2, v7}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :cond_5
    :goto_0
    add-int/lit8 p2, p3, 0x1

    .line 12
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result p1

    if-ne p1, v7, :cond_a

    add-int/lit8 p2, p3, 0x2

    goto :goto_4

    :cond_6
    :goto_1
    if-nez p3, :cond_7

    add-int/lit8 p4, p3, 0x4

    .line 13
    invoke-virtual {p0, p1, p4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result p4

    if-eq p4, v3, :cond_9

    .line 14
    :cond_7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p4

    if-eq p4, v2, :cond_9

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object p4

    invoke-static {p1, v5, v2, p4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_2

    .line 15
    :cond_8
    invoke-virtual {p2, v7, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    goto :goto_3

    .line 16
    :cond_9
    :goto_2
    invoke-virtual {p2, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_3
    add-int/lit8 p2, p3, 0x1

    :cond_a
    :goto_4
    return p2
.end method

.method private handleL(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I
    .locals 3

    add-int/lit8 v0, p3, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v1

    const/16 v2, 0x4c

    if-ne v1, v2, :cond_1

    .line 2
    invoke-direct {p0, p1, p3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->conditionL0(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p2, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->appendPrimary(C)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_0
    add-int/lit8 v0, p3, 0x2

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {p2, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_1
    return v0
.end method

.method private handleP(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I
    .locals 3

    add-int/lit8 v0, p3, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v1

    const/16 v2, 0x48

    if-ne v1, v2, :cond_0

    const/16 p1, 0x46

    .line 2
    invoke-virtual {p2, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/lit8 p3, p3, 0x2

    goto :goto_0

    :cond_0
    const/16 v1, 0x50

    .line 3
    invoke-virtual {p2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    const p2, 0x28bf

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const v1, 0x28c0

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    filled-new-array {p2, v1}, [Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, p2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    add-int/lit8 v0, p3, 0x2

    :cond_1
    move p3, v0

    :goto_0
    return p3
.end method

.method private handleR(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;IZ)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/16 v1, 0x52

    const/4 v2, 0x2

    if-ne p3, v0, :cond_0

    if-nez p4, :cond_0

    add-int/lit8 p4, p3, -0x2

    const v0, 0x28c1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {p1, p4, v2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    add-int/lit8 p4, p3, -0x4

    const v0, 0x28c2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v3, 0x28c3

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {p1, p4, v2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_0

    .line 4
    invoke-virtual {p2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->appendAlternate(C)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_0
    add-int/lit8 p2, p3, 0x1

    .line 6
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result p1

    if-ne p1, v1, :cond_1

    add-int/lit8 p2, p3, 0x2

    :cond_1
    return p2
.end method

.method private handleS(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;IZ)I
    .locals 9

    add-int/lit8 v0, p3, -0x1

    const v1, 0x28c4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x28c5

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 1
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {p1, v0, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    :goto_0
    add-int/2addr p3, v1

    goto/16 :goto_5

    :cond_0
    const/16 v0, 0x58

    const/16 v3, 0x53

    if-nez p3, :cond_1

    const/4 v4, 0x5

    const v5, 0x28c6

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 2
    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, p3, v4, v5}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 3
    invoke-virtual {p2, v0, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    goto :goto_0

    :cond_1
    const v4, 0x28c7

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 4
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    invoke-static {p1, p3, v5, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v4

    const/4 v6, 0x4

    if-eqz v4, :cond_3

    add-int/lit8 p4, p3, 0x1

    const v1, 0x28c8

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x28c9

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v4, 0x28ca

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v7, 0x28cb

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 5
    filled-new-array {v1, v2, v4, v7}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p4, v6, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto :goto_1

    .line 7
    :cond_2
    invoke-virtual {p2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_1
    add-int/2addr p3, v5

    goto/16 :goto_5

    :cond_3
    const v4, 0x28cc

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v7, 0x28cd

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 8
    filled-new-array {v4, v7}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, p3, v2, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_c

    const v4, 0x28ce

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, p3, v6, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const p4, 0x28cf

    invoke-static {p4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p4

    if-nez p3, :cond_5

    add-int/lit8 v2, p3, 0x1

    const v4, 0x28d0

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v6, 0x28d1

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x28d2

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x28d3

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 9
    filled-new-array {v4, v6, v7, v8}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v2, v1, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    add-int/lit8 v2, p3, 0x1

    filled-new-array {p4}, [Ljava/lang/String;

    move-result-object v4

    .line 10
    invoke-static {p1, v2, v1, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 11
    :cond_6
    invoke-virtual {p2, v3, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    add-int/lit8 p2, p3, 0x1

    .line 12
    filled-new-array {p4}, [Ljava/lang/String;

    move-result-object p4

    invoke-static {p1, p2, v1, p4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_1

    :cond_7
    move p3, p2

    goto :goto_5

    :cond_8
    const v0, 0x28d4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 13
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p3, v5, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 14
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleSC(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I

    move-result p3

    goto :goto_5

    .line 15
    :cond_9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v1

    if-ne p3, v0, :cond_a

    add-int/lit8 v0, p3, -0x2

    const v4, 0x28d5

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v6, 0x28d6

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v4, v6}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v0, v5, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 16
    invoke-virtual {p2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->appendAlternate(C)V

    goto :goto_2

    .line 17
    :cond_a
    invoke-virtual {p2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_2
    const p2, 0x28d7

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 18
    filled-new-array {p2, p4}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v2, v1, p2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_b

    goto/16 :goto_1

    :cond_b
    move p3, v2

    goto :goto_5

    :cond_c
    :goto_3
    if-eqz p4, :cond_d

    .line 19
    invoke-virtual {p2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto :goto_4

    .line 20
    :cond_d
    invoke-virtual {p2, v3, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    :goto_4
    add-int/2addr p3, v2

    :goto_5
    return p3
.end method

.method private handleSC(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I
    .locals 11

    add-int/lit8 v0, p3, 0x2

    .line 1
    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v1

    const/16 v2, 0x53

    const v3, 0x28d8

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    const/16 v5, 0x48

    if-ne v1, v5, :cond_3

    add-int/lit8 v0, p3, 0x3

    const v5, 0x28d9

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x28da

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x28db

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x28dc

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v9, 0x28dd

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x28de

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 2
    filled-new-array/range {v5 .. v10}, [Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x2

    invoke-static {p1, v0, v5, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x28df

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x28e0

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 3
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v5, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x28e1

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {p2, p1, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/16 v0, 0x58

    if-nez p3, :cond_2

    .line 6
    invoke-virtual {p0, p1, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v1

    invoke-direct {p0, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->isVowel(C)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0, p1, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result p1

    const/16 v1, 0x57

    if-eq p1, v1, :cond_2

    .line 7
    invoke-virtual {p2, v0, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    const v5, 0x28e2

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x28e3

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x28e4

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 9
    filled-new-array {v5, v6, v7}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v0, v1, v5}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 10
    invoke-virtual {p2, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto :goto_0

    .line 11
    :cond_4
    invoke-virtual {p2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(Ljava/lang/String;)V

    :goto_0
    add-int/2addr p3, v4

    return p3
.end method

.method private handleT(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I
    .locals 6

    const v0, 0x28e5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {p1, p3, v1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    const/16 v2, 0x58

    const/4 v3, 0x3

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p2, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_0
    add-int/2addr p3, v3

    goto/16 :goto_3

    :cond_0
    const v0, 0x28e6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v4, 0x28e7

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 3
    filled-new-array {v0, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p3, v3, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p2, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto :goto_0

    :cond_1
    const v0, 0x28e8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {p1, p3, v2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    const/16 v4, 0x54

    if-nez v0, :cond_4

    const v0, 0x28e9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p3, v3, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 6
    :cond_2
    invoke-virtual {p2, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/lit8 p2, p3, 0x1

    const v0, 0x28ea

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x28eb

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 7
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p1, p2, v1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    add-int/2addr p3, v2

    goto :goto_3

    :cond_3
    move p3, p2

    goto :goto_3

    :cond_4
    :goto_1
    add-int/2addr p3, v2

    const v0, 0x28ec

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v5, 0x28ed

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 8
    filled-new-array {v0, v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p3, v2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const v0, 0x28ee

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v2, 0x28ef

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    .line 9
    invoke-static {p1, v2, v1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const v0, 0x28f0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-static {p1, v2, v3, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    const/16 p1, 0x30

    .line 11
    invoke-virtual {p2, p1, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    goto :goto_3

    .line 12
    :cond_6
    :goto_2
    invoke-virtual {p2, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_3
    return p3
.end method

.method private handleW(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I
    .locals 7

    const v0, 0x28f1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {p1, p3, v1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p1, 0x52

    .line 2
    invoke-virtual {p2, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_0
    add-int/2addr p3, v1

    goto/16 :goto_3

    :cond_0
    const/16 v0, 0x46

    if-nez p3, :cond_3

    add-int/lit8 v2, p3, 0x1

    .line 3
    invoke-virtual {p0, p1, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v3

    invoke-direct {p0, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->isVowel(C)Z

    move-result v3

    if-nez v3, :cond_1

    const v3, 0x28f2

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-static {p1, p3, v1, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 5
    :cond_1
    invoke-virtual {p0, p1, v2}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result p1

    invoke-direct {p0, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->isVowel(C)Z

    move-result p1

    const/16 p3, 0x41

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p2, p3, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(CC)V

    goto :goto_1

    .line 7
    :cond_2
    invoke-virtual {p2, p3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :goto_1
    move p3, v2

    goto/16 :goto_3

    .line 8
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne p3, v1, :cond_4

    add-int/lit8 v1, p3, -0x1

    invoke-virtual {p0, p1, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v1

    invoke-direct {p0, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->isVowel(C)Z

    move-result v1

    if-nez v1, :cond_6

    :cond_4
    add-int/lit8 v1, p3, -0x1

    const/4 v2, 0x5

    const v3, 0x28f3

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x28f4

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x28f5

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x28f6

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v3, v4, v5, v6}, [Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-static {p1, v1, v2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_6

    const/4 v1, 0x0

    const/4 v2, 0x3

    const v3, 0x28f7

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    .line 10
    invoke-static {p1, v1, v2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    const v0, 0x28f8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x28f9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 11
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {p1, p3, v1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    const p1, 0x28fa

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x28fb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-virtual {p2, p1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 13
    :cond_6
    :goto_2
    invoke-virtual {p2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->appendAlternate(C)V

    :cond_7
    add-int/lit8 p3, p3, 0x1

    :goto_3
    return p3
.end method

.method private handleX(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I
    .locals 5

    const/4 v0, 0x1

    if-nez p3, :cond_0

    const/16 p1, 0x53

    .line 1
    invoke-virtual {p2, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/2addr p3, v0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v0

    const/4 v2, 0x2

    if-ne p3, v1, :cond_1

    add-int/lit8 v1, p3, -0x3

    const v3, 0x28fc

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x28fd

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    .line 3
    invoke-static {p1, v1, v4, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    add-int/lit8 v1, p3, -0x2

    const v3, 0x28fe

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x28ff

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-static {p1, v1, v2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    const v1, 0x2900

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {p2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(Ljava/lang/String;)V

    :cond_2
    add-int/lit8 p2, p3, 0x1

    const v1, 0x2901

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v3, 0x2902

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 6
    filled-new-array {v1, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, p2, v0, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    add-int/2addr p3, v2

    goto :goto_0

    :cond_3
    move p3, p2

    :goto_0
    return p3
.end method

.method private handleZ(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;IZ)I
    .locals 5

    add-int/lit8 v0, p3, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v1

    const/4 v2, 0x2

    const/16 v3, 0x48

    if-ne v1, v3, :cond_0

    const/16 p1, 0x4a

    .line 2
    invoke-virtual {p2, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/2addr p3, v2

    goto :goto_2

    :cond_0
    const v1, 0x2903

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v3, 0x2904

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x2905

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 3
    filled-new-array {v1, v3, v4}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->contains(Ljava/lang/String;II[Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    if-eqz p4, :cond_1

    if-lez p3, :cond_1

    add-int/lit8 p4, p3, -0x1

    .line 4
    invoke-virtual {p0, p1, p4}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result p4

    const/16 v1, 0x54

    if-eq p4, v1, :cond_1

    goto :goto_0

    :cond_1
    const/16 p4, 0x53

    .line 5
    invoke-virtual {p2, p4}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto :goto_1

    :cond_2
    :goto_0
    const p4, 0x2906

    invoke-static {p4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p4

    const v1, 0x2907

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {p2, p4, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    :goto_1
    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result p1

    const/16 p2, 0x5a

    if-ne p1, p2, :cond_3

    add-int/lit8 v0, p3, 0x2

    :cond_3
    move p3, v0

    :goto_2
    return p3
.end method

.method private isSilentStart(Ljava/lang/String;)Z
    .locals 5

    .line 1
    sget-object v0, Lorg/apache/commons/codec/language/DoubleMetaphone;->SILENT_START:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 2
    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v2
.end method

.method private isSlavoGermanic(Ljava/lang/String;)Z
    .locals 2

    const/16 v0, 0x57

    .line 1
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-gt v0, v1, :cond_1

    const/16 v0, 0x4b

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gt v0, v1, :cond_1

    const v0, 0x2908

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-gt v0, v1, :cond_1

    const v0, 0x2909

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    if-le p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private isVowel(C)Z
    .locals 1

    const v0, 0x290a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {v0, p1}, Ljava/lang/String;->indexOf(I)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public charAt(Ljava/lang/String;I)C
    .locals 1

    if-ltz p2, :cond_1

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lt p2, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public doubleMetaphone(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->doubleMetaphone(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public doubleMetaphone(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 7

    .line 2
    invoke-direct {p0, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->cleanInput(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->isSlavoGermanic(Ljava/lang/String;)Z

    move-result v0

    .line 4
    invoke-direct {p0, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->isSilentStart(Ljava/lang/String;)Z

    move-result v1

    .line 5
    new-instance v2, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;

    invoke-virtual {p0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->getMaxCodeLen()I

    move-result v3

    invoke-direct {v2, p0, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;-><init>(Lorg/apache/commons/codec/language/DoubleMetaphone;I)V

    .line 6
    :goto_0
    invoke-virtual {v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->isComplete()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-gt v1, v3, :cond_5

    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0xc7

    if-eq v3, v4, :cond_3

    const/16 v4, 0xd1

    const/16 v5, 0x4e

    if-eq v3, v4, :cond_2

    const/16 v4, 0x4b

    const/16 v6, 0x46

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_2

    .line 8
    :pswitch_0
    invoke-direct {p0, p1, v2, v1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleZ(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;IZ)I

    move-result v1

    goto :goto_0

    .line 9
    :pswitch_1
    invoke-direct {p0, p1, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleX(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I

    move-result v1

    goto :goto_0

    .line 10
    :pswitch_2
    invoke-direct {p0, p1, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleW(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I

    move-result v1

    goto :goto_0

    .line 11
    :pswitch_3
    invoke-virtual {v2, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/lit8 v3, v1, 0x1

    .line 12
    invoke-virtual {p0, p1, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v4

    const/16 v5, 0x56

    if-ne v4, v5, :cond_1

    :goto_1
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_1
    move v1, v3

    goto :goto_0

    .line 13
    :pswitch_4
    invoke-direct {p0, p1, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleT(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I

    move-result v1

    goto :goto_0

    .line 14
    :pswitch_5
    invoke-direct {p0, p1, v2, v1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleS(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;IZ)I

    move-result v1

    goto :goto_0

    .line 15
    :pswitch_6
    invoke-direct {p0, p1, v2, v1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleR(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;IZ)I

    move-result v1

    goto :goto_0

    .line 16
    :pswitch_7
    invoke-virtual {v2, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/lit8 v3, v1, 0x1

    .line 17
    invoke-virtual {p0, p1, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v4

    const/16 v5, 0x51

    if-ne v4, v5, :cond_1

    goto :goto_1

    .line 18
    :pswitch_8
    invoke-direct {p0, p1, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleP(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I

    move-result v1

    goto :goto_0

    .line 19
    :pswitch_9
    invoke-virtual {v2, v5}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/lit8 v3, v1, 0x1

    .line 20
    invoke-virtual {p0, p1, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v4

    if-ne v4, v5, :cond_1

    goto :goto_1

    :pswitch_a
    const/16 v3, 0x4d

    .line 21
    invoke-virtual {v2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    .line 22
    invoke-direct {p0, p1, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->conditionM0(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_1

    .line 23
    :pswitch_b
    invoke-direct {p0, p1, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleL(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I

    move-result v1

    goto/16 :goto_0

    .line 24
    :pswitch_c
    invoke-virtual {v2, v4}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/lit8 v3, v1, 0x1

    .line 25
    invoke-virtual {p0, p1, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v5

    if-ne v5, v4, :cond_1

    goto :goto_1

    .line 26
    :pswitch_d
    invoke-direct {p0, p1, v2, v1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleJ(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;IZ)I

    move-result v1

    goto/16 :goto_0

    .line 27
    :pswitch_e
    invoke-direct {p0, p1, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleH(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I

    move-result v1

    goto/16 :goto_0

    .line 28
    :pswitch_f
    invoke-direct {p0, p1, v2, v1, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleG(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;IZ)I

    move-result v1

    goto/16 :goto_0

    .line 29
    :pswitch_10
    invoke-virtual {v2, v6}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/lit8 v3, v1, 0x1

    .line 30
    invoke-virtual {p0, p1, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v4

    if-ne v4, v6, :cond_1

    goto :goto_1

    .line 31
    :pswitch_11
    invoke-direct {p0, p1, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleD(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I

    move-result v1

    goto/16 :goto_0

    .line 32
    :pswitch_12
    invoke-direct {p0, p1, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleC(Ljava/lang/String;Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I

    move-result v1

    goto/16 :goto_0

    :pswitch_13
    const/16 v3, 0x50

    .line 33
    invoke-virtual {v2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    add-int/lit8 v3, v1, 0x1

    .line 34
    invoke-virtual {p0, p1, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->charAt(Ljava/lang/String;I)C

    move-result v4

    const/16 v5, 0x42

    if-ne v4, v5, :cond_1

    goto/16 :goto_1

    .line 35
    :pswitch_14
    invoke-direct {p0, v2, v1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->handleAEIOUY(Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;I)I

    move-result v1

    goto/16 :goto_0

    .line 36
    :cond_2
    invoke-virtual {v2, v5}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    goto :goto_2

    :cond_3
    const/16 v3, 0x53

    .line 37
    invoke-virtual {v2, v3}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->append(C)V

    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_5
    if-eqz p2, :cond_6

    .line 38
    invoke-virtual {v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->getAlternate()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_6
    invoke-virtual {v2}, Lorg/apache/commons/codec/language/DoubleMetaphone$DoubleMetaphoneResult;->getPrimary()Ljava/lang/String;

    move-result-object p1

    :goto_3
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_14
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_14
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_14
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_14
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_14
        :pswitch_0
    .end packed-switch
.end method

.method public encode(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/codec/EncoderException;
        }
    .end annotation

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->doubleMetaphone(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Lorg/apache/commons/codec/EncoderException;

    const v0, 0x290b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/DoubleMetaphone;->doubleMetaphone(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getMaxCodeLen()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/commons/codec/language/DoubleMetaphone;->maxCodeLen:I

    return v0
.end method

.method public isDoubleMetaphoneEqual(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lorg/apache/commons/codec/language/DoubleMetaphone;->isDoubleMetaphoneEqual(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public isDoubleMetaphoneEqual(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->doubleMetaphone(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p3}, Lorg/apache/commons/codec/language/DoubleMetaphone;->doubleMetaphone(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/apache/commons/codec/binary/StringUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method public setMaxCodeLen(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/commons/codec/language/DoubleMetaphone;->maxCodeLen:I

    return-void
.end method
