#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

void solve () {
    vector <int> d;

    for (int i = 0; i < 3; i++) {
        int c;
        cin >> c;
        d.push_back(c);
    }

    sort (d.begin(), d.end());

    if (d[0] == d[1] && d[1] == d[2]) {
        cout << "YES\n";
    } else if (d[1] % d[0] == 0 && d[2] % d[0] == 0 && (((d[1] / d[0]) - 1) + ((d[2] / d[0]) - 1)) <= 3) {
        cout << "YES\n";
    } else {
        cout << "NO\n";
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
