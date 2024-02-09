.class public Lrg0;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:I

.field public d:Z

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IIZIIII)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lrg0;->a:Ljava/lang/String;

    .line 12
    iput p2, p0, Lrg0;->b:I

    .line 13
    iput p3, p0, Lrg0;->c:I

    .line 14
    iput-boolean p4, p0, Lrg0;->d:Z

    .line 15
    iput p5, p0, Lrg0;->e:I

    .line 16
    iput p6, p0, Lrg0;->f:I

    .line 17
    iput p7, p0, Lrg0;->g:I

    .line 18
    iput p8, p0, Lrg0;->h:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIZIIIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrg0;->a:Ljava/lang/String;

    .line 3
    iput p2, p0, Lrg0;->b:I

    .line 4
    iput p3, p0, Lrg0;->c:I

    .line 5
    iput-boolean p4, p0, Lrg0;->d:Z

    .line 6
    iput p5, p0, Lrg0;->e:I

    .line 7
    iput p6, p0, Lrg0;->g:I

    .line 8
    iput p7, p0, Lrg0;->h:I

    .line 9
    iput-boolean p8, p0, Lrg0;->i:Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lrg0;->c:I

    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lrg0;->e:I

    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lrg0;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lrg0;->g:I

    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget v0, p0, Lrg0;->f:I

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lrg0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lrg0;->h:I

    return v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lrg0;->d:Z

    return v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lrg0;->i:Z

    return v0
.end method
