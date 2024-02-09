.class public final Lokio/-GzipSourceExtensions;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field private static final FCOMMENT:I

.field private static final FEXTRA:I

.field private static final FHCRC:I

.field private static final FNAME:I

.field private static final SECTION_BODY:B

.field private static final SECTION_DONE:B

.field private static final SECTION_HEADER:B

.field private static final SECTION_TRAILER:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lokio/-GzipSourceExtensions;

    const v1, 0x8d

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public static final synthetic access$getBit(II)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lokio/-GzipSourceExtensions;->getBit(II)Z

    move-result p0

    return p0
.end method

.method private static final getBit(II)Z
    .locals 0

    shr-int/2addr p0, p1

    const/4 p1, 0x1

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static final gzip(Lokio/Source;)Lokio/GzipSource;
    .locals 1

    const v0, 0x2946

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lokio/GzipSource;

    invoke-direct {v0, p0}, Lokio/GzipSource;-><init>(Lokio/Source;)V

    return-object v0
.end method
