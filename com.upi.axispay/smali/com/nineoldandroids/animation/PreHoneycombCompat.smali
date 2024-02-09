.class public final Lcom/nineoldandroids/animation/PreHoneycombCompat;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static ALPHA:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static PIVOT_X:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static PIVOT_Y:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static ROTATION:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static ROTATION_X:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static ROTATION_Y:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static SCALE_X:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static SCALE_Y:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static SCROLL_X:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static SCROLL_Y:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static TRANSLATION_X:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static TRANSLATION_Y:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static X:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static Y:Lcom/nineoldandroids/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/nineoldandroids/util/Property<",
            "Landroid/view/View;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$1;

    const v1, 0x3c9b

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->ALPHA:Lcom/nineoldandroids/util/Property;

    .line 2
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$2;

    const v1, 0x3c9c

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$2;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->PIVOT_X:Lcom/nineoldandroids/util/Property;

    .line 3
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$3;

    const v1, 0x3c9d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$3;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->PIVOT_Y:Lcom/nineoldandroids/util/Property;

    .line 4
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$4;

    const v1, 0x3c9e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$4;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->TRANSLATION_X:Lcom/nineoldandroids/util/Property;

    .line 5
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$5;

    const v1, 0x3c9f

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$5;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->TRANSLATION_Y:Lcom/nineoldandroids/util/Property;

    .line 6
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$6;

    const v1, 0x3ca0

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$6;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->ROTATION:Lcom/nineoldandroids/util/Property;

    .line 7
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$7;

    const v1, 0x3ca1

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$7;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->ROTATION_X:Lcom/nineoldandroids/util/Property;

    .line 8
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$8;

    const v1, 0x3ca2

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$8;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->ROTATION_Y:Lcom/nineoldandroids/util/Property;

    .line 9
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$9;

    const v1, 0x3ca3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$9;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->SCALE_X:Lcom/nineoldandroids/util/Property;

    .line 10
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$10;

    const v1, 0x3ca4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$10;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->SCALE_Y:Lcom/nineoldandroids/util/Property;

    .line 11
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$11;

    const v1, 0x3ca5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$11;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->SCROLL_X:Lcom/nineoldandroids/util/Property;

    .line 12
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$12;

    const v1, 0x3ca6

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$12;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->SCROLL_Y:Lcom/nineoldandroids/util/Property;

    .line 13
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$13;

    const v1, 0x3ca7

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$13;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->X:Lcom/nineoldandroids/util/Property;

    .line 14
    new-instance v0, Lcom/nineoldandroids/animation/PreHoneycombCompat$14;

    const v1, 0x3ca8

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/nineoldandroids/animation/PreHoneycombCompat$14;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/nineoldandroids/animation/PreHoneycombCompat;->Y:Lcom/nineoldandroids/util/Property;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
