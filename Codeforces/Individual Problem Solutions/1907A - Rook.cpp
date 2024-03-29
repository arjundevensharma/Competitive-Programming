#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

string s;

void solve () {
    cin >> s;

    int a = s[1] - '0';
    int b = s[0] - '`';

    for (int i = 1; i < 9; i++) {
        if (i != a) {
            cout << s[0] << i << "\n";
        }
        if (i != b) {
            cout << char('a' + i - 1) << s[1] << "\n";
        }
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
