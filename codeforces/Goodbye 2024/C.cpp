#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int n;

void solve () {
    cin >> n;

    int cnt = 0;
    ll sum = 0;

    for (int i = 0; i < n; i++) {
        ll b;
        cin >> b;

        if (b % 2 != 0) {
            cnt++;
        }

        sum += b;

        ll ans = (sum - (cnt/3) );

        if (cnt % 3 == 1 && i != 0) {
            ans -= 1;
        }
        
        cout << ans << " ";
    }

    cout << "\n";
}

int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int t;
    cin >> t;
    
    while (t--)
        solve();
}
