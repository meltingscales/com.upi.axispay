.class public Lmyunmn/aA;
.super Lmyunmn/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/util/AttributeSet;Lmyunmn/b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lmyunmn/c;-><init>(Landroid/app/Activity;Landroid/util/AttributeSet;)V

    invoke-virtual {p0, p3}, Lmyunmn/c;->a(Lmyunmn/b;)V

    invoke-virtual {p0}, Lmyunmn/aA;->f()V

    return-void
.end method


# virtual methods
.method public f()V
    .locals 6

    new-instance v3, Landroid/inputmethodservice/Keyboard;

    iget-object v4, p0, Lmyunmn/c;->d:Landroid/app/Activity;

    const/16 v1, 0x7

    new-array v0, v1, [C

    const/16 v2, -0x10c

    xor-int/lit16 v2, v2, -0x179

    int-to-char v2, v2

    const v1, 0x6

    aput-char v2, v0, v1

    const v1, 0x6

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x16

    int-to-char v2, v2

    const v1, 0x4

    aput-char v2, v0, v1

    const v1, 0x4

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x10

    int-to-char v2, v2

    const v1, 0x1

    aput-char v2, v0, v1

    const v1, 0x4

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x8

    int-to-char v2, v2

    const v1, 0x2

    aput-char v2, v0, v1

    const v1, 0x2

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x1f

    int-to-char v2, v2

    const v1, 0x5

    aput-char v2, v0, v1

    const v1, 0x5

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x10

    int-to-char v2, v2

    const v1, 0x3

    aput-char v2, v0, v1

    const v1, 0x2

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x3

    int-to-char v2, v2

    const v1, 0x0

    aput-char v2, v0, v1

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Lmyunmn/c;->a(Ljava/lang/String;)I

    move-result v5

    invoke-direct {v3, v4, v5}, Landroid/inputmethodservice/Keyboard;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v3}, Landroid/inputmethodservice/KeyboardView;->setKeyboard(Landroid/inputmethodservice/Keyboard;)V

    invoke-virtual {p0}, Lmyunmn/c;->c()V

    return-void
.end method
