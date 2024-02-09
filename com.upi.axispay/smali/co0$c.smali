.class public final Lco0$c;
.super Lzl0;
.source "AxisPay"

# interfaces
.implements Ldl0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco0;->i0(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lhn0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzl0;",
        "Ldl0<",
        "Lrm0;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lco0$c;->b:Ljava/lang/CharSequence;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lzl0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Lrm0;)Ljava/lang/String;
    .locals 1

    const v0, 0x1073

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lco0$c;->b:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Lco0;->m0(Ljava/lang/CharSequence;Lrm0;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lrm0;

    invoke-virtual {p0, p1}, Lco0$c;->b(Lrm0;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
