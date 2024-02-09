.class public Lja$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lja;->c(Landroid/graphics/Typeface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Loa$c;

.field public final synthetic c:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Lja;Loa$c;Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lja$a;->b:Loa$c;

    iput-object p3, p0, Lja$a;->c:Landroid/graphics/Typeface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lja$a;->b:Loa$c;

    iget-object v1, p0, Lja$a;->c:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Loa$c;->b(Landroid/graphics/Typeface;)V

    return-void
.end method
