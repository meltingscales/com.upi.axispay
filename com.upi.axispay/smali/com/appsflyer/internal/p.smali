.class public final Lcom/appsflyer/internal/p;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public ı:D

.field private final Ɩ:Ljava/lang/String;

.field private final ǃ:I

.field public final ɩ:[[F

.field private final ɹ:Ljava/util/concurrent/Executor;

.field public Ι:J

.field public final ι:[J

.field private final І:Ljava/lang/String;

.field private final Ӏ:I


# direct methods
.method public constructor <init>(Landroid/hardware/Sensor;Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [[F

    .line 2
    iput-object v1, p0, Lcom/appsflyer/internal/p;->ɩ:[[F

    new-array v0, v0, [J

    .line 3
    iput-object v0, p0, Lcom/appsflyer/internal/p;->ι:[J

    .line 4
    iput-object p2, p0, Lcom/appsflyer/internal/p;->ɹ:Ljava/util/concurrent/Executor;

    .line 5
    invoke-virtual {p1}, Landroid/hardware/Sensor;->getType()I

    move-result p2

    iput p2, p0, Lcom/appsflyer/internal/p;->ǃ:I

    .line 6
    invoke-virtual {p1}, Landroid/hardware/Sensor;->getName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x3005

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-nez v0, :cond_0

    move-object v0, v1

    :cond_0
    iput-object v0, p0, Lcom/appsflyer/internal/p;->Ɩ:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Landroid/hardware/Sensor;->getVendor()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    iput-object v1, p0, Lcom/appsflyer/internal/p;->І:Ljava/lang/String;

    add-int/lit8 p2, p2, 0x1f

    mul-int/lit8 p2, p2, 0x1f

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    add-int/2addr p2, p1

    mul-int/lit8 p2, p2, 0x1f

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    add-int/2addr p2, p1

    .line 10
    iput p2, p0, Lcom/appsflyer/internal/p;->Ӏ:I

    return-void
.end method

.method public static synthetic ı(Landroid/hardware/Sensor;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/p;->ι(Landroid/hardware/Sensor;)Z

    move-result p0

    return p0
.end method

.method private static ɩ([F)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([F)",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 2
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget v3, p0, v2

    .line 3
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private ɩ()Z
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/p;->ɩ:[[F

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public static Ι([F[F)D
    .locals 8

    .line 1
    array-length v0, p0

    array-length v1, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    .line 2
    aget v4, p0, v3

    aget v5, p1, v3

    sub-float/2addr v4, v5

    float-to-double v4, v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/StrictMath;->pow(DD)D

    move-result-wide v4

    add-double/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    return-wide p0
.end method

.method private ι()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 15
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 16
    iget v1, p0, Lcom/appsflyer/internal/p;->ǃ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x3006

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    iget-object v1, p0, Lcom/appsflyer/internal/p;->Ɩ:Ljava/lang/String;

    const v2, 0x3007

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    iget-object v1, p0, Lcom/appsflyer/internal/p;->І:Ljava/lang/String;

    const v2, 0x3008

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    iget-object v1, p0, Lcom/appsflyer/internal/p;->ɩ:[[F

    const/4 v2, 0x0

    aget-object v1, v1, v2

    if-eqz v1, :cond_0

    .line 20
    invoke-static {v1}, Lcom/appsflyer/internal/p;->ɩ([F)Ljava/util/List;

    move-result-object v1

    const v2, 0x3009

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/p;->ɩ:[[F

    const/4 v2, 0x1

    aget-object v1, v1, v2

    if-eqz v1, :cond_1

    .line 22
    invoke-static {v1}, Lcom/appsflyer/internal/p;->ɩ([F)Ljava/util/List;

    move-result-object v1

    const v2, 0x300a

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method private static ι(Landroid/hardware/Sensor;)Z
    .locals 1

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/hardware/Sensor;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/hardware/Sensor;->getVendor()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1
    :cond_0
    instance-of v0, p1, Lcom/appsflyer/internal/p;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Lcom/appsflyer/internal/p;

    .line 3
    iget v0, p1, Lcom/appsflyer/internal/p;->ǃ:I

    iget-object v1, p1, Lcom/appsflyer/internal/p;->Ɩ:Ljava/lang/String;

    iget-object p1, p1, Lcom/appsflyer/internal/p;->І:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, p1}, Lcom/appsflyer/internal/p;->ι(ILjava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/appsflyer/internal/p;->Ӏ:I

    return v0
.end method

.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/p;->ɹ:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/appsflyer/internal/p$5;

    invoke-direct {v1, p0, p1}, Lcom/appsflyer/internal/p$5;-><init>(Lcom/appsflyer/internal/p;Landroid/hardware/SensorEvent;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ι(Ljava/util/Map;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/appsflyer/internal/p;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;Z)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lcom/appsflyer/internal/p;->ɩ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    invoke-direct {p0}, Lcom/appsflyer/internal/p;->ι()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_3

    .line 4
    iget-object p1, p0, Lcom/appsflyer/internal/p;->ɩ:[[F

    array-length p1, p1

    const/4 p2, 0x0

    move v0, p2

    :goto_0
    if-ge v0, p1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/appsflyer/internal/p;->ɩ:[[F

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/appsflyer/internal/p;->ι:[J

    array-length p1, p1

    :goto_1
    const-wide/16 v0, 0x0

    if-ge p2, p1, :cond_1

    .line 7
    iget-object v2, p0, Lcom/appsflyer/internal/p;->ι:[J

    aput-wide v0, v2, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    const-wide/16 p1, 0x0

    .line 8
    iput-wide p1, p0, Lcom/appsflyer/internal/p;->ı:D

    .line 9
    iput-wide v0, p0, Lcom/appsflyer/internal/p;->Ι:J

    return-void

    .line 10
    :cond_2
    invoke-interface {p1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 11
    invoke-direct {p0}, Lcom/appsflyer/internal/p;->ι()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p1, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public final ι(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 12
    iget v0, p0, Lcom/appsflyer/internal/p;->ǃ:I

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Lcom/appsflyer/internal/p;->Ɩ:Ljava/lang/String;

    .line 13
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/appsflyer/internal/p;->І:Ljava/lang/String;

    .line 14
    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
