.class public Loa$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:[Loa$b;


# direct methods
.method public constructor <init>(I[Loa$b;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Loa$a;->a:I

    .line 3
    iput-object p2, p0, Loa$a;->b:[Loa$b;

    return-void
.end method

.method public static a(I[Loa$b;)Loa$a;
    .locals 1

    .line 1
    new-instance v0, Loa$a;

    invoke-direct {v0, p0, p1}, Loa$a;-><init>(I[Loa$b;)V

    return-object v0
.end method


# virtual methods
.method public b()[Loa$b;
    .locals 1

    .line 1
    iget-object v0, p0, Loa$a;->b:[Loa$b;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Loa$a;->a:I

    return v0
.end method
