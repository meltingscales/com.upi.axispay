.class public final Lji$b$a;
.super Luh$e;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lji$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Luh$e;-><init>()V

    .line 2
    iput-object p1, p0, Lji$b$a;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public f(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lji$b$a;->a:Ljava/lang/Object;

    invoke-static {v0, p1}, Lbi$d;->i(Ljava/lang/Object;I)V

    return-void
.end method

.method public i(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lji$b$a;->a:Ljava/lang/Object;

    invoke-static {v0, p1}, Lbi$d;->j(Ljava/lang/Object;I)V

    return-void
.end method
