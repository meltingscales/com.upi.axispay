.class public final synthetic Lb20;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic b:Lb20;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lb20;

    invoke-direct {v0}, Lb20;-><init>()V

    sput-object v0, Lb20;->b:Lb20;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/File;

    invoke-static {p1, p2}, Lcom/google/firebase/crashlytics/internal/persistence/CrashlyticsReportPersistence;->b(Ljava/io/File;Ljava/io/File;)I

    move-result p1

    return p1
.end method
