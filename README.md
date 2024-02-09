## Findings summary

### gitleaks

No leaks found.

### apkurlgrep

- A LOT of URLs show up. At least 100 endpoints. They're probably related to <https://upiuat.axisbank.co.in/v1/>. I hope this company has a good API security program in place!

```
/v1/bank/transactions/pay
/v1/customer/accounts
/v1/customer/accounts/mobreg
/v1/customer/otp
/v1/customer/accounts/remove
/v1/customer/accounts/update
/v1/authenticate
/v1/bank/transactions/balanceinquiry/creditline
...
```

It also looks like they use DESede and AES CBC for some reason. They should make sure they're not using that encryption.

### Snyk SAST

10 High, 59 Mediums

Hardcoded IVs, Uses Random.nextInt for seeding crypto, deserializes serialized untrusted data, and a handful of mediums.

### jadx

- https://upiuat.axisbank.co.in/v1/ shows up in an XML file, it's a web API

## Commands

```
adb shell pm path com.upi.axispay

adb pull /data/app/~~l27LlzyH6D5jX4dE8H-VOg==/com.upi.axispay-Olx_xwFXU8iNxQ5tFQeRfw==/base.apk

mv base.apk com.upi.axispay.apk

~/go/bin/apkurlgrep -a com.upi.axispay.apk > apkurlgrep.txt

apktool d com.upi.axispay.apk

echo "Make sure to make a commit so gitleaks can work..."

gitleaks detect --report-path gitleaks.json
```
