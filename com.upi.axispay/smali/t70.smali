.class public final Lt70;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final CircularImageView:[I

.field public static final CircularImageView_border:I

.field public static final CircularImageView_border_color:I

.field public static final CircularImageView_border_width:I

.field public static final CircularImageView_selector:I

.field public static final CircularImageView_selector_color:I

.field public static final CircularImageView_selector_stroke_color:I

.field public static final CircularImageView_selector_stroke_width:I

.field public static final CircularImageView_shadow:I

.field public static final CustomCircularImageViewTheme:[I

.field public static final CustomCircularImageViewTheme_circularImageViewStyle:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Lt70;

    const v1, 0x8c

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lt70;->CircularImageView:[I

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x7f0400bb

    aput v2, v0, v1

    sput-object v0, Lt70;->CustomCircularImageViewTheme:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f040062
        0x7f040066
        0x7f040067
        0x7f04036e
        0x7f040370
        0x7f040371
        0x7f040372
        0x7f040374
    .end array-data
.end method
