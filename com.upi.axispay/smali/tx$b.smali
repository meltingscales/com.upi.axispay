.class public Ltx$b;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Ltx;


# direct methods
.method public constructor <init>(Ltx;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltx$b;->a:Ltx;

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltx;Ltx$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ltx$b;-><init>(Ltx;)V

    return-void
.end method


# virtual methods
.method public getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Ltx$b;->a:Ltx;

    return-object v0
.end method
