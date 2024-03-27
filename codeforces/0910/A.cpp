#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int n, k;
string s;

void solve () {
    cin >> n >> k >> s;

    int c = 0;

    for (int i = 0; i < n; i++) {
        if (s[i] == 'B') {
            c++;
        }
    }

    if (c < k) {
        for (int i = 0; i < n; i++) {
            if (s[i] == 'A') {
                c++;
            }

            if (c == k) {
                cout << 1 << "\n" << (i + 1) << " " << "B\n";
                break;
            }
        }
    } else if (c > k) {
        for (int i = 0; i < n; i++) {
            if (s[i] == 'B') {
                c--;
            }

            if (c == k) {
                cout << 1 << "\n" << (i + 1) << " " << "A\n";
                break;
            }
        }
    } else {
        cout << 0 << "\n";
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
