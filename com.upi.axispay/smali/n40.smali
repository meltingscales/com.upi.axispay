.class public final Ln40;
.super Lt40;
.source "AxisPay"


# static fields
.field public static final a:[I

.field public static final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const v0, 0x24

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    const/16 v0, 0x30

    new-array v0, v0, [I

    .line 2
    fill-array-data v0, :array_0

    .line 3
    sput-object v0, Ln40;->a:[I

    const/16 v1, 0x2f

    aget v0, v0, v1

    sput v0, Ln40;->b:I

    return-void

    :array_0
    .array-data 4
        0x114
        0x148
        0x144
        0x142
        0x128
        0x124
        0x122
        0x150
        0x112
        0x10a
        0x1a8
        0x1a4
        0x1a2
        0x194
        0x192
        0x18a
        0x168
        0x164
        0x162
        0x134
        0x11a
        0x158
        0x14c
        0x146
        0x12c
        0x116
        0x1b4
        0x1b2
        0x1ac
        0x1a6
        0x196
        0x19a
        0x16c
        0x166
        0x136
        0x13a
        0x12e
        0x1d4
        0x1d2
        0x1ca
        0x16e
        0x176
        0x1ae
        0x126
        0x1da
        0x1d6
        0x132
        0x15e
    .end array-data
.end method
