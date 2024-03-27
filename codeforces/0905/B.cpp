#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int n, k;
string s;
set <char> a;

void solve () {
    cin >> n >> k >> s;

    for (int i = 0; i < n; i++) {
        a.insert(s[i]);
    }

    int occs [a.size()];

    auto it = a.begin();

    for (int i = 0; i < a.size(); i++) {
        char b = *it;
        occs[i] = count(s.begin(), s.end(), b);
        it++;
    }

    int odds = 0;

    for (int i = 0; i < a.size(); i++) {
        if (occs[i] % 2 != 0) {
            ++odds;
        }
    }

    if ( (odds - 1 <= k && odds > 1) || odds <= 1) {
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
