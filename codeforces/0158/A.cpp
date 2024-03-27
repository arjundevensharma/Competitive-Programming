#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int n, x;

void solve () {
    cin >> n >> x;

    int a [n + 2];

    for (int i = 1; i <= n; i++) {
        cin >> a[i];
    }

    a[0] = 0;
    a[n + 1] = x + (x - a[n]);

    int diffs [n + 1];

    for (int i = 0; i < n + 1; i++) {
        diffs[i] = a[i + 1] - a[i];
    }

    int out = *max_element(diffs, diffs + n + 1);

    cout << out << "\n";
}
int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int t;
    cin >> t;

    while (t--)
        solve();
}
