.class public final Lokhttp3/internal/http/DatesKt;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field private static final BROWSER_COMPATIBLE_DATE_FORMATS:[Ljava/text/DateFormat;

.field private static final BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS:[Ljava/lang/String;

.field public static final MAX_DATE:J

.field private static final STANDARD_DATE_FORMAT:Lokhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    .line 1
    const-class v0, Lokhttp3/internal/http/DatesKt;

    const v1, 0x165

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    new-instance v0, Lokhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1;

    invoke-direct {v0}, Lokhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1;-><init>()V

    sput-object v0, Lokhttp3/internal/http/DatesKt;->STANDARD_DATE_FORMAT:Lokhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1;

    const v1, 0x3c4e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x3c4f

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x3c50

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x3c51

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x3c52

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x3c53

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x3c54

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x3c55

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v9, 0x3c56

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x3c57

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x3c58

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    const v12, 0x3c59

    invoke-static {v12}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    const v13, 0x3c5a

    invoke-static {v13}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    const v14, 0x3c5b

    invoke-static {v14}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    const v15, 0x3c5c

    invoke-static {v15}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    .line 2
    filled-new-array/range {v1 .. v15}, [Ljava/lang/String;

    move-result-object v0

    .line 3
    sput-object v0, Lokhttp3/internal/http/DatesKt;->BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS:[Ljava/lang/String;

    .line 4
    array-length v0, v0

    new-array v0, v0, [Ljava/text/DateFormat;

    sput-object v0, Lokhttp3/internal/http/DatesKt;->BROWSER_COMPATIBLE_DATE_FORMATS:[Ljava/text/DateFormat;

    return-void
.end method

.method public static final toHttpDateOrNull(Ljava/lang/String;)Ljava/util/Date;
    .locals 11

    const v0, 0x3c5d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const/4 v3, 0x0

    if-eqz v1, :cond_1

    return-object v3

    .line 2
    :cond_1
    new-instance v1, Ljava/text/ParsePosition;

    invoke-direct {v1, v2}, Ljava/text/ParsePosition;-><init>(I)V

    .line 3
    sget-object v4, Lokhttp3/internal/http/DatesKt;->STANDARD_DATE_FORMAT:Lokhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1;

    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/text/DateFormat;

    invoke-virtual {v4, p0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object v4

    .line 4
    invoke-virtual {v1}, Ljava/text/ParsePosition;->getIndex()I

    move-result v5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-ne v5, v6, :cond_2

    return-object v4

    .line 5
    :cond_2
    sget-object v4, Lokhttp3/internal/http/DatesKt;->BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS:[Ljava/lang/String;

    monitor-enter v4

    .line 6
    :try_start_0
    array-length v5, v4

    move v6, v2

    :goto_1
    if-ge v6, v5, :cond_5

    .line 7
    sget-object v7, Lokhttp3/internal/http/DatesKt;->BROWSER_COMPATIBLE_DATE_FORMATS:[Ljava/text/DateFormat;

    aget-object v8, v7, v6

    if-nez v8, :cond_3

    .line 8
    new-instance v8, Ljava/text/SimpleDateFormat;

    sget-object v9, Lokhttp3/internal/http/DatesKt;->BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS:[Ljava/lang/String;

    aget-object v9, v9, v6

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v8, v9, v10}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 9
    sget-object v9, Lokhttp3/internal/Util;->UTC:Ljava/util/TimeZone;

    invoke-virtual {v8, v9}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 10
    aput-object v8, v7, v6

    .line 11
    :cond_3
    invoke-virtual {v1, v2}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 12
    invoke-virtual {v8, p0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object v7

    .line 13
    invoke-virtual {v1}, Ljava/text/ParsePosition;->getIndex()I

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v8, :cond_4

    .line 14
    monitor-exit v4

    return-object v7

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 15
    :cond_5
    :try_start_1
    sget-object p0, Lpi0;->a:Lpi0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    monitor-exit v4

    return-object v3

    :catchall_0
    move-exception p0

    monitor-exit v4

    throw p0
.end method

.method public static final toHttpDateString(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    const v0, 0x3c5e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lokhttp3/internal/http/DatesKt;->STANDARD_DATE_FORMAT:Lokhttp3/internal/http/DatesKt$STANDARD_DATE_FORMAT$1;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    const v0, 0x3c5f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lyl0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
