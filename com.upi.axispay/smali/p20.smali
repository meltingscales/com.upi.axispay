.class public final synthetic Lp20;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/firebase/installations/FirebaseInstallations;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/installations/FirebaseInstallations;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp20;->b:Lcom/google/firebase/installations/FirebaseInstallations;

    iput-boolean p2, p0, Lp20;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp20;->b:Lcom/google/firebase/installations/FirebaseInstallations;

    iget-boolean v1, p0, Lp20;->c:Z

    invoke-virtual {v0, v1}, Lcom/google/firebase/installations/FirebaseInstallations;->b(Z)V

    return-void
.end method
