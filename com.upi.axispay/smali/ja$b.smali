.class public Lja$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lja;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Loa$c;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Lja;Loa$c;I)V
    .locals 0

    .line 1
    iput-object p2, p0, Lja$b;->b:Loa$c;

    iput p3, p0, Lja$b;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lja$b;->b:Loa$c;

    iget v1, p0, Lja$b;->c:I

    invoke-virtual {v0, v1}, Loa$c;->a(I)V

    return-void
.end method
