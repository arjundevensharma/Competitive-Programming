#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

string s;

void solve () {
    cin >> s;

    int cnt [] = {0, 0};

    for (int i = 0; i < s.length(); i++) {
        cnt[ int(s[i]) - '0' ] += 1;
    }

    bool outputted = false;

    for (int i = 0; i < s.length(); i++) {
        if (cnt[1 - (int(s[i]) - '0')] == 0) {
            cout << (s.length() - i) << "\n";
            outputted = true;
            break;
        }
        cnt[1 - (int(s[i]) - '0')] --;
    }

    if (outputted == false) {
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
