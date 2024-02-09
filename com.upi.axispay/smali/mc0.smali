.class public final synthetic Lmc0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:Ljf0;


# direct methods
.method public synthetic constructor <init>(Ljf0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmc0;->b:Ljf0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object v0, p0, Lmc0;->b:Ljf0;

    invoke-virtual {v0, p1, p2}, Ljf0;->D(Landroid/content/DialogInterface;I)V

    return-void
.end method
