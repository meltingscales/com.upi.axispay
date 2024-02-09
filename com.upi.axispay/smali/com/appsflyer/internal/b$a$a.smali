.class public final Lcom/appsflyer/internal/b$a$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private ǃ:J

.field public ɩ:Ljava/lang/String;

.field private final Ι:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/b$a$a;->Ι:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lcom/appsflyer/internal/b$a$a;->ǃ:J

    const v0, 0xecf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/appsflyer/internal/b$a$a;->ɩ:Ljava/lang/String;

    .line 6
    iput-wide p1, p0, Lcom/appsflyer/internal/b$a$a;->ǃ:J

    .line 7
    iput-object p3, p0, Lcom/appsflyer/internal/b$a$a;->ɩ:Ljava/lang/String;

    return-void
.end method

.method public static ı([B)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-byte v3, p0, v2

    .line 3
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    .line 5
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const v4, 0xed0

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 6
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ǃ([B)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_0

    .line 2
    aget-byte v1, p0, v0

    rem-int/lit8 v2, v0, 0x2

    add-int/lit8 v2, v2, 0x2a

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static ɩ(Ljava/lang/String;)Lcom/appsflyer/internal/b$a$a;
    .locals 5

    const v0, 0xed1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, 0x0

    if-nez p0, :cond_0

    .line 1
    new-instance p0, Lcom/appsflyer/internal/b$a$a;

    invoke-direct {p0, v1, v2, v0}, Lcom/appsflyer/internal/b$a$a;-><init>(JLjava/lang/String;)V

    return-object p0

    :cond_0
    const v3, 0xed2

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-virtual {p0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 3
    array-length v3, p0

    const/4 v4, 0x2

    if-ge v3, v4, :cond_1

    .line 4
    new-instance p0, Lcom/appsflyer/internal/b$a$a;

    invoke-direct {p0, v1, v2, v0}, Lcom/appsflyer/internal/b$a$a;-><init>(JLjava/lang/String;)V

    return-object p0

    .line 5
    :cond_1
    new-instance v0, Lcom/appsflyer/internal/b$a$a;

    const/4 v1, 0x0

    aget-object v1, p0, v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    const/4 v3, 0x1

    aget-object p0, p0, v3

    invoke-direct {v0, v1, v2, p0}, Lcom/appsflyer/internal/b$a$a;-><init>(JLjava/lang/String;)V

    return-object v0
.end method

.method private ɩ(J)Z
    .locals 2

    .line 6
    iget-wide v0, p0, Lcom/appsflyer/internal/b$a$a;->ǃ:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x7d0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ι(JLjava/lang/String;)Z
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/b$a$a;->Ι:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p3, :cond_0

    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/b$a$a;->ɩ:Ljava/lang/String;

    invoke-virtual {p3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/b$a$a;->ɩ(J)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iput-wide p1, p0, Lcom/appsflyer/internal/b$a$a;->ǃ:J

    .line 5
    iput-object p3, p0, Lcom/appsflyer/internal/b$a$a;->ɩ:Ljava/lang/String;

    const/4 p1, 0x1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p1

    :catchall_0
    move-exception p1

    .line 7
    monitor-exit v0

    throw p1

    :cond_0
    const/4 p1, 0x0

    .line 8
    monitor-exit v0

    return p1
.end method

.method public static ι(Ljava/lang/String;)[B
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Lcom/appsflyer/internal/b$a$a;->ǃ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const v1, 0xed3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/appsflyer/internal/b$a$a;->ɩ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ǃ(Lcom/appsflyer/internal/b$a$a;)Z
    .locals 2

    .line 3
    iget-wide v0, p1, Lcom/appsflyer/internal/b$a$a;->ǃ:J

    .line 4
    iget-object p1, p1, Lcom/appsflyer/internal/b$a$a;->ɩ:Ljava/lang/String;

    .line 5
    invoke-direct {p0, v0, v1, p1}, Lcom/appsflyer/internal/b$a$a;->ι(JLjava/lang/String;)Z

    move-result p1

    return p1
.end method
