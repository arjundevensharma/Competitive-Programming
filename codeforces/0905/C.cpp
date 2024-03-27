#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int n, k;

void solve () {
    cin >> n >> k;

    int a[n];
    
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    
    int cnt = k - 1;
    
    for (int i = 0; i < n; i++) {
        int b;
        if (a[i] % k == 0) {
            b = 0;
        } else {
            b = (k * ((a[i] / k) + 1))  - a[i];
        }
        if (b < cnt) {
            cnt = b;
        }
    }

    if (k == 4) {
        int c = 2;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                c--;
            }
            if (c == 0) {
                break;
            }
        }

        cnt = min (c, cnt);
    }

    cout << cnt << "\n";

}

int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int t;
    cin >> t;
    
    while (t--)
        solve();
}
