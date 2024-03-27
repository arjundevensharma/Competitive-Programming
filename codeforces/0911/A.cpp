#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define ar array

int n;
string s;

void solve () {
    cin >> n >> s;
    
    int a = 0;

    for (int i = 0; i < n; i++) {
        if (s[i] == '.') {
            a++;
        }
    }

    for (int i = 1; i < n - 1; i++) {
        if (s[i - 1] == '.' && s[i] == '.' && s[i + 1] == '.') {
            a = 2;
            break;
        }
    }

    cout << a << "\n";
}
int main () {
    ios::sync_with_stdio();
    cin.tie(0);

    int t;
    cin >> t;

    while (t--)
        solve();
}
