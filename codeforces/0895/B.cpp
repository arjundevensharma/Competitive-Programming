#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int n;

void solve () {
    cin >> n;

    set <int> k;

    int a, b;

    for (int i = 0; i < n; i++) {
        cin >> a >> b;
        k.insert(a + ( (b - 1) / 2));
    }
    cout << *k.begin() << "\n";
}

int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int t;
    cin >> t;

    while (t--)
        solve();
}
