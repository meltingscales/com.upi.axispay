.class public Lmc$c;
.super Lmc$b;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>(Lmc;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lmc$b;-><init>(Lmc;)V

    return-void
.end method


# virtual methods
.method public addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmc$a;->a:Lmc;

    .line 2
    invoke-static {p2}, Llc;->E0(Landroid/view/accessibility/AccessibilityNodeInfo;)Llc;

    move-result-object p2

    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lmc;->a(ILlc;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
