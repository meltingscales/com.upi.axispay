.class public Lxx$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lry$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxx;->N(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lxx;


# direct methods
.method public constructor <init>(Lxx;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxx$a;->a:Lxx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxx$a;->a:Lxx;

    invoke-virtual {v0, p1}, Lxx;->R(Landroid/graphics/Typeface;)V

    return-void
.end method
