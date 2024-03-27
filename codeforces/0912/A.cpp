#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int n, k;

void solve () {
    cin >> n >> k;

    int a [n];

    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    if (k > 1 || is_sorted(a, a + n) == true) {
        cout << "YES" << "\n";
    } else {
        cout << "NO" << "\n";
    }
}
int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int t;
    cin >> t;

    while (t--)
        solve();
}
