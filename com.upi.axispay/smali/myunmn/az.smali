.class public Lmyunmn/az;
.super Lmyunmn/aQ;
.source "SourceFile"


# direct methods
.method private constructor <init>(ZZ)V
    .locals 2

    sget-object v0, Lmyunmn/af;->k:Lmyunmn/af;

    invoke-direct {p0, v0}, Lmyunmn/aQ;-><init>(Lmyunmn/af;)V

    iget-object v0, p0, Lmyunmn/aQ;->a:Ljava/util/Map;

    const/16 v1, 0x1801

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lmyunmn/aQ;->a:Ljava/util/Map;

    const/16 v0, 0x1802

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/16 v0, 0x1801

    invoke-virtual {p0, v0}, Lmyunmn/aQ;->c(I)Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    const/16 v0, 0x1802

    invoke-virtual {p0, v0}, Lmyunmn/aQ;->c(I)Z

    move-result v0

    return v0
.end method
