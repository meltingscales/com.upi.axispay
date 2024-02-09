.class public Lmyunmn/am;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/Thread$UncaughtExceptionHandler; = null

.field private static final b:Ljava/lang/String; = "Report"

.field private static c:I = -0x1


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lmyunmn/z;->a()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lmyunmn/am;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Ljava/lang/Thread$UncaughtExceptionHandler;)Ljava/lang/Thread$UncaughtExceptionHandler;
    .locals 0

    sput-object p0, Lmyunmn/am;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-object p0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 5

    invoke-static {p0}, Lmyunmn/am;->b(Ljava/lang/String;)Lmyunmn/aD;

    move-result-object p0

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1a

    if-lt v3, v4, :cond_0

    const/16 v1, 0x6

    new-array v0, v1, [C

    const/16 v2, -0x671f

    xor-int/lit16 v2, v2, -0x676b

    int-to-char v2, v2

    const v1, 0x5

    aput-char v2, v0, v1

    const v1, 0x5

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x4

    int-to-char v2, v2

    const v1, 0x2

    aput-char v2, v0, v1

    const v1, 0x5

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x6

    int-to-char v2, v2

    const v1, 0x4

    aput-char v2, v0, v1

    const v1, 0x4

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x20

    int-to-char v2, v2

    const v1, 0x0

    aput-char v2, v0, v1

    const v1, 0x0

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x37

    int-to-char v2, v2

    const v1, 0x1

    aput-char v2, v0, v1

    const v1, 0x4

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x1d

    int-to-char v2, v2

    const v1, 0x3

    aput-char v2, v0, v1

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    const/16 v1, 0x9

    new-array v0, v1, [C

    const/16 v2, 0x2b35

    xor-int/lit16 v2, v2, 0x2b70

    int-to-char v2, v2

    const v1, 0x0

    aput-char v2, v0, v1

    const v1, 0x0

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x2b

    int-to-char v2, v2

    const v1, 0x5

    aput-char v2, v0, v1

    const v1, 0x5

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x9

    int-to-char v2, v2

    const v1, 0x6

    aput-char v2, v0, v1

    const v1, 0x6

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x47

    int-to-char v2, v2

    const v1, 0x8

    aput-char v2, v0, v1

    const v1, 0x0

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x31

    int-to-char v2, v2

    const v1, 0x3

    aput-char v2, v0, v1

    const v1, 0x3

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x1d

    int-to-char v2, v2

    const v1, 0x4

    aput-char v2, v0, v1

    const v1, 0x5

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x16

    int-to-char v2, v2

    const v1, 0x1

    aput-char v2, v0, v1

    const v1, 0x8

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x1a

    int-to-char v2, v2

    const v1, 0x7

    aput-char v2, v0, v1

    const v1, 0x3

    aget-char v2, v0, v1

    xor-int/lit16 v2, v2, 0x1d

    int-to-char v2, v2

    const v1, 0x2

    aput-char v2, v0, v1

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    sget-object v3, Lmyunmn/am;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-interface {v3, v4, p0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic b()Ljava/lang/Thread$UncaughtExceptionHandler;
    .locals 1

    sget-object v0, Lmyunmn/am;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-object v0
.end method

.method private static b(Ljava/lang/String;)Lmyunmn/aD;
    .locals 6

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x2

    if-ge v3, v4, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    new-instance v3, Lmyunmn/ah;

    invoke-direct {v3, p0}, Lmyunmn/ah;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_1
    new-instance v3, Lmyunmn/al;

    invoke-direct {v3, p0}, Lmyunmn/al;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_2
    new-instance v3, Lmyunmn/aI;

    invoke-direct {v3, p0}, Lmyunmn/aI;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_3
    new-instance v3, Lmyunmn/av;

    invoke-direct {v3, p0}, Lmyunmn/av;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_4
    new-instance v3, Lmyunmn/G;

    invoke-direct {v3, p0}, Lmyunmn/G;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_5
    new-instance v3, Lmyunmn/aL;

    invoke-direct {v3, p0}, Lmyunmn/aL;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_6
    new-instance v3, Lmyunmn/E;

    invoke-direct {v3, p0}, Lmyunmn/E;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_7
    new-instance v3, Lmyunmn/aO;

    invoke-direct {v3, p0}, Lmyunmn/aO;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_8
    new-instance v3, Lmyunmn/s;

    invoke-direct {v3, p0}, Lmyunmn/s;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_9
    new-instance v3, Lmyunmn/j;

    invoke-direct {v3, p0}, Lmyunmn/j;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_a
    new-instance v3, Lmyunmn/ak;

    invoke-direct {v3, p0}, Lmyunmn/ak;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_b
    new-instance v3, Lmyunmn/aP;

    invoke-direct {v3, p0}, Lmyunmn/aP;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_c
    new-instance v3, Lmyunmn/aB;

    invoke-direct {v3, p0}, Lmyunmn/aB;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_d
    new-instance v3, Lmyunmn/ag;

    invoke-direct {v3, p0}, Lmyunmn/ag;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_e
    new-instance v3, Lmyunmn/aq;

    invoke-direct {v3, p0}, Lmyunmn/aq;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_f
    new-instance v3, Lmyunmn/ap;

    invoke-direct {v3, p0}, Lmyunmn/ap;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_10
    new-instance v3, Lmyunmn/w;

    invoke-direct {v3, p0}, Lmyunmn/w;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_11
    new-instance v3, Lmyunmn/E;

    invoke-direct {v3, p0}, Lmyunmn/E;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_12
    new-instance v3, Lmyunmn/an;

    invoke-direct {v3, p0}, Lmyunmn/an;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_13
    new-instance v3, Lmyunmn/ay;

    invoke-direct {v3, p0}, Lmyunmn/ay;-><init>(Ljava/lang/String;)V

    return-object v3

    :pswitch_14
    new-instance v3, Lmyunmn/r;

    invoke-direct {v3, p0}, Lmyunmn/r;-><init>(Ljava/lang/String;)V

    return-object v3

    :cond_1
    :goto_0
    new-instance v3, Lmyunmn/ah;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x1

    new-array v0, v1, [C

    const/16 v2, 0x4397

    xor-int/lit16 v2, v2, 0x43b6

    int-to-char v2, v2

    const v1, 0x0

    aput-char v2, v0, v1

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v3, p0}, Lmyunmn/ah;-><init>(Ljava/lang/String;)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static c()V
    .locals 1

    new-instance v0, Lmyunmn/X;

    invoke-direct {v0}, Lmyunmn/X;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method static synthetic d()I
    .locals 1

    sget v0, Lmyunmn/am;->c:I

    return v0
.end method

.method private static e()Ljava/lang/String;
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    :try_start_0
    sget v2, Lmyunmn/am;->c:I

    invoke-static {v2}, Landroid/os/ParcelFileDescriptor;->adoptFd(I)Landroid/os/ParcelFileDescriptor;

    move-result-object v2

    new-instance v3, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    invoke-direct {v3, v2}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    new-instance v2, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v3, 0x400

    :try_start_1
    new-array v4, v3, [C

    :cond_0
    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5, v3}, Ljava/io/BufferedReader;->read([CII)I

    move-result v6

    if-lez v6, :cond_1

    invoke-virtual {v0, v4, v5, v6}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0x1

    new-array v7, v8, [C

    const/16 v9, 0x5a64

    xor-int/lit16 v9, v9, 0x5a45

    int-to-char v9, v9

    const v8, 0x0

    aput-char v9, v7, v8

    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v7}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->setLength(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-gtz v2, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v2

    goto :goto_1

    :catchall_1
    move-exception v0

    :goto_1
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    throw v0

    :catch_2
    move-object v2, v1

    :catch_3
    :try_start_4
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    return-object v1
.end method
