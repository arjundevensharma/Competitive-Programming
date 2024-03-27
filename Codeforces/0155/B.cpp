#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int n;

void solve () {
    cin >> n;

    vector <ll> a, b;

    for (int i = 0; i < n; i++) {
        ll c;
        cin >> c;
        a.push_back(c);
    }

    for (int i = 0; i < n; i++) {
        ll c;
        cin >> c;
        b.push_back(c);
    };

    ll suma = reduce(a.begin(), a.end());
    ll sumb = reduce(b.begin(), b.end());
    ll mina = *min_element(a.begin(), a.end());
    ll minb = *min_element(b.begin(), b.end());;

    cout << min(suma + (minb * n), sumb + (mina * n)) << "\n";
}

int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int t = 1;
    cin >> t;

    while (t--)
        solve();
}
