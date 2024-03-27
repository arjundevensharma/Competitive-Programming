#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

ll a, b, n;

void solve () {
    cin >> a >> b >> n;

    ll sum = b;

    for (int i = 0; i < n; i++) {
        ll c;
        cin >> c;
        if (c >= a) {
            sum += a - 1;
        } else {
            sum += c;
        }
    }

    cout << sum << "\n";
    
}

int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int t;
    cin >> t;

    while (t--)
        solve();
}
