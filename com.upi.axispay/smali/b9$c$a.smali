.class public Lb9$c$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb9$c;->b(Landroid/graphics/Typeface;Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/graphics/Typeface;

.field public final synthetic c:Lb9$c;


# direct methods
.method public constructor <init>(Lb9$c;Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb9$c$a;->c:Lb9$c;

    iput-object p2, p0, Lb9$c$a;->b:Landroid/graphics/Typeface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lb9$c$a;->c:Lb9$c;

    iget-object v1, p0, Lb9$c$a;->b:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lb9$c;->e(Landroid/graphics/Typeface;)V

    return-void
.end method
