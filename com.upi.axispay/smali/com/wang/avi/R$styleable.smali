.class public final Lcom/wang/avi/R$styleable;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wang/avi/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final AVLoadingIndicatorView:[I

.field public static final AVLoadingIndicatorView_indicatorColor:I

.field public static final AVLoadingIndicatorView_indicatorName:I

.field public static final AVLoadingIndicatorView_maxHeight:I

.field public static final AVLoadingIndicatorView_maxWidth:I

.field public static final AVLoadingIndicatorView_minHeight:I

.field public static final AVLoadingIndicatorView_minWidth:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/wang/avi/R$styleable;

    const v1, 0xb7

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/wang/avi/R$styleable;->AVLoadingIndicatorView:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f0401f5
        0x7f0401f9
        0x7f0402b3
        0x7f0402b7
        0x7f0402cc
        0x7f0402d0
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
