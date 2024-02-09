## Findings summary

### gitleaks

TODO

### apkurlgrep

TODO

### Snyk SAST

TODO

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