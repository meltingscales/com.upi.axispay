.class public final enum Lin/org/npci/commonlibrary/d;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lin/org/npci/commonlibrary/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d:Lin/org/npci/commonlibrary/d;

.field public static final enum e:Lin/org/npci/commonlibrary/d;

.field public static final enum f:Lin/org/npci/commonlibrary/d;

.field public static final enum g:Lin/org/npci/commonlibrary/d;

.field public static final enum h:Lin/org/npci/commonlibrary/d;

.field public static final enum i:Lin/org/npci/commonlibrary/d;

.field public static final enum j:Lin/org/npci/commonlibrary/d;

.field public static final enum k:Lin/org/npci/commonlibrary/d;

.field public static final synthetic l:[Lin/org/npci/commonlibrary/d;


# instance fields
.field public final b:I

.field public final c:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lin/org/npci/commonlibrary/d;

    const-string v1, "KEY_CODE_EMPTY"

    const/4 v2, 0x0

    const/16 v3, 0x3e9

    const-string v4, "Your organization key is empty. Please provide a organization key."

    invoke-direct {v0, v1, v2, v3, v4}, Lin/org/npci/commonlibrary/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lin/org/npci/commonlibrary/d;->d:Lin/org/npci/commonlibrary/d;

    new-instance v1, Lin/org/npci/commonlibrary/d;

    const-string v3, "KEY_CODE_INVALID"

    const/4 v4, 0x1

    const/16 v5, 0x3ea

    const-string v6, "Your organization key is invalid. Please contact your system administrator or UPI support team."

    invoke-direct {v1, v3, v4, v5, v6}, Lin/org/npci/commonlibrary/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v1, Lin/org/npci/commonlibrary/d;->e:Lin/org/npci/commonlibrary/d;

    new-instance v3, Lin/org/npci/commonlibrary/d;

    const-string v5, "PUBLICKEY_NOT_FOUND"

    const/4 v6, 0x2

    const/16 v7, 0x3eb

    const-string v8, "Public key file not found please contact your system administrator UPI support team"

    invoke-direct {v3, v5, v6, v7, v8}, Lin/org/npci/commonlibrary/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v3, Lin/org/npci/commonlibrary/d;->f:Lin/org/npci/commonlibrary/d;

    new-instance v5, Lin/org/npci/commonlibrary/d;

    const-string v7, "PARSER_MISCONFIG"

    const/4 v8, 0x3

    const/16 v9, 0x3ec

    const-string v10, "XML Parser configuration error.Keys.xml may not be formatted correctly."

    invoke-direct {v5, v7, v8, v9, v10}, Lin/org/npci/commonlibrary/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v5, Lin/org/npci/commonlibrary/d;->g:Lin/org/npci/commonlibrary/d;

    new-instance v7, Lin/org/npci/commonlibrary/d;

    const-string v9, "XML_PATH_ERROR"

    const/4 v10, 0x4

    const/16 v11, 0x3ed

    const-string v12, "XML File is not found or cannot be read."

    invoke-direct {v7, v9, v10, v11, v12}, Lin/org/npci/commonlibrary/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v7, Lin/org/npci/commonlibrary/d;->h:Lin/org/npci/commonlibrary/d;

    new-instance v9, Lin/org/npci/commonlibrary/d;

    const-string v11, "KEYS_NOT_VALID"

    const/4 v12, 0x5

    const/16 v13, 0x3ee

    const-string v14, "Keys are not valid. Please contact your system administrator UPI support team"

    invoke-direct {v9, v11, v12, v13, v14}, Lin/org/npci/commonlibrary/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v9, Lin/org/npci/commonlibrary/d;->i:Lin/org/npci/commonlibrary/d;

    new-instance v11, Lin/org/npci/commonlibrary/d;

    const-string v13, "UNKNOWN_ERROR"

    const/4 v14, 0x6

    const/16 v15, 0x3ef

    const-string v12, "Unknown error occurred."

    invoke-direct {v11, v13, v14, v15, v12}, Lin/org/npci/commonlibrary/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v11, Lin/org/npci/commonlibrary/d;->j:Lin/org/npci/commonlibrary/d;

    new-instance v12, Lin/org/npci/commonlibrary/d;

    const-string v13, "TRUST_NOT_VALID"

    const/4 v15, 0x7

    const/16 v14, 0x3f0

    const-string v10, "Trust is not valid"

    invoke-direct {v12, v13, v15, v14, v10}, Lin/org/npci/commonlibrary/d;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v12, Lin/org/npci/commonlibrary/d;->k:Lin/org/npci/commonlibrary/d;

    const/16 v10, 0x8

    new-array v10, v10, [Lin/org/npci/commonlibrary/d;

    aput-object v0, v10, v2

    aput-object v1, v10, v4

    aput-object v3, v10, v6

    aput-object v5, v10, v8

    const/4 v0, 0x4

    aput-object v7, v10, v0

    const/4 v0, 0x5

    aput-object v9, v10, v0

    const/4 v0, 0x6

    aput-object v11, v10, v0

    aput-object v12, v10, v15

    sput-object v10, Lin/org/npci/commonlibrary/d;->l:[Lin/org/npci/commonlibrary/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lin/org/npci/commonlibrary/d;->b:I

    iput-object p4, p0, Lin/org/npci/commonlibrary/d;->c:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lin/org/npci/commonlibrary/d;
    .locals 1

    const-class v0, Lin/org/npci/commonlibrary/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lin/org/npci/commonlibrary/d;

    return-object p0
.end method

.method public static values()[Lin/org/npci/commonlibrary/d;
    .locals 1

    sget-object v0, Lin/org/npci/commonlibrary/d;->l:[Lin/org/npci/commonlibrary/d;

    invoke-virtual {v0}, [Lin/org/npci/commonlibrary/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lin/org/npci/commonlibrary/d;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lin/org/npci/commonlibrary/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lin/org/npci/commonlibrary/d;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lin/org/npci/commonlibrary/d;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lin/org/npci/commonlibrary/d;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
