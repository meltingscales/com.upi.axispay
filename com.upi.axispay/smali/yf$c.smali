.class public Lyf$c;
.super Lpf;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final d:Lqf$b;


# instance fields
.field public c:Lv4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv4<",
            "Lyf$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyf$c$a;

    invoke-direct {v0}, Lyf$c$a;-><init>()V

    sput-object v0, Lyf$c;->d:Lqf$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lpf;-><init>()V

    .line 2
    new-instance v0, Lv4;

    invoke-direct {v0}, Lv4;-><init>()V

    iput-object v0, p0, Lyf$c;->c:Lv4;

    return-void
.end method

.method public static g(Lrf;)Lyf$c;
    .locals 2

    .line 1
    new-instance v0, Lqf;

    sget-object v1, Lyf$c;->d:Lqf$b;

    invoke-direct {v0, p0, v1}, Lqf;-><init>(Lrf;Lqf$b;)V

    const-class p0, Lyf$c;

    invoke-virtual {v0, p0}, Lqf;->a(Ljava/lang/Class;)Lpf;

    move-result-object p0

    check-cast p0, Lyf$c;

    return-object p0
.end method


# virtual methods
.method public d()V
    .locals 2

    .line 1
    invoke-super {p0}, Lpf;->d()V

    .line 2
    iget-object v0, p0, Lyf$c;->c:Lv4;

    invoke-virtual {v0}, Lv4;->j()I

    move-result v0

    if-gtz v0, :cond_0

    .line 3
    iget-object v0, p0, Lyf$c;->c:Lv4;

    invoke-virtual {v0}, Lv4;->b()V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lyf$c;->c:Lv4;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lv4;->k(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyf$a;

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Lyf$a;->k(Z)Lzf;

    const/4 v0, 0x0

    throw v0
.end method

.method public f(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lyf$c;->c:Lv4;

    invoke-virtual {v0}, Lv4;->j()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const v0, 0x135f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x1360

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lyf$c;->c:Lv4;

    invoke-virtual {v2}, Lv4;->j()I

    move-result v2

    if-gtz v2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, p0, Lyf$c;->c:Lv4;

    invoke-virtual {v2, v1}, Lv4;->k(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyf$a;

    .line 6
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const p1, 0x1361

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p1, p0, Lyf$c;->c:Lv4;

    invoke-virtual {p1, v1}, Lv4;->h(I)I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    const p1, 0x1362

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Lyf$a;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v2, v0, p2, p3, p4}, Lyf$a;->l(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyf$c;->c:Lv4;

    invoke-virtual {v0}, Lv4;->j()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 2
    iget-object v2, p0, Lyf$c;->c:Lv4;

    invoke-virtual {v2, v1}, Lv4;->k(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyf$a;

    .line 3
    invoke-virtual {v2}, Lyf$a;->m()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
