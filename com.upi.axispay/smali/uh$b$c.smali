.class public final Luh$b$c;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luh$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luh$b$c$a;
    }
.end annotation


# instance fields
.field public final a:Lsh;

.field public final b:I

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Lsh;IZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Luh$b$c;->a:Lsh;

    .line 3
    iput p2, p0, Luh$b$c;->b:I

    .line 4
    iput-boolean p3, p0, Luh$b$c;->c:Z

    .line 5
    iput-boolean p4, p0, Luh$b$c;->d:Z

    .line 6
    iput-boolean p5, p0, Luh$b$c;->e:Z

    return-void
.end method

.method public static a(Landroid/os/Bundle;)Luh$b$c;
    .locals 7

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const v0, 0x2302

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lsh;->d(Landroid/os/Bundle;)Lsh;

    move-result-object v2

    const/4 v0, 0x1

    const v1, 0x2303

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {p0, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    const v0, 0x2304

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    const v0, 0x2305

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    const v0, 0x2306

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    .line 7
    new-instance p0, Luh$b$c;

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Luh$b$c;-><init>(Lsh;IZZZ)V

    return-object p0
.end method


# virtual methods
.method public b()Lsh;
    .locals 1

    .line 1
    iget-object v0, p0, Luh$b$c;->a:Lsh;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Luh$b$c;->b:I

    return v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Luh$b$c;->d:Z

    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Luh$b$c;->e:Z

    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Luh$b$c;->c:Z

    return v0
.end method
