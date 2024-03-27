#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int n;
string s;

void solve () {
    cin >> n >> s;

    bool zerosExist = false;

    for (int i = 0; i < s.length(); i++) {
        if (s[i] == '0') {
            zerosExist = true;
            break;
        } 
    }

    if (zerosExist == true) {
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
