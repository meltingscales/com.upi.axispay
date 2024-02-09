.class public Ltg0;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ltg0;->a:Ljava/lang/String;

    .line 3
    iput-boolean p2, p0, Ltg0;->b:Z

    .line 4
    iput-boolean p3, p0, Ltg0;->c:Z

    .line 5
    iput-boolean p4, p0, Ltg0;->d:Z

    .line 6
    iput-boolean p5, p0, Ltg0;->e:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ltg0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ltg0;->c:Z

    return v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ltg0;->b:Z

    return v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ltg0;->d:Z

    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ltg0;->e:Z

    return v0
.end method
