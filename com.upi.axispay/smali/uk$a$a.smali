.class public Luk$a$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luk$a;->b([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:[Ljava/lang/String;

.field public final synthetic c:Luk$a;


# direct methods
.method public constructor <init>(Luk$a;[Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Luk$a$a;->c:Luk$a;

    iput-object p2, p0, Luk$a$a;->b:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Luk$a$a;->c:Luk$a;

    iget-object v0, v0, Luk$a;->a:Luk;

    iget-object v0, v0, Luk;->d:Ltk;

    iget-object v1, p0, Luk$a$a;->b:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Ltk;->f([Ljava/lang/String;)V

    return-void
.end method
