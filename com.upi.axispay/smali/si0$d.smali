.class public final Lsi0$d;
.super Lsi0;
.source "AxisPay"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsi0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lsi0<",
        "TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field public final b:Lsi0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsi0<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final c:I

.field public d:I


# direct methods
.method public constructor <init>(Lsi0;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsi0<",
            "+TE;>;II)V"
        }
    .end annotation

    const v0, 0x1072

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lsi0;-><init>()V

    iput-object p1, p0, Lsi0$d;->b:Lsi0;

    iput p2, p0, Lsi0$d;->c:I

    .line 2
    sget-object v0, Lsi0;->Companion:Lsi0$a;

    invoke-virtual {p1}, Lri0;->size()I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, Lsi0$a;->c(III)V

    sub-int/2addr p3, p2

    .line 3
    iput p3, p0, Lsi0$d;->d:I

    return-void
.end method


# virtual methods
.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .line 1
    sget-object v0, Lsi0;->Companion:Lsi0$a;

    iget v1, p0, Lsi0$d;->d:I

    invoke-virtual {v0, p1, v1}, Lsi0$a;->a(II)V

    .line 2
    iget-object v0, p0, Lsi0$d;->b:Lsi0;

    iget v1, p0, Lsi0$d;->c:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Lsi0;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getSize()I
    .locals 1

    .line 1
    iget v0, p0, Lsi0$d;->d:I

    return v0
.end method
